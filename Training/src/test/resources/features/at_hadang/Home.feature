Feature: Test on Home screen

  Background:
    Given Home page is opened

  Scenario: Check title of Home screen
    When I check title of Home screen
    Then The title of Home screen is "Daily Dozen"

  Scenario: Check header text of Home screen
    When I check header text of Home screen
    Then The header text of Home screen is "Servings"

  Scenario Outline: Verify display of items on the Servings list
    When I check display of items in the Servings list
    Then I see "<name>" item at the <pos> position on list

    Examples:
      | pos | name                   |
      | 0   | Beans                  |
      | 1   | Berries                |
      | 2   | Other Fruits           |
      | 3   | Cruciferous Vegetables |
      | 4   | Greens                 |
      | 5   | Other Vegetables       |
      | 6   | Flaxseeds              |
      | 7   | Nuts and Seeds         |
      | 8   | Herbs and Spices       |
      | 9   | Whole Grains           |
      | 10  | Beverages              |
      | 11  | Exercise               |
      | 12  | Vitamin B12            |

  Scenario Outline: Check function of thex Calendar button
    When I click on the Calendar button of each item
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
    When I click on the More Info button of "<name>" item at the <pos> position
    Then Move to Servings Size screen of "<name>" item successfully

    Examples:
      | pos | name                   |
      | 0   | Beans                  |
      | 1   | Berries                |
      | 2   | Other Fruits           |
      | 3   | Cruciferous Vegetables |
      | 4   | Greens                 |
      | 5   | Other Vegetables       |
      | 6   | Flaxseeds              |
      | 7   | Nuts and Seeds         |
      | 8   | Herbs and Spices       |
      | 9   | Whole Grains           |
      | 10  | Beverages              |
      | 11  | Exercise               |

  Scenario: Check function of More Info button of Vitamin B12 item
    When I click on the More Info button of "Vitamin B12" item at the 12 th position
    Then The Home screen is not displayed

  Scenario: Check function of the 21Tweaks button
    When I click on the Tweaks button
    Then Move to Tweaks screen successfully

  Scenario: Check function of the Info Menu button
    When I click on the InfoMenu button
    Then Move to Info screen successfully

  Scenario: Check function of the Chart button
    When I click on the Chart button
    Then Move to Servings History screen successfully