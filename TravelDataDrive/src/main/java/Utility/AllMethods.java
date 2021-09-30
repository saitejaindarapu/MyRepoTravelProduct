package Utility;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AllMethods {
	
	
	
	private WebDriver driver;
	
	
	public By Username = By.id("username");
	public By Password = By.id("password");
	public By LoginButton = By.id("kc-login");
	public By QMSTile = By.xpath("//body/dx-dijta-home-root/dx-layout-wrapper/dx-layout-one[@class='ng-tns-c4-0 ng-star-inserted']/div[@class='layout-one']/div[@class='content']/div[@class='main-content']/div[contains(@class,'w-100')]/content/div[@class='content']/dx-dijta-home-dashboard[@class='ng-star-inserted']/div[@class='content']/div[@class='titls-wapper']/div[@id='4']/div/div[@class='tile-wrapper']/div[1]/dx-basic-tile[1]/div[1]");
	 public By NewButton = By.xpath("//button[normalize-space()='New Quote']");
	// public By NewButton = By.xpath("/html/body/dx-dijta-home-root/dx-default-layout/div/div[2]/div[2]/div/dx-dijta-home-quote-management/dx-content-with-sub-side-bar-layout/div/div[2]/dx-loader/div/dx-table-header/div[1]/dx-button/button");
	public By ProductSelection = By.xpath("//div[@class='col-12 col-md-6 d-flex align-items-center product-list ng-star-inserted']");
	public By ContinueButton = By.xpath("//*[@id=\"selectProcess\"]/div[2]/dx-button[2]/button");
    public By TripStartDate = By.id("mat-input-0");
    public By TripEndDate = By.id("mat-input-1");
    
    public By Region = By.xpath("//*[@id=\"dx-form-view\"]/form/div[1]/mat-card/mat-card-content/div/div/div[3]/mat-form-field");
	public By PlanType = By.xpath("//*[@id=\"dx-form-view\"]/form/div[1]/mat-card/mat-card-content/div/div/div[4]/mat-form-field/div/div[1]");
	public By getpremium=By.xpath("//*[@id=\"dx-form-view\"]/form/div[2]/dx-button/button");
    public By Max=By.xpath("//button[@class='cart-expansion-icon']");
    public By Createquote= By.xpath("//button[normalize-space()='Create Quote']");
    public By AddPH=By.xpath("//button[normalize-space()='Add Policy Holder']");
    
    public By ButtonC=By.xpath("//dx-button[@class='ng-star-inserted']//button[@class='dxBtn'][normalize-space()='Continue']");

    public By ID=By.id("mat-input-5");// ID Number field
    public By Expirydate=By.id("mat-input-4"); // Expiry Date field
    public By firstnameE=By.id("mat-input-6");    // First name in English
    public By SnameE=By.id("mat-input-9"); // Fourth Name in English
    public By firstNameA=By.id("mat-input-10"); // First Name in Arabic
    public By FNameA=By.id("mat-input-13"); // Fourth Name in Arabic
    public By DOB=By.id("mat-input-14"); //Date of Birth
    public By MobileN= By.id("maskIn"); //  Mobile Number
    public By email= By.id("mat-input-16"); //Email
    public By Passport = By.xpath("//mat-form-field[@class='mat-form-field ng-tns-c9-67 mat-primary mat-form-field-type-mat-select mat-form-field-appearance-outline mat-form-field-can-float mat-form-field-has-label mat-form-field-hide-placeholder ng-untouched ng-pristine ng-invalid']//div[@class='mat-form-field-infix']");
    public By PassportSearch = By.xpath("//input[@aria-label='dropdown search']");
	public By PassportNum = By.id("mat-input-17");
	public By PassportStartDate = By.id("mat-input-18");
	public By PassportEndDate = By.id("mat-input-19");
	public By SourceofIncomeSearch = By.xpath("//input[@aria-label='dropdown search']");
	public By NextButton = By.xpath("//*[@id=\\\"policyholderSearch\\\"]/div/div[2]/div/div[2]/dx-button");
	public By AddressInfo = By.xpath("//div[contains(text(),'Address Information')]");
	
	
//  Constructor of the page class:
			public AllMethods(WebDriver driver) {
				this.driver = driver;
			}
	public void LoginPage(String username, String password) {
		driver.findElement(Username).sendKeys(username);
		driver.findElement(Password).sendKeys(password);	
	}
	public void LoginClick() {
		driver.findElement(LoginButton).click();
	}
	public void QMS()  {
		
		driver.findElement(QMSTile).click();
	}
	public void NewButton() {
		driver.findElement(NewButton).click();
	}
	public void ProductSelection() {
		Set<String> window = driver.getWindowHandles();
		for(String ID: window) {
			driver.switchTo().window(ID); System.out.println("window changed");
				
		}
		driver.findElement(ProductSelection).click();
	}
	public void ContinueButton() {
		driver.findElement(ContinueButton).click();	
	}
	public void SelectPlanPage(String TripStdt, String TripEndt) {
		driver.findElement(TripStartDate).sendKeys(TripStdt);
		driver.findElement(TripEndDate).sendKeys(TripEndt);
		
	}
	
	
	
	public void region1(String Reg1) throws AWTException {
		WebElement region = driver.findElement(Region);
		region.click();
Robot r = new Robot();
r.keyPress(KeyEvent.VK_ENTER);
			}
public void region2(String Reg2) throws AWTException {
	WebElement region = driver.findElement(Region);
	Robot r = new Robot();
region.click();
r.keyPress(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_ENTER);
	}

public void region3(String Reg3) throws AWTException {
	WebElement region = driver.findElement(Region);
	Robot r = new Robot();
region.click();
r.keyPress(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_ENTER);
	}
public void region4(String Reg4) throws AWTException {
	WebElement region = driver.findElement(Region);
	Robot r = new Robot();
region.click();
r.keyPress(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_ENTER);
	}
	public void plantype1(String planType1) throws AWTException {
		WebElement plantype = driver.findElement(PlanType);
		Robot r = new Robot();
		plantype.click();
		r.keyPress(KeyEvent.VK_ENTER);
}
	public void plantype2(String planType2) throws AWTException {
		WebElement plantype = driver.findElement(PlanType);
		Robot r = new Robot();
		plantype.click();
		r.keyPress(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_ENTER);
}
public void getpremium() {
	 driver.findElement(getpremium).click();
}
public void createQutoe() {
	Actions a = new Actions(driver); 
	driver.findElement(Max).click();
 
}


public void AddPH() {
	  driver.findElement(AddPH).click();
		driver.findElement(ButtonC).click();
}
public void PHInformation(String id,String expirydate, String fstname, String fthname, String fnameA, String fthnameA, String dob, String mobileN, String Email) {
	driver.findElement(ID).sendKeys(id);
	driver.findElement(Expirydate).sendKeys(expirydate);
	driver.findElement(firstnameE).sendKeys(fstname);
	driver.findElement(SnameE).sendKeys(fthname);
	driver.findElement(firstNameA).sendKeys(fnameA);
	driver.findElement(FNameA).sendKeys(fthnameA);
	driver.findElement(DOB).sendKeys(dob);
	driver.findElement(MobileN).sendKeys(mobileN);
driver.findElement(email).sendKeys(Email);


}
public void ClickonCreateQuote() {
	driver.findElement(Createquote).click();
	
}


public void Passport(String passportType, String passportNumber, String PassportStDt, String PassportEdDt) throws AWTException {
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_TAB); 
	r.keyPress(KeyEvent.VK_ENTER);
	driver.findElement(PassportSearch).sendKeys(passportType);
	r.keyPress(KeyEvent.VK_ENTER);     // Passport Type
	driver.findElement(PassportNum).sendKeys(passportNumber);
	
	                                                
	driver.findElement(PassportStartDate).sendKeys(PassportStDt);  // Passport Issue Date
	driver.findElement(PassportEndDate).sendKeys(PassportEdDt);   //Passport Expiry date
	
}
public void SourceofIncome(String SourceofInc) throws AWTException {
	Robot r = new Robot();
	Actions a = new Actions(driver);
	r.keyPress(KeyEvent.VK_TAB); 
	r.keyPress(KeyEvent.VK_TAB);
	r.keyPress(KeyEvent.VK_ENTER);
	driver.findElement(SourceofIncomeSearch).sendKeys(SourceofInc);
	r.keyPress(KeyEvent.VK_ENTER);
	driver.findElement(NextButton).click();
	
	WebElement AD = driver.findElement(AddressInfo);
			
  a.click(AD).build().perform();
	
	
}


		}
