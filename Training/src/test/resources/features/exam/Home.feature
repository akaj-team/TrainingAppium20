Feature: Test on Home screen

  Background:
    Given Home screen is opened

  Scenario: Check title home screen
    When I check title on home screen
    Then The title is "Daily Dozen"

  Scenario: Check content tweaks button
    When I check content tweaks button
    Then The content contain "TWEAKS"

  Scenario: Check click Daily Dozen button
    When I click Daily Dozen button
    Then Display Daily Dozen screen

  Scenario: Check click more options button
    When I click more option button
    Then Display list options menu

