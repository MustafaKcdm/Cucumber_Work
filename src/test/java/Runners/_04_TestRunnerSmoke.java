package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest", //smoketest etiketli featurelar çalışır
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin = {"html:target/site/cucumber-pretty.html"} //jenkins için eklendi

)

public class _04_TestRunnerSmoke extends AbstractTestNGCucumberTests {
}
