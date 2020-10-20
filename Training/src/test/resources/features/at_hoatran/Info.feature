Feature: Test on Info screen

  Background:
    Given Info screen is opened

  Scenario: Check content of Title on Info screen
    When Check Title of Info screen
    Then Title is displayed correctly with content "Info"

  Scenario: Check action when tap on Title
    When Tap on Title of Info screen
    Then Nothing happens

  Scenario Outline: Check content of <number> th menu
    When Check content of <number> th menu
    Then Content of <number> th menu is displayed correctly "<text>"

    Examples:
      | number | text                    |
      | 1      | Latest Videos           |
      | 2      | How Not to Die          |
      | 3      | How Not to Die Cookbook |
      | 4      | How Not to Diet         |
      | 5      | Daily Dozen Challenge   |
      | 6      | Donate                  |
      | 7      | Subscribe               |
      | 8      | Open Source             |
      | 9      | About                   |

  Scenario Outline: Check action when tap on Latest Videos menu
    When Tap on <number> th menu
    Then Move to "<url>"

    Examples:
      | number | url                                                                                |
      | 1      | https://nutritionfacts.org/videos/                                                 |
      | 2      | https://nutritionfacts.org/book/how-not-to-die/                                    |
      | 3      | https://nutritionfacts.org/book/how-not-to-die-cookbook/                           |
      | 4      | https://nutritionfacts.org/videos/https://nutritionfacts.org/book/how-not-to-diet/ |
      | 5      | https://nutritionfacts.org/daily-dozen-challenge/                                  |
      | 6      | https://nutritionfacts.org/donate/                                                 |
      | 7      | https://nutritionfacts.org/subscribe/                                              |
      | 8      | https://nutritionfacts.org/open-source/                                            |

  Scenario: Check action when tap on About menu
    When Tap on 9 th menu
    Then About this app screen is displayed correctly