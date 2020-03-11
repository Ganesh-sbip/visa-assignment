package amazon.pages;

import amazon.utility.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import static amazon.wrappers.Elementwrappers.click;

/**
 * Created By: Ganesh Prabhakaran
 * Version: 1.0
 */

public class ProductPage extends LoadableComponent<ProductPage> {


    @FindBy(id = "productTitle")
    WebElement lblproductTitle;

    @FindBy(id = "price_inside_buybox")
    WebElement lblproductPrice;

    @FindBy(xpath = "//*[@id='selectQuantity']//span[@class='a-dropdown-container']//label")
    WebElement selectquantitydropdown;

    @FindBy(id = "add-to-cart-button")
    WebElement btnaddtocart;

    @FindBy(id = "buy-now-button")
    WebElement btnbuynow;

    private RemoteWebDriver driver;
    public static String addedproductName;
    public static String addedproductquantity;
    public static String addedproductprice;

    public ProductPage(RemoteWebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        isLoaded();
    }

    public boolean verifyProductPage(){
        boolean isTrue = false;
        try {
            isTrue = btnaddtocart.isDisplayed() && btnbuynow.isDisplayed();
            String output = isTrue ? "Pass" : "Fail";
            Log.info(output + "Verify product details page");

        } catch (Exception e) {
            Log.info("Error" + "Verify product details page" + e);
        }
        return isTrue;
    }

    public void selectProductQuantity(String quantity){
        addedproductquantity = quantity;
        click(driver, selectquantitydropdown);
        click(driver, driver.findElement(By.xpath("//*[@class='a-nostyle a-list-link']//li[" + quantity + "]/a")));
        Log.info("Info : ===>>> Added product quantity "+ addedproductquantity);
    }

    public void captureProductDetails()
    {
        addedproductprice = lblproductPrice.getText();
        Log.info("Info : ===>>> Added product price is "+ addedproductprice);
        addedproductName = lblproductTitle.getText();
        Log.info("Info : ===>>> Added product name is "+ addedproductName);
    }

    public void addProductToCart()
    {
        click(driver, btnaddtocart);
    }



    @Override
    protected void load() {

    }

    @Override
    protected void isLoaded() throws Error {
        BasePage.waitForPageLoad(driver);
    }

}
