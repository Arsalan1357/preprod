package api.servlet;

import entity.formbean.RegistrationFormBean;
import entity.user.User;
import exceptions.BusinessException;
import org.apache.log4j.Logger;
import service.captcha.CaptchaService;
import service.formbean.DefaultFormBeanService;
import service.user.DefaultUserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

import static constants.Constants.*;


/**
 * @author Arsalan
 */
@WebServlet("/registration_servlet")
@MultipartConfig(fileSizeThreshold = 1024 * 1024,
        maxFileSize = 1024 * 1024 * 5, maxRequestSize = 1024 * 1024 * 5 * 5)
public class RegistrationServlet extends HttpServlet {

    private DefaultUserService defaultUserService;
    private DefaultFormBeanService defaultFormBeanService;
    private CaptchaService captchaService;
    private static final Logger log = Logger.getLogger(RegistrationServlet.class);

    @Override
    public void init() throws ServletException {
        defaultUserService = (DefaultUserService) getServletContext().getAttribute(USER_SERVICE);
        defaultFormBeanService = (DefaultFormBeanService) getServletContext().getAttribute(FORM_BEAN_SERVICE);
        captchaService = (CaptchaService) getServletContext().getAttribute(SCOPE);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        RegistrationFormBean formBean = (RegistrationFormBean) session.getAttribute(FORM_BEAN);
        Map<String, String> errors = (Map<String, String>) session.getAttribute(ERRORS);

        if (errors != null) {
            if (errors.size() > 0) {
                log.info("ERRORS DETECTED");
                request.setAttribute(FORM_BEAN, formBean);
                request.setAttribute(ERRORS, errors);
            }
        }
        request.setAttribute(CAPTCHA_CODE, generateCodeCaptcha());
        session.removeAttribute(FORM_BEAN);
        session.removeAttribute(ERRORS);
        RequestDispatcher dispatcher = request.getRequestDispatcher(REGISTER_JSP);
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (System.currentTimeMillis() > (long) request.getSession().getAttribute(TIME)) {
            log.info("TIME OUT");
            RequestDispatcher dispatcher = request.getRequestDispatcher(ERROR_TIME_OUT_JSP);
            dispatcher.forward(request, response);
            return;
        }

        HttpSession session = request.getSession();
        RegistrationFormBean formBean = defaultFormBeanService.createFormBean(request);
        Map<String, String> errors = defaultFormBeanService.validateBean(formBean);
        captchaService.validateCaptcha(request, errors);

        if (errors.size() == 0) {
            if (defaultUserService.checkIfExistUser(formBean.getEmail())) {
                errors.put(EMAIL, EMAIL_ALREADY_EXIST);
            } else {
                User user = defaultFormBeanService.transformBean(formBean);
                createAvatar(request);
                try {
                    defaultUserService.createUser(user);
                } catch (BusinessException e) {
                    e.printStackTrace();
                    errors.put(SIMPLE_TRANSACTIONAL_ERROR, TRANSACTIONAL_ERROR);
                    log.info("TRANSACTIONAL EXCEPTION! " + e.getMessage());
                }
                log.info("NEW USER WAS REGISTERED");
            }
        }
        session.setAttribute(FORM_BEAN, formBean);
        session.setAttribute(ERRORS, errors);
        response.sendRedirect(REGISTRATION_SERVLET);
    }

    protected String generateCodeCaptcha() {
        return UUID.randomUUID().toString();
    }

    private void createAvatar(HttpServletRequest request) throws IOException, ServletException {
        String appPath = request.getServletContext().getRealPath("");
        String savePath = appPath + File.separator + AVATARS_PATH;

        File fileSaveDir = new File(savePath);
        if (!fileSaveDir.exists()) {
            fileSaveDir.mkdir();
        }

        if (request.getPart(PHOTO) != null && request.getParameter(EMAIL) != null) {
            request.getPart(PHOTO).write(savePath + File.separator + request.getParameter(EMAIL) + PNG);
        }
    }
}
