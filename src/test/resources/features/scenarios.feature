@CarTrading
  Feature: Car trading
    I want to buy and sell cars

  @BuyCar
  Scenario: Buying a car
    Given I go to buy car
    And car must be BMW motors
    And car must have 'capacity of 7'
    When I search for a car
    And I select city as 'New York City'
    Then I should get white cars in result
    And car must be least 6 years old
    And car should be delivered to 123 Rainforest Cafe, New York, NY, 48282
    But car should not be damaged

