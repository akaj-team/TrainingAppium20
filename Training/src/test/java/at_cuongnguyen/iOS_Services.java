package at_cuongnguyen;
import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;
import at_cuongnguyen.Android_Services;


public class iOS_Services extends Android_Services {


    public iOS_Services(MobileDriver driver) {
        super(driver);
    }

    public iOS_Services open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
        }
        return this;
    }

    public boolean isPageDisplayed() {
        return isForElementPresent(actionBar);
    }

    public String getTextTitle() {
        return txtServing.findElement(By.id("Serving Sizes")).getText();
    }

    public boolean isbtnvideoContain() {
        return btnVideo.isDisplayed();
    }

    public iOS_Services clickMenuButton() {
        btnMenu.click();
        return this;
    }

    public iOS_Services clickVideoButton(int pos){
        actionBar.findElements(By.id("VIDEOS")).get(pos).click();
        return this;
    }
    public iOS_Services clickUnitButton(){
        btnUnit.click();
        return this;
    }

    public iOS_Services clickPreviousButton() {
        actionBar.findElement(By.id("Daily Dozen")).click();
        return this;
    }


}
