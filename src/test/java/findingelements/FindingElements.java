package findingelements;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindingElements {
	
	FirefoxDriver driver;
	@BeforeTest
	public void openURL()
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Sources\\geckodriver.exe");
		driver =new FirefoxDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		
	}
	@Test
	public void testbrowsercommands() { 
		driver.navigate().to("https://the-internet.herokuapp.com/login");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
	}
	@AfterTest
	public void closeurl()
	{
		driver.quit();
	}
}
