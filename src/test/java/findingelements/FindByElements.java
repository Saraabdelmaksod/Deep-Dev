package findingelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindByElements {

	
	ChromeDriver driver;
	@BeforeTest
	public void openURL()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Sources\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/");
	}
	@Test
	public void testfindElements()
	{//get all the links displayed on page
	List<WebElement> links = driver.findElements(By.tagName("a"));
	//verify there are 20 links displayed on the page
	System.out.println(links.size());// to find num of links on page
	Assert.assertEquals(46, links.size());
	for (WebElement link : links) {
		System.out.println(link.getAttribute("href"));
		
		
	}

	}
	 @AfterTest
	 public void closeWebsite()
		
		  {
			driver.quit();
			
	      }
}
