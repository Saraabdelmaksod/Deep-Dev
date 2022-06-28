package workingwithelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingwithDropdownList {
	ChromeDriver driver;
	@BeforeTest
	public void openURL()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\sara\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/dropdown");
	}
	
	@Test
	public void testDropdownList()
	{
        WebElement options=driver.findElement(By.id("dropdown"));
        Select optionlist= new Select(options);
        Assert.assertFalse(optionlist.isMultiple());
       Assert.assertEquals(3, optionlist.getOptions().size());
       optionlist.selectByVisibleText("Option 2");
       optionlist.selectByVisibleText("Option 1");
        }
	 @AfterTest
	 public void closeurl( ) {
		 driver.quit();
	 }
}
