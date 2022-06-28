package workingwithelements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithJavascriptAlert {  
	ChromeDriver driver;
	
	@BeforeTest
	public void openrl() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\sandy\\chromedriver.exe");
		driver =new ChromeDriver();
		
		driver.navigate().to("http://cookbook.seleniumacademy.com/Alerts.html");
	}
	@Test
	public void testAlert()
	{
		WebElement btnalert=driver.findElement(By.id("simple"));
		btnalert.click();
		Alert alert =driver.switchTo().alert();
		String alertText=alert.getText();
		Assert.assertEquals("Hello! I am an alert box!",alertText);

	alert.accept();
	}

}
