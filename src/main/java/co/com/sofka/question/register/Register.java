package co.com.sofka.question.register;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterface.signin.SignIn.LOGIN_VALIDATION;

public class Register implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return (LOGIN_VALIDATION.resolveFor(actor).containsOnlyText(
                "Welcome to your account. Here you can manage all of your personal information and orders."));
    }

    public static Register registerValidation(){
        return new Register();
    }
}
