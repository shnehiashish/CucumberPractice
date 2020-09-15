package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import UtilPackage.DriverClass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SD_Examples extends DriverClass{
	
	@When("^Navigate to AutomationPractice site$")
	public void navigate_to_AutomationPractice_site() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get("http://automationpractice.com/index.php");
	}

	@Then("^Verify the titile of the page$")
	public void verify_the_titile_of_the_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(driver.getTitle());
	}

	@When("^click on login link$")
	public void click_on_login_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[contains(text(),'Sign in')]")).click();
	    Thread.sleep(3000);

	}

	@Then("^Login page should be dispayed$")
	public void login_page_should_be_dispayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.getTitle();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,500)");
		System.out.println("Able to scroll the page");
	    
	}

	@When("^Enter the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_the_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[@id='email']")).sendKeys(arg1);
	    driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys(arg2);
	}

	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id='SubmitLogin']/span")).click();
	}


}
