package amazon.glue;

import amazon.pages.BasePage;
import amazon.pages.HeaderPage;
import amazon.utility.Log;
import amazon.wrappers.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Created By: Ganesh Prabhakaran
 * Version: 1.0
 */


public class HeaderGlue extends DriverFactory {

    RemoteWebDriver driver = DriverFactory.driver;

    BasePage basePage;
    HeaderPage headerPage;

    public HeaderGlue() {
        basePage = new BasePage(driver);
        headerPage = new HeaderPage(driver);
    }

    @Given("^I logout from the amazon website$")
    public void click_logout() throws Throwable {
        Log.info("Info : ===>>> Logout from the website!!");
        headerPage.clickSignout();
    }

    @When("^I navigate to cart page$")
    public void navigate_to_cart() throws Throwable {
        Log.info("Info : ===>>> Navigate to cart page!!");
        headerPage.clickCartlink();
    }
}
