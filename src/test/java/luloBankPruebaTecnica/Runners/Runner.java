package luloBankPruebaTecnica.Runners;



import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/EmployeesGet.feature",
        glue = {"luloBankPruebaTecnica/StepDefinitions"}
)

public class Runner {
}
