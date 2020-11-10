package page.at_hoatran;

import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

import java.util.ArrayList;
import java.util.List;

/**
 * for screen
 *
 * @author at-hoa.tran
 */
public class HomePageHoa extends BasePage {
    @AndroidFindBy(id = "action_bar")
    @iOSFindBy(className = "UIANavigationBar")
    public MobileElement actionBar;

    @AndroidFindBy(id = "header")
    @iOSFindBy(id = "Servings")
    public MobileElement txtHeader;

    @AndroidFindBy(id = "date_food_servings")
    @iOSFindBy(className = "UIATable")
    public MobileElement listFood;

    @AndroidFindBy(id = "food_history")
    @iOSFindBy(id = "ic calendar")
    private List<MobileElement> lstCalendar;

    public HomePageHoa(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(actionBar);
    }

    @Override
    public BasePage open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
        }
        return this;
    }

    public String getTitle() {
        return "";
    }

    public String getTextHeader() {
        return txtHeader.getText();
    }

    public List<MobileElement> getListFoodName() {
        return new ArrayList<>();
    }

    public boolean isImageOfFoodDisplayed(int n) {
        return false;
    }

    public boolean isTextFoodContain(int n, String text) {
        return false;
    }

    public String getTextOfFood(int pos) {
        List<MobileElement> list = getListFoodName();
        System.out.println("list.size:" + list.size());
        if (pos > list.size()) {
            int pos1 = pos - list.size();
            int pos2 = pos1;
            String name = list.get(list.size() - 1).getText();
            System.out.println("name:" + name);
            while (pos2 > 0) {
                scrollToView();
                list = getListFoodName();
                pos2 = pos2 - (list.size() - posFoodNameOnList(name, list));
                System.out.println("pos:" + pos2);
                if (pos2 > 0) {
                    pos1 = pos2;
                    name = list.get(list.size() - 1).getText();
                }
            }
            return list.get(pos1 + posFoodNameOnList(name, list)).getText();
        }
        System.out.println(list.get(pos).getText());
        return list.get(pos).getText();
    }

    private int posFoodNameOnList(String name, List<MobileElement> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getText().equals(name)) {
                return i;
            }
        }
        return 0;
    }

    public HomePageHoa clickCalendarButton(int n) {
        return this;
    }

    public String getTitleHistoryScreen() {
        return "";
    }

    public HomePageHoa clickSupplementItem() {
        return this;
    }

    public HomePageHoa selectCheckBox(int n) {
        return this;
    }

    public HomePageHoa unselectCheckBox(int n) {
        return this;
    }

    public HomePageHoa clickMoreInfoButton(int n) {
        return this;
    }

    public String getTitleServingsSizeScreen(String text) {
        return "";
    }

    public HomePageHoa clickBackButtonOnServingsSizeScreen() {
        return this;
    }

    public boolean isNotHomepageDisplayed() {
        return false;
    }

    public String getTitleInfoMenuScreen() {
        return "";
    }

    public HomePageHoa clickTweaksButton() {
        return this;
    }

    public boolean isTweaksScreenDisplayed() {
        return false;
    }

    public HomePageHoa clickInfoMenuButton() {
        return this;
    }

    public boolean isInfoScreenDisplayed() {
        return false;
    }

    public HomePageHoa clickSettingsMenuButton() {
        return this;
    }

    public boolean isSettingsScreenDisplayed() {
        return false;
    }

    public HomePageHoa clickChartButton() {
        return this;
    }

    public boolean isServingsHistoryDisplayed() {
        return false;
    }
}
