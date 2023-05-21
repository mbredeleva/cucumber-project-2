Feature: the user adds one cloth item to cart and creates an order

  Scenario: Add cloth item to card
    Given the user opens women cloth page
    When the user adds one cloth item to cart
    Then the user sees '1' items in minicart

  Scenario: Add cloth item to cart and open checkout page
    Given the user opens women cloth page
      And the user adds one cloth item to cart
    When the user opens checkout page
      And the user fills checkout form with random data
      And the user submits default billing info
    Then the user sees success page