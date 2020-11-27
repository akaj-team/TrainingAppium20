Feature: Test on Calendar screen

  Background:
    Given Calendar screen is opened

  Scenario: Check display of Calendar screen
    When I check display of Calendar screen
    Then Calendar is displayed

  Scenario: Check function of back button
    When I tap on back button
    Then Home screen is opened

  Scenario: Check content of item
    When I check content of item
    Then The content of item is correct

  Scenario: Check display initial time
    When I check display initial time
    Then The initial time is current time

  Scenario: Check function of swipe history
    When I swipe from left to right
    Then The time is back to one month

  Scenario: Check function of swipe history
    When I swipe from right to left
    Then The time is forward to one month

  Scenario: Check function of swipe history
    When I swipe from right to left in current time
    Then The time is still current time

  Scenario: Check some buttons of Android devices
    When I tap on next button
    Then The time is forward to one month

  Scenario: Check some buttons of Android devices
    When I tap on next previous button
    Then The time is back to one month

  Scenario: Check some buttons of IOS devices
    When I tap on daily dozen button
    Then Home screen is opened

  Scenario: Check some buttons of IOS devices
    When I tap on info button
    Then Info screen is opened

  Scenario: Check some buttons of IOS devices
    When I tap on settings button
    Then Settings screen is opened
