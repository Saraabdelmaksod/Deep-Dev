package findingelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithSubmitMethod {
	ChromeDriver driver;
	WebElement txtsearch;
	@BeforeTest
	public void openURL()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\sara\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
	}
	@Test
	public void testsubmit()
	{
	    txtsearch= driver.findElement(By.name("q"));
		txtsearch.clear();
		txtsearch.sendKeys("Selenuim Webdriver");
		txtsearch.submit();
	    txtsearch= driver.findElement(By.name("q"));
	    txtsearch.clear();
		txtsearch.sendKeys("Selenuim WebDriver Book");
		txtsearch.submit();	
	}
	
	
	
	@AfterTest
	public void closeurl()
	{
		driver.quit();
	}

}
