Feature: Login Action
# Without Example Keyword
#Scenario: Successful Login with Valid Credentials
#	Given user is already on Login Page
#	Then User Enter "sachinkg88" and "sachinkg88"
#	Then User clicks on login button 
#	Then user is on home page
	
	
#With Example Keyword
# Difference between scenario and scenario outline
# Scenario Outline is used while using Data driven approach and Example Keyword and Scenario is used while normally
#
Scenario Outline:: Successful Login with Valid Credentials
	Given user is already on Login Page
	Then User Enter "<username>" and "<password>"
	Then User clicks on login button 
	Then user is on home page
	Then close the browser
	
Examples:

	| username | password |
	| sachinkg88 | sachinkg88 |
	| sachinkg88 | sachinkg88 |
	
	