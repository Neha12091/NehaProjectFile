package project12;

import org.openqa.selenium.By;


import org.testng.annotations.Test;

public class searchfunction extends login {
  @Test(priority=2)
  public void searchproduct() {
	  
	 
	        // Perform search on Amazon
	       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("headphones jbl");
	  
	       //click on searchicon button
	      driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	  
	  
  }
}
