package workingwithelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Firfox {
	FirefoxDriver driver;
	@BeforeTest
	public void openURL()
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Sources\\geckodriver.exe");
		driver =new  FirefoxDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/login");
	}
	@Test
	public void loginscreen()
	{

		WebElement usertxt= driver.findElement(By.id("username"));
		WebElement passwordtxt= driver.findElement(By.id("password"));
		WebElement btnlogin=driver.findElement(By.className("radius"));
		usertxt.clear();
		usertxt.sendKeys("tomsmith");
		
		passwordtxt.clear();
		passwordtxt.sendKeys("SuperSecretPassword!");
	
		btnlogin.click();
	}
	 @AfterTest
	 public void closeWebsite()
		
		  {
			driver.quit();
			
	      }

}
