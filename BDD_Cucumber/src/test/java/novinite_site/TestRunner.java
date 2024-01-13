package novinite_site;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/resources/novinite_site/Login.feature"},

        plugin = {"pretty",
                "html:target/cucumber.html"}
)

public class TestRunner {
}
