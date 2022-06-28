package findingelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TechTest {
	
	ChromeDriver driver;
	@BeforeTest
	public void openURL()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Sources\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.navigate().to("http://test_tech1.surge.sh/");
	}
	@Test
	public void findelementbyname()
	{
		WebElement username= driver.findElement(By.name("email"));
		System.out.println(username.getTagName());
		WebElement password= driver.findElement(By.name("password"));
		System.out.println(password.getTagName());
		WebElement loginbtton= driver.findElement(By.className("submit"));
		System.out.println(loginbtton.getText());
		
		
	}
	 @AfterTest
	 public void closeWebsite()
		
		  {
			driver.quit();
			
	      }

}
