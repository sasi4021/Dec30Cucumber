
Feature: Login into Application

  Scenario: To Validate login with Invalid credential
    Given The user should be Target home page
    When The user clicks on login button
    And User clicks on signin button
    When User enters the username and password
    Then User clickes on login button
 

	Scenario: To validate login with valid credentials
		
		Given The User should be in Target Home Page
		When The user clicks on login button
    And User clicks on signin button
    When User enters the "sasi702343@gmail.com" and "sasi123456"
    Then User clickes on login button with valid data
    And Verify the user name is Appeared on home page
	