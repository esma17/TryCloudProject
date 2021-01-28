package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

//LogIn has TesBase and Driver
public class LogIn extends TestBase {
    private static LogIn log;


    public LogIn() {
        PageFactory.initElements(getDriver(), this);
    }


    public static LogIn getLogInstance() {
        if (log == null) {
            log = new LogIn();
        }
        return log;
    }


    @FindBy(how = How.XPATH, using = "//p[@class='grouptop']/input")
    public WebElement loginBox;

    @FindBy(how = How.XPATH, using = "//p[@class='groupbottom']/input")
    public WebElement passwordBox;

    @FindBy(how = How.XPATH, using = "//div[@id='submit-wrapper']/input")
    public WebElement loginBtn;

    @FindBy(how = How.XPATH, using = "//div[@class='lost-password-container']/a[1]")
    public WebElement forgotPassword;

    @FindBy(how = How.XPATH, using = "//a[contains(@href,'/privacy-policy/') ]")
    public WebElement privacyButton;
//    Credentials credentials=new Credentials();

//    public void loginUser23() {
//        loginBox.clear();
//        loginBox.sendKeys(ConfigurationReader.configurationReader("user23"));
//        passwordBox.sendKeys(ConfigurationReader.configurationReader("password"));
//        loginBtn.click();
//
//    }
//
//    public void user53() {
//        loginBox.clear();
//        loginBox.sendKeys(ConfigurationReader.configurationReader("user53"));
//        passwordBox.sendKeys(ConfigurationReader.configurationReader("password"));
//        loginBtn.click();
//    }
//
//    public void user83() {
//        loginBox.clear();
//        loginBox.sendKeys(ConfigurationReader.configurationReader("user83"));
//        passwordBox.sendKeys(ConfigurationReader.configurationReader("password"));
//        loginBtn.click();
//    }
//
//    public void user113() {
//        loginBox.clear();
//        loginBox.sendKeys(ConfigurationReader.configurationReader("user113"));
//        passwordBox.sendKeys(ConfigurationReader.configurationReader("password"));
//        loginBtn.click();
//    }


    public void login(String key) {
        loginBox.clear();
        loginBox.sendKeys(ConfigurationReader.configurationReader(key));
        passwordBox.sendKeys(ConfigurationReader.configurationReader("password"));
        loginBtn.click();
    }


    @BeforeMethod
    public void login() {
        getLogInstance();
        log.loginBox.clear();
        log.loginBox.sendKeys(ConfigurationReader.configurationReader("user23"));
        log.passwordBox.sendKeys(ConfigurationReader.configurationReader("password"));
        log.loginBtn.click();
    }


}
