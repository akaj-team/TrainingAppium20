Feature: Test on Home screen

  Background:
    Given Home screen is opened

  Scenario: Check title home screen
    When I check title on home screen
    Then The title is "Daily Dozen"

  Scenario: Check content tweaks button
    When I check content tweaks button
    Then The content contain "TWEAKS"

  Scenario: Check content of [Servings] text
    When I check content of [Servings] text
    Then The content of [Servings] text is "Servings"

  Scenario: Check click [TWEAKS] button
    When I click [TWEAKS] button
    Then [TWEAKS] screen is displayed correctly

  Scenario: Check click Calendar button
    When I click [Calendar] button
    Then [Calendar] screen is displayed correctly

  Scenario Outline: Verify display of items on the Servings list
    When I check display of items in the Servings list
    Then I see "<name>" item at the position on list

    Examples:
      | name                   |
      | Beans                  |
      | Berries                |
      | Other Fruits           |
      | Cruciferous Vegetables |
      | Greens                 |
      | Other Vegetables       |
      | Flaxseeds              |
      | Nuts and Seeds         |
      | Herbs and Spices       |
      | Whole Grains           |
      | Beverages              |
      | Exercise               |
      | Vitamin B12            |



