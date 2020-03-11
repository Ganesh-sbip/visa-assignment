package amazon.pages;

import amazon.utility.Log;
import org.openqa.selenium.WebDriver;
import amazon.wrappers.DriverFactory;
import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.*;

/**
 * Created By: Ganesh Prabhakaran
 * Version: 1.0
 */

public class BasePage extends LoadableComponent<BasePage> {

    private RemoteWebDriver driver;

    public BasePage(RemoteWebDriver driver) {
        this.driver = driver;
        isLoaded();
    }

    public static void waitForPageLoad(final RemoteWebDriver driver) {
        waitForPageLoad(driver, DriverFactory.maxElementWait);
    }

    public static boolean waitForPageLoad(final RemoteWebDriver driver, int maxWait) {
        Log.info("Info : Wait for page to load...");
        final JavascriptExecutor js = (JavascriptExecutor) driver;
        FluentWait<WebDriver> wait = new WebDriverWait(driver, 0).withTimeout(Duration.ofSeconds(maxWait)).pollingEvery(Duration.ofSeconds(1))
                .ignoring(StaleElementReferenceException.class).withMessage("Page Load Time Out");
        boolean docReadyState = false;
        try {
            docReadyState = (Boolean) js
                    .executeScript("return (function() {if(document.readyState!='complete'){return false;}();");
        } catch (Exception e) {

        }
        return docReadyState;
    }

    @Override
    protected void load() {

    }

    @Override
    protected void isLoaded() throws Error {

    }
}