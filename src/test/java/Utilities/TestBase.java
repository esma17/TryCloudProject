package Utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase extends Driver {



        @BeforeClass
        public void setUpMethod(){
            getDriver("chrome");
            getDriver().manage().window().maximize();
            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }

        @AfterClass
        public void tearDown(){
            getDriver().close();
        }

    }

