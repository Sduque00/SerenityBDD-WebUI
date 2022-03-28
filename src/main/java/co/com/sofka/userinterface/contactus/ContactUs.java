package co.com.sofka.userinterface.contactus;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.*;

public class ContactUs extends PageObject {

    public static final Target CONTACTUS = Target
            .the("ContactUs")
            .located(xpath("//a[contains(text(),'Contact us')]"));

    public static final Target HEADING = Target
            .the("Heading")
            .located(xpath("//select[@id='id_contact']"));

    public static final Target EMAIL = Target
            .the("Email")
            .located(id("email"));

    public static final Target ORDER = Target
            .the("Order")
            .located(id("id_order"));

    public static final Target UPLOAD = Target
            .the("Upload")
            .located(id("fileUpload"));

    public static final Target MESSAGE = Target
            .the("Message")
            .located(id("message"));

    public static final Target SUBMIT = Target
            .the("Submit")
            .located(xpath("//button[@id='submitMessage']/span"));

    //For validations.

    public static final Target CONTACT_US_VALIDATION= Target
            .the("Contact_Us_Validation")
            .located(xpath("//div[@id='center_column']/p"));
}
