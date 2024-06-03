package vcpageObjects;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.IOSActions;

import java.util.Map;

public class CustomerDetailsPage extends IOSActions {
    IOSDriver driver;

    public CustomerDetailsPage(IOSDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[7]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[5]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeTextField")
    private WebElement emailInputText;

    @iOSXCUITFindBy(iOSClassChain ="**/XCUIElementTypeWindow/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[7]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[5]/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTextField")
    private WebElement phoneNoInputText;

    @iOSXCUITFindBy(iOSClassChain ="**/XCUIElementTypeWindow/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[7]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[5]/XCUIElementTypeOther[2]/XCUIElementTypeOther[6]/XCUIElementTypeTextField")
    private WebElement companyNameInputText;

    @iOSXCUITFindBy(iOSClassChain ="**/XCUIElementTypeWindow/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[7]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[5]/XCUIElementTypeOther[2]/XCUIElementTypeOther[7]/XCUIElementTypeTextField")
    private WebElement nameInputText;

    @iOSXCUITFindBy(iOSClassChain ="**/XCUIElementTypeWindow/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[7]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[5]/XCUIElementTypeOther[2]/XCUIElementTypeOther[11]/XCUIElementTypeTextField")
    private WebElement addressLineInputText;

    @iOSXCUITFindBy(iOSClassChain ="**/XCUIElementTypeWindow/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[7]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[5]/XCUIElementTypeOther[2]/XCUIElementTypeOther[12]/XCUIElementTypeTextField")
    private WebElement addressLine2InputText;

    @iOSXCUITFindBy(iOSClassChain ="**/XCUIElementTypeWindow/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[7]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[5]/XCUIElementTypeOther[2]/XCUIElementTypeOther[15]/XCUIElementTypeTextField")
    private WebElement cityInputText;

    @iOSXCUITFindBy(iOSClassChain ="**/XCUIElementTypeWindow/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[7]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[5]/XCUIElementTypeOther[2]/XCUIElementTypeOther[16]/XCUIElementTypeTextField")
    private WebElement stateProvincesInputText;

    @iOSXCUITFindBy(iOSClassChain ="**/XCUIElementTypeWindow/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[7]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[5]/XCUIElementTypeOther[2]/XCUIElementTypeOther[19]/XCUIElementTypeTextField")
    private WebElement zipPostalCodeInputText;

    @iOSXCUITFindBy(iOSClassChain ="**/XCUIElementTypeWindow/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[7]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[5]/XCUIElementTypeOther[2]/XCUIElementTypeOther[20]/XCUIElementTypeTextField")
    private WebElement countryInputText;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name == \"  Use same address for billing\"`]")
    private WebElement checkBox;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name == \"CONTINUE\"`]")
    private WebElement continueButton;

    /*public void addCustomerDetails(Map<String, String> customerDetails) throws InterruptedException {
        Thread.sleep(2000);
        emailInputText.sendKeys(customerDetails.get("ProjectEmail"));
        phoneNoInputText.sendKeys(customerDetails.get("PhoneNumber"));
        companyNameInputText.sendKeys(customerDetails.get("CompanyName"));
        nameInputText.sendKeys(customerDetails.get("Name"));
        addressLineInputText.sendKeys(customerDetails.get("AddressLine"));
        addressLine2InputText.sendKeys(customerDetails.get("AddressLine2"));
        cityInputText.sendKeys(customerDetails.get("City"));
        stateProvincesInputText.sendKeys(customerDetails.get("StateProvinces"));
        zipPostalCodeInputText.sendKeys(customerDetails.get("ZipPostalCode"));
        countryInputText.sendKeys(customerDetails.get("Country"));

    }*/
    public void addCustomerDetailsNew(Map<String, String> customerDetails) throws InterruptedException {
        sendKeysWithWait(emailInputText, customerDetails.get("ProjectEmail"));
        sendKeysWithWait(phoneNoInputText, customerDetails.get("PhoneNumber"));
        sendKeysWithWait(companyNameInputText, customerDetails.get("CompanyName"));
        sendKeysWithWait(nameInputText, customerDetails.get("Name"));
        sendKeysWithWait(addressLineInputText, customerDetails.get("AddressLine"));
        sendKeysWithWait(addressLine2InputText, customerDetails.get("AddressLine2"));
        sendKeysWithWait(cityInputText, customerDetails.get("City"));
        sendKeysWithWait(stateProvincesInputText, customerDetails.get("StateProvinces"));
        sendKeysWithWait(zipPostalCodeInputText, customerDetails.get("ZipPostalCode"));
        sendKeysWithWait(countryInputText, customerDetails.get("Country"));
    }
    public void clickOnCheckBox(){
        checkBox.click();
    }
    public void clickOnContinueButton(){
        continueButton.click();
    }


}
