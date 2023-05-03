package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.When;

public class _06_FeeScenarioOutlineDatabase {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @When("User creates a citizenship name as {string} and code name as {string} and priorty as {string}")
    public void userCreatesACitizenshipNameAsAndCodeNameAsAndPriortyAs(String name, String code, String priorty) {
    dc.sendKeysFunc(dc.nameInput,name);
    dc.sendKeysFunc(dc.codeInput, code);
    dc.sendKeysFunc(dc.priortyInput, priorty);
    }
}
