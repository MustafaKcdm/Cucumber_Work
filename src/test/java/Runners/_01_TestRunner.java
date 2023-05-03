package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_01_Login.feature"}, //feature file path
        glue = {"StepDefinitions"}      //stepdef file name
)
public class _01_TestRunner extends AbstractTestNGCucumberTests {
}
