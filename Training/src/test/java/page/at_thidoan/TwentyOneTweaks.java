package page.at_thidoan;

import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

import java.util.List;

public class TwentyOneTweaks extends BasePage {
    @AndroidFindBy(id = "menu_toggle_modes")
    private MobileElement btnMenuToggleMode;

    @AndroidFindBy(className = "android.widget.TextView")
    private MobileElement txtHomeTitle;

    @AndroidFindBy(className = "android.widget.LinearLayout")
    private MobileElement listMealItems;

    @AndroidFindBy(className = "class='android.widget.CheckBox")
    @iOSFindBy(className = "UIAButton")
    private List<MobileElement> listCheckBox;

    @AndroidFindBy(id = "tweak_name")
    @iOSFindBy(id = "More Info")
    private MobileElement btnMoreInfo;

    @AndroidFindBy(id = "tweak_history")
    @iOSFindBy(id = "ic calendar")
    private MobileElement btnCalendar;

    @AndroidFindBy(id = "tweak_short")
    @iOSFindBy(className = "UIAStaticText")
    private List<MobileElement> listTxtDetail;

    @AndroidFindBy(className = "android.widget.TextView")
    @iOSFindBy(className = "UIAStaticText")
    private List<MobileElement> listTxtCalendar;


    public TwentyOneTweaks(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(btnMenuToggleMode);
    }

    @Override
    public BasePage open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
        }
        return this;
    }

    public String getTextHomeTitle() {
        return txtHomeTitle.getText();
    }

    public boolean isListMealItemsDisplayed() {
        return isForElementPresent(listMealItems);
    }

    public void checkAllCheckBoxes() {
        for (MobileElement mobileElement : listCheckBox) {
            if (!mobileElement.isSelected()) {
                mobileElement.click();
            }
        }
    }

    ;

    public void UncheckAllCheckBoxes() {
        for (MobileElement mobileElement : listCheckBox) {
            if (mobileElement.isSelected()) {
                mobileElement.click();
            }
        }
    }

    ;

    public boolean isAllCheckBoxChecked() {
        for (MobileElement mobileElement : listCheckBox) {
            if (!mobileElement.isSelected()) {
                return false;
            }
        }
        return true;
    }

    public boolean isAllCheckBoxUnchecked() {
        for (MobileElement mobileElement : listCheckBox) {
            if (mobileElement.isSelected()) {
                return false;
            }
        }
        return true;
    }

    public TwentyOneTweaks clickBtnMoreInfo() {
        btnMoreInfo.click();
        return this;
    }

    public TwentyOneTweaks clickBtnCalendar() {
        btnCalendar.click();
        return this;
    }

    public boolean isCalendarOfPreloadWaterDisplayed() {
        for (MobileElement mobileElement : listTxtCalendar) {
            waitForElementDisplay(mobileElement);
            if (mobileElement.getText().equals("Preload Water")) ;
            return true;
        }
        return false;
    }


    public boolean isDetailPreloadWaterDisplayed() {
        for (MobileElement mobileElement : listTxtDetail) {
            waitForElementDisplay(mobileElement);
            if (mobileElement.getText().equals("Preload with Water")) ;
            return true;
        }
        return false;
    }
}