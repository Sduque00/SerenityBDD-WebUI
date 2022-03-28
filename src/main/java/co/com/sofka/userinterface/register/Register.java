package co.com.sofka.userinterface.register;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;
import static org.openqa.selenium.By.cssSelector;

public class Register extends PageObject {
    public static final Target SIGNIN = Target
            .the("SignIn")
            .located(xpath("//header[@id='header']/div[2]/div/div/nav/div/a"));

    public static final Target EMAILADDRESS = Target
            .the("EmailAddress")
            .located(id("email_create"));

    public static final Target SUBMITCREATE = Target
            .the("SubmitCreate")
            .located(xpath("//button[@id='SubmitCreate']/span"));

    public static final Target GENDERMALE= Target
            .the("GenderMale")
            .located(id("id_gender1"));

    public static final Target GENDERFEMALE= Target
            .the("GenderFemale")
            .located(id("id_gender2"));

    public static final Target FIRSTNAME= Target
            .the("FirstName")
            .located(id("customer_firstname"));

    public static final Target LASTNAME= Target
            .the("LastName")
            .located(id("customer_lastname"));

    public static final Target PASSWORD= Target
            .the("Password")
            .located(id("passwd"));

    public static final Target DATE_OF_BIRTH = Target
            .the("Days")
            .locatedBy("(//*[@value='{0}'])[1]");

    public static final Target CBO_MONTHS_OF_BIRTH = Target
            .the("Months")
            .locatedBy("//*[contains(text(), '{0}')]");

    public static final Target NEWSLETTER= Target
            .the("Newsletter")
            .located(id("newsletter"));

    public static final Target OFFERS= Target
            .the("Offers")
            .located(id("optin"));

    public static final Target COMPANY= Target
            .the("Company")
            .located(id("company"));

    public static final Target ADDRESS= Target
            .the("Address")
            .located(id("address1"));

    public static final Target ADDRESS2= Target
            .the("Address2")
            .located(id("address2"));

    public static final Target CITY= Target
            .the("City")
            .located(id("city"));

    public static final Target STATE= Target
            .the("State")
            .located(id("id_state"));

    public static final Target ZIPCODE= Target
            .the("ZipCode")
            .located(id("postcode"));

    public static final Target COUNTRY= Target
            .the("Country")
            .located(id("id_country"));

    public static final Target ADDITIONAL= Target
            .the("Additional")
            .located(id("other"));

    public static final Target PHONE= Target
            .the("Phone")
            .located(id("phone"));

    public static final Target PHONEMOBILE= Target
            .the("PhoneMobile")
            .located(id("phone_mobile"));

    public static final Target ALIAS= Target
            .the("Alias")
            .located(id("alias"));

    public static final Target SUBMITREGISTER= Target
            .the("SubmitRegister")
            .located(xpath("//button[@id='submitAccount']/span"));

    //For validations.

    public static final Target REGISTER_VALIDATION= Target
            .the("Register_Validation")
            .located(cssSelector(".info-account"));

    public static final Target PASSWORD_NONE_VALIDATION= Target
            .the("Password_None_Validation")
            .located(xpath("//div[@id='center_column']/div/ol/li"));


}
