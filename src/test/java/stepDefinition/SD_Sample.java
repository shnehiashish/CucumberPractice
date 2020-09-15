package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SD_Sample {

	@Before(order = 2)
	public void beforeTwo()
	{
		System.out.println("this is two before hooks");
	}

	@Before(order = 0)
	public void beforeZero()
	{
		System.out.println("this is Zero before hooks");
	}
	@Before(order = 1)
	public void beforeOne()
	{
		System.out.println("this is One before hooks");
	}

	@Before(order = -1)
	public void beforeMinsOne()
	{
		System.out.println("this is Minus-One before hooks");
	}


	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Given I want to write a step with precondition");
	}

	@When("^I complete action$")
	public void i_complete_action() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("When I complete action");
	}

	@When("^some other action$")
	public void some_other_action() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("And some other action");
	}

	@When("^yet another action$")
	public void yet_another_action() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("And yet another action");
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Then I validate the outcomes");
	}

	@Then("^check more outcomes$")
	public void check_more_outcomes() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("And check more outcomes");
	}

	@Given("^open the Browser$")
	public void open_the_Browser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Given open the Browser");
	}

	@When("^Navigate to the google$")
	public void navigate_to_the_google() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("When Navigate to the google");
	}

	@Then("^verify the title$")
	public void verify_the_title() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Then verify the title");
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Then close the browser");
	}

	@After(order = 2)
	public void afterTwo()
	{
		System.out.println("this is two after hooks");
	}

	@After(order = 0)
	public void afterZero()
	{
		System.out.println("this is Zero after hooks");
	}
	@After(order = 1)
	public void afterOne()
	{
		System.out.println("this is One after hooks");
	}

	@After(order = -1)
	public void afterMinsOne()
	{
		System.out.println("this is Minus-One after hooks");
	}

	@Given("^This is back$")
	public void this_is_back() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("this is given back");
	}

	@When("^This is back when$")
	public void this_is_back_when() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("this is when back");
	}

}
