package vcpageObjects;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.IOSActions;

public class ViewProjectPage extends IOSActions {
    IOSDriver driver;
    public ViewProjectPage(IOSDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"EDIT PROJECT\"`][1]")
    private WebElement editProjectButton;

    @iOSXCUITFindBy(accessibility = "We're sorry, but there are no results that match your search criteria")
    private WebElement searchResultMsg;

    public boolean validateEditButton() {
        return editProjectButton.isDisplayed();
    }
    public String validateSearchResultNotFoundMsg(){
        return searchResultMsg.getAttribute("name");
    }

}
