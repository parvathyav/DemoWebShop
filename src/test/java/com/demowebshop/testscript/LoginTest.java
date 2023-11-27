package com.demowebshop.testscript;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.demowebshop.automationcore.Base;
import com.demowebshop.pages.HomePage;
import com.demowebshop.pages.LoginPage;
import com.demowebshop.utilities.ExcelUtility;

public class LoginTest extends Base {
	
	HomePage home;
	LoginPage login;
	@Test(priority=1,enabled=true,description="tc_001 verifyValidLogin",groups= {"Sanity"})
	
	public void tc_003_verifyValidLogin() 
		{
		List<ArrayList<String>>data=ExcelUtility.excelDataReader("LoginPage");
		String username=data.get(1).get(1);
		String password=data.get(2).get(1);
		home=new HomePage(driver);
		login=home.clickOnLoginLink();
		login.enterUserEmailID(username);
		login.enterUserPassword(password);
		}
	
	

}
