package vcpageObjects;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.IOSActions;

public class ProductSearchPage extends IOSActions {
    IOSDriver driver;

    public ProductSearchPage(IOSDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSXCUITFindBy(accessibility = "Product Search")
    private WebElement productSearchPageTitle;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextField[`value == \"Search by Product name, SKU\"`]")
    private WebElement productSearchPageSearchBox;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name == \"iconSearch\"`][2]")
    private WebElement productSearchPageSearchIcon;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"Scan Product  \"`]")
    private WebElement scanProductText;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"Sort By: Designer Recommends  \"`]")
    private WebElement sortByDropDown;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"Sort By: Price High to Low  \"`]")
    private WebElement sortByDropDown1;
    @iOSXCUITFindBy(accessibility = "Designer Recommends")
    private WebElement sortByFilterOption1;

    @iOSXCUITFindBy(accessibility = "Price High to Low")
    private WebElement sortByFilterOption2;

    @iOSXCUITFindBy(accessibility = "Price Low to High")
    private WebElement sortByFilterOption3;

    public void selectProductByName(String productName) {
        String xpath = "//XCUIElementTypeStaticText[@name='" + productName + "']";
        driver.findElement(By.xpath(xpath)).click();
    }

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"  ADD TO PROJECT\"`]")
    private WebElement addToProjectButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \" BACK TO PROJECT EDITOR\"`]")
    private WebElement backToProjectEditorLink;

    @iOSXCUITFindBy(accessibility = "addquantity")
    private WebElement plusIcon;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"Comment \"`][1]")
    private WebElement commentBox;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeOther[1]/XCUIElementTypeOther")
    private WebElement commentTextBox;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name == \"CONTINUE TO CUSTOMER DETAILS\"`]")
    private  WebElement continueToCustomerDetailsButton;


    public boolean validateProductSearchPageTitle() throws InterruptedException {
        Thread.sleep(2000);
        return productSearchPageTitle.isDisplayed();
    }

    public void validateSearchFunctionalityOnProductSearchPage(String productName) {
        productSearchPageSearchBox.sendKeys(productName);
        productSearchPageSearchIcon.click();
    }

    public boolean validateScanProductOptionIsDisplayed() {
        return scanProductText.isDisplayed();
    }

    public void validateSortBy_designer_recommends() {
        sortByDropDown.click();
        sortByFilterOption1.click();
    }

    public void validateSortBy_price_high_to_low() {
        sortByDropDown.click();
        sortByFilterOption2.click();
    }

    public void validateSortBy_price_low_to_high() {
        sortByDropDown1.click();
        sortByFilterOption3.click();
    }

    public void validateAddToProject() {
        addToProjectButton.click();
    }

    public void clickOnBackToProjectEditor() {
        backToProjectEditorLink.click();
    }

    public void validateEditProjectDetails(String commentText) {
        plusIcon.click();
        commentBox.click();
        // commentTextBox.sendKeys(commentText);
    }
    public void clickOnContinueToCustomerDetailsButton(){
        continueToCustomerDetailsButton.click();
    }

}
