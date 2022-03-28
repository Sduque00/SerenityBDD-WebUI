package co.com.sofka.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.components.FileToUpload;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.WebDriver;

import static co.com.sofka.userinterface.contactus.ContactUs.UPLOAD;


public class Upload implements Interaction {

    private String fileName;

    public Upload(String fileName) {
        this.fileName = fileName;
    }

    public static Upload archive(String fileName){
        return Tasks.instrumented(Upload.class, fileName);
    }

    @Step("Upload file from local machine.")
    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver webDriver = ThucydidesWebDriverSupport.getProxiedDriver();
        FileToUpload fileToUpload = new FileToUpload(webDriver,"src/main/resources/files/"+fileName);
        fileToUpload.fromLocalMachine().to(UPLOAD.resolveFor(actor));
    }
}