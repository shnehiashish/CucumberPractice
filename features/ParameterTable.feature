Feature: Open the sites and perform some search

@parameter
Scenario: verify that user should be able to navigate to multiple site
	Given Launch the chrome browser
	When Navigate to home page for
		|Google|
		|Gmail|
	Then gmail home page should dispay
	Then Close Browser