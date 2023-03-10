Feature: Librarian manage user info table

  US61 As a user, I want to change the number of rows to see the user info

  Background: User is already in the log in page
    Given the user logged in as "librarian"


  Scenario: Change number of rows in User page
    And I click on User link
    When I select Show "50" records
    Then show records value should be 50
    And the users table must display "50" records


