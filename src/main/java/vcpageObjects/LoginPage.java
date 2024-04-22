package vcpageObjects;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.IOSActions;

import java.time.Duration;

public class LoginPage extends IOSActions {
    IOSDriver driver;
    private final WebDriverWait wait;


    //create a constructor for Initializing the page objects
    public LoginPage(IOSDriver driver) {
        super(driver);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    // private By signLinkEle=By.xpath("//XCUIElementTypeStaticText[@name=\"SIGN IN WITH SSO\"]");

    @iOSXCUITFindBy(accessibility = "SIGN IN WITH SSO")
    private WebElement signInText;

    @iOSXCUITFindBy(accessibility = "SIGN IN WITH SSO")
    private WebElement signInLink;


    @iOSXCUITFindBy(accessibility = "VCLoginLogo")
    private WebElement vcLogo;


    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeImage[`name == \"VCLogoNav\"`]")
    private WebElement vcHM_PGLogo;


    //Login Page actions
    public boolean validateLoginScreen() {
        return signInText.isDisplayed();
    }

    public boolean validateVCLogo() {
        return vcLogo.isDisplayed();
    }
    public HomePage clickOnSignIn(){
        signInLink.click();
        return new HomePage(driver);
    }
    public boolean checkHomePageLogo(){
        return vcHM_PGLogo.isDisplayed();
    }


}
