Feature: Test on Setting screen

  Background:
    Given Settings screen is opened

  Scenario: Check UI of Settings screen
    Then The title of Settings must is "Settings"
    And  The title of section 1 must is "MEASUREMENT UNITS"
    And  The content of note section 1 must is "Set to always be one unit type or enable the 'Units:' toggle button"
    And  The title of section 2 must is "DAILY REMINDER"
    And  The title of cell in section 2 must is "Enable Reminders"
    And  The title of section 3 must is "21 TWEAKS VISIBILITY"
    And  The content of note section 3 must is "For health alone, use ', '"', 'Daily Dozen Only', '"', '. For health and weight loss use ', '"', 'Daily Dozen + 21 Tweaks', '"', '.') and ./parent::*[@text=concat('For health alone, use ', '"', 'Daily Dozen Only', '"', '. For health and weight loss use ', '"', 'Daily Dozen + 21 Tweaks', '"', '.'"
    And  The tile of bottom button must is "Advanced Utilities"

  Scenario: Check list status button of section 1
    When Tap on button `Imperial`
    Then Button `Imperial` must is highlight and button `Metric` and button `Toggle Units` must is gray

  Scenario: Check list status button of section 1
    When Tap on button `Metric`
    Then Button `Metric` must is highlight and button Imperial and button `Toggle Units` must is gray

  Scenario: Check list status button of section 1
    When Tap on button `Toggle Units`
    Then Button `Toggle Units` must is highlight and button `Imperial` and button `Metric` must is gray

  Scenario: Check status of `Enable Reminder` of section 2
    When Value of `Enable Reminders` is true
    Then Status of `Enable Reminders` must is On

  Scenario: Check status of `Enable Reminder` of section 2
    When Value of `Enable Reminders` is falser
    Then Status of `Enable Reminders` must is Off

