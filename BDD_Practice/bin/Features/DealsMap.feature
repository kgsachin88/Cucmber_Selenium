Feature: Deal data creation

Scenario: Free CRM Create a new deal scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters username and password
| Username | Password |
| sachinkg88 | sachinkg88 |

Then User clicks on login button
Then user is on home page
Then user moves to new deal page
Then user enters deal details

|title | amount | probability | commission |
| test deal1 | 1000 | 50 | 10 |
| test deal2 | 1001 | 60 | 20 |
| test deal3 | 1011 | 40 | 30 |
| test deal4 | 1111 | 30 | 40 |
Then Close the browser