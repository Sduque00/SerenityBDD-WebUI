package co.com.sofka.question.lognin;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterface.signin.SignIn.INVALID_PASSWORD;


public class InvalidPassword implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return (INVALID_PASSWORD.resolveFor(actor).containsOnlyText("Authentication failed."));
    }

    public static InvalidPassword invalidPasswordValidation(){
        return new InvalidPassword();
    }
}
