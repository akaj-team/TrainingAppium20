Feature: Test on Daily Dozen Tweaks screen

  Background:
    Given Tweaks Detail screen is opened

  Scenario: Check title Tweaks Detail screen
    Then The title is "About Tweak" is shown

  Scenario: Check display of Back button
    Then Button image is shown

  Scenario: Check display of Tweak image
    Then Button image is shown

  Scenario: Check Short Tweak text
    Then The Short Tweak text is shown

  Scenario: Check Content Tweak text
    Then The Content Tweak text is shown

  Scenario: Check Back button function
    When Tap Back button
    Then The 21Tweak is displayed