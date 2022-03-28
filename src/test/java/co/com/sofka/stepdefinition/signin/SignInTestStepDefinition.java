package co.com.sofka.stepdefinition.signin;

import co.com.sofka.exception.ValidationTextDoNotMatch;
import co.com.sofka.stepdefinition.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.question.lognin.InvalidPassword.invalidPasswordValidation;
import static co.com.sofka.question.lognin.LognIn.lognInValidation;
import static co.com.sofka.task.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.task.signin.BrowseToLognIn.browseToLognIn;
import static co.com.sofka.task.signin.FillLognIn.fillLognIn;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class SignInTestStepDefinition extends Setup {

    private static final String ACTOR_NAME = "User";

    @Given("El usuario ya registrado está en la página de destino")
    public void elUsuarioYaRegistradoEstáEnLaPáginaDeDestino() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openLandingPage()
        );

    }

    @When("el navega hasta el formulario de login")
    public void elNavegaHastaElFormularioDeLogin() {
        theActorInTheSpotlight().attemptsTo(
                browseToLognIn()
        );

    }

    @When("el digita usuario y contraseña y da click en Signin")
    public void elDigitaUsuarioYContraseñaYDaClickEnSignin(io.cucumber.datatable.DataTable dataTable) {
        theActorInTheSpotlight().attemptsTo(
                fillLognIn()
                .usingTheUsername(dataTable.row(0).get(1))
                .usingThePassword(dataTable.row(1).get(1))
        );

    }

    @Then("el usuario verá una información de inicio de sesion")
    public void elUsuarioVeráUnaInformaciónDeInicioDeSesion() {
        theActorInTheSpotlight().should(
                seeThat(
                        lognInValidation(), equalTo(true)
                ).orComplainWith(ValidationTextDoNotMatch.class)
        );

    }

    @When("el navega hasta el formulario")
    public void elNavegaHastaElFormulario() {
        theActorInTheSpotlight().attemptsTo(
                browseToLognIn()
        );

    }

    @When("el digita usuario,contraseña incorrecta y da click en Signin")
    public void elDigitaUsuarioContraseñaIncorrectaYDaClickEnSignin(io.cucumber.datatable.DataTable dataTable) {
        theActorInTheSpotlight().attemptsTo(
                fillLognIn()
                        .usingTheUsername(dataTable.row(0).get(1))
                        .usingThePassword(dataTable.row(1).get(1))
        );

    }

    @Then("el usuario vera mensaje de contraseña invalida")
    public void elUsuarioVeraMensajeDeContraseñaInvalida() {
        theActorInTheSpotlight().should(
                seeThat(
                        invalidPasswordValidation(), equalTo(true)
                ).orComplainWith(ValidationTextDoNotMatch.class)
        );

    }
}
