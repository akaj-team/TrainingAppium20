Feature: Test on ServingHistory screen

  Background:
    Given HomePage screen is opened

  Scenario:
    When I open HomePage screen
    Then Screen title is "Daily Dozen"

  Scenario:
    When I click on Stat button
    Then Open Serving History screen

  Scenario:
    When I click on Today button
    Then Display TimeView

  Scenario:
    When I click on More Info button
    Then Open Service screen

  Scenario:
    When I click on Supplements button
    Then Display Supplements pop-up

  Scenario:
    When I click on Beans Checkbox
    Then Beans checkbox is ticked

  Scenario:
    When I click on Beans Calendar button
    Then Beans calendar screen is display
