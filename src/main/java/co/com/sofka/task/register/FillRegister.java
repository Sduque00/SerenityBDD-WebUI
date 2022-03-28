package co.com.sofka.task.register;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.sofka.userinterface.register.Register.*;

public class FillRegister implements Task {

    private String email;
    private String firstname;
    private String lastname;
    private String password;
    private String dayofbirth;
    private String monthofbirth;
    private String yearofbirth;
    private String company;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipcode;
    private String country;
    private String description;
    private String homephone;
    private String mobilphone;
    private String addressreference;

    public FillRegister usingTheEmail(String email) {
        this.email = email;
        return this;
    }

    public FillRegister usingTheFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public FillRegister usingTheLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public FillRegister usingThePassword(String password) {
        this.password = password;
        return this;
    }

    public FillRegister usingTheDayofbirth(String dayofbirth) {
        this.dayofbirth = dayofbirth;
        return this;
    }

    public FillRegister usingTheMonthofbirth(String monthofbirth) {
        this.monthofbirth = monthofbirth;
        return this;
    }

    public FillRegister usingTheYearofbirth(String yearofbirth) {
        this.yearofbirth = yearofbirth;
        return this;
    }

    public FillRegister usingTheCompany(String company) {
        this.company = company;
        return this;
    }

    public FillRegister usingTheAddress(String address) {
        this.address = address;
        return this;
    }

    public FillRegister usingTheAddress2(String address2) {
        this.address2 = address2;
        return this;
    }

    public FillRegister usingTheCity(String city) {
        this.city = city;
        return this;
    }

    public FillRegister usingTheState(String state) {
        this.state = state;
        return this;
    }

    public FillRegister usingTheZipcode(String zipcode) {
        this.zipcode = zipcode;
        return this;
    }

    public FillRegister usingTheCountry(String country) {
        this.country = country;
        return this;
    }

    public FillRegister usingTheDescription(String description) {
        this.description = description;
        return this;
    }

    public FillRegister usingTheHomephone(String homephone) {
        this.homephone = homephone;
        return this;
    }

    public FillRegister usingTheMobilphone(String mobilphone) {
        this.mobilphone = mobilphone;
        return this;
    }

    public FillRegister usingTheAddressreference(String addressreference) {
        this.addressreference = addressreference;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(email).into(EMAILADDRESS),
                Click.on(SUBMITCREATE),

                Click.on(GENDERMALE),
                Enter.theValue(firstname).into(FIRSTNAME),

                Enter.theValue(lastname).into(LASTNAME),

                Enter.theValue(password).into(PASSWORD),

                Click.on(DATE_OF_BIRTH.of(dayofbirth)),

                Click.on(CBO_MONTHS_OF_BIRTH.of(monthofbirth)),

                Click.on(DATE_OF_BIRTH.of(yearofbirth)),

                Click.on(NEWSLETTER),
                Click.on(OFFERS),

                Enter.theValue(company).into(COMPANY),

                Enter.theValue(address).into(ADDRESS),

                Enter.theValue(address2).into(ADDRESS2),

                Enter.theValue(city).into(CITY),

                SelectFromOptions.byVisibleText(state).from(STATE),

                Enter.theValue(zipcode).into(ZIPCODE),

                SelectFromOptions.byVisibleText(country).from(COUNTRY),

                Enter.theValue(description).into(ADDITIONAL),

                Enter.theValue(homephone).into(PHONE),

                Enter.theValue(mobilphone).into(PHONEMOBILE),

                Enter.theValue(addressreference).into(ALIAS),

                Click.on(SUBMITREGISTER)


        );

    }

    public static FillRegister fillRegister(){
        return new FillRegister();
    }
}
