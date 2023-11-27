package com.demowebshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.demowebshop.utilities.TestHelperUtility;

public class UserAccountPage extends TestHelperUtility {
	
	public WebDriver driver;
	
	public UserAccountPage(WebDriver driver) 
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
			
		}
}
