Feature: Test on TwentyOneTweaks

  Background:
    Given Twenty one Tweaks screen is opened

  Scenario: Check all check boxes in the screen
    When I check all check boxes
    Then All check boxes are checked successfully


  Scenario: Uncheck all check boxes in the screen
    When I uncheck all check boxes
    Then All check boxes are unchecked successfully

  Scenario: Check that calendar is open with the date is current date when clicking calendar button
    When I click calendar button of the Preload Water
    Then The calendar Preload Water in the current date is opened successfully

  Scenario: Check that detail screen is open when clicking info button
    When I click info button of the Preload Water
    Then The Preload Water detail is opened successfully