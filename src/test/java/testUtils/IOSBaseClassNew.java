package testUtils;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import utils.AppiumUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class IOSBaseClassNew extends AppiumUtils {
    public static IOSDriver driver;
    //public LoginPage loginPage;
    DesiredCapabilities cap;
    @Test
    public void ConfigurationAppium() throws IOException {
        //read properties
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//src//main//resources//data.properties");
        prop.load(fis);
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
        // loginPage=new LoginPage(driver);


    }

    public void tearDown() {
        //driver.quit();
        driver.manage().deleteAllCookies();
        service.stop();
    }
}
