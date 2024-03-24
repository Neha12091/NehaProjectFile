package project12;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class profileupdate extends login{
	
  @Test(priority=2)
  
  public void profile() {
	  
	driver.get("https://www.amazon.in/gp/history?ref_=nav_cs_timeline");
	
	//click on your profile
      driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[5]/span")).click();
   
    //edit your profile
     driver.findElement(By.xpath("//*[@id=\"profile_v5\"]/div/div/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/a[2]/span")).click();
      
  //occupation
     driver.findElement(By.xpath("//*[@id=\"profile_occupation\"]")).sendKeys("Software Tester");
     
     //for Bio
     driver.findElement(By.id("profile_personal_description")).sendKeys("I am Software tester");
     
     //for location
     driver.findElement(By.xpath("//*[@id=\"profile_location\"]")).sendKeys("pune");
     
     //save information
    driver.findElement(By.xpath("//*[@id=\"save-public-activity-announce\"]")).click();
     
  }
}

