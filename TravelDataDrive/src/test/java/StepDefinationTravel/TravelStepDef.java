package StepDefinationTravel;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.AllMethods;
import Utility.ExcelReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import factory.qa.DriverFactory;


public class TravelStepDef {
	
	private static final String Region = null;
	private static final String Plan = null;
	private static final String PlanType = null;
	public AllMethods Methods = new AllMethods(DriverFactory.getdriver());
	
	
	@Given("^User navigates to dijta login page$")
	public void user_navigates_to_dijta_login_page() throws Throwable {
		
		DriverFactory.getdriver().get("https://dijta-uat.salama.com.sa/");
	   Thread.sleep(3000);
	}
     
	@When("^User fills the required field values from given sheetname \"([^\"]*)\" and rownumber (\\d+)$")
	public void user_fills_the_required_field_values_from_given_sheetname_and_rownumber(String sheetName, int rowNumber) throws Throwable {
	    
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> testData = 
				reader.getData("C:\\Users\\DELLs\\OneDrive\\Desktop\\Quote_Creation_Data.xlsx", sheetName);
		System.out.println("Excel Opened");
		String Username = testData.get(rowNumber).get("Username");
		String Password = testData.get(rowNumber).get("Password");
				
		Methods.LoginPage(Username, Password);
		Methods.LoginClick();
	Thread.sleep(5000);
	Methods.QMS();
	Thread.sleep(5000);
	Methods.NewButton();
	Thread.sleep(5000);
	Methods.ProductSelection();
	Thread.sleep(5000);
	Methods.ContinueButton();
	Thread.sleep(5000);
	String TripStartDate = testData.get(rowNumber).get("Trip Start Date");
	Thread.sleep(5000);
	String TripEndDate = testData.get(rowNumber).get("Trip End Date");
	Thread.sleep(5000);
	
	Methods.SelectPlanPage(TripStartDate, TripEndDate);
	
String Region = testData.get(rowNumber).get("Region");
if(Region.matches("Worldwide")) {
	((AllMethods) Methods).region1(Region);
Thread.sleep(5000);

}
	if(Region.matches("Worldwide-Excluding USA & Canada")) 
{	
Methods.region2(Region);	
Thread.sleep(5000);
}
if(Region.matches("Schengen"))
{	
		Methods.region3(Region);	
	Thread.sleep(20000);
} 

if(Region.matches("Other")) {
Methods.region4(Region);	

}
Thread.sleep(10000);

String PlanType = testData.get(rowNumber).get("Plan Type");
if(PlanType.matches("Individual")) {	

Methods.plantype1(PlanType);
Thread.sleep(2000);
}
if(PlanType.matches("Family")) {	
Methods.plantype2(PlanType);
Thread.sleep(2000);
}
Thread.sleep(5000);
Methods.getpremium();
Thread.sleep(3000);
Methods.createQutoe();
Thread.sleep(5000);
Methods.ClickonCreateQuote();
Thread.sleep(2000);
Methods.AddPH();
Thread.sleep(5000);
String id = testData.get(rowNumber).get("ID Number");
String expirydate = testData.get(rowNumber).get("Expiry Date / Date Of Birth");
String fnameE = testData.get(rowNumber).get("First Name in English");
String fthnameE = testData.get(rowNumber).get("Last Name in English");
String fnameA = testData.get(rowNumber).get("First Name in Arabic");
String fthnameA = testData.get(rowNumber).get("Last Name in Arabic");
String dob = testData.get(rowNumber).get("Date of Birth");
String phnnumb = testData.get(rowNumber).get("Mobile Number");
String email = testData.get(rowNumber).get("Email");


 Methods.PHInformation(id, expirydate, fnameE, fthnameE, fnameA, fthnameA, dob, phnnumb, email);
 
 Thread.sleep(2000);
 String PassportType =  testData.get(rowNumber).get("Passport Type");
 String PassportNumber =  testData.get(rowNumber).get("Passport Number");
 String PassportStDt =  testData.get(rowNumber).get("Passport Issue Date");
 String PassportEdDt =  testData.get(rowNumber).get("Passport End Date");
 
 
 Methods.Passport(PassportType, PassportNumber, PassportStDt, PassportEdDt);
 Thread.sleep(2000);
 String SourceofIncome =  testData.get(rowNumber).get("Source of Income");
 Methods.SourceofIncome(SourceofIncome);
 Thread.sleep(2000);
 
}

@When("^User clicks on Download Quote and Process Payment button$")
public void user_clicks_on_Download_Quote_and_Process_Payment_button() throws Throwable {
}

@Then("^Status change to Quoted to Issued$")
public void status_change_to_Quoted_to_Issued() throws Throwable {
}

	

	@When("^User clicks on Download Quote button and Process Payment button$")
	public void user_clicks_on_Download_Quote_button_and_Process_Payment_button() throws Throwable {
		
		
	}

	@Then("^Status changes to Issued$")
	public void status_changes_to_Issued() throws Throwable {
	   
	}


	
	

}
