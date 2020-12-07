package page.at_hungnguyen3.detailfood;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

import java.util.List;

public class DetailFoodPageAndroid extends DetailFoodPage {

    @AndroidFindBy(className = "android.widget.ImageButton")
    private MobileElement btnHomeButton;

    @AndroidFindBy(id = "food_info_videos")
    private MobileElement firstTvVideo;

    @AndroidFindBy(id = "text1")
    private List<MobileElement> listServing;

    @AndroidFindBy(id = "food_name")
    private List<MobileElement> listType;

    public DetailFoodPageAndroid(MobileDriver driver) {
        super(driver);
    }

    @Override
    public String getTitle() {
        return actionBar.findElement(By.className("android.widget.TextView")).getText();
    }

    @Override
    public DetailFoodPage clickBackButton() {
        actionBar.findElement(By.className("android.widget.ImageButton")).click();
        return this;
    }

    @Override
    public DetailFoodPage clickBtnHomeButton() {
        btnHomeButton.click();
        return this;
    }

    @Override
    public boolean isFirstVideoDisplayed() {
        return firstTvVideo.isDisplayed();
    }

    @Override
    public DetailFoodPage clickFirstTvVideo() {
        firstTvVideo.click();
        return this;
    }

    @Override
    public int getSizeOfListServing() {
        return listServing.size();
    }

    @Override
    public boolean isListServingAndTypeDisplayed() {
        scrollToView();
        return listServing.size() > 0 && listType.size() > 0;
    }
}
