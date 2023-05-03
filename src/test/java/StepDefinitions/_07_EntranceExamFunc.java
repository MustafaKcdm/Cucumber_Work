package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;

public class _07_EntranceExamFunc {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();
    @And("Select items in the combobox on Dialog")
    public void selectItemsInTheComboboxOnDialog() {
        dc.selectItem(0,dc.academicPeriod);
        dc.selectItem(0,dc.gradeLevel);


    }
}
