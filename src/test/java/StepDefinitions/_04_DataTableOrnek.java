package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;

public class _04_DataTableOrnek {
    @When("Write username{string}")
    public void writeUsername(String username) {
        System.out.println("username = " + username);
    }


    @And("Write username as DataTable")
    public void writeUsernameAsDataTable(DataTable items) {
       List<String> itemslist = items.asList(String.class);
        for(String e : itemslist){
            System.out.println("e = " + e);
        }
    }

    @And("Write username and as password {string} and {string}")
        public void writeUsernameAndAsPasswordAnd(String username, String password) {
        System.out.println("username = " + username + " password = " + password);
    }

    @And("Write username and as password as DataTable")
    public void writeUsernameAndAsPasswordAsDataTable(DataTable userData) {
        List<List<String> > datalist = userData.asLists(String.class);
        for (int i = 0; i < datalist.size(); i++) {
            System.out.println("User Data List = " + datalist.get(i).get(0) + " " +
                    datalist.get(i).get(1));

        }
    }
}