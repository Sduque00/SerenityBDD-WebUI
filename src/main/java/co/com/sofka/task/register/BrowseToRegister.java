package co.com.sofka.task.register;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterface.register.Register.SIGNIN;

public class BrowseToRegister implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(SIGNIN),
                Click.on(SIGNIN)

        );

    }

    public static BrowseToRegister browseToRegister(){
        return new BrowseToRegister();
    }
}
