package at_cuongnguyen;

import io.appium.java_client.MobileDriver;
import org.openqa.selenium.By;

/**
 * for screen
 *
 * @author at-cuong.nguyen
 */
public class ServicesPageAndroid extends ServicesPage {

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

    public boolean isbtnvideoContain() {
        return btnVideo.isDisplayed();
    }

    public ServicesPageAndroid clickPreviousButton() {
        actionBar.findElement(By.className("android.widget.ImageView")).click();
        return this;
    }

    public ServicesPageAndroid checkImg(String im){
         imgFood.getText().equals(im);
         return this;
    }

    public ServicesPageAndroid clickUnitButton(){
        btnUnit.click();
        return this;
    }

    public boolean isImageBtnContain() {
        return btnDailyDozen.isDisplayed();
    }

    public ServicesPageAndroid clickVideoButton(int pos){
        actionBar.findElements(By.id("food_info_videos")).get(pos).click();
        return this;
    }

    public String getTextTitle() {
        return actionBar.findElement(By.className("android.widget.TextView")).getText();
    }

    public ServicesPageAndroid clickMenuButton() {
        btnMenu.click();
        return this;
    }

    //public String getTextTvMenuToggleModes() {return tvMenuToggleModes.getText(); }

    //public boolean isListMenuDisplay() {return isForElementPresent(listMenu);}

    //public String getTextOfNameFood(int pos) {return container.getText();}

    //public String clickIcCalendar(int pos) {return container.findElements(By.className("UIAStaticText")).get(pos).getText();}

    //public boolean isContentTvMenuToggleModesContain(String text) {return getTextTvMenuToggleModes().contains(text);}
}

