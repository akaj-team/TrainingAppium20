Feature: Test on Home screen

  Background:
    Given Home screen is opened

  Scenario: Check title of Home screen
    When I check title of Home screen
    Then The title is "Daily Dozen"

  Scenario Outline: Verify display of items in the Servings list
    When I check display of items in the Servings list
    Then I see 12 items with "<name>" correctly

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

  Scenario Outline: Verify quantity of checkboxes on each item
    When I check quantity of checkboxes on each item
    Then I see "<quantity>" checkboxes on "<name>" item

    Examples:
      | name                   | quantity |
      | Beans                  | 3        |
      | Berries                | 1        |
      | Other Fruits           | 3        |
      | Cruciferous Vegetables | 1        |
      | Greens                 | 2        |
      | Other Vegetables       | 2        |
      | Flaxseeds              | 1        |
      | Nuts and Seeds         | 1        |
      | Herbs and Spices       | 1        |
      | Whole Grains           | 3        |
      | Beverages              | 5        |
      | Exercise               | 1        |

  Scenario: Check function of the 21Tweaks button
    When I click on the 21Tweaks button
    Then Move to 21 Tweaks screen successfully

  Scenario: Check function of the InfoMenu button
    When I click on the InfoMenu button
    Then Move to Info screen successfully

  Scenario: Check function of the Chart button
    When I click on the Chart button
    Then Move to Servings History screen successfully