package master;


import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginPage extends MainDriver {
	@Test
	public void LoginPageTest() throws InterruptedException {
    
	 driver.findElement(By.xpath("//div//h1[text()='LOGIN PORTAL']")).click();
	 Thread.sleep(5000);
	  String parentWindow = driver.getWindowHandle();
	  Set<String> handles =  driver.getWindowHandles();
	     for(String windowHandle  : handles)
	         {
	         if(!windowHandle.equals(parentWindow))
	            {
	            driver.switchTo().window(windowHandle);
	         //  <!--Perform your operation here for new window-->
	          driver.findElement(By.xpath("//input[@id=\"text\"]")).click();
	          Thread.sleep(1000);
	          driver.findElement(By.xpath("//input[@id=\"text\"]")).sendKeys("Pratik");
	      	  Thread.sleep(2000);
	      	  driver.findElement(By.xpath("//input[@id=\"password\"]")).click();
	      	  Thread.sleep(1000);
	      	  driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("PASSWORD");
	      	  Thread.sleep(2000);
	       	  driver.findElement(By.xpath("//button[@id=\"login-button\"]")).click();
	       	  Alert alert = driver.switchTo().alert();
	          Thread.sleep(4000);
	          alert.accept();
	          Thread.sleep(4000);
	          driver.close(); //closing child window
	          Thread.sleep(4000);
	          driver.switchTo().window(parentWindow); //cntrl to parent window
	          Thread.sleep(4000);
	            }
	         }
	} 
	 
}
