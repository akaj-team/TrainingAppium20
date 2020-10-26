package at_cuongnguyen;
import io.appium.java_client.MobileDriver;
import org.openqa.selenium.By;

/**
 * for screen
 *
 * @author at-cuong.nguyen
 */


public class ServicesPageIOS extends ServicesPage {

    public boolean isPageDisplayed() {return isForElementPresent(actionBar); }

    public ServicesPageIOS(MobileDriver driver) {
        super(driver);
    }

    public ServicesPageIOS open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
        }
        return this;
    }

    public boolean checkTitle(String til){
        return title.getText().equals(til);
    }

    public ServicesPageIOS checkImg(String im){
        imgFood.getText().equals(im);
        return this;
    }

    //Check title with only "Serving size"
    public String getTextTitle() {
        return txtServing.findElement(By.id("Serving Sizes")).getText();
    }

    public boolean isbtnvideoContain() {
        return btnVideo.isDisplayed();
    }

    public ServicesPageIOS clickVideoButton(int pos){
        actionBar.findElements(By.id("VIDEOS")).get(pos).click();
        return this;
    }
    public void clickUnitButtoniOS() {
        if (btnImperial.isDisplayed()) {
            btnImperial.click();
        }
        else  btnMetric.click();
    }
    public ServicesPageIOS clickPreviousButton() {
        actionBar.findElement(By.id("Daily Dozen")).click();
        return this;
    }
}