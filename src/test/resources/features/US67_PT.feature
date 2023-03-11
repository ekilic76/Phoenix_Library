Feature: Books Search
  US67_PT: As I a user, I should be able to search a book.

  Background: User is already in the log in page
    Given the user is on the login page
    Given the user logged in with username as "student11@library" and password as "libraryUser"

  Scenario: Verify book search results
    When I navigate to Books page
    And I search for The Goldfinch
    Then books table should contain results matching The Goldfinch
      | ISBN     | 387927210592  |
      | Name     | The Goldfinch |
      | Author   | Donna Tartt   |
      | Category | Fantasy       |
      | Year     | 2013          |