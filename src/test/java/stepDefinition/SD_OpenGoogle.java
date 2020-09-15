package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import UtilPackage.DriverClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class SD_OpenGoogle extends DriverClass {

	@Given("^Launch the chrome browser$")
	public void launch_the_chroem_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	}

	@When("^Navigate to google home page$")
	public void navigate_to_google_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get("https://www.google.com");
	}

	@Then("^Google search page should dispay$")
	public void google_search_page_should_dispay() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    String title = driver.getTitle();
	    System.out.println(title);
	    Assert.assertEquals(title, "Google");
	}

	@When("^Enter the text in seach filed$")
	public void enter_the_text_in_seach_filed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[@title='Search']")).click();
	    driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("Cucumber");
	   }
	
}
