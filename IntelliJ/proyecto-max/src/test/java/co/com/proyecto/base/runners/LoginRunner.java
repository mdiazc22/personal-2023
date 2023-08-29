package co.com.proyecto.base.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/login/inicio_sesion.feature",
        //glue = "co.com.proyecto.base.definitions", //POM
        glue = "co.com.proyecto.base.stepdefinitions", //Screenplay
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = "pretty",
        tags = "@InicioSesionExitoso"

)
public class LoginRunner {
}
