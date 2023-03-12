package Cucumbercalculator.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Calculatorobjects {
WebDriver driver;
	
	public Calculatorobjects(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void navigateTo_HomePage() {
		driver.get("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");

	}

	@FindBy(xpath = "//label[@for='application_type_single']")
	public WebElement Singlebutton;
	
	@FindBy(xpath = "//select[@title='Number of dependants']")
	public WebElement Nodependants;
	
	@FindBy(xpath = "//label[@for='borrow_type_home']")
	public WebElement Hometolive;
	
	@FindBy(xpath = "(//label[text()='Your annual income (before tax)']/following::input)[1]")
	public WebElement Annualincome;
	
	@FindBy(xpath = "(//label[text()='Your annual other income (optional)']/following::input)[1]")
	public WebElement Otherincome;
	
	@FindBy(xpath = "(//label[text()='Monthly living expenses ']/following::input)[1]")
	public WebElement Monthlyexpenses;
	
	@FindBy(xpath = "(//label[text()[normalize-space()='Current home loan monthly repayments']]/following::input)[1]")
	public WebElement Currenthome;
	
	@FindBy(xpath = "(//label[text()='Other loan monthly repayments']/following::input)[1]")
	public WebElement Otherloan;
	
	@FindBy(xpath = "(//label[text()='Other monthly commitments']/following::input)[1]")
	public WebElement Othercommitments;
	
	@FindBy(xpath = "//label[text()='Total credit card limits']/following::input")
	public WebElement Totalcreditlimits;
	
	@FindBy(xpath = "//button[text()[normalize-space()='Work out how much I could borrow']]")
	public WebElement Workoutbutton;
	
	@FindBy(xpath = "//div[@class='result__restart']//button[1]")
	public WebElement Startover;
	
	@FindBy(xpath = "//div[@class='borrow__error--textcontainer result__restart']//div[1]")
	public WebElement Errormessage;
	
	@FindBy(xpath = "//span[text()='$428,000']")
	public WebElement Estimation;
	
	
	public void Application_type() {
		 if (Singlebutton.isDisplayed())
			System.out.println("Application type is single");
		else
			System.out.println("Details error");
	}
		 public void Dependants()
				 {
		 if (Nodependants.equals(0))
				System.out.println("Number of dependants is Zero");
			else
				System.out.println("Details error");
	}
		 
		 public void property_buy()
		 {
			 if (Hometolive.isDisplayed())
				
					System.out.println("Home to live property");
				else
					System.out.println("Details error");
			 
		 }
		 
		 public void annual_income() throws Exception
		 {
			 if (Annualincome.isDisplayed())
					
					System.out.println("Annual income box displayed");
				else
					System.out.println("Details error");
			 Annualincome.sendKeys("80000");
			// ////wait(10);
		 }
		 
		 public void other_income() throws Exception {
			 if(Otherincome.isDisplayed())
				 System.out.println("Other income box displayed");
				else
					System.out.println("Details error"); 
			 Otherincome.sendKeys("10000");
			// ////wait(10);
		 }
		 
		 public void monthly_expenses() throws Exception
		 {
			 if(Monthlyexpenses.isDisplayed())
				 System.out.println("Monthly expenses box displayed");
				else
					System.out.println("Details error"); 
			 Monthlyexpenses.sendKeys("500");
			// //wait(10);
		 }
		 
		 public void current_home() throws Exception {
			 
			 if(Currenthome.isDisplayed())
				 System.out.println("Current home expenses box displayed");
				else
					System.out.println("Details error"); 
			 Currenthome.sendKeys("0");
			// //wait(10);
		 }
	
public void other_loan() throws Exception {
			 
			 if(Otherloan.isDisplayed())
				 System.out.println("Other loan expenses box displayed");
				else
					System.out.println("Details error"); 
			 Otherloan.sendKeys("100");
			// //wait(10);
}
public void other_commitments() throws Exception {
	 
	 if(Othercommitments.isDisplayed())
		 System.out.println("Other commitments expenses box displayed");
		else
			System.out.println("Details error"); 
	 Othercommitments.sendKeys("0");
	 ////wait(10);
}
public void credit_limit() throws Exception {
	 
	 if(Totalcreditlimits.isDisplayed())
		 System.out.println("Totoal credit limits expenses box displayed");
		else
			System.out.println("Details error"); 
	 Totalcreditlimits.sendKeys("10000");
	 ////wait(10);
	 }

public void workout_borrow() throws Exception
{
	if(Workoutbutton.isDisplayed())
		 System.out.println("Workout button is displayed");
		else
			System.out.println("Details error"); 
	Workoutbutton.click();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   
	
	if(Estimation.isDisplayed())
		 System.out.println("Estimation is displayed");
		else
			System.out.println("Details error"); 
	
}

public void Start_over() throws Exception {
	if(Startover.isDisplayed())
		 System.out.println("Startover button is displayed");
		else
			System.out.println("Details error"); 
	Startover.click();
	////wait(10);
	

	
}

public void Living_expenses() throws Exception
{
	if(Monthlyexpenses.isDisplayed())
		 System.out.println("Monthly expenses box displayed");
		else
			System.out.println("Details error"); 
	Monthlyexpenses.sendKeys("1");
	
	Workoutbutton.click();
	 
	 if(Errormessage.isDisplayed())
		 System.out.println("Error message is displayed");
		else
			System.out.println("Not displayed error message"); 
}




}

