package co.com.sofka.question.contactus;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterface.contactus.ContactUs.CONTACT_US_VALIDATION;

public class Contactus implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return (CONTACT_US_VALIDATION.resolveFor(actor).containsOnlyText(
                "Your message has been successfully sent to our team."));
    }
    public static Contactus contactUsValidation(){
        return new Contactus();
    }
}
