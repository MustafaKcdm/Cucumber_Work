package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest", //smoketest etiketli featurelar çalışır
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"}
)

public class _04_TestRunnerSmoke extends AbstractTestNGCucumberTests {
}
