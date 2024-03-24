package project12;


import org.openqa.selenium.By;

import org.testng.annotations.Test;

public class AddAddress extends login {
  @Test(priority=2)
  public void address() throws InterruptedException {
	 
	driver.get("https://www.amazon.in/gp/css/homepage.html");	  
	  
	//your address 
	driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[1]/div/div[3]/div[1]/a/div/div")).click();
	  
	//add address icon
	driver.findElement(By.xpath("//*[@id=\"ya-myab-plus-address-icon\"]")).click();
	
	//add name
	driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressFullName\"]")).sendKeys("Neha Limkar");
	//add mobile number
	driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressPhoneNumber\"]")).sendKeys("9876543213");
	//add pincode
	driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressPostalCode\"]")).sendKeys("411015");
	//add flat,house------
	driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressLine1\"]")).sendKeys("AB19");
	//area,street,village-----
	driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressLine2\"]")).sendKeys("Vishrantwadi Pune Alandi Road");
	//landmark----
	driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-landmark\"]")).sendKeys("city hospital");
	
	//No need to write the code for city and State...Because we already given pincode at line 25 so state and city automatically getting fetch by system.
	  Thread.sleep(5000);
	     //add address button
	      driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-form-submit-button\"]/span/input")).click();
	      
	    
  }
}
