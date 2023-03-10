Feature: Search new users dialog
@hicham
  Scenario:  Verify user information
    Given I am on login page
    And i login using following credential :
      |email    |librarian21@library		   |
      |password |libraryUser                   |


    And I click on "Users" link
    When I search for "6486"
    Then table should contain this data
    |UserId   |6486		   |
    |FullName |D King	   |
    |Email    |175@king.com|

