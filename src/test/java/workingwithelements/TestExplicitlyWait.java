package workingwithelements;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
public class TestExplicitlyWait {
ChromeDriver driver;
	
	@BeforeTest
	public void openUrl() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\sandy\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
	}

@Test
 public void testexplicitlywait() {
	WebElement query=driver.findElement(By.name("q"));
	query.sendKeys("Selenium Webelement");
	query.submit();
	WebDriverWait wait = new WebDriverWait(driver, 20);
	
	wait.until(ExpectedConditions.titleContains("Selenium"));
	AssertJUnit.assertTrue(driver.getTitle().toLowerCase().startsWith("selenium"));
}
}
