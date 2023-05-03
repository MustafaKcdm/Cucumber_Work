package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;

public class Hookz {

    @After //her senaryodan sonra otomatik çalışır, cucumber annotation'ıdır.
    public void after(){
        System.out.println("Senaryo Sonu");
        GWD.quitDriver();
    }
}
