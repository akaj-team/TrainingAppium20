Feature: Test on Info screen

  Background:
    Given InfoPage is opened

  Scenario: Check Function of BackToHome button
    When I click BackToHome button
    Then HomePage is opened

  Scenario: Check Function of Videos button
    When I click Videos button
    Then The HomePage is not displayed

  Scenario: Check Size of Servings
    When Check Size of Servings
    Then Servings Size is exist

  Scenario: Check Size of Type
    When Check Size of Type
    Then Types is exist


