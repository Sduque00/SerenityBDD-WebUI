package co.com.sofka.userinterface.signin;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.*;

public class SignIn extends PageObject {

    public static final Target SIGNIN = Target
            .the("SignIn")
            .located(xpath("//header[@id='header']/div[2]/div/div/nav/div/a"));

    public static final Target USERNAME = Target
            .the("UserName")
            .located(id("email"));

    public static final Target PASSWORD = Target
            .the("Password")
            .located(id("passwd"));

    public static final Target SUBMIT = Target
            .the("Submit")
            .located(xpath("//button[@id='SubmitLogin']/span"));

    //For validations.

    public static final Target LOGIN_VALIDATION= Target
            .the("Login_Validation")
            .located(cssSelector(".info-account"));

    public static final Target INVALID_PASSWORD= Target
            .the("InvalidPassword")
            .located(xpath("//div[@id='center_column']/div/ol/li"));
}
