import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"/home/marcin/IdeaProjects/Zadanie/src/test/java/cucumber/steps.feature"}
)

public class Runner {
}
