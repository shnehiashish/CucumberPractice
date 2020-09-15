Feature: Title of your feature I want to use this template for my feature file
Background: This is background
Given This is back
When This is back when

@sample 
  Scenario: Title of your scenario
    Given I want to write a step with precondition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes

@Test @Testing
  Scenario: Launch google and verify the title
  Given open the Browser
  When Navigate to the google
  Then verify the title
  Then close the browser
  
  