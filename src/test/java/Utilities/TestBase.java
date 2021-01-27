package Utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase extends Driver {



        public WebDriver driver;

        @BeforeClass
        public void setUpMethod(){
            driver = getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        }

        @AfterClass
        public void tearDown(){
            driver.close();
        }

    }

