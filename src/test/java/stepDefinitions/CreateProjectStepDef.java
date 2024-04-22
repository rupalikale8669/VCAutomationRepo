package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import testUtils.IOSBaseTest;
import vcpageObjects.CreateProjectPage;
import vcpageObjects.ProductSearchPage;

public class CreateProjectStepDef extends IOSBaseTest {
    CreateProjectPage createProjectPage;
    ProductSearchPage productSearchPage;
    public CreateProjectStepDef(){
        createProjectPage=new CreateProjectPage(driver);
        productSearchPage=new ProductSearchPage(driver);
    }

    @When("I have created a new project")
    public void i_have_created_a_new_project() {
        boolean flag=createProjectPage.verifyCreateNewProjectButton();
        Assert.assertTrue(flag);
        productSearchPage=createProjectPage.verifyCreateNewProjectButtonClick();
    }

    @And("I add details in customer details page")
    public void i_add_details_in_customer_details_page() {

    }

}
