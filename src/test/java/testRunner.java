import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Screenshots;
import org.junit.runner.RunWith;
import org.testng.annotations.Test;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/transferencia"},
        monochrome = false,
        glue = {"steps"},
        plugin ={"json:target/cucumber.json","html:target/site/cucumber-pretty"},
        tags = "@happyPath")

@Test
@Screenshots(forEachAction=true)
public class testRunner {
}


