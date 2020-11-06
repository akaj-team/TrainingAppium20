package page.at_hungnguyen3;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import page.at_hungnguyen3.InfoPage;

public class InfoPageIOS extends InfoPage {

    @AndroidFindBy(id = "food_info_videos")
    @iOSFindBy(xpath = "//*[@class='UIANavigationBar']/*[@id='VIDEOS']")
    private MobileElement btnVideo;

    public InfoPageIOS(MobileDriver driver) {
        super(driver);
    }

}
