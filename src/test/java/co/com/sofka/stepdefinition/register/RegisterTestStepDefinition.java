package co.com.sofka.stepdefinition.register;

import co.com.sofka.exception.ValidationTextDoNotMatch;
import co.com.sofka.stepdefinition.Setup;
import io.cucumber.datatable.DataTable;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.question.register.NonePassword.nonePasswordValidation;
import static co.com.sofka.question.register.Register.registerValidation;
import static co.com.sofka.task.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.task.register.BrowseToRegister.browseToRegister;
import static co.com.sofka.task.register.FillRegister.fillRegister;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class RegisterTestStepDefinition extends Setup {

    private static final String ACTOR_NAME = "User";

    @Given("the user is on landing page")
    public void theUserIsOnLandingPage() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openLandingPage()

        );

    }

    @When("him browse to registration form")
    public void himBrowseToRegistrationForm() {
        theActorInTheSpotlight().attemptsTo(
                browseToRegister()
        );
    }

    @When("him has filled it and submitted")
    public void himHasFilledItAndSubmitted(DataTable dataTable) {
        Faker faker = Faker.instance();
        theActorInTheSpotlight().attemptsTo(
                fillRegister()
                .usingTheEmail(faker.name().username()+dataTable.row(0).get(1))
                .usingTheFirstname(dataTable.row(1).get(1))
                .usingTheLastname(dataTable.row(2).get(1))
                .usingThePassword(dataTable.row(3).get(1))
                .usingTheDayofbirth(dataTable.row(4).get(1))
                .usingTheMonthofbirth(dataTable.row(5).get(1))
                .usingTheYearofbirth(dataTable.row(6).get(1))
                .usingTheCompany(dataTable.row(7).get(1))
                .usingTheAddress(dataTable.row(8).get(1))
                .usingTheAddress2(dataTable.row(9).get(1))
                .usingTheCity(dataTable.row(10).get(1))
                .usingTheState(dataTable.row(11).get(1))
                .usingTheZipcode(dataTable.row(12).get(1))
                .usingTheCountry(dataTable.row(13).get(1))
                .usingTheDescription(dataTable.row(14).get(1))
                .usingTheHomephone(dataTable.row(15).get(1))
                .usingTheMobilphone(dataTable.row(16).get(1))
                .usingTheAddressreference(dataTable.row(17).get(1))
        );
    }

    @Then("the user will see a registration information")
    public void theUserWillSeeARegistrationInformation() {
        theActorInTheSpotlight().should(
                seeThat(
                        registerValidation(), equalTo(true)
                ).orComplainWith(ValidationTextDoNotMatch.class)
        );

    }

    @Given("the user is on page")
    public void theUserIsOnPage() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openLandingPage()

        );

    }

    @When("the user browse to registration form")
    public void theUserBrowseToRegistrationForm() {
        theActorInTheSpotlight().attemptsTo(
                browseToRegister()
        );

    }

    @When("him has filled it except password and submitted")
    public void himHasFilledItExceptPasswordAndSubmitted(io.cucumber.datatable.DataTable dataTable) {
        Faker faker = Faker.instance();
        theActorInTheSpotlight().attemptsTo(
                fillRegister()
                        .usingTheEmail(faker.name().username()+dataTable.row(0).get(1))
                        .usingTheFirstname(dataTable.row(1).get(1))
                        .usingTheLastname(dataTable.row(2).get(1))
                        .usingThePassword("")
                        .usingTheDayofbirth(dataTable.row(4).get(1))
                        .usingTheMonthofbirth(dataTable.row(5).get(1))
                        .usingTheYearofbirth(dataTable.row(6).get(1))
                        .usingTheCompany(dataTable.row(7).get(1))
                        .usingTheAddress(dataTable.row(8).get(1))
                        .usingTheAddress2(dataTable.row(9).get(1))
                        .usingTheCity(dataTable.row(10).get(1))
                        .usingTheState(dataTable.row(11).get(1))
                        .usingTheZipcode(dataTable.row(12).get(1))
                        .usingTheCountry(dataTable.row(13).get(1))
                        .usingTheDescription(dataTable.row(14).get(1))
                        .usingTheHomephone(dataTable.row(15).get(1))
                        .usingTheMobilphone(dataTable.row(16).get(1))
                        .usingTheAddressreference(dataTable.row(17).get(1))
        );

    }

    @Then("the user will see a registration error")
    public void theUserWillSeeARegistrationError() {
        theActorInTheSpotlight().should(
                seeThat(
                        nonePasswordValidation(), equalTo(true)
                ).orComplainWith(ValidationTextDoNotMatch.class)
        );

    }

}
