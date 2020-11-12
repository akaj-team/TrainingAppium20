Feature: Test on Daily Dozen Tweaks screen

  Background:
    Given Tweaks screen is opened

  Scenario: Check title Daily Dozen Tweaks screen
    When I check title on Daily Dozen Tweaks screen
    Then The title is "Tweaks" which was shown

  Scenario: Check showing the default tap is today
    When I check default tab on Tweak screen
    Then The default tab is today

  Scenario: Check showing the tab when user select date on calendar popup
    When I tap into calendar icon
    And I tap into "24"
    Then showing the tab is "Sat, Oct 24"

  Scenario: Check showing the weight item under Tweaks title
    When I check title under Tweak text
    Then The title under the Tweak text is "Weight"

  Scenario: Check showing the eye open
    When I check  the eye open is shown or not
    Then The the eye open is shown

  Scenario Outline: Check showing the title at AT EACH MEAL group
    When I check showing the title at AT EACH MEAL group
    Then The group title shows as "<titleGroup>"
    Examples:
      | titleGroup            |
      | At Each Meal          |
      | Every Day             |
      | Take your daily doses |
      | Every Night           |

  Scenario Outline: Check showing all items in AT EACH MEAL
    When I check showing the all items AT EACH MEAL
    Then All items in AT EACH MEAL are shown correctly with "<itemTitle>"
    Examples:
      | itemTitle                                  |
      | Preload with Water                         |
      | Preload with Water                         |
      | Preload with Negative Calorie Foods        |
      | Incorporate Vinegar (2 tsp with each meal) |
      | Enjoy Undistracted Meals                   |

  Scenario: Check action when user tap into calendar
    When I tap into calendar icon
    Then Showing the calendar with title is "History"

  Scenario: Check showing the item detail when user tap into item
    When I tap into "Preload with Water" item
    Then Showing the item detail page with title is "About Tweak"
    And Showing the image on this page
    And showing the title of content is "Preload with Water"
    And Showing the content on this page

  Scenario: Check back to the previous page when user tap into the back button
    When I tap back button detail item page
    Then Showing the Daily Dozen Tweaks screen

  Scenario: Check tap into checkbox on each item
    When I tap into checkbox on each item
    Then all check box on row was checked
