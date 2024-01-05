package com.orange.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver=null;
	
	@BeforeClass
	@Parameters()
	@Test
	
	public void verifyLogin(@Optional("chrome")String browserName)
	{
		System.out.println("Parameter value is " +browserName);
		
		if (browserName.contains("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}
		 
		else if (browserName.contains("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}
		
		else if (browserName.contains("ie"))
		{
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}
}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
