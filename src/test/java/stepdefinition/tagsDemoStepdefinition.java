package stepdefinition;

import cucumber.api.java.en.Given;

public class tagsDemoStepdefinition 
{
	@Given("^Executing Scenario_one$")
	public void executing_Scenario_one() throws Throwable 
	{
	    System.out.println("Scenario_1 is Executed");
	}

	@Given("^Executing Scenario_two$")
	public void executing_Scenario_two() throws Throwable 
	{
		System.out.println("Scenario_2 is Executed");
	}

	@Given("^Executing Scenario_three$")
	public void executing_Scenario_trhee() throws Throwable 
	{
		System.out.println("Scenario_3 is Executed");
	}

	@Given("^Executing Scenario_four$")
	public void executing_Scenario_four() throws Throwable 
	{
		System.out.println("Scenario_4 is Executed");
	}

	@Given("^Executing Scenario_five$")
	public void executing_Scenario_five() throws Throwable 
	{
		System.out.println("Scenario_5 is Executed");
	}

	@Given("^Executing Scenario_six$")
	public void executing_Scenario_six() throws Throwable 
	{
		System.out.println("Scenario_6 is Executed");
	}
}