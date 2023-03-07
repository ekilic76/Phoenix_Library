Feature: Show record functionality

  Scenario: verify default values in user page
    Given the user is on the login page
    And the user logged in as "librarian"
    When the user clicks on "Users" link
    Then show records default value should be 10
    And show record should have following options:
      | 5   |
      | 10  |
      | 15  |
      | 50  |
      | 100 |
      | 200 |
      | 500 |
