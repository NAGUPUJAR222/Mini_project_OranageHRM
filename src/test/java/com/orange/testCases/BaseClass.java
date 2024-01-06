package com.orange.testCases;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
public static WebDriver driver;
	
	
	@BeforeMethod
	@Parameters("browser")
	public void LauchBrowser( @Optional("chrome")String browser)
	{
		if (browser.equals("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("Chrome Browser  is launched");
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}
		
		else if (browser.equals("firefox")) 
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("Firefox  Browser is launched");
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}
		
		else if (browser.equals("ie")) 
		{
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("Inter Explorer Browser is Launched");
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
		}
		
		
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	


}
