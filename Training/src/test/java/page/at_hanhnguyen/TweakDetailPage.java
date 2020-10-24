package page.at_hanhnguyen;

import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.joda.time.LocalDate;
import org.openqa.selenium.By;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TweakDetailPage extends BasePage {
    @AndroidFindBy(id="action_bar")
    private MobileElement actionBar;

    @AndroidFindBy(id="tweak_info_image")
    private MobileElement image;

    @AndroidFindBy(id="tweak_short")
    private MobileElement titleOfContent;

    @AndroidFindBy(id="tweak_text")
    private MobileElement contentText;

    public TweakDetailPage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(actionBar);
    }

    @Override
    public BasePage open() {
        return null;
    }

    public String getTextTitleAtTweakDetail(){
        return actionBar.findElement(By.className("android.widget.TextView")).getText();
    }

    public boolean isImageDisplay(){
        return image.isDisplayed();
    }

    public String getTextTitleOfContent(){
        return titleOfContent.getText();
    }

    public boolean getTextfContent(){
        return contentText.isDisplayed();
    }

    public BasePage clickBackButton(){
        actionBar.findElement(By.className("android.widget.ImageButton")).click();
        return this;
    }
}
