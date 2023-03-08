
Feature:
  Correct page visible after logging in
  User is on the login page, and when user enters valid credentials, user is able to see correct page


  Background: login page
    Given I am on the login page

  Scenario: Login as librarian same line
    Given I login using librarian email "librarian12@library" and librarian password "libraryUser"
    Then Dashboard page should be displayed

  Scenario: Login as student same line
    Given I login using student email "student12@library" and student password "libraryUser"
    Then Books page should be displayed