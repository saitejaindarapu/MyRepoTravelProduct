package factory.qa;



import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverFactory
{
	
	
	public static WebDriver driver;

	public static WebDriver getdriver() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELLs\\Downloads\\chromedriver_win32\\chromedriver.exe");
if (driver == null) {
		driver=new ChromeDriver();
        driver.manage().window().maximize();

		return driver;
		
	}
else {
return driver;	
}
}



}
	
	

