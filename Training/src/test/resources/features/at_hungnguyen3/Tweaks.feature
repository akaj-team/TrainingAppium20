Feature: Test on Tweaks screen

  Background:
    Given Tweaks is opened

  Scenario: Check Function of Daily Dozen button
    When I click Daily Dozen button
    Then HomePage is opened

  Scenario: Check title of TweaksPage
    Then Title contains "Tweaks"

  Scenario: Check Function of About button
    When I click About Menu button
    Then Menu About is displayed

  Scenario: Check Function of About button
    When I click About Menu button
    Then Menu About is displayed
