package amazon.pages;

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

public class HeaderPage extends LoadableComponent<HeaderPage> {


    @FindBy(xpath = "//span[@class='nav-line-2 ']")
    WebElement lnknameheader;

    @FindBy(xpath = "//span[contains(text(), 'Sign Out')]")
    WebElement linksignout;

    @FindBy(css = ".nav-cart-icon.nav-sprite")
    WebElement linkcart;

    private RemoteWebDriver driver;

    public HeaderPage(RemoteWebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        isLoaded();
    }

    public void clickSignout() {
        click(driver, lnknameheader);
        click(driver, linksignout);
    }

    public void clickCartlink() {
        click(driver, linkcart);
    }

    @Override
    protected void load() {

    }

    @Override
    protected void isLoaded() throws Error {
        BasePage.waitForPageLoad(driver);
    }

}
