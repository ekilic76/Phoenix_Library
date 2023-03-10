
Feature:
  User Story4: As a user, I want to select different number of raws to see users records

  Background: User is already in the log in page
   # Given the user is on the login page
    Given the user logged in as "librarian"



@mahliyo
  Scenario Outline: Show records for count options

    And I click on Users link
    When I select Show "<count>" records
    Then show records value should be "<count>"
    And the users table must display "<count>" records

    Examples:

      | count |
      | 5     |
      | 10    |
      | 15    |
      | 50    |
      | 100   |


