package Utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 extends TestBase {



   @Test
    public void t1(){
        LogIn log=LogIn.getLog();
       Driver.navigate(ConfigurationReader.configurationReader("url"));
        log.user53();

    }
}
