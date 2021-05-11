Feature: Check login functionality
@valid 
Scenario Outline: Verify login
Given user is in the login page of the of the application
When user provides valid <mobile number> 
Then user should successfully view Sign out option

Examples: 
|mobile number|
|9123687233   |

@invalid
Scenario Outline: Verify Signin
Given user is in the home page of AsianPaints application
When  user provides invalid <phone number>
Then user should successfully view mobile no is invalid

Examples:
|phone number|
|912368723   |