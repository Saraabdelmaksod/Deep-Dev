package findingelements;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElementException {
	ChromeDriver driver;
	@BeforeTest
	public void openURL()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Sources\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/login");
	}
	@Test
	public void findelementbyname()
	{
		try {WebElement passwordtxt= driver.findElement(By.name("password11"));
		System.out.println(passwordtxt.getTagName());
		WebElement usertxt= driver.findElement(By.name("username"));
		System.out.println(usertxt.getTagName());
		
			
		}
		catch (NoSuchElementException e) {
			System.out.println("the element not found please use another attribute");
		}
		
		
	}
	 @AfterTest
	 public void closeWebsite()
		
		  {
			driver.quit();
			
	      }

}
