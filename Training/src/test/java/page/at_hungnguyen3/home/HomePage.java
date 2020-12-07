package page.at_hungnguyen3.home;

import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage {
    @AndroidFindBy(id = "action_bar")
    @iOSFindBy(className = "UIANavigationBar")
    public MobileElement actionBar;

    @AndroidFindBy(id = "header")
    @iOSFindBy(id = "Servings")
    public MobileElement txtHeader;

    @AndroidFindBy(id = "date_food_servings")
    @iOSFindBy(className = "UIATable")
    public MobileElement listFood;

    @iOSFindBy(id = "Info")
    @AndroidFindBy(className = "android.widget.ImageView")
    private MobileElement btnMenu;

    @AndroidFindBy(id = "food_history")
    @iOSFindBy(id = "ic calendar")
    private List<MobileElement> listCalendar;

    @iOSFindBy(id = "21 Tweaks")
    @AndroidFindBy(id = "menu_toggle_modes")
    protected MobileElement btnTweaks;

    private int listSize = getListFoodName().size();
    private int lastPos = 0;

    public HomePage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(actionBar);
    }

    @Override
    public HomePage open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
            waitForPageDisplayed(actionBar);
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

    public String getTextOfFood(int pos) {
        if (pos == listSize + 1) {
            String name = getListFoodName().get(listSize - 1).getText();
            scrollToView();
            lastPos = posFoodNameOnList(name, getListFoodName());
        }

        if (pos > listSize) {
            int distance = pos - listSize;
            return getListFoodName().get(lastPos + distance).getText();
        }

        return getListFoodName().get(pos - 1).getText();
    }

    private int posFoodNameOnList(String name, List<MobileElement> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getText().equals(name)) {
                return i;
            }
        }
        return 0;
    }

    public HomePage clickCalendarButton(int n) {
        listCalendar.get(n).click();
        return this;
    }

    public HomePage clickSupplementItem() {
        scrollToView();
        getListFoodName().get(getListFoodName().size() - 1).click();
        return this;
    }

    public HomePage openApp() {
        getDriver().launchApp();
        return this;
    }

    public HomePage clickMoreInfoButton(int n) {
        return this;
    }

    public HomePage clickTweaksButton() {
        btnTweaks.click();
        return this;
    }

    public HomePage clickInfoMenuButton() {
        btnMenu.click();
        return this;
    }

    public HomePage clickChartButton() {
        return this;
    }

    public List<MobileElement> getListCheckbox() {
        return new ArrayList<>();
    }

    public HomePage clickCheckbox(int pos) {
        getListCheckbox().get(pos).click();
        return this;
    }

    public HomePage clickCheckbox(List<MobileElement> list, int pos) {
        list.get(pos).click();
        return this;
    }

    public boolean isCheckboxChecked(int pos) {
        return false;
    }
}
