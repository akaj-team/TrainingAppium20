Feature: Test on Services screen
  Background:
    Given Services screen is opened

    Scenario : Check header bar of Services screen

      When I check the header bar of screen
      Then The header bar including Back button on the left
      Then The header bar including Videos button on the right

    Scenario: Check click on Back button

      When I click on Back button
      Then I move to previous screen

    Scenario: Check click on Videos button

      When I click on Videos button
      Then Open the url in new tab correctly with param-request

    Scenario: Check [Service] area

      When I move to [service] area
      Then I check the [Service type] text is Services