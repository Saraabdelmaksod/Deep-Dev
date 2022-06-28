package findingelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindingElementByID {
	ChromeDriver driver;
	 @BeforeTest
	 public void openURL()
	 {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Sourses\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/login");
		 }
	  @Test
	  public void findElementsByID() {

			WebElement usertxt= driver.findElement(By.id("username"));
			WebElement passwordtxt= driver.findElement(By.id("password"));
			System.out.println(usertxt.getTagName());
			System.out.println(passwordtxt.getTagName()); 
	  }
	  @AfterTest
	  public void closeDriver()
	  {
		  driver.quit();
	  }
	  
	 

}
