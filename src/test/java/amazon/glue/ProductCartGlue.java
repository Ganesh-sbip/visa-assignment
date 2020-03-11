package amazon.glue;

import amazon.pages.BasePage;
import amazon.pages.ProductCartPage;
import amazon.utility.Log;
import amazon.wrappers.DriverFactory;
import cucumber.api.java.en.Then;
import org.openqa.selenium.remote.RemoteWebDriver;
import static amazon.pages.ProductPage.addedproductName;
import static amazon.pages.ProductPage.addedproductprice;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Created By: Ganesh Prabhakaran
 * Version: 1.0
 */


public class ProductCartGlue extends DriverFactory {

    RemoteWebDriver driver = DriverFactory.driver;

    BasePage basePage;
    ProductCartPage productcartPage;

    public ProductCartGlue() {
        basePage = new BasePage(driver);
        productcartPage = new ProductCartPage(driver);
    }

    @Then("^I verify the product details in cart page$")
    public void verify_product_cart_page() {
        Log.info("Info : ===>>> Verify added product in cart page on Product screen");
        productcartPage.navigatetoproductcartpage();
        waitForElement(driver, productcartPage.lblshoppingcartheader);
        assertTrue("Product Page is not displayed!!", productcartPage.lblshoppingcartheader.isDisplayed());
        assertEquals(addedproductName, productcartPage.lblproducttitle.getText());
        assertEquals(addedproductprice, productcartPage.lblproductprice.getText());
    }
}
