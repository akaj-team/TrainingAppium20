Feature: Test on Info screen

  Background:
    Given InfoPage is opened

  Scenario Outline: Check List Info
    When I check List Info
    Then Info Menu is "<name>"
    Examples:
      | name                    |
      | Latest Videos           |
      | How Not to Die          |
      | How Not to Die
      | Cookbook                |
      | How Not to Diet         |
      | Daily Dozen Challenge   |
      | Donate                  |
      | Subscribe               |
      | Open Source             |
      | Daily Reminder Settings |
      | Back up                 |
      | About                   |

  Scenario: Check function About button
    When I click About
    Then InfoPage is not displayed
    When I click back button
    Then Homepage screen is not displayed

  Scenario: Check function Donate button
    When I click Donate
    Then InfoPage is not displayed

