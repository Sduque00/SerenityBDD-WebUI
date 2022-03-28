package co.com.sofka.task.signin;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterface.signin.SignIn.SIGNIN;

public class BrowseToLognIn implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(SIGNIN),
                Click.on(SIGNIN)

        );
    }
    public static BrowseToLognIn browseToLognIn(){
        return new BrowseToLognIn();
    }
}
