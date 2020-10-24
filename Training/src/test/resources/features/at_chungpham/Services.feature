Feature : Test on Services screen

  Background:
    Given Services screen is opened

  Scenario: Check display of Types section
    When I check display of Types section
    Then Display Detail information and Videos button

  Scenario: Check display title of Types
    When I check display title of Types
    Then The content contain "Types"

  Scenario: Check title of Unit
    When I check title of Unit
    Then The content contain "Unit"

  Scenario: Check display name of Video button
    When I check display name of Video button
    Then The content contain "Video"

  Scenario: Check function of Video button
    When I taping on Video button
    Then The App redirect to http://nutritionfacts.org/topics/ website

  Scenario: Check display of Imperial
    When I check display of Imperial
    Then Then button "Imperial" display

  Scenario: Check function of Imperial button
    When I tap on Imperial button
    Then The Metric button display

  Scenario: Check display of Metric button
    When I check display of Metric button
    Then The button "Metric" display

  Scenario: Check function of Metric button
    When I tap on Metric button
    Then The "Imperial" button display

  Scenario: Check Types section have item or not
    When I check list item of Types
    Then Show the item of Types

  Scenario: Check display of Daily Dozen bar
    When I check display of Daily Dozen bar
    Then The "Daily Dozen" bar display

  Scenario: Check function of Daily Dozen bar
    When I tap on Daily Dozen bar
    Then The page "Daily Dozen" display

  Scenario: Check display of Tweaks bar
    When I check display of Tweaks bar
    Then The "Tweaks" bar display

  Scenario: Check function of Tweaks bar
    When I tap on Tweaks bar
    Then The page "Tweaks" display

  Scenario: Check display of Info bar
    When I check display of Info bar
    Then The "Info" bar display

  Scenario: Check function of Info bar
    When I tap on Info bar
    Then The page "Info" display

  Scenario: Check display of Setting bar
    When I check display of Setting bar
    Then The "Setting" bar display

  Scenario: Check function of Setting bar
    When I tap on Setting bar
    Then The page "Setting" display

