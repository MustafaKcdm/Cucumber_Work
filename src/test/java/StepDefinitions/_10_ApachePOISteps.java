package StepDefinitions;

import Utilities.ExcelUtility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;

public class _10_ApachePOISteps {
    @When("User create citizenshio with ApachePOI")
    public void userCreateCitizenshioWithApachePOI() {
        ArrayList<ArrayList<String>> tablo =  ExcelUtility.getData(2,"src/test/java/ApachePOI/Resources/ApacheExcel2.xlsx","")
    }

    @Then("User delete citizenship with ApachePOI")
    public void userDeleteCitizenshipWithApachePOI() {
    }
}
