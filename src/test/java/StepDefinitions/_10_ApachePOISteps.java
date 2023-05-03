package StepDefinitions;

import Pages.DialogContent;
import Utilities.ExcelUtility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;

public class _10_ApachePOISteps {
    DialogContent dc = new DialogContent();
    @When("User create citizenshio with ApachePOI")
    public void userCreateCitizenshioWithApachePOI() {
        ArrayList<ArrayList<String>> tablo =  ExcelUtility.getData(2,"src/test/java/ApachePOI/Resources/ApacheExcel2.xlsx","testCitizen");

        for(ArrayList<String> satir: tablo){
            dc.clickFunc(dc.plus);
            dc.sendKeysFunc(dc.nameInput,satir.get(0));
            dc.sendKeysFunc(dc.shortNameInput,satir.get(1));
            dc.clickFunc(dc.saveButton);
            dc.verifyContainsTextFunc(dc.confirmMsg,"success");

        }
    }

    @Then("User delete citizenship with ApachePOI")
    public void userDeleteCitizenshipWithApachePOI() {
        ArrayList<ArrayList<String>> tablo =  ExcelUtility.getData(2,"src/test/java/ApachePOI/Resources/ApacheExcel2.xlsx","testCitizen");

        for(ArrayList<String> satir: tablo) {
        dc.deleteItem(satir.get(0));
        dc.verifyContainsTextFunc(dc.confirmMsg,"success");
        }
        }
    }

