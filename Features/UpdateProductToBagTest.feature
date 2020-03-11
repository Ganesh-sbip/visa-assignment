Feature: Amazon website Add Product to bag Test

  @add_product_to_bag @smoke_test
  Scenario: Amazon SG - Add a product to bag
    Given I'm on amazon login page
    When I enter "valid" username
    And I continue to the next page
    And I enter "valid" password
    And I submit the user credentials
      Then I verify I am landed on Home screen
    When I search for a product
      Then I verify product search results is displayed
    When I add product with index "1" from search list to bag
      Then I verify I am landed on product page
    When I select "1" product quantity
    And I capture the product details
    And I add the product to cart
      Then I verify the product details in cart page
    When I logout from the amazon website
      Then I verify I am landed on signin page
    When I enter "valid" username
    And I continue to the next page
    And I enter "valid" password
    And I submit the user credentials
      Then I verify I am landed on Home screen
    And I navigate to cart page
      Then I verify the product details in cart page
