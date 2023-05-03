package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;

public class _08_entranceExamScenarioOutlineSteps {
    DialogContent dc = new DialogContent();

    @And("User creates a exam name as {string}")
    public void userCreatesAExamNameAs(String name) {
        dc.sendKeysFunc(dc.nameInput,name);
        dc.clickFunc(dc.academicPeriod);
        dc.clickFunc(dc.academicPeriod2);
        dc.clickFunc(dc.gradeLevel);
        dc.clickFunc(dc.gradeLevel2);

    }
}
