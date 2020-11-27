Feature: Test on Tweaks screen

  Background:
    Given TweaksPage screen is opened

  Scenario: Check Function of Daily Dozen button
    When I click Daily Dozen button
    Then Homepage screen is displayed

  Scenario: Check title of TweaksPage
    Then Title contains "Tweaks"

  Scenario: Check Function of About button
    When I click About Menu button
    Then Menu About is displayed
    When I click Lastest Video Button
    Then Move to LoginGoogle screen

  Scenario: Check Function of CheckBox
    Then I click CheckBox and CheckBox is checked





