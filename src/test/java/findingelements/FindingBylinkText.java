package findingelements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class FindingBylinkText {
	ChromeDriver driver;
	@BeforeTest
	public void openURL()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Sources\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/login");
	}
	
	@Test
	public void testlinktext()
	{
		WebElement seleniumlink = driver.findElement(By.linkText("Elemental Selenium"));
		
		System.out.println(seleniumlink.getAttribute("href"));
		
	}
	
	@Test
	public void partiallinktext()
	{
		WebElement seleniumlink = driver.findElement(By.partialLinkText("Elemental "));
		
		System.out.println(seleniumlink.getAttribute("href"));
		
	}
	
    @AfterTest
    public void closeWebsite()
	
	  {
		driver.quit();
		
     }
}
