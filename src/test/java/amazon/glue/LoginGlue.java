package amazon.glue;

import amazon.pages.BasePage;
import amazon.wrappers.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.remote.RemoteWebDriver;
import junit.framework.Assert;
import amazon.pages.LoginPage;
import amazon.utility.Log;

/**
 * Created By: Ganesh Prabhakaran
 * Version: 1.0
 */

public class LoginGlue extends DriverFactory {

    RemoteWebDriver driver = DriverFactory.driver;

    BasePage basePage;
    LoginPage loginPage;

    public LoginGlue() {
        basePage = new BasePage(driver);
        loginPage = new LoginPage(driver);
    }

    @Given("^I'm on amazon login page$")
    public void i_m_on_Amazon_login_page() throws Throwable {
        Log.info("Info : ===>>> Check if user is landed on amazon login page");
        Assert.assertTrue("Fail to verify main page", loginPage.isUserinLoginPage());
    }

    @When("^I enter \"([^\"]*)\" username$")
    public void i_enter_username(String usernameType) throws Throwable {
        Log.info("Info : ===>>> Enter username " + usernameType);
        loginPage.setUsername(usernameType);
    }

    @When("^I enter \"([^\"]*)\" password$")
    public void i_enter_password(String passwordType) throws Throwable {
        Log.info("Info : ===>>> Enter password " + passwordType);
        loginPage.setPassword(passwordType);
    }

    @And("^I continue to the next page$")
    public void i_continue_to_next_page() throws Throwable {
        Log.info("Info : ===>>> Continue to the next page");
        loginPage.clickContinue();
    }

    @And("^I submit the user credentials$")
    public void i_submit_user_credentials() throws Throwable {
        Log.info("Info : ===>>> Submit user credentials");
        loginPage.clickSubmit();
    }

    @Then("^I verify if invalid \"([^\"]*)\" error message is displayed$")
    public void i_verify_invalid_error(String field) throws Throwable {
        Log.info("Info : ===>>> Verify invalid error message is displayed in " + field);
        loginPage.verifyerrormessage(field);
    }

    @Then("^I verify I am landed on signin page$")
    public void i_verify_loginpage() throws Throwable {
        Log.info("Info : ===>>> Verify user is landed on login page successfully!!");
        loginPage.isUserinLoginPage();
    }
}
