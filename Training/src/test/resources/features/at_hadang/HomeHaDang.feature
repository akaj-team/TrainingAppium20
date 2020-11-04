Feature: Test on Home screen

  Background:
    Given Home page is opened at_hadang

  Scenario: Check title of Home screen
    When I check title of Home screen at_hadang
    Then The title of Home screen is "Daily Dozen" at_hadang

  Scenario: Check header text of Home screen
    When I check header text of Home screen at_hadang
    Then The header text of Home screen is "Servings" at_hadang

  Scenario Outline: Verify display of items on the Servings list
    When I check display of items in the Servings list at_hadang
    Then I see "<name>" item at the <pos> position on list at_hadang

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

  Scenario Outline: Check function of the Calendar button
    When I click on the Calendar button of each item at_hadang
    Then Move to Calendar screen of "<name>" item successfully at_hadang

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
    When I click on the More Info button of "<name>" item at the <pos> position at_hadang
    Then Move to Servings Size screen of "<name>" item successfully at_hadang

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
    When I click on the More Info button of "Vitamin B12" item at the 12 th position at_hadang
    Then The Home screen is not displayed at_hadang

  Scenario: Check function of the 21Tweaks button
    When I click on the Tweaks button at_hadang
    Then Move to "21 Tweaks" screen successfully at_hadang

  Scenario: Check function of the Info Menu button
    When I click on the InfoMenu button at_hadang
    Then Move to Info screen successfully at_hadang

  Scenario: Check function of the Chart button
    When I click on the Chart button at_hadang
    Then Move to Servings History screen successfully at_hadang
    And The screen title contains text "Servings History" at_hadang