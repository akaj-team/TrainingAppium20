Feature: Test on Food Detail screen

  Background:
    Given Food Detail screen is opened

  Scenario: Check screen name of this screen
    When I check screen name of [Food Detail] screen
    Then The screen name is "Flaxseeds"

  Scenario: Check click <= button
    When I click <= button
    Then Display Home screen

  Scenario: Check click VIDEOS button
    When I click VIDEOS button
    Then Display [Information of Food] webview

  Scenario: Check content of [Serving Sizes]
    When I check content is "Serving Sizes"
    Then The content is "Serving Sizes"

  Scenario: Check display of Units label
    When I check display of Units label
    Then The content of units is "Units"

  Scenario: Check click "IMPERIAL" button
    Then Button is IMPERIAL
    When I click IMPERIAL button
    Then IMPERIAL button change to METRIC button

  Scenario: Check click "METRIC" button
    Then Button is METRIC
    When I click METRIC button
    Then METRIC button change to IMPERIAL button

  Scenario: Check sub content of [Serving Sizes]
    When I check sub content of [Serving Sizes]
    Then The sub content of [Serving Sizes] is "1 tablespoon ground"

  Scenario: Check content of [Types]
    When I check content 1
    Then The content 1 is "Types"

  Scenario: Check list of [Types]
    When I check list of [Types]
    Then The list of [Types] is displayed correctly
