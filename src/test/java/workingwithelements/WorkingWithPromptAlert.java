package workingwithelements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithPromptAlert { 
ChromeDriver driver;
	
	@BeforeTest
	public void openrl() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\sandy\\chromedriver.exe");
		driver =new ChromeDriver();
		
		driver.navigate().to("http://cookbook.seleniumacademy.com/Alerts.html");
	}
	@Test
	public void testPrompetAlert() throws InterruptedException
	{  WebElement prompetbut= driver.findElement(By.id("prompt"));
	prompetbut.click();
	Thread.sleep(2000);
	Alert alert =driver.switchTo().alert();
	
	alert.sendKeys("ENG Sara");
	alert.accept();
	Thread.sleep(2000);

	WebElement message=driver.findElement(By.id("prompt_demo"));
	Assert.assertEquals("Hello ENG Sara! How are you today?", message.getText());
	
} 
	}
