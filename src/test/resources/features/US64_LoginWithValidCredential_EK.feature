@erdal
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

  @wip
  #Scenario: Verify login with different user types
  # Given the user logged in as "student"
   # Given the user logged in with username as "<email>" and password as "<password>"




  Scenario Outline: Verify user information <email>
#Given I am on the login page
#When I login using "<email>" and “<password>"
    Given the user logged in with username as "<email>" and password as "<password>"
    Then account holder name should be "<name>"

    @students
    Examples:
      | email             | password    | name            |
      | student11@library | libraryUser | Test Student 11 |
      | student12@library | libraryUser | Test Student 12 |
      | student13@library | libraryUser | Test Student 13 |
      | student14@library | libraryUser | Test Student 14 |
      | student15@library | libraryUser | Test Student 15 |

    @librarian
    Examples:
      | email               | password    | name              |
      | librarian11@library | libraryUser | Test Librarian 11 |
      | librarian12@library | libraryUser | Test Librarian 12 |
      | librarian13@library | libraryUser | Test Librarian 13 |
      | librarian14@library | libraryUser | Test Librarian 14 |
      | librarian15@library | libraryUser | Test Librarian 15 |
