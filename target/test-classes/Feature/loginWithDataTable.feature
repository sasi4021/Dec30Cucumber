Feature: TO validate the login by using Data Table

  Background: 
    Given The User should launch the application

	@smoke @sanity
  Scenario: TO validate the application - With Header 1D
    When User clicks on the sign-in button
    And User clicks on the Sign-in again
    And User enters the username and password by using withHeader oneD
      | username | sasi     |
      | password | sasi1234 |
    And User clicks on login button in sign-account page
    Then User get into the application "using withHeader oneD"
    
	@sanity
  Scenario: To validate the application - with Header 2D
    When User clicks on the sign-in button
    And User clicks on the Sign-in again
    And User enters the username and password by using withHeader twoD
      | username | password  | action |
      | sasi     | sasi1234  | yes    |
      | nithi    | nithy1234 | no     |
      | aadhav   |      1234 | Yes    |
    And User clicks on login button in sign-account page
    Then User get into the application "using withHeader twoD"
    
	@smoke
  Scenario: TO validate the application - Without Header oneD
    When User clicks on the sign-in button
    And User clicks on the Sign-in again
    And User enters the username and password by using Without Header oneD
      | sasi | sasi1234 | 1245 |
    And User clicks on login button in sign-account page
    Then User get into the application "using without Header oneD"
	
	@Retest
  Scenario: To validate login by using data table - without Header twoD
    When User clicks on the sign-in button
    And User clicks on the Sign-in again
    And User enters the username and password by using without Header twoD
      | sasi   | sasi234   |
      | aadhav |      1234 |
      | nithya | nithy1243 |
    And User clicks on login button in sign-account page
    Then User get into the application "without Header twoD"
