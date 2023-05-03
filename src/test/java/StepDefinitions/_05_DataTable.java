package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _05_DataTable {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("Click to the element in Dialog")
    public void clickToTheElementInDialog(DataTable buttons) {
        List<String> strButtons = buttons.asList(String.class);

        for (String strButton : strButtons) {
            WebElement element = dc.getWebElement(strButton);
            dc.clickFunc(element);
        }

    }

    @And("Click to the element in LeftNav")
    public void clickToTheElementInLeftNav(DataTable items) {
        List<String> strButtons = items.asList(String.class);

        for (String strButton : strButtons) {

            WebElement element = ln.getWebElement(strButton);
            ln.clickFunc(element);
        }
    }

    @And("User sending the keys in the Dialog Content")
    public void userSendingTheKeysInTheDialogContent(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);//ÖNEMLİ

        for (int i = 0; i < items.size(); i++) {
            WebElement element = dc.getWebElement(items.get(i).get(0));//ÖNEMLİ
            dc.sendKeysFunc(element, items.get(i).get(1));

        }



    }


    @And("User delete item named from Dialog Content")
    public void userDeleteItemNamedFromDialogContent(DataTable dt) {
        List<String> items = dt.asList(String.class);//ÖNEMLİ

        for (String deleteItem : items) {
            dc.deleteItem(deleteItem);

        }
    }
}
