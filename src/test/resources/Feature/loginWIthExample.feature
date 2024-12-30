Feature: Login into Application with Example

Scenario Outline: To validate the application with credentials
 Given The user login into the application
 When User clicks on sign on button
 And User clicks on login button
 When User enters into the "<username>" and "<password>"
 And User clicks on skip and may be later button for next login
 Then User Get into the application with different credentials
 
 Examples: 
 	|username|password|
 	|sasi| sasi1234|
 	|kavi| 1236454|
 	|test| test1234|
 	|nithi| 1234|
 