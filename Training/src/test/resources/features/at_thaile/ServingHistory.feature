Feature: Test on ServingHistory screen

  Background:
    Given ServingHistory screen is opened

  Scenario: Check title ServingHistory screen
    When I check title on ServingHistory screen
    Then The title is "Serving History"

  Scenario: Check click Daily Dozen button
    When I click Daily Dozen button
    Then Display Daily Dozen screen

  Scenario: Check content tweaks button
    When I check content tweaks button
    Then The content contain "TWEAKS"

  Scenario: Check click more options button
    When I click more option button
    Then Display list options menu

  Scenario: Check click Month button
    When I click Month button
    Then Month button is active

  Scenario: Check click Year button
    When I click Year button
    Then Year button is active

  Scenario: Check click Day button
    When I click Day button
    Then Day button is active

  Scenario: Check click Setting button
    When I click Setting button
    Then Display Setting screen

  Scenario: Check click Info button
    When I click Info button
    Then Display Info screen