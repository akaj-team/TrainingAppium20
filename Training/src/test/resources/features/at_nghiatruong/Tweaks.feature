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

