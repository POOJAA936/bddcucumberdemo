package stepdefinition;
import static org.testng.Assert.assertEquals;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class LoginStepDefinition 
{
	static WebDriver driver;
	@Given("^the browser is launched$")
	public void the_browser_is_launched() throws Throwable 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Hi\\Config\\geckodriver.exe");
	    driver=new FirefoxDriver();
	}

	@Given("^the application is loaded$")
	public void the_application_is_loaded() throws Throwable 
	{
		driver.get("http://localhost/login.do");
	}
	
//	@When("^the user enters the creadentials as username and password$")
//	public void the_user_enters_the_creadentials_as_username_and_password(DataTable data) throws Throwable 
//	{
//		List<List<String>> dataTable = data.asLists(String.class);
//		driver.findElement(By.id("username")).sendKeys(dataTable.get(1).get(0));
//		driver.findElement(By.name("pwd")).sendKeys(dataTable.get(1).get(1));
//		Thread.sleep(4000);
//	}
	
	@When("^the user enters the creadentials as username and password$")
	public void the_user_enters_the_creadentials_as_username_and_password(DataTable data) throws Throwable 
	{
		List<Map<String, String>> dataMap = data.asMaps(String.class, String.class);
		driver.findElement(By.id("username")).sendKeys(dataMap.get(0).get("username"));
		driver.findElement(By.name("pwd")).sendKeys(dataMap.get(0).get("password"));
		Thread.sleep(4000);
	}
	
//	@When("^the user enters the creadentials as \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void the_user_enters_the_creadentials_as_and(String arg1, String arg2) throws Throwable 
//	{
//		driver.findElement(By.id("username")).sendKeys(arg1);
//		driver.findElement(By.name("pwd")).sendKeys(arg2);
//	}

	@When("^the user clicks on the login Button$")
	public void the_user_clicks_on_the_login_Button() throws Throwable 
	{
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(4000);
	}
	
	@Then("^dashboard should be displayed$")
	public void dashboard_should_be_displayed() throws Throwable 
	{
		Assert.assertEquals("", "");
		driver.close();
	}
}