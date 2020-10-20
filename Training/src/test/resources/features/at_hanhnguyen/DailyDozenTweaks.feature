Feature: Test on Daily Dozen Tweaks screen

  Background:
    Given Tweaks screen is opened

  Scenario: Check title Daily Dozen Tweaks screen
    When I check title on Daily Dozen Tweaks screen
    Then The title is "Tweaks" which was shown

  Scenario: Check showing the default tap is today
    When I check default tab on Tweak screen
    Then The default tab is today

  Scenario: Check showing the weight item under Tweaks title
    When I check title under Tweak text
    Then The title under the Tweak text is "Weight"

  Scenario Outline: Check showing the all items on Tweak screen
    Then Display all items on Tweak screen with "<itemTitle>"
    Examples:
      |itemTitle  |
      |Preload with Water|
      |Preload with Negative Calorie Foods|
      |Incorporate Vinegar (2 tsp with each meal)|
      |Enjoy Undistracted Meals|

  Scenario: Check action when user tap into calendar
    When I tap into calendar icon
    Then Showing the calendar

  Scenario: Check showing the tab when user select date on calendar popup
    When I tap into calendar icon
    And I tap into 19/10
    Then showing the tab is 19/10

  Scenario: Check showing the item detail when user tap into i icon
    When I tap into first item
    Then Showing the item detail page with title is "About Tweak"
    And Showing the image on this page
    And showing the title of content is "Incorporate Vinegar (2 tsp with each meal)"
    And Showing the content on this page

  Scenario: Check back to the previous page when user tap into the back button
    When I tap back button detail item page
    Then Showing the Daily Dozen Tweaks screen

  Scenario: Check tap into checkbox on each item
    When I tap into checkbox on each item
    Then all check box on row was checked