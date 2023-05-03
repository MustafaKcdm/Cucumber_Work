package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GWD {

    //her threade özel lokal static driver oluşturur
    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    private  static  ThreadLocal<String> threadBrowserName = new ThreadLocal<>(); //browser thredleme


    //threadDriver.get() -> bulunulan yere thread driverı verecek
    //threadDriver.set() -> bulunulan threade driverı  setleycelek


    public static WebDriver getDriver()
    {
        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN"); // extended raporun türkçe çalışmaması sebebiylekoyuldu

        Logger logger= Logger.getLogger("");
        logger.setLevel(Level.SEVERE);
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

        if(threadBrowserName.get()==null)
            threadBrowserName.set("chrome");

        if(threadDriver.get()==null) {

            switch (threadBrowserName.get())
            {
                case "firefox":
                    threadDriver.set(new FirefoxDriver());
                    break;

                case "safari":
                    threadDriver.set(new SafariDriver());
                    break;

                case "edge":
                    threadDriver.set(new EdgeDriver());
                    break;

                case "chrome":
                    ChromeOptions options = new ChromeOptions();
                    //jenkins için options
                    options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage", "--disable-gpu", "--window-size=1400,2400");
                    threadDriver.set(new ChromeDriver(options));

                    break;
            }

            threadDriver.get().manage().window().maximize();
        }
        return threadDriver.get();
    }

    public static void quitDriver(){
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        if(threadDriver.get()!= null){
        threadDriver.get().quit();
        WebDriver driver = threadDriver.get();
        driver=null;
        threadDriver.set(driver);}

    }

public static void threadBrowserSet(String browser){
        threadBrowserName.set(browser);

}
    public static String  threadBrowserGet(){
       return threadBrowserName.get();

    }


}
