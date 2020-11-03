package at_cuongnguyen;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;

/**
 * for screen
 *
 * @author at-cuong.nguyen
 */

public class ServicesPageIOS extends ServicesPage {

    @iOSFindBy(id = "IMPERIAL")
    public MobileElement btnImperial;

    @iOSFindBy(id = "METRIC")
    public MobileElement btnMetric;

    @iOSFindBy(className = "UIAStaticText")
    public MobileElement title;

    @iOSFindBy(className = "UIAView")
    public MobileElement viewBackground;

    public boolean isPageDisplayed() {
        return isForElementPresent(actionBar);
    }

    public ServicesPageIOS(MobileDriver driver) {
        super(driver);
    }

    @Override
    public ServicesPage open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
        }
        return this;
    }

    public boolean checkTitle(String til) {
        return title.getText().equals(til);
    }

    public ServicesPage checkImg(String im) {
        imgFood.getText().equals(im);
        return this;
    }

    @Override
    public String getTextTitle() {
        return txtServing.findElement(By.id("Serving Sizes")).getText();
    }

    @Override
    public String getFoodName() {
        viewBackground.findElements(By.className("UIAStaticText"));
        return viewBackground.getText();
    }


    @Override
    public boolean isDailyDozenBtnContain() {
        return btnDailyDozen.isEnabled();
    }

    @Override
    public boolean isBtnVideoContain() {
        return btnVideo.isDisplayed();
    }

    @Override
    public ServicesPage clickVideoButton() {
        btnVideo.click();
        return this;
    }

    @Override
    public boolean clickUnitButton() {
        if (btnImperial.isDisplayed()) {
            btnImperial.click();
        } else if (btnMetric.isDisplayed()) btnMetric.click();
        return false;
    }

    @Override
    public ServicesPage clickMenuButton() {
        btnMenu.click();
        return this;
    }

    @Override
    public boolean checkPreviousScreen() {
        if (isPreviousScreenDisplayed())
            return true;
        return false;
    }

    @Override
    public boolean checkServicesArea() {
        if (isServicesAreaDisplayed())
            return true;
        return false;
    }
}