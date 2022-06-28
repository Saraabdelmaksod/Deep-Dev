package workingwithelements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithConfirmAlert {
ChromeDriver driver;
	
	@BeforeTest
	public void openUrl() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\sandy\\chromedriver.exe");
		driver =new ChromeDriver();
		
		driver.navigate().to("http://cookbook.seleniumacademy.com/Alerts.html");
	}
	@Test(priority = 1)
	public void confirmalert () {
		WebElement confirmbtn =driver.findElement(By.id("confirm"));
		confirmbtn.click();
		Alert alert =driver.switchTo().alert();
		alert.accept();
		WebElement message = driver.findElement(By.id("demo"));
		Assert.assertEquals("You Accepted Alert!", message.getText());
		
		
	}
	@Test(priority = 2)
	public void dismissalert () {
		WebElement confirmbtn =driver.findElement(By.id("confirm"));
		confirmbtn.click();
		Alert alert =driver.switchTo().alert();
		alert.dismiss();
		WebElement message = driver.findElement(By.id("demo"));
		Assert.assertEquals("You Dismissed Alert!", message.getText());
		

}
	}
