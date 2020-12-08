Feature: Test on Info screen

  Background:
    Given InfoPage is opened

  Scenario Outline: Check List Info
    When I check List Info
    Then I see "<android>" item or "<ios>" at the <pos> position on list info

    Examples:
      | pos | android                 | ios                     |
      | 0   | Latest Videos           | Latest Videos           |
      | 1   | How Not to Die          | How Not to Die          |
      | 2   | Cookbook                | How Not to Die Cookbook |
      | 3   | How Not to Diet         | How Not to Diet         |
      | 4   | Daily Dozen Challenge   | Daily Dozen Challenge   |
      | 5   | Donate                  | Donate                  |
      | 6   | Subscribe               | Subscribe               |
      | 7   | Open Source             | Open Source             |
      | 8   | Daily Reminder Settings | About                   |
      | 9   | Backup                  | x                       |
      | 10  | About                   | x                       |

  Scenario: Check function About button
    When I click About
    Then Move to About Details screen
    When I click back button
    Then Homepage screen is displayed

  Scenario: Check function Donate button
    When I click Donate
    Then InfoPage screen is not displayed

