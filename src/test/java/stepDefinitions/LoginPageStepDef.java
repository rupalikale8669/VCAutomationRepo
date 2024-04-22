package stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import testUtils.IOSBaseTest;
import vcpageObjects.HomePage;


import java.io.IOException;

public class LoginPageStepDef extends IOSBaseTest {
    HomePage homePage;

    //Using hooks
   /* @Before
    public void setUp() throws IOException {
        ConfigurationAppium();
        System.out.println("Appium configuration completed.");
    }*/

    @After
    public void tearDownAppium() {
        tearDown();
    }

    @After
    public void waitForTCRun() throws InterruptedException {
        Thread.sleep(2000);
    }


    @When("the user is on the login page")
    public void the_user_is_on_the_login_page() throws InterruptedException {
        boolean flag = loginPage.validateLoginScreen();
        Assert.assertTrue(flag);
    }

    @And("User enters valid credentials and logs in")
    public void user_enters_valid_credentials_and_logs_in() {
        homePage = loginPage.clickOnSignIn();
    }

    @Then("the user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(loginPage.checkHomePageLogo());
        System.out.println("user logged in successfully");
    }
    @When("User logs into the app with valid credentials")
    public void user_logs_into_the_app_with_valid_credentials() throws InterruptedException {
        Thread.sleep(2000);
        loginFunction();
    }

    public void loginFunction() throws InterruptedException {
        boolean flag = loginPage.validateLoginScreen();
        Assert.assertTrue(flag);
        homePage = loginPage.clickOnSignIn();
        Thread.sleep(3000);
        Assert.assertTrue(loginPage.checkHomePageLogo());
        System.out.println("user logged in successfully");
    }

}
