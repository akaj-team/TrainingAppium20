Feature: Test on DetailFood screen

  Background:
    Given FoodDetailPage is opened

  Scenario: Check Function of BackToHome button
    When I click BackToHome button
    Then Homepage screen is opened

  Scenario: Check Function of TV Videos button
    When I click TV Videos button
    Then FoodDetailPage is not displayed

  Scenario: Check Food Image
    When Check display of Food Image
    Then Food Image is displayed

  Scenario: Check Size of Servings and Type
    When Check Size of Servings and Type
    Then Servings Size and Type is displayed
