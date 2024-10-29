package co.co.sofka.demoblaze.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/crearUsuario.feature",
        tags = "@success",
        glue = "co.co.sofka.demoblaze.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE

)
public class CreateUserRunner {
}
