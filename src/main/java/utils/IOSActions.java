package utils;

import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;


public class IOSActions extends AppiumUtils {
    IOSDriver driver;
    private final WebDriverWait wait;
    private TouchAction touchAction;

    public IOSActions(IOSDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void tapOnElement(WebElement element) {
        touchAction = new TouchAction(driver);
        touchAction.tap(tapOptions().withElement(element(element))).perform();
    }

    public void sendKeysWithWait(WebElement element, String text) {
        try {
            WebElement inputElement = wait.until(ExpectedConditions.elementToBeClickable(element));
            inputElement.clear();
            inputElement.sendKeys(text);
        } catch (TimeoutException e) {
            System.out.println("Timeout waiting for element to be visible.");
        } catch (NoSuchElementException e) {
            System.out.println("Element not found.");
        }
    }


}
