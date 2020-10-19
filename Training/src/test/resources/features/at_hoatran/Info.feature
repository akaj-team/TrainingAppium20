Feature: Test on Info screen

  Background:
    Given Info screen is opened

  Scenario: Check content of Title on Info screen
    When Check Title of Info screen
    Then Content is displayed correctly "Info"

  Scenario: Check action when tap on Title
    When Tap on Title of Info screen
    Then Nothing happens

  Scenario: Check content of 1 th menu
    When Check content of 1 th menu
    Then Content of 1 th menu is displayed correctly "Latest Videos"

  Scenario: Check action when tap on Latest Videos menu
    When Tap on 1 th menu
    Then Move to "https://nutritionfacts.org/videos/"

  Scenario: Check content of 2 th menu
    When Check content of 2 th menu
    Then Content of 2 th menu is displayed correctly "How Not to Die"

  Scenario: Check action when tap on How Not to Die menu
    When Tap on 2 th menu
    Then Move to "https://nutritionfacts.org/book/how-not-to-die/"

  Scenario: Check content of 3 th menu
    When Check content of 3 th menu
    Then Content of 3 th menu is displayed correctly "How Not to Die Cookbook"

  Scenario: Check action when tap on How Not to Die Cookbook menu
    When Tap on 3 th menu
    Then Move to "https://nutritionfacts.org/book/how-not-to-die-cookbook/"

  Scenario: Check content of 4 th menu
    When Check content of 4 th menu
    Then Content of 4 th menu is displayed correctly "How Not to Diet"

  Scenario: Check action when tap on How Not to Diet menu
    When Tap on 4 th menu
    Then Move to "https://nutritionfacts.org/videos/https://nutritionfacts.org/book/how-not-to-diet/"

  Scenario: Check content of 5 th menu
    When Check content of 5 th menu
    Then Content of 5 th menu is displayed correctly "Daily Dozen Challenge"

  Scenario: Check action when tap on Daily Dozen Challenge menu
    When Tap on 5 th menu
    Then Move to "https://nutritionfacts.org/daily-dozen-challenge/"

  Scenario: Check content of 6 th menu
    When Check content of 6 th menu
    Then Content of 6 th menu is displayed correctly "Donate"

  Scenario: Check action when tap on Donate menu
    When Tap on 6 th menu
    Then Move to "https://nutritionfacts.org/donate/"

  Scenario: Check content of 7 th menu
    When Check content of 7 th menu
    Then Content of 7 th menu is displayed correctly "Subscribe"

  Scenario: Check action when tap on Subscribe menu
    When Tap on 7 th menu
    Then Move to "https://nutritionfacts.org/subscribe/"

  Scenario: Check content of 8 th menu
    When Check content of 8 th menu
    Then Content of 8 th menu is displayed correctly "Open Source"

  Scenario: Check action when tap on Open Source menu
    When Tap on 8 th menu
    Then Move to "https://nutritionfacts.org/open-source/"

  Scenario: Check content of 9 th menu
    When Check content of 9 th menu
    Then Content of 9 th menu is displayed correctly "About"

  Scenario: Check action when tap on About menu
    When Tap on 9 th menu
    Then About this app screen is displayed correctly