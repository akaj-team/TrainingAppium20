package at_cuongnguyen;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

/**
 * for screen
 *
 * @author at-cuong.nguyen
 */
public class ServicesPageAndroid extends ServicesPage {

    @AndroidFindBy(id = "change_units_button")
    public MobileElement btnUnit;

    public ServicesPageAndroid(MobileDriver driver) {
        super(driver);
    }

    public boolean isPageDisplayed() {
        return isForElementPresent(actionBar);
    }

    public ServicesPageAndroid open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
        }
        return this;
    }

    @Override
    public boolean isDailyDozenBtnContain() {
        return btnDailyDozen.isDisplayed();
    }

    @Override
    public boolean isBtnVideoContain() {
        return btnVideo.isDisplayed();
    }

    public ServicesPage checkImg(String im) {
        imgFood.getText().equals(im);
        return this;
    }

    @Override
    public boolean clickUnitButton() {
        if (btnUnit.isDisplayed())
            btnUnit.click();
        return false;
    }

    public ServicesPage clickVideoButton() {
        btnVideo.click();
        return this;
    }

    @Override
    public ServicesPage clickMenuButton() {
        btnMenu.click();
        return this;
    }

    @Override
    public String getTextTitle() {
        return txtServing.findElement(By.id("Serving Sizes")).getText();
    }

    @Override
    public String getFoodName() {
        actionBar.findElements(By.className("android.widget.TextView"));
        return actionBar.getText();
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