Feature: Test on Tweaks screen

  Background:
    Given Tweaks screen is opened

  Scenario: Check display at the 1st login Tweaks screen
    When I go to Tweaks page
    Then all checkboxes are unchecked


  Scenario: Check function when select 1st checkbox on Green Tea
    When I click all the first checkbox
    Then all checkboxes are checked


  Scenario: Check function when select 2nd checkbox on Green Tea
    When I click the Second checkbox
    Then third checkboxes is also checked

  Scenario: Check function when select 3nd checkbox on Green Tea
    When I click the Second checkbox
    Then Only the third checkboxes is checked

  Scenario: Check function when select 2nd checkbox on Green Tea
    When I click the first checkbox
    And I click the third checkbox
    Then all checkboxes are unchecked

  Scenario: Check function when select checkbox on Stayed Hydrated
    When I click the checkbox
    Then The check  box is checked

  Scenario: Check function when select checkbox on Deflour diet
    When I click the checkbox
    Then The check  box is checked

  Scenario: Check function when select checkbox on Front-load Calories
    When I click the checkbox
    Then The check  box is checked


  Scenario: Check function when select checkbox on Time-restrict Eating
    When I click the checkbox
    Then The check  box is checked

  Scenario: Check function when select checkbox on Exercising Timing
    When I click the checkbox
    Then The check  box is checked

  Scenario: Check function when select 1st checkbox on Weigh Twice Daily
    When I click the first checkbox
    Then all checkboxes are checked

  Scenario: Check function when select 2nd checkbox on Weigh Twice Daily
    When I click the first checkbox
    And I click the second checkbox
    Then all checkboxes are unchecked

  Scenario: Check function when select 1st checkbox on Complete intentions
    When I click the first checkbox
    Then all checkboxes are checked


  Scenario: Check function when select 2nd checkbox on Complete intentions
    When I click the Second checkbox
    Then third checkboxes is also checked

  Scenario: Check function when select 3nd checkbox on Complete intentions
    When I click the Second checkbox
    Then Only the third checkboxes is checked

  Scenario: Check function when select 2nd checkbox on Complete intentions
    When I click the first checkbox
    And I click the third checkbox
    Then all checkboxes are unchecked

  Scenario: Check function when select checkbox on Fast After 7:00 p.m.
    When I click the checkbox
    Then The check  box is checked

  Scenario: Check function when select checkbox on Sufficient Sleep
    When I click the checkbox
    Then The check  box is checked

  Scenario: Check function when select checkbox on Trendelenburg
    When I click the checkbox
    Then The check  box is checked

  Scenario Outline: Verify display of items in the Tweak list
    When I check display of items in the Tweaks list
    Then I see 21 items with "<name>" correctly
    Examples:
      | name                     |
      | Preload Water            |
      | Negative Calorie Preload |
      | Incorporate Vinegar      |
      | Undistracted Meals       |
      | Twenty-minute Rule       |
      | Black Cumin              |
      | Garlic Powder            |
      | Ginger or Cayenne        |
      | Nutritional Yeast        |
      | Cumin                    |
      | Green Tea                |
      | Stay Hydrated            |
      | Deflour diet             |
      | Front-load Calories      |
      | Time-restrict Eating     |
      | Exercising Timing        |
      | Weigh Twice Daily        |
      | Complete intentions      |
      | Fast After 7:00 p.m.     |
      | Sufficient Sleep         |
      | Trendelenburg            |

  Scenario Outline: Verify quantity of checkboxes on each item
    When I check quantity of checkboxes on each item
    Then I see "<quantity>" checkboxes on "<name>" item
    Examples:
      | name                     | quantity |
      | Preload Water            | 3        |
      | Negative Calorie Preload | 3        |
      | Incorporate Vinegar      | 3        |
      | Undistracted Meals       | 3        |
      | Twenty-minute Rule       | 3        |
      | Black Cumin              | 1        |
      | Garlic Powder            | 1        |
      | Ginger or Cayenne        | 1        |
      | Nutritional Yeast        | 1        |
      | Cumin                    | 1        |
      | Green Tea                | 3        |
      | Stay Hydrated            | 1        |
      | Deflour diet             | 1        |
      | Front-load Calories      | 1        |
      | Time-restrict Eating     | 1        |
      | Exercising Timing        | 1        |
      | Weigh Twice Daily        | 2        |
      | Complete intentions      | 3        |
      | Fast After 7:00 p.m.     | 1        |
      | Sufficient Sleep         | 1        |
      | Trendelenburg            | 1        |



