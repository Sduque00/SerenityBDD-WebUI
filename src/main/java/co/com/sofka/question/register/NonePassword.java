package co.com.sofka.question.register;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterface.register.Register.PASSWORD_NONE_VALIDATION;

public class NonePassword implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return (PASSWORD_NONE_VALIDATION.resolveFor(actor).containsOnlyText("passwd is required."));
    }
    public static NonePassword nonePasswordValidation(){
        return new NonePassword();
    }
}
