package co.com.sofka.stepdefinition.contactus;

import co.com.sofka.exception.ValidationTextDoNotMatch;
import co.com.sofka.stepdefinition.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.question.contactus.Contactus.contactUsValidation;
import static co.com.sofka.task.contactus.BrowseToContactUs.browseToContactUs;
import static co.com.sofka.task.contactus.FillContactUs.fillContactUs;
import static co.com.sofka.task.landingpage.OpenLandingPage.openLandingPage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class ContactUsTestStepDefinition extends Setup {

    private static final String ACTOR_NAME = "User";

    @Given("El usuario ya registrado está en la página de destino")
    public void elUsuarioYaRegistradoEstáEnLaPáginaDeDestino() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openLandingPage()
        );

    }

    @When("el navega hasta el formulario de Contac us")
    public void elNavegaHastaElFormularioDeContacUs() {
        theActorInTheSpotlight().attemptsTo(
                browseToContactUs()
        );

    }

    @When("el ingresa los campos del formulario y confirma la accion")
    public void elIngresaLosCamposDelFormularioYConfirmaLaAccion(io.cucumber.datatable.DataTable dataTable) {
        theActorInTheSpotlight().attemptsTo(
                fillContactUs()
                        .usingTheCabecera(dataTable.row(0).get(1))
                        .usingTheEmail(dataTable.row(1).get(1))
                        .usingTheReferencia(dataTable.row(2).get(1))
                        .usingTheMensaje(dataTable.row(3).get(1))
        );

    }

    @Then("el usuario verá un mensaje exitoso")
    public void elUsuarioVeráUnMensajeExitoso() {
        theActorInTheSpotlight().should(
                seeThat(
                        contactUsValidation(),equalTo(true)
                ).orComplainWith(ValidationTextDoNotMatch.class)
        );

    }



    @When("el usuario navega hasta el formulario de Contac us")
    public void elUsuarioNavegaHastaElFormularioDeContacUs() {
        theActorInTheSpotlight().attemptsTo(
                browseToContactUs()
        );

    }

    @When("el ingresa los campos del formulario, adjunta un archivo y confirma la accion")
    public void elIngresaLosCamposDelFormularioAdjuntaUnArchivoYConfirmaLaAccion(io.cucumber.datatable.DataTable dataTable) {
        theActorInTheSpotlight().attemptsTo(

        );

    }

    @Then("el usuario verá un mensaje exitoso en la pagina")
    public void elUsuarioVeráUnMensajeExitosoEnLaPagina() {

    }

}
