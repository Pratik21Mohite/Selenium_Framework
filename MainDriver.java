package master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class MainDriver {
	public static WebDriver driver;
	@BeforeTest
	 public void initialization() 
	 {
	 	System.setProperty("webdriver.chrome.driver", "D://Automation_setup//chromedriver_win32//chromedriver.exe");
	  	driver = new ChromeDriver();
	    driver.manage().window().maximize();		
	 }
}
