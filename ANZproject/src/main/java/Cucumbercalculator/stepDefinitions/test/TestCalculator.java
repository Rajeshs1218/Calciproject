package Cucumbercalculator.stepDefinitions.test;

import org.openqa.selenium.support.PageFactory;

import Cucumbercalculator.pageObjects.Calculatorobjects;
import TestBase.TestBasecheck;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCalculator extends TestBasecheck
{
	@Before()
	public void open_browser() throws Throwable {
		OpenBrowser();
	}
	
	@After()
	public void Close_browser() throws Throwable {
		CloseBrowser();
	}
	
	@Given("Open Calculator")
	public void Open_Calculator() {
		System.out.println("Succeffully page opened");
	}

	@When("Check Estimation")
	public void Check_Estimation() throws Exception {
		Calculatorobjects CO = PageFactory.initElements(driver, Calculatorobjects.class);
		CO.Application_type();
		CO.Dependants();
		CO.property_buy();
		CO.annual_income();
		CO.other_income();
		CO.monthly_expenses();
		CO.current_home();
		CO.other_loan();
		CO.other_commitments();
		CO.credit_limit();
		CO.workout_borrow();
			
	}


	@Then("Start Over")
	public void Start_Over() throws Exception {
		Calculatorobjects CO = PageFactory.initElements(driver, Calculatorobjects.class);
		CO.Start_over();
	   
	}

	@Then("Error Check")
	public void Error_Check() throws Exception {
		Calculatorobjects CO = PageFactory.initElements(driver, Calculatorobjects.class);
		CO.Living_expenses();
	    
	}


}
