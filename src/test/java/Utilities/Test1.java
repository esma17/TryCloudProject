package Utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {

    @BeforeMethod
    public void setUp(){
        Driver.getDriver("chrome");
        Driver.navigate("http://app.trycloud.net/index.php/login");
    }

   @Test
    public void t1(){
        LogIn log=LogIn.getLog();
        log.user113();
    }
}
