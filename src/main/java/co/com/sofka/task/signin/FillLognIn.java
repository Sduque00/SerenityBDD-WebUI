package co.com.sofka.task.signin;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.sofka.userinterface.signin.SignIn.*;

public class FillLognIn implements Task {

    private String username;
    private String password;

    public FillLognIn usingTheUsername(String username) {
        this.username = username;
        return this;
    }

    public FillLognIn usingThePassword(String password) {
        this.password = password;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(USERNAME),

                Enter.theValue(password).into(PASSWORD),

                Click.on(SUBMIT)
        );
    }

    public static FillLognIn fillLognIn(){
        return new FillLognIn();
    }
}
