package com.demo.magentoobjet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Welcome {
  
	WebDriver driver;
	
	public Welcome(WebDriver driver) {
		
		this.driver=driver;
	}
//**has part**	
	  By my=By.linkText("My Account");
	  
	  
//**does part**
	  public void clickMy()
	  {
		 driver.findElement(my).click();
	  }	

}
