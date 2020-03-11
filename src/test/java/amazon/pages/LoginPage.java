package amazon.pages;

import junit.framework.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import amazon.utility.Log;

import static amazon.wrappers.Elementwrappers.click;
import static amazon.wrappers.Elementwrappers.enterText;

/**
 * Created By: Ganesh Prabhakaran
 * Version: 1.0
 */

public class LoginPage extends LoadableComponent<LoginPage> {


    @FindBy(id = "ap_email")
    WebElement txtUserName;

    @FindBy(id = "ap_password")
    WebElement txtPassword;

    @FindBy(xpath = "//*[@id='auth-error-message-box']//*[@class='a-alert-heading']")
    WebElement lblinvalidheadererror;

    @FindBy(xpath = "//*[@id='auth-error-message-box']//span[@class='a-list-item']")
    WebElement lblinvaliderrormsg;

    @FindBy(id = "continue")
    WebElement btncontinue;

    @FindBy(id = "signInSubmit")
    WebElement btnsubmit;

    @FindBy(xpath = "//*[@class='a-spacing-small']")
    WebElement lblsigninheader;

    private RemoteWebDriver driver;

    public LoginPage(RemoteWebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        isLoaded();
    }

    public boolean isUserinLoginPage() {
        boolean isTrue = false;
        try {
            isTrue = lblsigninheader.getText().equalsIgnoreCase("Sign-In");
            String output = isTrue ? "Pass" : "Fail";
            Log.info(output + "Verify on main page");
        } catch (Exception e) {
            Log.info("Error" + "Verify on main page" + e);
        }
        return isTrue;
    }

    public void setUsername(String usernameType) {
        if(usernameType.equalsIgnoreCase("valid")){
            enterText(driver, txtUserName, System.getProperty("valid_username"));
        } else {
            enterText(driver, txtUserName, System.getProperty("invalid_username"));
        }
    }

    public void setPassword(String passwordType) {
        if(passwordType.equalsIgnoreCase("valid")){
            enterText(driver, txtPassword, System.getProperty("valid_password"));
        } else {
            enterText(driver, txtPassword, System.getProperty("invalid_password"));
        }
    }

    public void clickContinue() {
        click(driver, btncontinue);
    }

    public void clickSubmit() {
        click(driver, btnsubmit);
    }


    public void verifyerrormessage(String field) {
        switch (field) {
            case "username":
                Assert.assertEquals(lblinvalidheadererror.getText(), "There was a problem");
                Assert.assertEquals(lblinvaliderrormsg.getText(), "We cannot find an account with that email address");
                break;
            case "password":
                Assert.assertEquals(lblinvalidheadererror.getText(), "There was a problem");
                Assert.assertEquals(lblinvaliderrormsg.getText(), "Your password is incorrect");
                break;
        }
    }


    @Override
    protected void load() {
    }

    @Override
    protected void isLoaded() throws Error {
        BasePage.waitForPageLoad(driver);
    }

}
