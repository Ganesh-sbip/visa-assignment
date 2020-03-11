package amazon.pages;

import amazon.utility.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import static amazon.wrappers.Elementwrappers.click;
import static amazon.wrappers.Elementwrappers.enterText;
import static junit.framework.TestCase.assertTrue;

/**
 * Created By: Ganesh Prabhakaran
 * Version: 1.0
 */

public class HomePage extends LoadableComponent<HomePage> {


    @FindBy(xpath = "//a[@class='nav-logo-link']")
    WebElement imgamazonlogo;

    @FindBy(id = "nav-hamburger-menu")
    WebElement linkleftmenu;

    @FindBy(id = "twotabsearchtextbox")
    WebElement txtsearchfield;

    @FindBy(xpath = "//*[@type='submit']")
    WebElement btnsearchsubmit;

    @FindBy(css = ".a-section.a-spacing-small.a-spacing-top-small")
    WebElement lblsearchresults;

    private RemoteWebDriver driver;
    public static String productName;

    public HomePage(RemoteWebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        isLoaded();
    }

    public boolean verifyamazonlogo() {
        boolean isTrue = false;
        try {
            isTrue = imgamazonlogo.isDisplayed();
            String output = isTrue ? "Pass" : "Fail";
            Log.info(output + "Verify amazon logo is displayed");

        } catch (Exception e) {
            Log.info("Error" + "Amazon logo is not displayed!! " + e);
        }
        return isTrue;
    }

    public boolean verifyleftnavigationmenu() {
        boolean isTrue = false;
        try {
            isTrue = linkleftmenu.isDisplayed();
            String output = isTrue ? "Pass" : "Fail";
            Log.info(output + "Verify left navigation menu is displayed");

        } catch (Exception e) {
            Log.info("Error" + "Left navigation menu is not displayed!!" + e);
        }
        return isTrue;
    }

    public boolean verifyhomepagesearchbar() {
        boolean isTrue = false;
        try {
            isTrue = txtsearchfield.isDisplayed();
            String output = isTrue ? "Pass" : "Fail";
            Log.info(output + "Verify left navigation menu is displayed");
        } catch (Exception e) {
            Log.info("Error" + "Search bar is not displayed!! " + e);
        }
        return isTrue;
    }

    public void searchproduct() {
        productName = System.getProperty("product");
        enterText(driver, txtsearchfield, productName);
        click(driver, btnsearchsubmit);
    }

    public void verifysearchresults() {
        assertTrue(lblsearchresults.getText().replace("\"", "").contains("results for " + productName));
    }

    public void addproductbasedonindex(int productNumber) {
        click(driver, driver.findElement(By.xpath("//*[contains(@class, 's-result-item')][" + productNumber + "]//*[@class='a-size-medium a-color-base a-text-normal']")));
    }


    @Override
    protected void load() {

    }

    @Override
    protected void isLoaded() throws Error {
        BasePage.waitForPageLoad(driver);
    }

}
