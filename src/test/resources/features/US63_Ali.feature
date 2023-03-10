@his
Feature: As I user, I should be able to search values in the Users page.

  Background:
    Given I am on the login page
    And I login as a librarian And I click on "Users" link

  Scenario: Searched accuracy
    When I search for "test"
    Then table should contain rows with "test"

  Scenario: Table columns names
    Then table should have following column names:
      | Actions |
      | User ID |
      | Full Name |
      | Email |
      | Group |
      | Status |
