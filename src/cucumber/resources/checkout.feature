Feature: Checkout

  Scenario: API setup

    When I ask for the checkout api
    Then it should exist


  Scenario: When I'm at the checkout I should know what to do
    Given I'm I have my items
    When I'm at the checkout
    Then I should see directions on how to checkout

  Scenario: Checkout an empty basket

    Given I have no items
    When I checkout
    Then I should not have to pay anything

  Scenario: Buying 1 "A"
    Given that I'm buying an "A"
    When I checkout
    Then I should be asked to pay 50

  Scenario: Buying 2 "A"s
    Given that I'm buying 2 "A"
    When I checkout
    Then I should be asked to pay 100


  Scenario: Buying 1 "B"s
    Given that I'm buying 1 "B"
    When I checkout
    Then I should be asked to pay 30