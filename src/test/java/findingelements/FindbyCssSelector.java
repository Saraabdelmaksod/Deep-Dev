package findingelements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindbyCssSelector {


	ChromeDriver driver;
	@BeforeTest
	public void openURL()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Sources\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/login");
	}
	@Test
	public void findbyccsselector()
	{
	WebElement header= driver.findElement(By.cssSelector("h2"));
	WebElement loginbtn= driver.findElement(By.cssSelector("button.radius"));
	WebElement username= driver.findElement(By.cssSelector("input#username"));
	WebElement password= driver.findElement(By.cssSelector("input#password"));

	System.out.println(username.getTagName());	
	System.out.println(password.getTagName());	
	System.out.println(loginbtn.getText());	
	System.out.println(header.getText());	

	}
	 @AfterTest
	 public void closeWebsite()
		
		  {
			driver.quit();
			
	      }
	
	
	
	
	
}
