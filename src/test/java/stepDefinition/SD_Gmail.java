package stepDefinition;

import org.openqa.selenium.By;

import UtilPackage.DriverClass;
import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SD_Gmail extends DriverClass{
	
	
	@When("^Navigate to gmail home page$")
	public void navigate_to_gmail_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver.get("https://www.gmail.com");
	}

	@Then("^gmail home page should dispay$")
	public void gmail_home_page_should_dispay() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println(driver.getTitle());
	   Assert.assertEquals(driver.getTitle(), "Gmail - Email from Google");
	}

	@When("^Enter the email id in email filed$")
	public void enter_the_email_id_in_email_filed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.id("identifierId")).click();
	   driver.findElement(By.id("identifierId")).sendKeys("shnehiashish@gmail.com");
	   
	}
	@Then("Close Browser")
	public void closeBrowser()
	{
		driver.quit();
	}

}
