Feature: Free CRM create contacts

Scenario Outline:: Create a new contact 
	Given user is already on Login Page
	Then User Enter "<username>" and "<password>"
	Then User clicks on login button 
	Then user is on home page
	Then user moves to new contact page 
	Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
	Then close the browser
	
Examples:

    | username | password | firstname | lastname | position |
    
    