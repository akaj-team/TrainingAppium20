Feature: Test on Info screen

  Background:
    Given Info screen is opened

  Scenario: Check content of Title on Info screen
    When Check Title of Info screen
    Then Content of Title is displayed correctly "Info"

  Scenario: Check action when tap on Title
    When Tap on Title of Info screen
    Then Nothing happens

  Scenario: Check content of Latest Videos menu
    When Check content of Latest Videos menu
    Then Latest Videos menu is displayed correctly with content "Latest Videos"

  Scenario: Check action when tap on Latest Videos menu
    When Tap on Latest Videos menu
    Then Move to "https://nutritionfacts.org/videos/"

  Scenario: Check content of [How Not to Die] menu
    When Check content of How Not to Die menu
    Then [How Not to Die] menu is displayed correctly with content "How Not to Die"

  Scenario: Check action when tap on How Not to Die menu
    When Tap on How Not to Die menu
    Then Move to "https://nutritionfacts.org/book/how-not-to-die/"

  Scenario: Check content of How Not to Die Cookbook menu
    When Check content of How Not to Die Cookbook menu
    Then [How Not to Die Cookbook] menu is displayed correctly with content "How Not to Die Cookbook"

  Scenario: Check action when tap on How Not to Die Cookbook menu
    When Tap on How Not to Die Cookbook menu
    Then Move to "https://nutritionfacts.org/book/how-not-to-die-cookbook/"

  Scenario: Check content of How Not to Diet menu
    When Check content of How Not to Diet menu
    Then How Not to Diet menu is displayed correctly with content "How Not to Diet"

  Scenario: Check action when tap on How Not to Diet menu
    When Tap on How Not to Diet menu
    Then Move to "https://nutritionfacts.org/videos/https://nutritionfacts.org/book/how-not-to-diet/"

  Scenario: Check content of Daily Dozen Challenge menu
    When Check content of Daily Dozen Challenge menu
    Then [Daily Dozen Challenge] menu is displayed correctly with content "Daily Dozen Challenge"

  Scenario: Check action when tap on Daily Dozen Challenge menu
    When Tap on [Daily Dozen Challenge] menu
    Then Move to "https://nutritionfacts.org/daily-dozen-challenge/"

  Scenario: Check content of Donate menu
    When Check content of Donate menu
    Then Donate menu is displayed correctly with content "Donate"

  Scenario: Check action when tap on Donate menu
    When Tap on [Donate] menu
    Then Move to "https://nutritionfacts.org/donate/"

  Scenario: Check content of Subscribe menu
    When Check content of [Subscribe] menu
    Then Subscribe menu is displayed correctly with content "Subscribe"

  Scenario: Check action when tap on Subscribe menu
    When Tap on Subscribe menu
    Then Move to "https://nutritionfacts.org/subscribe/"

  Scenario: Check content of Open Source menu
    When Check content of Open Source menu
    Then Open Source menu is displayed correctly with content "Open Source"

  Scenario: Check action when tap on Open Source menu
    When Tap on Open Source menu
    Then Move to "https://nutritionfacts.org/open-source/"

  Scenario: Check content of About menu
    When Check content of About menu
    Then About menu is displayed correctly with content "About"

  Scenario: Check action when tap on About menu
    When Tap on About menu
    Then About this app screen is displayed correctly



