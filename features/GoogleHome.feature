Feature: Open the google and perform some search

Scenario: verify that user should be able to search
	Given Launch the chrome browser
	When Navigate to google home page
	Then Google search page should dispay
	When Enter the text in seach filed
	Then Close Browser


Scenario: verify that user should be able to go facebook
	Given Launch the chrome browser
	When Navigate to gmail home page
	Then gmail home page should dispay
	When Enter the email id in email filed
	Then Close Browser