package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class _02_ContrySteps {

    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();


    @And("Navigate to country page")
    public void navigateToCountryPage() {
        ln.clickFunc(ln.setup);
        ln.clickFunc(ln.parameters);
        ln.clickFunc(ln.countries);
           }

    @When("Create a country")
    public void createACountry() {
        String countryName = RandomStringUtils.randomAlphanumeric(8);// 8 harf
        String countryCode = RandomStringUtils.randomNumeric(4);// 4 sayı üretir
        dc.clickFunc(dc.plus);
        dc.sendKeysFunc(dc.nameInput,countryName);
        dc.sendKeysFunc(dc.codeInput,countryCode);
        dc.clickFunc(dc.saveButton);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
      dc.verifyContainsTextFunc(dc.confirmMsg,"success");
    }

    @When("create a country name as {string} code as {string}")
    public void createACountryNameAsCodeAs(String name, String code) {
        dc.clickFunc(dc.plus);
        dc.sendKeysFunc(dc.nameInput,name);
        dc.sendKeysFunc(dc.codeInput,code);
        dc.clickFunc(dc.saveButton);
    }
}
