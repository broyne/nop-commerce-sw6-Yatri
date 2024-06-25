@author_Yatri @regression
Feature: Computer feature
  As a user I want to navigate to computer
  and want to add item on cart successfully

  @author_Yatri @smock @sanity
  Scenario: Verify user should navigate to computer page successfully
    Given I am on homepage
    When I click on menu "Computers"
    Then I should see the text "Computers"

  @author_Yatri @smock
  Scenario: Verify user should navigate to desktop page successfully
    Given I am on homepage
    When I mouse over to computer and click on desktop
    Then I should see the text as "Desktops"

  @author_Yatri @c
  Scenario Outline: Verify user should able to add Build your own computer product on cart successfully
    Given I am on homepage
    When I mouse over to computer and click on desktop
    And I click on build your computer product
    And I select processor "<processor>"
    And I select ram"<ram>"
    And I select hdd "<hdd>"
    And I select os "<os>"
    And I select software "<software>"
    And I click on add to cart button
    Then I should see the success message "The product has been added to your shopping cart"
    Examples:
      | processor                                       | ram           | hdd               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]    | Total Commander [+$5.00]   |

