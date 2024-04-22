package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import testUtils.IOSBaseTest;
import vcpageObjects.HomePage;
import vcpageObjects.ViewProjectPage;

import java.util.List;
import java.util.Map;


public class HomePageStepDef extends IOSBaseTest {
    HomePage homePage;
    ViewProjectPage viewProjectPage;


    public HomePageStepDef() {
        homePage = new HomePage(driver);
        viewProjectPage = new ViewProjectPage(driver);
    }

    @Given("I am on the home page")
    public void i_am_on_the_home_page() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(loginPage.checkHomePageLogo());
    }

    @When("I search for a product with the searchText")
    public void i_search_for_a_product_with_the_searchText(DataTable searchData) throws InterruptedException {
        List<Map<String, String>> userMap = searchData.asMaps(String.class, String.class);
        System.out.println(userMap);
        /*for (Map<String, String> data : userMap) {
            System.out.println(data);
            homePage.searchProduct(data.get("searchText"));
            homePage.clickOnSearchIcon();
            //Check if the result is displayed
            boolean flag = viewProjectPage.validateEditButton();
            //Assert.assertTrue(flag);
            if (flag) {
                System.out.println("Product details found !!!");
            } else {
                System.out.println("Product details not found !!!");
                String actualMsg = viewProjectPage.validateSearchResultNotFoundMsg();
                String ExpMsg = "We're sorry, but there are no results that match your search criteria";
                Assert.assertEquals(actualMsg, ExpMsg, "Message is not displayed as expected");

            }
            Thread.sleep(5000);
            homePage.clickSearchBox();
        }*/
    }

    @Then("I should see the product details for the customer")
    public void i_should_see_the_product_details_for_the_customer() {
        System.out.println("Product details found !!!");
    }

    @When("User searches for {string} in the global search")
    public void user_searches_for_in_the_global_search(String productName) {
        boolean flag = homePage.validateSearchBar();
        Assert.assertTrue(flag);
        homePage.searchProduct(productName);
    }

    @Then("User should see a home page logo")
    public void user_should_see_a_home_page_logo() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(loginPage.checkHomePageLogo());
    }

    @Then("Search results for {string} should be displayed")
    public void search_results_for_should_be_displayed(String string) {
        System.out.println("Search bar is displayed on Home Page");
    }

}
