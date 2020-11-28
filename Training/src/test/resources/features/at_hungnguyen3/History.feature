Feature: Test on History screen

  Background:
    Given HistoryPage screen is opened

  Scenario: Check function of back button
    When I tap on back button
    Then Homepage screen is opened

  Scenario: Check display initial time
    When I check display initial time
    Then The initial time is current time

  Scenario: Check function of Swipe
    When I swipe from the left
    Then The time is not current time
    When I swipe from the right
    Then The initial time is current time
