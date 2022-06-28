package findingelements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindelementByXpath {
	
	FirefoxDriver driver;
	
	@BeforeTest
	public void openURL()
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Sources\\geckodriver.exe");
		driver =new FirefoxDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/login");
	}
	@Test
	public void testfindElements()
	{
       WebElement username =driver.findElement(By.xpath("//*[@id=\"username\"]"));
       WebElement password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
       WebElement loginbutton=driver.findElement(By.xpath("//*[@id=\"login\"]/button/i"));
       System.out.println(username.getTagName());
       System.out.println(password.getTagName());
       System.out.println(loginbutton.getText());
	}
	 @AfterTest
	 public void closeWebsite()
		  {
			driver.quit();
	      }
	

}
