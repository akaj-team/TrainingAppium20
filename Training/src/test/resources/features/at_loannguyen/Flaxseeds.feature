Feature: Test on Flaxseeds Detail screen

  Background:
    Given Flaxseeds Detail screen is opened

  Scenario: Check screen name of this screen
    Then The screen name is "Flaxseeds"

  Scenario: Check click <= button
    When I click <= button
    Then Display Home screen

  Scenario: Check click VIDEOS button
    When I click VIDEOS button
    Then Display [Information of Flaxseeds] webview

  Scenario: Check content of [Serving Sizes]
    Then The content is "Serving Sizes"

  Scenario: Check default value of [Serving Sizes]
    Then The default is "IMPERIAL"

  Scenario: Check click "IMPERIAL" value
    When I click "IMPERIAL" value
    Then "IMPERIAL" change to "METRIC"

  Scenario: Check sub content of [Serving Sizes]
    Then The sub content of [Serving Sizes] is "1 tablespoon ground"

  Scenario: Check content of [Types]
    Then The content 1 is "Types"

  Scenario: Check sub content of [Types]
    Then The sub content of [Types] is "Brown flaxseed"

  Scenario: Check sub content of [Types]
    Then The sub content 1 of [Types] is "Golden flaxseed"





