Feature: Test on Info screen

  Background:
    Given InfoPage is opened

  Scenario Outline: Check List Info
    Then I see "<name>" item at the <pos> position on list info
    Examples:
      | pos | name                    |
      | 1   | Latest Videos           |
      | 2   | How Not to Die          |
      | 3   | Cookbook                |
      | 4   | How Not to Diet         |
      | 5   | Daily Dozen Challenge   |
      | 6   | Donate                  |
      | 7   | Subscribe               |
      | 8   | Open Source             |
      | 9   | Daily Reminder Settings |
      | 10  | Backup                  |
      | 11  | About                   |


  Scenario: Check function About button
    When I click About
    Then InfoPage is not displayed
    When I click back button
    Then Homepage screen is not displayed

  Scenario: Check function Donate button
    When I click Donate
    Then InfoPage is not displayed

