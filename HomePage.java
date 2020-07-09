package master;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class HomePage extends MainDriver{

	 @Test
	  @Parameters("url")
	  public void ContactUs(String url) throws Exception{
	  driver.get(url);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@class=\"section-title\"]//*[text()='CONTACT US']")).click();
	  Thread.sleep(5000);
	  String parentWindow = driver.getWindowHandle();
	  Set<String> handles =  driver.getWindowHandles();
	     for(String windowHandle  : handles)
	         {
	         if(!windowHandle.equals(parentWindow))
	            {
	            driver.switchTo().window(windowHandle);
	         //  <!--Perform your operation here for new window-->
	          driver.findElement(By.xpath("//input[@name=\"first_name\"]")).sendKeys("Pratik");
	      	  Thread.sleep(2000);
	      	  driver.findElement(By.xpath("//input[@name=\"last_name\"]")).sendKeys("Mohite");
	      	  Thread.sleep(2000);
	      	  driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("pratikmohite21@gmail.com");
	      	  Thread.sleep(2000);
	      	  driver.findElement(By.xpath("//textarea[@name=\"message\"]")).sendKeys("NEVER BACK DOWN");
	      	  Thread.sleep(2000);
	      	  driver.findElement(By.xpath("//input[@class=\"contact_button\" and @value=\"RESET\"]")).click();
	      	  Thread.sleep(2000);
	      	  driver.findElement(By.xpath("//input[@name=\"first_name\"]")).sendKeys("Pratik");
	      	  Thread.sleep(2000);
	      	  driver.findElement(By.xpath("//input[@name=\"last_name\"]")).sendKeys("Mohite");
	      	  Thread.sleep(2000);
	      	  driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("pratikmohite21@gmail.com");
	      	  Thread.sleep(2000);
	      	  driver.findElement(By.xpath("//textarea[@name=\"message\"]")).sendKeys("NEVER BACK DOWN");
	      	  Thread.sleep(2000);	  
	      	  driver.findElement(By.xpath("//input[@class=\"contact_button\" and @value=\"SUBMIT\"]")).click();
	      	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      	  String Data = driver.findElement(By.xpath("//div//h1[text()='Thank You for your Message!']")).getText();
	      	  System.out.println("Printing "+Data);
              Thread.sleep(4000);
	          driver.close(); //closing child window
	          driver.switchTo().window(parentWindow); //cntrl to parent window
	          Thread.sleep(4000); 	
	            }
	         }
	  /*if(driver.findElements(By.xpath("//input[@name=\\\"first_name\\\"]")).size() != 0){
		  System.out.println("Element is Present");
		  }else{
		  System.out.println("Element is Absent");
		  }*/
	  
	
	  
	 }
	     
}
