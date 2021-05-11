Feature: Check the functionality of login by providing unregistered mobile no
Scenario Outline: verify login by providing unregistered mobile no
Given User is on the homepage
When User provides unregistered <number> mobile number
Then user should successfully view mobile no is not registered
Examples: 
|number    |
|1111111111|