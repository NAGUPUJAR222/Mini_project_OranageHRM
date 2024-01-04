import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autosugg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("java");
		List<WebElement> auto = driver.findElements(By.xpath("//div[contains(@aria-label,'java')]"));
		int count = auto.size();
		System.out.println(count);
		for (int i = 0; i <=count; i++)
		{
			String text = auto.get(i).getText();
			System.out.println(text);
			
		}
		
		

	}

}
