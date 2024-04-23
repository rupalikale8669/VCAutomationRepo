package stepDefinitions;

import io.cucumber.java.en.And;
import testUtils.IOSBaseTest;

public class QuoteSummaryStepDef extends IOSBaseTest {
    @And("I am on the Quote summary page")
    public void i_am_on_the_quote_summary_page() {
      System.out.println("User is on Quote summary page");
    }
}
