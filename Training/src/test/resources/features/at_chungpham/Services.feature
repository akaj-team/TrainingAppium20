Feature : Test on Services screen

  Background:
    Given Services screen is opened

  Scenario: Check display of Types section
    When I check display of Types section
    Then Display Detail information and Videos button

  Scenario: Check display title of Types
    When I check display title of Types
    Then The title text is "Types"

  Scenario: Check title of Unit
    When I check title of Unit
    Then The title of unit is "Unit"

  Scenario: Check display name of Video button
    When I check display name of Video button
    Then The text of video button is "Video"

  Scenario: Check function of Video button
    When I taping on Video button
    Then The App redirect to http://nutritionfacts.org/topics/ website

  Scenario: Check display text of Imperial
    When I check display text of Imperial
    Then The text of Imperial button is "Imperial"

  Scenario: Check function of Imperial button
    When I tap on Imperial button
    Then The Metric button display

  Scenario: Check display text of Metric button
    When I check display text of Metric button
    Then The text of Metric button is "Metric"

  Scenario: Check function of Metric button
    When I tap on Metric button
    Then The Imperial button display

  Scenario: Check Types section have item or not
    When I check list item of Types
    Then Show the item of Types

  Scenario: Check function of Daily Dozen bar
    When I tap on Daily Dozen bar
    Then The page Daily Dozen display

  Scenario: Check function of Tweaks bar
    When I tap on Tweaks bar
    Then The page Tweaks is display

  Scenario: Check function of Info bar
    When I tap on Info bar
    Then The page Info displays

  Scenario: Check function of Setting bar
    When I tap on Setting bar
    Then The page Setting display

