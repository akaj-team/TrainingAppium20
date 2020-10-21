package stepdefs.at_hanhnguyen;

import at.core.PageFactory;
import cucumber.api.java8.En;
import at.base.BaseDefinitions;
import page.at_hanhnguyen.DailyDozenTweaksPage;

/**
 * @author hanhnguyent
 */
class DailyDozenTweaksDefinitions extends BaseDefinitions implements En {
    DailyDozenTweaksPage dailyDozenTweaksPage= new PageFactory<>(DailyDozenTweaksPage.class).create();

    public DailyDozenTweaksDefinitions() {
    }
}
