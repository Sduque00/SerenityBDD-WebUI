package co.com.sofka.task.contactus;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterface.contactus.ContactUs.CONTACTUS;

public class BrowseToContactUs implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(CONTACTUS),
                Click.on(CONTACTUS)
        );

    }
    public static BrowseToContactUs browseToContactUs(){
        return new BrowseToContactUs();
    }
}
