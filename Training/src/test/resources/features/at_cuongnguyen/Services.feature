Feature: Test on Services screen

  Background:
    Given Services screen is opened

  Scenario: Check header bar of Services screen
    When I check the header bar of screen
    Then The header bar including Back button on the left
    Then The header bar including Videos button on the right

  Scenario: Check click on Back button
    When I click on Back button
    Then I move to previous screen

  Scenario: Check click on Videos button
    When I click on Videos on button
    Then Open the url in new tab correctly with param-request

  Scenario: Check [Service] area
    When I move to [service] area
    Then I check the [Service type] text is "Services"
    Then I click on Unit button

  Scenario Outline: Check [Food name] title
    When I move back to [Home Page] screen
    Then I check the Food name item of <pos> position
    Then I move to [Services] screen having "<foodName>" at <pos>
    And I check the "<foodName>" on Services screen is correct

    Examples:
      | pos | foodName               |
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

