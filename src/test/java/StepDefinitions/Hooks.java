package StepDefinitions;

import Utilities.ExcelUtility;
import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @After //her senaryodan sonra otomatik çalışır, cucumber annotation'ıdır.
    public void after(Scenario senaryo){
        System.out.println("Senaryo Sonu");
        ExcelUtility.writeExcel("src/test/java/ApachePOI/Resources/ScenarioResults.xlsx",senaryo,GWD.threadBrowserGet());

        if (senaryo.isFailed()){
            //extend report
            TakesScreenshot ts=(TakesScreenshot) GWD.getDriver();
            final byte[] hafizadakiHali=ts.getScreenshotAs(OutputType.BYTES);
            senaryo.attach(hafizadakiHali, "image/png","screen shot");
        }

        GWD.quitDriver();
    }
}
