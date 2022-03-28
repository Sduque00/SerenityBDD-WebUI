package co.com.sofka.question.lognin;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterface.register.Register.REGISTER_VALIDATION;

public class LognIn implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return (REGISTER_VALIDATION.resolveFor(actor).containsOnlyText(
                "Welcome to your account. Here you can manage all of your personal information and orders."));
    }

    public static LognIn lognInValidation(){
        return new LognIn();
    }
}
