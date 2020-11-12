Feature: Test on ServingsHistoryPage

  Background:
    Given Servings History Page is opened

  Scenario: Check title of screen
    Then Text contains "Servings History"

  Scenario: Check function of back button
    When I click Back button in Servings History Page
    Then HomePage is opened

  Scenario: Check function of time spinner
    When I click time spinner button in Servings History Page
    Then List time spinner is displayed




