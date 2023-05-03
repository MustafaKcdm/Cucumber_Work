package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _01_LoginSteps extends GWD {
    DialogContent dc = new DialogContent();
    @Given("Navigate to Campus")
    public void navigateToCampus() {
        GWD.getDriver().get("https://test.mersys.io");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Enter username and password and click to the login button")
    public void enterUsernameAndPasswordAndClickToTheLoginButton() {


//        WebDriverWait wait = new WebDriverWait(GWD.getDriver(),Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.visibilityOf(dc.usernameTextbox));
//        dc.usernameTextbox.sendKeys("turkeyts");
//        dc.passwordTextbox.sendKeys("TechnoStudy123");
//        dc.loginButton.click();

        dc.findAndSend(dc.usernameTextbox,"turkeyts");
        dc.findAndSend(dc.passwordTextbox,"TechnoStudy123");
        dc.findAndClick(dc.loginButton);

    }

    @Then("User should login succesfully")
    public void userShouldLoginSuccesfully() {
        dc.verifyContainsTextFunc(dc.txtTechnoStudy,"Techno");
    }

}
