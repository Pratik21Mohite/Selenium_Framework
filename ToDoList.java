package master;

import java.util.Set;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class ToDoList extends MainDriver {
	@Test
	public void ToDoListTest() throws InterruptedException {
    
	 driver.findElement(By.xpath("//div//h1[text()='TO DO LIST']")).click();
	 Thread.sleep(5000);
	  String parentWindow = driver.getWindowHandle();
	  Set<String> handles =  driver.getWindowHandles();
	     for(String windowHandle  : handles)
	         {
	         if(!windowHandle.equals(parentWindow))
	            {
	            driver.switchTo().window(windowHandle);
	         //  <!--Perform your operation here for new window-->
	          driver.findElement(By.xpath("//input[@type='text' and @placeholder='Add new todo']")).click();
	          Thread.sleep(1000);
	          driver.findElement(By.xpath("//input[@type='text' and @placeholder='Add new todo']")).sendKeys("Learn new things");
	      	  Thread.sleep(2000);
	      	  driver.findElement(By.xpath("//input[@type='text' and @placeholder='Add new todo']")).sendKeys(Keys.ENTER);
	      	  Thread.sleep(1000);
	      	  
	      	  List<WebElement> tasks = driver.findElements(By.cssSelector("#container > ul"));
	         // System.out.println("List of Tasks:" +tasks.size());

	        	          System.out.println("Task List is as follows:");
	        
	        for (int i=0; i < tasks.size(); i++)
	        {
	           System.out.println(tasks.get(i).getText());
	        }
             
	      	  
	          Thread.sleep(4000);
	          driver.close(); //closing child window
	          Thread.sleep(4000);
	          driver.switchTo().window(parentWindow); //cntrl to parent window
	          Thread.sleep(4000);
	            }
	         }
	     }
	}

