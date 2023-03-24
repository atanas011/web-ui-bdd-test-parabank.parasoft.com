package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "steps",
        features = "src/test/resources",
        plugin = {"pretty", "html:target/cucumber-reports/report.html"}
)
public class TestRunner {
}