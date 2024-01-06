package com.orange.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.orange.pageObject.LoginPage;
import com.orange.pageObject.admin;

public class TC_LOGINTEST extends BaseClass {

	@Test(priority = 1)
	public void verifyLogin() throws Exception
	{
         LoginPage lp=new LoginPage(driver);
         lp.setLogin("Admin", "admin123");
         System.out.println("Successfully logged in +++++++++++++++++++");

         Thread.sleep(3000);
         
         admin am=new admin(driver);
         am.adminClick();
         am.drop();
         am.titlejob();
         am.Addbtn();
         am.JobTitle();
         am.decription();
         am.Savebutton();
	
}


}
