package page.at_hungnguyen3.detailfood;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;

import java.util.List;

public class DetailFoodPageIOS extends DetailFoodPage {

    @iOSFindBy(id = "Daily Dozen")
    private MobileElement tvBack;

    @iOSFindBy(className = "UIATable")
    private MobileElement container;

    List<MobileElement> listServingAndType = container.findElements(By.className("UIAStaticText"));

    public DetailFoodPageIOS(MobileDriver driver) {
        super(driver);
    }

    @Override
    public String getTitle() {
        return tvHeader.getText();
    }

    @Override
    public DetailFoodPage clickBackButton() {
        tvBack.click();
        return this;
    }

    @Override
    public DetailFoodPage clickBtnHomeButton() {
        actionBar.findElement(By.id("Daily Dozen")).click();
        return this;
    }

    @Override
    public DetailFoodPage clickFirstTvVideo() {
        getDriver().findElement(By.id("VIDEOS")).click();
        return this;
    }

    @Override
    public boolean isListServingAndTypeDisplayed() {
        return container.findElements(By.className("UIAStaticText")).size() > 0;
    }

    @Override
    public boolean isFirstVideoDisplayed() {
        return actionBar.findElement(By.id("VIDEOS")).isDisplayed();
    }
}
