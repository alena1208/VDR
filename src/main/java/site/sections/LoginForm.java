package site.sections;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.Text;
import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import org.openqa.selenium.support.FindBy;

public class LoginForm extends Form {
    @FindBy(id = "Login")
    TextField login;

    @FindBy(id = "Password")
    TextField password;

    @FindBy(id = "SubmitLogin")
    Button buttonOK;
}
