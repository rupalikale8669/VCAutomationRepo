package vcpageObjects;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.IOSActions;

public class CreateProjectPage extends IOSActions {
    IOSDriver driver;

    public CreateProjectPage(IOSDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"  CREATE NEW PROJECT\"`]")
    private WebElement createNewProjectButton;

    public boolean verifyCreateNewProjectButton() {
        return createNewProjectButton.isDisplayed();
    }

    public ProductSearchPage verifyCreateNewProjectButtonClick() {
        createNewProjectButton.click();
        return new ProductSearchPage(driver);
    }

}
