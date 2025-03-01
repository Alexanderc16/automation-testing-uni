Feature: Login Page

  Scenario: Verify User is able to login with correct credentials
    Given user navigates to "url"
    And verify "Swag Labs" text is present
    And verify "Accepted usernames are:" text is present
    And user enters "adminUsername" username
    And user enters "adminPassword" password
    And user clicks Login button
    And verify user is on "https://www.saucedemo.com/inventory.html" url
    And verify "Products" text is present
