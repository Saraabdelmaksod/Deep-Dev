package workingwithelements;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestImplicitlyWait {  
ChromeDriver driver;
	
	@BeforeTest
	public void openUrl() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\sandy\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.navigate().to("http://cookbook.seleniumacademy.com/AjaxDemo.html");
	}

@Test
 public void testimplicitywait() {
	//set the implicity wait
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//find element then click on it
	driver.findElement(By.linkText("Page 4")).click();
	//find message(element)appear when click on page 4
	WebElement message=driver.findElement(By.id("page4"));
	assertTrue(message.getText().contains("Nunc nibh tortor,"));
	
}
}
