package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"StepDefinitions"},
monochrome= true,
plugin={"pretty", "html:target/Htmlreport/report.html", "json:target/JSONreport/report.json", "junit:target/XMLreport/report.xml"}
//tags="@smoketest"
)

//RunWith is junit annotation
//CucumberOption is cucumber junit annotation
//monochrome is to format the console output 
//plugin is to generate reports and we can also configure at that time of CI/CD jenkins deployment

public class TestRunner {

}
