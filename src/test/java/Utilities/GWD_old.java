package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GWD_old {
    public static WebDriver driver;


    @BeforeClass
    public static WebDriver getDriver()
    {
        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN"); // extended raporun türkçe çalışmaması sebebiylekoyuldu

        Logger logger= Logger.getLogger("");
        logger.setLevel(Level.SEVERE);
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

        if(driver==null) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
        }
        return driver;
    }

    public static void quitDriver(){
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        if(driver!= null){
        driver.quit();
        driver=null; }

    }

}
