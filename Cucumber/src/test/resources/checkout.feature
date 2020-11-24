Feature: Checkout

  @testing
  Scenario: Add to cart
    Given User is on the homepage
    When user clicks on product
    And user clicks on Add to cart button
    Then Product successfully added to your shopping cart is displayed


  @testing
  Scenario: Navigate to shopping cart
    Given user has a product in the cart
    When user clicks on the cart icon
    Then shopping cart page is displayed


    @testing
    Scenario: Make payment
      Given user is shopping cart page
      And click on Proceed to checkout button
      When fill data in mandatory fields
      And user clicks on Continue button
      And select shipping method
      And select payment method
      And agree to the terms of service
      And user clicks on Order with an obligation to pay button
      Then Your order is confirmed is displayed


