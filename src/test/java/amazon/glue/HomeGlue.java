package amazon.glue;

import amazon.pages.BasePage;
import amazon.pages.HomePage;
import amazon.utility.Log;
import amazon.wrappers.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Created By: Ganesh Prabhakaran
 * Version: 1.0
 */


public class HomeGlue extends DriverFactory {

    RemoteWebDriver driver = DriverFactory.driver;

    BasePage basePage;
    HomePage homePage;

    public HomeGlue() {
        basePage = new BasePage(driver);
        homePage = new HomePage(driver);
    }

    @Given("^I verify I am landed on Home screen$")
    public void verify_home_screen() throws Throwable {
        Log.info("Info : ===>>> Verify landed on Home screen");
        Assert.assertTrue("Amazon image logo is not displayed!!", homePage.verifyamazonlogo());
        Assert.assertTrue("Left navigation menu is not displayed!!", homePage.verifyleftnavigationmenu());
        Assert.assertTrue("Home page header is not displayed!!", homePage.verifyhomepagesearchbar());
    }

    @When("^I search for a product$")
    public void search_product() throws Throwable {
        Log.info("Info : ===>>> Search for a product ");
        homePage.searchproduct();
    }

    @Then("^I verify product search results is displayed$")
    public void verify_product_search_results() {
        Log.info("Info : ===>>> Verify the search results page of the product");
        homePage.verifysearchresults();
    }

    @When("^I add product with index \"([^\"]*)\" from search list to bag$")
    public void add_product_based_on_index(int index) {
        Log.info("Info : ===>>> Add " + index + " product to bag");
        homePage.addproductbasedonindex(index);
    }
}
