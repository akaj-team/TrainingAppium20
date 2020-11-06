Feature: Test on Home screen

  Background:
    Given HomePage is opened

  Scenario: Check title home screen
    When I check title on home screen
    Then The title is "Daily Dozen"

  Scenario: Check content tweaks button
    When I check content tweaks button
    Then The content contain "TWEAKS" or "Tweaks"

  Scenario: Check function of Info button
    When I click Info button
    Then InfoPage is displayed

  Scenario: Check function of Calendar Button
    When I click Calendar Button
    Then CalendarPage is displayed

  Scenario: Check function of about button
    When I click About button
    Then About Menu is displayed

  Scenario: Check function of Tweaks button
    When I click Tweaks button
    Then TweaksPage is displayed

  Scenario Outline: Verify display of items in the Servings list
    When I check display of Food Name in the Servings list
    Then Texts of Food Names contains "<food name>"

    Examples:
      | food name              |
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

  Scenario: Check function of More Info button of Vitamin B12 item
    When I click on the More Info button of VitaminB12 item
    Then The HomePage is not displayed

  Scenario: Check function of the Chart button
    When I click Chart button
    Then Servings History Page is Displayed