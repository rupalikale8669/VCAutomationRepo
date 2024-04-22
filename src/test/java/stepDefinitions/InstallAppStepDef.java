package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import testUtils.IOSBaseTest;

import java.io.IOException;

public class InstallAppStepDef extends IOSBaseTest {

    @Given("User has installed the iOS mobile app")
    public void user_has_installed_the_i_os_mobile_app() throws IOException {
        ConfigurationAppium();
        System.out.println("Appium configuration completed.");
    }

    @And("User has launched the VCShowroom application")
    public void user_has_launched_the_vc_showroom_application() {
        System.out.println("Appium configuration completed.");
    }


}
