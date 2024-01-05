package com.orange.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.orange.pageObject.LoginPage;

public class TC_LOGINTEST extends BaseClass {

	@Test
	public void verifyLogin()
	{
         LoginPage lp=new LoginPage(driver);
         lp.setLogin("Admin", "admin123");


	
}
}
