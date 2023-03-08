Feature: Add new user functionality
  User Story 65: As a user, I want to add new users to the app

  Background: User is already in the log in page
    Given the user logged in as "librarian"

  Scenario: Add new user verification

    And click on "Users" module
    When user click on the Add Users
    Then dialog field must have matching placeholder
      | full name | Full Name |
      | email     | Email     |
      | password  | Password  |
      | address   |           |

