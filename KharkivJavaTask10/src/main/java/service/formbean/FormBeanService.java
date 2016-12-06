package service.formbean;

import entity.client.Client;
import entity.formbean.RegistrationFormBean;
import util.Validator;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

import static constatnts.Constants.*;

/**
 * @author Arsalan
 */
public class FormBeanService {

    private Validator validator = new Validator();

    public RegistrationFormBean createFormBean(HttpServletRequest request){
        if(request.getParameter(FIRST_NAME) != null && request.getParameter(LAST_NAME) != null && request.getParameter(EMAIL) != null &&
                request.getParameter(PASS) != null && request.getParameter(MOBILE_NUMBER) != null){
            return new RegistrationFormBean(request.getParameter(FIRST_NAME), request.getParameter(LAST_NAME),
                    request.getParameter(EMAIL), request.getParameter(PASS),
                    request.getParameter(MOBILE_NUMBER));
        }
        return null;
    }

    public Map<String, String> validateBean(RegistrationFormBean formBean){
        validator.setFormBean(formBean);
        return  validator.validate();
    }

    public Client transformBean(RegistrationFormBean formBean){
        return new Client(formBean.getFirstName(), formBean.getSecondName(), formBean.getEmail(),
                formBean.getPassword(), formBean.getMobileNumber());
    }
}
