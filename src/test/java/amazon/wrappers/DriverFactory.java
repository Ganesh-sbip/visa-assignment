package amazon.wrappers;

import amazon.utility.Log;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

/**
 * Created By: Ganesh Prabhakaran
 * Version: 1.0
 */

/**
 * This class is used to create drivers based on the input from the config
 * properties files
 */

public class DriverFactory extends Elementwrappers {

    public static RemoteWebDriver driver = null;
    public static int maxElementWait = 4;

    /**
     * This method initialize and returns the driver
     *
     * @throws Exception
     */
    public RemoteWebDriver initialize() throws Exception {
        if (driver == null) {
            Log.info("Info : Initializing Driver - New");

            this.driver = getDriver();
            createNewInstanceDriver();
            Log.info("Info : Desktop Driver initialized");

        } else {
            Log.info("Info - Initializing Driver : Existing");
            this.driver = getDriver();
        }
        return driver;
    }

    /**
     * This method creates the driver based on the input from the
     * config.properties files
     *
     * @throws Exception
     */
    private void createNewInstanceDriver() throws Exception {
        String browser = System.getProperty("browser");
        String mainURL = System.getProperty("mainURL");

            Log.info("Info : Browser - " + browser);
            DesiredCapabilities cap = new DesiredCapabilities();
            switch (browser) {
                case "Chrome":
                    try {

                        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "BrowserDrivers" + File.separator + "chromedriver.exe");
                        ChromeOptions chromeOptions = new ChromeOptions();
                        chromeOptions.addArguments("--window-size=1920,1080");
                        chromeOptions.setExperimentalOption("useAutomationExtension", false);

                        Log.info("Info : Chrome options are set:/n" + chromeOptions);

                        driver = new ChromeDriver(chromeOptions);
                        driver.get(mainURL);
                        waitForLoad(driver);
                        Log.info("Invoked Chrome driver successfully");

                    } catch (Exception e) {
                        Log.info("Error : Invoke Chrome driver - " + e);
                        throw new Exception("Error : Invoke Chrome driver - " + e);
                    }
                    break;
                case "IE":
                    try {
                        System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + File.separator + "BrowserDrivers" + File.separator + "IEDriverServer.exe");

                        driver = new InternetExplorerDriver();
                        driver.manage().window().maximize();
                        driver.get(mainURL);
                        waitForLoad(driver);
                        Log.info("Invoked IE driver successfully");
                    } catch (Exception e) {
                        Log.info("Error : Invoke IE driver - " + e);
                        throw new Exception("Error : Invoke IE driver - " + e);
                    }
                    break;
                case "Firefox":
                    try {
                        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + File.separator + "BrowserDrivers" + File.separator + "geckodriver.exe");

                        driver = new FirefoxDriver();
                        driver.manage().window().maximize();
                        driver.get(mainURL);
                        waitForLoad(driver);
                        Log.info("Invoked Firefox driver successfully");
                    } catch (Exception e) {
                        Log.info("Error : Invoke Firefox driver - " + e);
                        throw new Exception("Error : Invoke Firefox driver - " + e);
                    }
                    break;
            }

        }

    /**
     * This method returns the created driver
     */

    public RemoteWebDriver getDriver() {
        return driver;
    }

    /**
     * This method used to close the opened session of the driver
     *
     * @throws InterruptedException
     */

    public void destroyDriver() throws InterruptedException {
        Log.info("Info : Driver quits...");
        // Thread.sleep(10000);
        driver.quit();
        driver = null;

    }

    public static void waitForLoad(WebDriver driver) {
        int waitFor = 2;
        Log.info("Info : Wait for page to load");
        ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                String pageLoadStatus = (String) ((JavascriptExecutor) driver).executeScript("return document.readyState");
                Log.info("Info : Page Load Status - " + pageLoadStatus);
                return pageLoadStatus.equals("complete") || pageLoadStatus.equals("interactive");
            }
        };
        Log.info("Info : Maximum wait for - " + waitFor);
        WebDriverWait wait = new WebDriverWait(driver, waitFor);
        wait.until(pageLoadCondition);
    }

    public static boolean switchToWindowId(RemoteWebDriver driver, String windowId) {
        try {
            if (System.getProperty("platform").equals("Desktop")) {
                driver.switchTo().window(windowId);
                return true;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}