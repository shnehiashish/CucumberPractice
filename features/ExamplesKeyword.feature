Feature: Navigate to AutomationPractice site and login

@AutomationPractice
Scenario Outline: Successfull Login with valid credentials
	Given Launch the chrome browser
	When Navigate to AutomationPractice site
	Then Verify the titile of the page
	When click on login link
	Then Login page should be dispayed
	When Enter the "<Username>" and "<Password>"
	And click on login button
	Then Close Browser
	
	Examples:
		|Username				 |Password|
		|ashish@gmail.com|ashish|
		|shnehi@gmail.com|shnehi|
