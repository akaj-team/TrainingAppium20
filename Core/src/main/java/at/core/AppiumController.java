package at.core;

import at.base.Const;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.xml.XmlTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @author tien.hoang
 */
class AppiumController {
    static AppiumController instance = new AppiumController();
    private ThreadLocal<AppiumDriver> driverFactoryThread = new ThreadLocal<>();
    private AppiumDriver driver = null;

    /**
     * Get Appium driver #synchronized
     *
     * @return appium driver
     */
    synchronized AppiumDriver getDriver() {
        if (driverFactoryThread.get() == null) {
            try {
                startDefaultServer();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return driverFactoryThread.get();
    }

    /**
     * Start test session
     *
     * @param xmlTest
     * @throws MalformedURLException
     */
    synchronized void start(XmlTest xmlTest) throws MalformedURLException {
        String workSpace;

        DesiredCapabilities capabilities = new DesiredCapabilities();
        if (System.getProperty("workSpace") != null) {
            workSpace = System.getProperty("workSpace");
        } else {
            workSpace = System.getProperty("user.dir");
            if (workSpace.contains("20/Training")) {
                workSpace = workSpace.replace("20/Training", "20");
            }
        }

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, xmlTest.getParameter(MobileCapabilityType.DEVICE_NAME));
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, xmlTest.getParameter(MobileCapabilityType.PLATFORM_VERSION));
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);

        if (xmlTest.getParameter(MobileCapabilityType.PLATFORM_NAME).equalsIgnoreCase("android")) {
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
            capabilities.setCapability(MobileCapabilityType.APP, workSpace + "/appfile/training/android/" + xmlTest.getParameter(MobileCapabilityType.APP));
            capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, xmlTest.getParameter(AndroidMobileCapabilityType.APP_PACKAGE));
//            capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, xmlTest.getParameter(AndroidMobileCapabilityType.APP_ACTIVITY));
            driver = new AndroidDriver(new URL(xmlTest.getParameter("server")), capabilities);
            ((AndroidDriver) driver).unlockDevice();
        } else if (xmlTest.getParameter(MobileCapabilityType.PLATFORM_NAME).equalsIgnoreCase("ios")) {
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
            capabilities.setCapability(MobileCapabilityType.APP, workSpace + "/appfile/training/ios/" + xmlTest.getParameter(MobileCapabilityType.APP));
            driver = new IOSDriver<>(new URL(xmlTest.getParameter("server")), capabilities);
        }

        if (driver != null) {
            driver.manage().timeouts().implicitlyWait(Const.TIME_OUT_MIN_ELEMENT, TimeUnit.SECONDS);
        }

        Set<String> contextNames = driver.getContextHandles();
        for (String contextName : contextNames) {
            if (contextName.contains("WEBVIEW") || contextName.contains("NATIVE_APP")) {
                driver.context(contextName);
                break;
            }
        }

        driverFactoryThread.set(driver);
    }

    /**
     * Stop test session
     */
    void stop() {
        if (driver != null) {
            driver.quit();
        }
    }

    private synchronized void startDefaultServer() throws MalformedURLException {
        XmlTest xmlTest = new XmlTest();
        xmlTest.setParameters(defaultAndroidParameters());
        start(xmlTest);
    }

    private Map<String, String> defaultAndroidParameters() {
        Map<String, String> parameters = new HashMap<>();
        parameters.put(MobileCapabilityType.PLATFORM_NAME, "android");
        parameters.put(MobileCapabilityType.DEVICE_NAME, "Pixel XL API 27");
        parameters.put(MobileCapabilityType.PLATFORM_VERSION, "9");
        parameters.put(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        parameters.put(AndroidMobileCapabilityType.APP_PACKAGE, "org.nutritionfacts.dailydozen");
        parameters.put(MobileCapabilityType.APP, "org.nutritionfacts.dailydozen.apk");
        parameters.put("server", "http://127.0.0.1:4723/wd/hub");
        return parameters;
    }

    private Map<String, String> defaultIosParameters() {
        Map<String, String> parameters = new HashMap<>();
        parameters.put(MobileCapabilityType.PLATFORM_NAME, "ios");
        parameters.put(MobileCapabilityType.DEVICE_NAME, "iPhone 8 Plus");
        parameters.put(MobileCapabilityType.PLATFORM_VERSION, "13.7");
        parameters.put(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        parameters.put(MobileCapabilityType.APP, "org.nutritionfacts.dailydozen.app");
        parameters.put("server", "http://127.0.0.1:4723/wd/hub");
        return parameters;
    }
}
