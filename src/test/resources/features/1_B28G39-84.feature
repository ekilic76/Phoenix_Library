@B28G39-88
Feature: Default

	Background:
		#@B28G39-84
		Given the user is on the login page
		  Given the user logged in with username as "librarian11@library" and password as "libraryUser"
		

	Scenario: US59-AC01-Verify each user has unique ID.
		Scenario: unique users ids
		
		    When i click on "Users" link
		    Then each users id should be unique
