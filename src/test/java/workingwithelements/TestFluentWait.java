package workingwithelements;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.BeforeTest;

@Test
public class TestFluentWait {

ChromeDriver driver;
	
	@BeforeTest
	public void openUrl() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\sandy\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.navigate().to("http://cookbook.seleniumacademy.com/AjaxDemo.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	@Test
	public void testfluentwait() {
		driver.findElement(By.linkText("Page 4")).click();
		Wait<WebDriver> wait =new FluentWait<WebDriver>(driver).withTimeout(20,TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS) .ignoring(NoSuchElementException.class);
		
		 WebElement message = wait.until(new Function<WebDriver,WebElement>() {
			 
			 public WebElement apply(WebDriver d) {
				 return d.findElement(By.id("page4"));
			 }
			 } 
		                                 );
		
	}
		
				
} 
