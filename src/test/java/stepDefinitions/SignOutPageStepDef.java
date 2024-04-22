package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testUtils.IOSBaseTest;
import vcpageObjects.SignOutPage;

public class SignOutPageStepDef extends IOSBaseTest {
    SignOutPage signOutPage;
    public SignOutPageStepDef(){
        signOutPage=new SignOutPage(driver);
    }

    @When("User navigates to the logout option")
    public void user_navigates_to_the_logout_option() throws InterruptedException {
        Thread.sleep(3000);
        signOutPage.clickOnAvtarIcon();
    }
    @And("User confirms the logout action")
    public void user_confirms_the_logout_action() {
        signOutPage.clickOnSignOutButton();
    }
    @Then("User should be logged out successfully")
    public void user_should_be_logged_out_successfully() {
      System.out.println("User signOut successfully!!!");
    }
}
