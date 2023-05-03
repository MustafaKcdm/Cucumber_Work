package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_02_AddCountry.feature",
        "src/test/java/FeatureFiles/_01_Login.feature"},
        glue = {"StepDefinitions"},
        dryRun = true
        // true olduğunda testi çalıştırmaz sadece featurelara
        // ait steplerin varlığını kontrol eder.
        // false olduğunda ise testi çalıştırır.
)
public class _02_TestRunnerFeatures extends AbstractTestNGCucumberTests {
}
