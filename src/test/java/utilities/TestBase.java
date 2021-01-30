package utilities;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase extends Driver {


//    @BeforeClass
//    public void setUpMethod(String key) {
//        getDriver("chrome");
//        getDriver().manage().window().maximize();
//        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        Driver.navigate("http://app.trycloud.net/index.php/login");
//        login(key);
//
//    }

    @BeforeClass
    public void setUpMethod() {
        getDriver("chrome");
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.navigate("http://app.trycloud.net/index.php/login");


//        log.login();


    }

    @AfterClass
    public void tearDown() {
        getDriver().close();
    }

}

