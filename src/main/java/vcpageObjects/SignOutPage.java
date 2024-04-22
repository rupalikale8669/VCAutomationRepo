package vcpageObjects;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.IOSActions;

public class SignOutPage extends IOSActions {
    IOSDriver driver;

    public SignOutPage(IOSDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeButton[4]")
    private WebElement avtarIcon;

    @iOSXCUITFindBy(accessibility = "SIGN OUT")
    private WebElement signOutButton;

    public void clickOnAvtarIcon(){
        avtarIcon.click();
    }
    public void clickOnSignOutButton(){
        signOutButton.click();
    }
    
}
