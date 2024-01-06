package com.orange.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	 public static WebDriver driver=null;
	 public LoginPage(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 
	@FindBy(name="username")
	WebElement untbx;
	
	@FindBy(name="password")
	WebElement pwtbx;
	
	@FindBy(xpath="//button[.=' Login ']")
	WebElement lgbtn;
	
	public void setLogin(String un, String pwd)
	{
		untbx.sendKeys(un);
		pwtbx.sendKeys(pwd);
		lgbtn.click();
	}

}
