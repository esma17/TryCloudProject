package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.LogIn;

public class Test1 extends LogIn {


    @Test
    public void t1() {
        getDriver().findElement(By.xpath("//a[.='Recent']")).click();
        sleep(3);
        // hello

    }

}
