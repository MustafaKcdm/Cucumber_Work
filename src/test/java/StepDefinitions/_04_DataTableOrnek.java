import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;

public class _04_DataTableOrnek {
    @When("Write username{string}")
    public void writeUsername(String username) {
        System.out.println("username = " + username);


    }

    @And("Write username and password")
    public void writeUsernameAndPassword() {

    }

    @And("Write username and as password {string}{int}\"")
    public void writeUsernameAndAsPassword(String username, String password) throws Throwable {
        System.out.println("username = " + username + " password = " + password);
    }

    @And("Write username as DataTable")
    public void writeUsernameAsDataTable(DataTable items) {
       List<String> itemslist = items.asList(String.class);
        for(String e : itemslist){
            System.out.println("e = " + e);
        }
    }
}