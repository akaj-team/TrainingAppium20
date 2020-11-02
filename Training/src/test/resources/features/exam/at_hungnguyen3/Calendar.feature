Feature: Test on Calendar screen

  Background:
    Given Calendar screen is opened

  Scenario: Check display of Calendar screen
    When I check display of Calendar screen
    Then Calendar is displayed

  Scenario: Check function of back button
    When I tap on back button
    Then Home screen is opened

  Scenario: Check display initial time
    When I check display initial time
    Then The initial time is current time

  Scenario: Check function of DailyDozen button(ios devices)
    When I tap on DailyDozen button
    Then Home screen is opened

  Scenario: Check function of Info button(ios devices)
    When I tap on Info button
    Then Info screen is opened

  Scenario: Check function of Settings button(ios devices)
    When I tap on Settings button
    Then Settings screen is opened
