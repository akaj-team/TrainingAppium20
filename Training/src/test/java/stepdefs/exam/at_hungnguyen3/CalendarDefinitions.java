package stepdefs.exam;

import at.base.BaseDefinitions;
import at.core.PageFactory;
import cucumber.api.java8.En;
import page.exam.at_hungnguyen3.CalendarPage;

public class CalendarDefinitions extends BaseDefinitions implements En {
    CalendarPage calendarPage = new PageFactory<>(CalendarPage.class).create();


    public CalendarDefinitions(){


    }


}
