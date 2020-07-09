package master;

import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ButtonClicks extends MainDriver {
	@Test
	public void ButtonClicksTest() throws InterruptedException {
    
	 driver.findElement(By.xpath("//div//h1[text()=\"BUTTON CLICKS\"]")).click();
	 Thread.sleep(5000);
	  String parentWindow = driver.getWindowHandle();
	  Set<String> handles =  driver.getWindowHandles();
	     for(String windowHandle  : handles)
	         {
	         if(!windowHandle.equals(parentWindow))
	            {
	            driver.switchTo().window(windowHandle);
	         //  <!--Perform your operation here for new window-->
	          driver.findElement(By.xpath("//span//p[text()=\"CLICK ME!\"]")).click();
	          Thread.sleep(1000);
	          driver.findElement(By.cssSelector("#myModalClick > div > div > div.modal-footer > button")).click();
	          Thread.sleep(4000);
	          driver.findElement(By.xpath("//span[@id=\"button2\"]")).click();
	          Thread.sleep(4000);
	          WebElement closeButton = driver.findElement(By.cssSelector("#myModalJSClick > div > div > div.modal-footer > button"));
	          JavascriptExecutor executor = (JavascriptExecutor)driver;
	          executor.executeScript("arguments[0].click();", closeButton);
	          //driver.close(); //closing child window
	          Thread.sleep(4000);
	          driver.findElement(By.xpath("//span[@id=\"button3\"]")).click();
	          Thread.sleep(4000);
	          WebElement closeButton2 = driver.findElement(By.cssSelector("#myModalMoveClick > div > div > div.modal-footer > button"));
	          Actions builder = new Actions(driver);	
	          Action mouseOverHome = builder
                      .moveToElement(closeButton2)
                      .click()
                      .build();
	          Thread.sleep(4000);
	          mouseOverHome.perform();
	          Thread.sleep(2000);
	          driver.close(); //closing child window
	          Thread.sleep(2000);
	          driver.switchTo().window(parentWindow); //cntrl to parent window
	          Thread.sleep(4000);
	  	}
	          
	          
	      
	            }
	         }
	} 

