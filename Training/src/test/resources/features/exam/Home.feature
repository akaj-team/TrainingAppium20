@Home
Feature: Test on Home screen

  Background:
    Given Homepage screen is opened

  Scenario: Check title of Home screen
    When I check title of Home screen
    Then The title of Home screen is "Daily Dozen"

  Scenario: Check header text of Home screen
    When I check header text of Home screen
    Then The header text of Home screen is "Servings"

  Scenario: Check checkbox on item
    When I click checkbox
    Then Check box is checked

  Scenario Outline: Check function of the Calendar button
    When I click on the Calendar button of <pos> item
    Then Move to History screen of "<name>" item successfully

    Examples:
      | pos | name                   |
      | 0   | Beans                  |
      | 1   | Berries                |
      | 2   | Other Fruits           |
      | 3   | Cruciferous Vegetables |
      | 4   | Greens                 |

  Scenario Outline: Check function of the More Info button in the Servings list
    When I click on the More Info button at the <pos> position
    Then Move to Servings Size screen of "<name>" item successfully

    Examples:
      | pos | name                   |
      | 0   | Beans                  |
      | 1   | Berries                |
      | 2   | Other Fruits           |
      | 3   | Cruciferous Vegetables |
      | 4   | Greens                 |

  Scenario Outline: Verify display of items on the Servings list
    When I check display of items in the Servings list
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
    When I click on the More Info button of Vitamin B12 item
    Then The Home screen is not displayed

  Scenario: Check function of the 21Tweaks button
    When I click on the Tweaks button
    Then Move to Tweaks screen successfully

  Scenario: Check function of the Chart button
    When I click on the Chart button
    Then Move to Servings History screen successfully

  Scenario: Check function of the Info Menu button
    When I click on the InfoMenu button
    Then Move to Info screen successfully
