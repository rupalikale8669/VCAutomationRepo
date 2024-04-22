package vcpageObjects;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.IOSActions;


public class HomePage extends IOSActions {
    IOSDriver driver;

    public HomePage(IOSDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextField[`value == \"Search By Document ID, Email, Customer Name, Project Name\"`]")
    private WebElement searchBox;

    @iOSXCUITFindBy(accessibility = "iconSearch")
    private WebElement searchIcon;


    //Actions
    public boolean validateSearchBar() {
        return searchBox.isDisplayed();
    }

    public void searchProduct(String searchText) {
        searchBox.sendKeys(searchText);
    }

    public void clickOnSearchIcon() {
        searchIcon.click();
    }

    public void clickSearchBox() {
        searchBox.click();
    }


}
