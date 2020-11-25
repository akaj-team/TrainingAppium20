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
    Then I see "<name>" item at the <pos> position on list
    Examples:
      | pos | name                   |
      | 1   | Beans                  |
      | 2   | Berries                |
      | 3   | Other Fruits           |
      | 4   | Cruciferous Vegetables |
      | 5   | Greens                 |
      | 6   | Other Vegetables       |
      | 7   | Flaxseeds              |
      | 8   | Nuts and Seeds         |
      | 9   | Herbs and Spices       |
      | 10  | Whole Grains           |
      | 11  | Beverages              |
      | 12  | Exercise               |
      | 13  | Vitamin B12            |

  Scenario: Check function of More Info button of Vitamin B12 item
    When I click on the More Info button of VitaminB12 item
    Then The HomePage is not displayed

  Scenario: Check function of the Chart button
    When I click Chart button
    Then Servings History Page is Displayed