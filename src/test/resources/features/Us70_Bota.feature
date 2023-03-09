@bota
Feature: User Story 12: as a librarian, I should be able to navigate to correct pages.
  Page navigation links


  Background: User is already in the log in page
    Given the user logged in as "librarian"


  Scenario: Go to us page
    When I click on Users module
    Then "Users" page should display

  Scenario: Go to books page
    When I click on Books module
    Then "Books" page should be displayed

  Scenario: Go to dashboard page
    When I click on Dashboard link
    Then "Dashboard" page should displayed

