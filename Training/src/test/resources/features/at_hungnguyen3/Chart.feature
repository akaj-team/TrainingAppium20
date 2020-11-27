Feature: Test on Chart screen

  Background:
    Given ChartPage screen is opened

  Scenario: Check Text of tv Header
    When I Check Text of tv Header
    Then Text is "Time scale"

  Scenario: Check function of Home Button
    When I click Home Button
    Then Homepage screen is opened

  Scenario: Check Title of Chart screen
    When I check title of Chart screen
    Then Title is "Daily Tweaks History" or "Servings History"
