package runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions (
    features = "src/test/resources/features/herokuApp.feature",
    glue = "steps",
    plugin = {"html:target/cucumber-reports.html"}
        )

public class HerokuRunner extends AbstractTestNGCucumberTests{

}
