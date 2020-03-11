package amazon.pages;

import amazon.utility.Log;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import static amazon.wrappers.Elementwrappers.waitForElement;

/**
 * Created By: Ganesh Prabhakaran
 * Version: 1.0
 */

public class ProductCartPage extends LoadableComponent<ProductCartPage> {


    @FindBy(id = "attach-added-to-cart-message")
    public WebElement lbladdtocart;

    @FindBy(xpath = "//*[@id='attach-view-cart-button-form']//input")
    public WebElement btnCart;

    @FindBy(css = ".a-size-medium.sc-product-title")
    public WebElement lblproducttitle;

    @FindBy(css = ".sc-list-item-content .a-size-medium.sc-price")
    public WebElement lblproductprice;

    @FindBy(xpath = "//h2[contains(text(), 'Shopping Cart')]")
    public WebElement lblshoppingcartheader;

    private RemoteWebDriver driver;

    public ProductCartPage(RemoteWebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        isLoaded();
    }

    public void navigatetoproductcartpage()
    {
        try{
            waitForElement(driver, btnCart, 10);
            lbladdtocart.isDisplayed();
            btnCart.click();
            Log.info("Clicked Add to Cart button!!");
        } catch(Exception e) {
            Log.info("Error" + "Add to cart window not displayed!! " + e);
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
