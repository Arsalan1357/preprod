package listener;

import org.apache.log4j.Logger;
import service.captcha.CookieCaptchaService;
import service.captcha.HiddenCaptchaService;
import service.captcha.SessionCaptchaService;
import service.client.UserService;
import service.formbean.FormBeanService;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import static constatnts.Constants.*;

/**
 * @author Arsalan
 */
public class ContextListener implements ServletContextListener {

    private static final Logger log = Logger.getLogger(ContextListener.class);

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();
        initCaptchaService(servletContext);
        initUserService(servletContext);
        initFormBeanService(servletContext);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }

    private void initUserService(ServletContext servletContext){
        servletContext.setAttribute(USER_SERVICE, new UserService());
    }

    private void initFormBeanService(ServletContext servletContext){
        servletContext.setAttribute(FORM_BEAN_SERVICE, new FormBeanService());
    }

    private void initCaptchaService(ServletContext servletContext){
        switch (servletContext.getInitParameter(CAPTCHA_SCOPE)) {
            case SESSION: {
                log.info("Captcha scope: SESSION");
                servletContext.setAttribute(SCOPE, new SessionCaptchaService());
                break;
            }
            case COOKIE: {
                log.info("Captcha scope: COOKIE");
                servletContext.setAttribute(SCOPE, new CookieCaptchaService());
                break;
            }
            case HIDDEN: {
                log.info("Captcha scope: HIDDEN");
                servletContext.setAttribute(SCOPE, new HiddenCaptchaService());
                break;
            }
        }
    }
}