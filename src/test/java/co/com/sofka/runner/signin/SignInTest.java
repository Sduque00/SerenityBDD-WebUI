package co.com.sofka.runner.signin;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = "src/test/resources/features/signin/signin.feature",
        glue = "co.com.sofka.stepdefinition.signin",
        tags = ""
)
public class SignInTest {
}
