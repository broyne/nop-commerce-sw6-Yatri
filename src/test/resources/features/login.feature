@regression
Feature: Login Feature
  In Order to perform successful login
  As a User
  I have to enter correct username and password

  @author_Yatri @smock @sanity
  Scenario: User should navigate to login page successfully
    Given I am on homepage
    When I click on login link
    Then I should navigate to login page successfully

#not working how to resolve
#  Scenario: Verify the error message with invalid credentials
#    Given I am on homepage
#    When I click on login link
#    And I enter email "abcd123@gmail.com"
#    And I enter password "abcd@1234"
#    And I click on login button
#    Then I should see the error message "Login was unsuccessful. Please correct the errors and try again. /nNo customer account found"

  @author_Yatri @smock @sanity
  Scenario Outline: Verify the error message with invalid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "<email>"
    And I enter password "<password>"
    And I click on login button
    And I should see the error message "<errorMessage>"
    Examples:
      | email             | password | errorMessage                                                                                |
      | abcd123@gmail.com | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |

  @author_Yatri @sanity
  Scenario: Verify that user should log in successfully with valid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "yatrihiraniCnvu1c@gmail.com"
    And I enter password "Test@1234"
    And I click on login button
    Then I should see the log out link "Log out" display

  @author_Yatri
  Scenario: Verify that user should log out successfully
    Given I am on homepage
    When I click on login link
    And I enter email "yatrihiraniCnvu1c@gmail.com"
    And I enter password "Test@1234"
    And I click on login button
    And I click on Logout button
    Then I should see the log in link "Log in" display
