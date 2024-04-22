package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import testUtils.IOSBaseTest;
import vcpageObjects.ProductSearchPage;

import java.util.List;
import java.util.Map;

public class ProductSearchStepDef extends IOSBaseTest {
    ProductSearchPage productSearchPage;

    public ProductSearchStepDef() {
        productSearchPage = new ProductSearchPage(driver);
    }

    @And("I have validated the {string} filter option")
    public void i_have_validated_the_Sort_By_filter_option(String sortBy, DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> options = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> option : options) {
            String sortByValue = option.get("sortBy");
            System.out.println(sortByValue);
            switch (sortByValue) {
                case "Designer recommends":
                    productSearchPage.validateSortBy_designer_recommends();
                    System.out.println("Designer recommends option selected from the dropdown !!!");
                    break;
                case "Price High to Low":
                    productSearchPage.validateSortBy_price_high_to_low();
                    System.out.println("Price high to low option selected from the dropdown !!!");
                    break;
                case "Price Low to High":
                    productSearchPage.validateSortBy_price_low_to_high();
                    System.out.println("Price low to high option selected from the dropdown !!!");
                    break;
                default:
                    // Handle invalid sort option
                    break;

            }

            Thread.sleep(2000);
        }

    }

    @And("I have selected a product {string} to add to the project")
    public void i_have_selected_a_product_to_add_to_the_project(String productName) {
        productSearchPage.selectProductByName(productName);
    }

    @And("I have click on Add to project button")
    public void i_have_click_On_AddToProject_Button() {
        productSearchPage.validateAddToProject();
    }

    @And("I have click on back to project editor option")
    public void i_have_click_On_BackToProjectEditor_Option() {
        productSearchPage.clickOnBackToProjectEditor();
    }

    @And("I edit the project details by adding quantity and comment")
    public void I_edit_the_project_details_by_adding_quantity_and_comment(String commentText) {
        productSearchPage.validateEditProjectDetails(commentText);
    }

    @And("I click on the Continue to Customer details option")
    public void i_click_on_the_continue_to_customer_details_option() {
        productSearchPage.clickOnContinueToCustomerDetailsButton();
    }

    @And("I have validate product search page details")
    public void i_have_validate_product_search_page_details() throws InterruptedException {
        boolean flag = productSearchPage.validateProductSearchPageTitle();
        Assert.assertTrue(flag);
        boolean flag1 = productSearchPage.validateScanProductOptionIsDisplayed();
        Assert.assertTrue(flag1);

    }

}
