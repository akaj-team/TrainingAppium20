package at.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;

/**
 * @author tien.hoang
 */
public abstract class BasePage {
    private static final double OFFSET1 = 0.8;
    private static final double OFFSET2 = 0.2;
    private static final int DURATION = 500;
    private static final int OFFSET_X = 10;
    private static final double OFFSET_RIGHT1 = 0.7;
    private static final double OFFSET_RIGHT2 = 0.3;
    private static final double OFFSET_LEFT1 = 0.2;
    private static final double OFFSET_LEFT2 = 0.9;
    private MobileDriver driver;

    public BasePage(MobileDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.driver = driver;
    }

    /**
     * Get Mobile driver
     *
     * @return mobile driver
     */
    private static HashMap<String, Integer> getScrollStartAndEndElements(AppiumDriver driver) {
        Dimension dimensions = driver.manage().window().getSize();
        Double screenHeightStart = dimensions.getHeight() * 0.5;
        HashMap<String, Integer> scrollHash = new HashMap<>();
        Integer scrollStart = screenHeightStart.intValue();
        scrollHash.put("start", scrollStart);
        Double screenHeightEnd = dimensions.getHeight() * 0.2;
        Integer scrollEnd = screenHeightEnd.intValue();
        scrollHash.put("end", scrollEnd);
        return scrollHash;
    }

    public BasePage swipeRight() {
        Dimension size = getDriver().manage().window().getSize();
        int startY = (size.height / 2);
        int startX = (int) (size.width * OFFSET_RIGHT1);
        int endX = (int) (size.width * OFFSET_RIGHT2);
        (new TouchAction(getDriver()))
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(DURATION)))
                .moveTo(PointOption.point(endX, startY))
                .release()
                .perform();
        return this;
    }

    public BasePage swipeLeft() {
        Dimension size = getDriver().manage().window().getSize();
        int startY = (size.height / 2);
        int endX = (int) (size.width * OFFSET_LEFT1);
        int startX = (int) (size.width * OFFSET_LEFT2);
        (new TouchAction(getDriver()))
                .press(PointOption.point(endX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(DURATION)))
                .moveTo(PointOption.point(startX, startY))
                .release()
                .perform();
        return this;
    }

    /**
     * Get Mobile driver
     *
     * @return mobile driver
     */
    public MobileDriver getDriver() {
        return driver;
    }

    /**
     * Wait for element displayed with timeout
     *
     * @param by
     * @param timeOutInSecond
     */
    public void waitForElementDisplay(By by, int timeOutInSecond) {
        try {
            new WebDriverWait(getDriver(), timeOutInSecond).until(
                    driver -> isElementDisplayed((MobileElement) getDriver().findElement(by)));
        } catch (Exception e) {
            // no-opt
        }
    }

    /**
     * Wait for element displayed with timeout
     *
     * @param element
     * @param timeOutInSecond
     */
    public void waitForElementDisplay(MobileElement element, int timeOutInSecond) {
        try {
            new WebDriverWait(getDriver(), timeOutInSecond).until(
                    driver -> isElementDisplayed(element));
        } catch (Exception e) {
            // no-opt
        }
    }

    /**
     * Wait for element displayed without timeout
     *
     * @param element
     */
    public void waitForElementDisplay(MobileElement element) {
        try {
            new WebDriverWait(getDriver(), Const.TIME_OUT_NORMAL_ELEMENT).until(
                    driver -> isElementDisplayed(element));
        } catch (Exception e) {
            // no-opt
        }
    }

    /**
     * Wait for element displayed without timeout
     *
     * @param element
     */
    public void waitForElementEnable(MobileElement element) {
        try {
            new WebDriverWait(getDriver(), Const.TIME_OUT_NORMAL_ELEMENT).until(
                    driver -> element.isEnabled());
        } catch (Exception e) {
            // no-opt
        }
    }

    /**
     * Wait for element hide without timeout
     *
     * @param element
     */
    public void waitForElementHide(MobileElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(),Const.TIME_OUT_MEDIUM_ELEMENT);

            wait.until(driver -> !isElementDisplayed(element));
            new WebDriverWait(getDriver(), Const.TIME_OUT_NORMAL_ELEMENT).until(
                    driver -> !isElementDisplayed(element));
        } catch (Exception e) {
            // no-opt
        }
    }

    /**
     * Wait for page displayed
     *
     * @param element
     */
    public BasePage waitForPageDisplayed(MobileElement element) {
        try {
            new WebDriverWait(getDriver(), Const.TIME_OUT_NORMAL_ELEMENT).until(
                    driver -> isElementDisplayed(element));
        } catch (Exception e) {
            // no-opt
        }
        return this;
    }

    /**
     * Check for screen is displayed
     *
     * @param element
     * @return
     */
    public boolean isForElementPresent(MobileElement element) {
        return isElementDisplayed(element, Const.TIME_OUT_MIN_ELEMENT);
    }

    /**
     * Wait for element displayed with scroll action then click without timeout
     *
     * @param elementTextDisplay
     * @param element
     */
    public void scrollToElementContainText(String elementTextDisplay, MobileElement element) {
        try {
            new WebDriverWait(getDriver(), Const.TIME_OUT_MIN_ELEMENT).until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            if (getDriver() instanceof AndroidDriver) {
                AndroidDriver androidDriver = (AndroidDriver) getDriver();
                androidDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"" + elementTextDisplay + "\"))");
            } else if (getDriver() instanceof IOSDriver) {
                JavascriptExecutor js = (IOSDriver) getDriver();
                HashMap<String, String> scrollDownObject = new HashMap<>();
                scrollDownObject.put("predicateString", "value == '" + elementTextDisplay + "'");
                scrollDownObject.put("direction", "down");
                js.executeScript("mobile: scroll", scrollDownObject);
                if (!element.isDisplayed()) {
                    HashMap<String, String> scrollUpObject = new HashMap<>();
                    scrollUpObject.put("predicateString", "value == '" + elementTextDisplay + "'");
                    scrollUpObject.put("direction", "up");
                    js.executeScript("mobile: scroll", scrollUpObject);
                }
            }
        }
    }

    /**
     * Check page is displayed
     *
     * @return boolean
     */
    public abstract boolean isPageDisplayed();

    /**
     * Click back button
     */
    public BasePage clickBackButton() {
        return this;
    }

    /**
     * Navigate to page
     */
    public abstract BasePage open();

    /**
     * Scroll to see elements
     */
    public void scrollToView() {
        try {
            Dimension dimensions = getDriver().manage().window().getSize();
            int startPosition = (int) (dimensions.getHeight() * OFFSET1);
            int endPosition = (int) (dimensions.getHeight() * OFFSET2);
            (new TouchAction(getDriver()))
                    .press(PointOption.point(OFFSET_X, startPosition))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(DURATION)))
                    .moveTo(PointOption.point(OFFSET_X, endPosition))
                    .release()
                    .perform();
        } catch (Exception e) {

        }
    }

    /**
     * Click notification alerts
     */
    public BasePage clickNotification(By by) {
        try {
            new WebDriverWait(getDriver(), Const.TIME_OUT_MEDIUM_ELEMENT).until(
                    driver -> isElementDisplayed((MobileElement) getDriver().findElement(by)));
            getDriver().findElement(by).click();
        } catch (Exception e) {
            // no-opt
        }
        return this;
    }

    /**
     * ResetApp to logout app for android devices
     */
    public void resetAndroidApp() {
        getDriver().resetApp();
        getDriver().launchApp();
    }

    /**
     * Check element displayed for pages
     */
    public void waitToCallApiSuccess(boolean apiStatus) {
        WebDriverWait wait = new WebDriverWait(driver, Const.TIME_OUT_NORMAL_ELEMENT);
        try {
            wait.until(driver -> apiStatus);
        } catch (Exception e) {
            // No-opt
        }
    }

    /**
     * Check element displayed for pages
     */
    private boolean isElementDisplayed(MobileElement element, int timeOutInSecond) {
        boolean isVisible = false;
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSecond);
        try {
            if (wait.until(ExpectedConditions.visibilityOf(element)) != null) {
                isVisible = true;
            }
        } catch (Exception e) {
            // No-opt
        }
        return isVisible;
    }

    private boolean isElementDisplayed(MobileElement element) {
        try {
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
