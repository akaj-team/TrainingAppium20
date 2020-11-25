Feature: Test on Calendar screen

  Background:
    Given Calendar screen is opened

  Scenario: Check history display
    When I check display of history
    Then Text is "History"

  Scenario: Check function of back button
    When I tap on back button
    Then HomePage is opened

  Scenario: Check display initial time
    When I check display initial time
    Then The initial time is current time

  Scenario: Check item in CalendarPage
    When I check item
    Then Item text is correct
