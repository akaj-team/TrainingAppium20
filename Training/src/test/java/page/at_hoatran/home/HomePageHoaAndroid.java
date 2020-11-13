package page.at_hoatran.home;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

import java.util.List;

/**
 * for screen
 *
 * @author at-hoa.tran
 */
public class HomePageHoaAndroid extends HomePageHoa {
    @AndroidFindBy(id = "sub_header")
    private MobileElement txtSubHeader;

    @AndroidFindBy(id = "menu_toggle_modes")
    private MobileElement tvMenuToggleModes;

    @AndroidFindBy(className = "android.widget.ImageView")
    private MobileElement btnMenu;

    @AndroidFindBy(className = "android.widget.TextView")
    private MobileElement listDay;

    @AndroidFindBy(id = "date_pager_indicator")
    private MobileElement lstDay;

    public HomePageHoaAndroid(MobileDriver driver) {
        super(driver);
    }

    @Override
    public String getTitle() {
        return actionBar.findElement(By.className("android.widget.TextView")).getText();
    }

    /*
        @Override
        public String getTextTweaks(){
            return tvMenuToggleModes.getText();
        }

        @Override
        public HomePageHoa clickTweaksButton(){
            tvMenuToggleModes.click();
            return this;
        }

        @Override
        public HomePageHoa clickMenuIcon(){
            btnMenu.click();
            return this; }

        @Override
        public boolean isTodayDisplayed(){
            SimpleDateFormat format= new SimpleDateFormat("EEE, MMM d", Locale.getDefault());
            String myDate = format.format(new Date());
            String txtToDay = lstDay.findElement(By.xpath("//*[@clickable='false']")).getText();
            if (myDate==txtToDay)
                return true;
            else
            return false;
        }

        @Override
        public String getCurrentDay(){
            return lstDay.findElement(By.xpath("//*[@clickable='false']")).getText();
        }
    */

    /*
        @Override
        public String getTextSubHeader(){
           String numServings = txtSubHeader.findElement(By.id("num_servings")).getText();
           String max = txtSubHeader.findElement(By.id("max")).getText();
            return numServings+ " out of " + max;
        }
    */
    @Override
    public boolean isImageOfFoodDisplayed(int n) {
        MobileElement items = listFood.findElements(By.id("food_icon")).get(n);
        isForElementPresent(items);
        return true;
    }

    @Override
    public HomePageHoa backKeyDevice() {
        AndroidDriver driver = (AndroidDriver) getDriver();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        return this;
    }

    @Override
    public List<MobileElement> getListFoodName() {
        return listFood.findElements(By.id("food_name"));
    }

    @Override
    public boolean isTextFoodContain(int n, String text) {
        MobileElement items = listFood.findElements(By.id("food_name")).get(n);

        boolean result = isForElementPresent(items);
        if (result == false) {
            // scrollToElementContainText(text,items);
            scrollToView();
            return items.getText().contains(text);
        }
        return items.getText().contains(text);
    }

    @Override
    public HomePageHoa clickCalendarButton(int n) {
        listFood.findElements(By.id("food_history")).get(n).click();
        return this;
    }

    @Override
    public String getTitleHistoryScreen() {
        return actionBar.findElement(By.className("android.widget.TextView")).getText();
    }

    @Override
    public HomePageHoa clickSupplementItem() {
        List<MobileElement> list = listFood.findElements(By.id("food_name"));
        list.get(list.size() - 1).click();
        return this;
    }

    @Override
    public HomePageHoa clickMoreInfoButton(int n) {
        listFood.findElements(By.id("food_name")).get(n).click();
        return this;
    }

    @Override
    public String getTitleServingsSizeScreen(String text) {
        return actionBar.findElement(By.className("android.widget.TextView")).getText();
    }

    @Override
    public HomePageHoa clickChartButton() {
        txtSubHeader.findElements(By.className("android.widget.TextView")).get(3).click();
        return this;
    }

    @Override
    public HomePageHoa selectCheckBox(int n) {
        listFood.findElements(By.id("food_check_boxes_container")).get(n).click();
        return this;
    }

    @Override
    public HomePageHoa unselectCheckBox(int n) {
        listFood.findElements(By.id("food_check_boxes_container")).get(n).click();
        listFood.findElements(By.id("food_check_boxes_container")).get(n).click();
        return this;
    }
}
