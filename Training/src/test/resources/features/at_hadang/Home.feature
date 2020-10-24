Feature: Test on Home screen

  Background:
    Given Home screen is opened

  Scenario: Check title of Home screen
    When I check title of Home screen
    Then The title is "Daily Dozen"

  Scenario: Check header text of Home screen
    When I check header text of Home screen
    Then The header text is "Servings"

  Scenario Outline: Verify display of items in the Servings list
    When I check display of items in the Servings list
    Then I see 13 items with "<name>" correctly

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
      | Vitamin B12            | 1        |

  Scenario: Check function of the checkbox
    When I click on the first checkbox of the "Beans" item
    Then All of checkboxes are selected
    When I click on the first checkbox again
    Then The first checkbox is unselected
    And The 2nd checkbox and the 3rd checkbox are still selected
    When I click on the 3rd checkbox of the "Beans" item
    Then The 2nd checkbox and the 3rd checkbox are unselected

  Scenario Outline: Check function of the Calendar button
    When I click on the [Calendar] button of each item
    Then Move to History screen of "<name>" item successfully

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

  Scenario Outline: Check function of the More Info button in the Servings list
    When I click on the More Info button of each item
    Then Move to Servings Size screen of "<name>" item successfully

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

  Scenario: Check function of More Info button of Vitamin B12 item
    When I click on the More Info button of "<Vitamin B12>" item
    Then The Home screen is not displayed

  Scenario: Check function of the 21Tweaks button
    When I click on the 21Tweaks button
    Then Move to 21 Tweaks screen successfully

  Scenario: Check function of the Info Menu button
    When I click on the InfoMenu button
    Then Move to Info screen successfully

  Scenario: Check function of the Chart button
    When I click on the Chart button
    Then Move to Servings History screen successfully
