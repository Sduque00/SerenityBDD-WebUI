package co.com.sofka.task.contactus;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.sofka.userinterface.contactus.ContactUs.*;


public class FillContactUs implements Task {
    private String cabecera;
    private String email;
    private String referencia;
    private String mensaje;

    public FillContactUs usingTheCabecera(String cabecera) {
        this.cabecera = cabecera;
        return this;
    }

    public FillContactUs usingTheEmail(String email) {
        this.email = email;
        return this;
    }

    public FillContactUs usingTheReferencia(String referencia) {
        this.referencia = referencia;
        return this;
    }

    public FillContactUs usingTheMensaje(String mensaje) {
        this.mensaje = mensaje;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

            Scroll.to(HEADING),
            SelectFromOptions.byVisibleText(cabecera).from(HEADING),

            Enter.theValue(email).into(EMAIL),
            Enter.theValue(referencia).into(ORDER),
            Enter.theValue(mensaje).into(MESSAGE),

            Click.on(SUBMIT)
        );
    }

    public static FillContactUs fillContactUs(){
        return new FillContactUs();
    }
}
