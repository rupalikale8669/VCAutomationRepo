package testUtils;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import utils.AppiumUtils;
import vcpageObjects.LoginPage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class IOSBaseTest extends AppiumUtils {
    public static IOSDriver driver;
    public static LoginPage loginPage;
    DesiredCapabilities cap;

    public static Properties prop;

    //create a constructor
    public IOSBaseTest() {
        //read properties
        prop = new Properties();
        try {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//src//main//resources//data.properties");
            prop.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ConfigurationAppium() throws IOException {

        String ipAddress = prop.getProperty("ipAddress");
        String port = prop.getProperty("port");

        String deviceType = prop.getProperty("DeviceType");

        service = startAppiumServer(ipAddress, Integer.parseInt(port));

        if (deviceType.equalsIgnoreCase("RealDevice")) {
            //Launch application on real device
            cap = new DesiredCapabilities();
            cap.setCapability("platformName", "iOS");
            cap.setCapability("udid", prop.getProperty("udid"));
            cap.setCapability("app", System.getProperty("user.dir") + "//src//test//resources//appFiles//VCShowroomApp_Stage.ipa");
            cap.setCapability("automationName", "XCUITest");
            cap.setCapability("deviceName", prop.getProperty("deviceName"));
            cap.setCapability("platformVersion", prop.getProperty("platformVersionRD"));

            driver = new IOSDriver(service.getUrl(), cap);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        } else {
            //Launch application on simulator
            XCUITestOptions options = new XCUITestOptions();
            options.setDeviceName(prop.getProperty("SimulatorDeviceName"));
            options.setApp(System.getProperty("user.dir") + "//src//test//resources//appFiles//VCShowroomApp_Stage.app");
            options.setPlatformVersion(prop.getProperty("platformVersion"));
            options.setWdaLaunchTimeout(Duration.ofSeconds(20));


            driver = new IOSDriver(service.getUrl(), options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        }
        loginPage = new LoginPage(driver);


    }

    public void tearDown() {
        // driver.quit();
        // driver.manage().deleteAllCookies();
        if (service != null) {
            service.stop();
        } else {
            System.out.println("Appium service is not initialized.");
        }

    }
}
