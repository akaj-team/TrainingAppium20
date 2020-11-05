package at_cuongnguyen;

import at.core.PageFactory;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import page.at_hadang.HomePage;

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

    @Override
    public ServicesPage open(String name, int pos) {
        if (!isPageDisplayed()) {
            HomePage homePage = new PageFactory<>(HomePage.class).create();
            homePage.open();
            homePage.clickMoreInfoButton(name,pos);
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
      return actionBar.findElements(By.className("android.widget.TextView")).get(1).getText();
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