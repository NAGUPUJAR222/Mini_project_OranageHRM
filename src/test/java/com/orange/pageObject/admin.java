package com.orange.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class admin {
	
	// public static WebDriver driver=null;
	
	public admin(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")
	WebElement admbtn;
	
	public void adminClick() throws Exception
	{
		admbtn.click();
		Thread.sleep(2000);
	}
	
	@FindBy(xpath="(//i[@class='oxd-icon bi-chevron-down'])[2]")
	WebElement jbsdrop;
	
	public void drop() throws Exception
	{
		jbsdrop.click();
		Thread.sleep(1000);
	}
	
	@FindBy(linkText ="Job Titles")
	WebElement jobtitle;
	
	public void titlejob() throws InterruptedException
	{
		jobtitle.click();
		Thread.sleep(2000);
	}
	
	@FindBy(xpath="(//button[@type='button'])[3]")
	WebElement addbtn;
	
	public void Addbtn() throws InterruptedException
	{
		addbtn.click();
		Thread.sleep(2000);
	}
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement titletbx;
	
	public void JobTitle() throws InterruptedException
	{
		titletbx.sendKeys("QA");
		Thread.sleep(2000);
	}
	
	@FindBy(xpath="(//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical'])[1]")
	WebElement jobdesc;
	
	public void decription() throws InterruptedException
	{
		jobdesc.sendKeys("I AM GOOD IN WRITING THE TEST CASES AND TEST SCRIPTS");
		Thread.sleep(2000);
	}
	
	@FindBy(xpath="//button[.=' Save ']")
	WebElement savebtn;
	
	public void Savebutton() throws InterruptedException
	{
		savebtn.click();
		System.out.println("successfully added jobs========");
		Thread.sleep(3000);
	}

}
