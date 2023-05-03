package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _03_CitizenshipSteps {
    LeftNav ln =new LeftNav();
    DialogContent dc = new DialogContent();
    @And("Navigate to citizenship page")
    public void navigateToCitizenshipPage() {

        ln.clickFunc(ln.setup);
        ln.clickFunc(ln.parameters);
        ln.clickFunc(ln.citizenship);    }

    @When("Create a citizen")
    public void createACitizen() {
        dc.clickFunc(dc.plus);
        dc.sendKeysFunc(dc.nameInput,"tryw4");
        dc.sendKeysFunc(dc.shortNameInput,"128e3");
        dc.clickFunc(dc.saveButton);


    }

    @When("User creates a citizenship name as {string} and short name as {string}")
    public void userCreatesACitizenshipNameAsAndShortNameAs(String name, String shortname) {
        dc.clickFunc(dc.plus);
        dc.sendKeysFunc(dc.nameInput,name);
        dc.sendKeysFunc(dc.shortNameInput,shortname);
        dc.clickFunc(dc.saveButton);



    }

    @Then("Alert message should be displayed")
    public void alertMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunc(dc.alreadyExist,"already");
    }


    @When("User delete the {string}")
    public void userDeleteThe(String searchText) {
        dc.deleteItem(searchText);






    }
}
