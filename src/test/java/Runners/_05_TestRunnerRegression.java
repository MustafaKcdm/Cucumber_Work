package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        //tags = "@SmokeTest and @Regression", // and  olduğu zaman iki etiketin aynı anda bulunması gerekir çalışması için
        tags = "@SmokeTest or @Regression", //smoketest ve regression etiketli featurelar çalışır
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin = {"json:target/cucumber/cucumber.json"} //jenkinsde cucumber raporu için eklendi

)

public class _05_TestRunnerRegression extends AbstractTestNGCucumberTests {
}
