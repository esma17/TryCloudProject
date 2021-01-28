package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public  class Driver {
    private static WebDriver driver;

    public static WebDriver getDriver(String browserName) {
        return setUp(browserName);
    }
    public static WebDriver getDriver(){
return driver;
    }

    public static WebDriver setUp(String browserName) {
        switch (browserName.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                return driver;


            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                return driver;

            case "safari":
                driver = new SafariDriver();
                driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                return driver;

            default:
                throw new RuntimeException("Invalid browser name");
                //hello



        }
    }

    public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
    public static void navigate(String url){
        driver.get(url);
    }



    public static void driverQuit() {
        driver.quit();
    }

}
