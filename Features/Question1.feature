@tag
Feature: Practical Question1

  @tag1
  Scenario: Search for appium book and add to cart
    Given User is on the Amazon website
    When User searches for Appium Book
    And User selects the tenth book
    Then User prints rating
    And User adds book to cart
    And User prints amount of book
