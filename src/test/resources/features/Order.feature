Feature: Order Functionality

  Background:
    Given user navigates to "url"
    And verify "Swag Labs" text is present
    And verify "Accepted usernames are:" text is present
    And user enters "adminUsername" username
    And user enters "adminPassword" password
    And user clicks Login button
    And verify user is on "https://www.saucedemo.com/inventory.html" url

  Scenario: Verify Order functionality
    When user clicks first add to cart button
    And user clicks cart button
    And verify user is on "https://www.saucedemo.com/cart.html" url
    And user click "Checkout" text
    And verify user is on "https://www.saucedemo.com/checkout-step-one.html" url
    And verify "Checkout: Your Information" text is present
    And user inputs "test" into "Name" field
    And user inputs "test" into "Last Name" field
    And user inputs "test" into "Zip" field
    And user click "Continue" text
    And verify "Checkout: Overview" text is present
    And verify "Payment Information:" text is present
    And verify "Shipping Information:" text is present
    And verify "Price Total" text is present
    And user click "Finish" text
    And verify "Thank you for your order!" text is present
    And verify "Your order has been dispatched, and will arrive just as fast as the pony can get there!" text is present
    And user click "Back Home" text
    And verify user is on "https://www.saucedemo.com/inventory.html" url
