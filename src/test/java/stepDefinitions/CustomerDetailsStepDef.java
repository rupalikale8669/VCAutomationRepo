package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import testUtils.IOSBaseTest;
import vcpageObjects.CustomerDetailsPage;

import java.util.List;
import java.util.Map;

public class CustomerDetailsStepDef extends IOSBaseTest {
    CustomerDetailsPage customerDetailsPage;

    public CustomerDetailsStepDef() {
        customerDetailsPage = new CustomerDetailsPage(driver);
    }

    @And("I am on the customer details page")
    public void i_am_on_the_customer_details_page() throws InterruptedException {
     System.out.println("User is adding customer details!");
    }


    @And("I enter the following customer details:")
    public void i_Enter_The_Following_CustomerDetails(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> customerDetails=dataTable.asMaps(String.class,String.class);
        for(Map<String,String> customer :customerDetails ){
            customerDetailsPage.addCustomerDetailsNew(customer);

        }

    }
    @And("I have enter the billing address")
    public void i_have_enter_the_billing_address(DataTable dataTable) {
        System.out.println("user is adding billing address details!!");
    }
    @And("I have click on Continue button")
    public void i_have_click_on_continue_button() {

    }


}
