package amazon.glue;

import amazon.pages.BasePage;
import amazon.pages.ProductPage;
import amazon.utility.Log;
import amazon.wrappers.DriverFactory;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.remote.RemoteWebDriver;
import static junit.framework.TestCase.assertTrue;

/**
 * Created By: Ganesh Prabhakaran
 * Version: 1.0
 */

public class ProductPageGlue extends DriverFactory {

    RemoteWebDriver driver = DriverFactory.driver;

    BasePage basePage;
    ProductPage productPage;

    public ProductPageGlue() {
        basePage = new BasePage(driver);
        productPage = new ProductPage(driver);
    }

    @Then("^I verify I am landed on product page$")
    public void verify_product_page() {
        Log.info("Info : ===>>> Verify landed on Product screen successfully");
        assertTrue("Product Page is not displayed!!", productPage.verifyProductPage());
    }

    @When("^I select \"([^\"]*)\" product quantity$")
    public void select_product_qty(String quantity) {
        Log.info("Info : ===>>> Select product quantity as " + quantity);
        productPage.selectProductQuantity(quantity);
    }

    @When("^I capture the product details$")
    public void capture_product_details() {
        Log.info("Info : ===>>> Capture the product details");
        productPage.captureProductDetails();
    }

    @When("^I add the product to cart$")
    public void add_product_to_cart() {
        Log.info("Info : ===>>> Add Product to cart");
        productPage.addProductToCart();
    }
}
