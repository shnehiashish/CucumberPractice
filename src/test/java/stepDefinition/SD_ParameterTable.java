package stepDefinition;

import java.util.List;

import UtilPackage.DriverClass;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;

public class SD_ParameterTable extends DriverClass{

	@When("^Navigate to home page for$")
	public void navigate_to_home_page_for(DataTable arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>> site = arg1.raw();
		if(site.get(0).get(0).equalsIgnoreCase("google"))
		{
			driver.get("https://www.google.com");
		}
		if(site.get(1).get(0).equalsIgnoreCase("gmail"))
		{
		
			driver.get("https://www.gmail.com");
		}

	}

}
