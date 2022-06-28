package workingwithelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssertTrueTest {

	ChromeDriver driver;
	@BeforeTest
	public void openrl() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\sandy\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/login");
	}
	@Test
	public void loginScreen() {
		WebElement usertxt =driver.findElement(By.id("username"));
		WebElement passtxt =driver.findElement(By.id("password"));
		WebElement buttonlogin =driver.findElement(By.className("radius"));
		
		usertxt.clear();
		usertxt.sendKeys("tomsmith");
		passtxt.clear();
		passtxt.sendKeys("SuperSecretPassword!");
		buttonlogin.click();
		WebElement scessfullogin =driver.findElement(By.id("flash"));
		System.out.println(scessfullogin.getText());
		Assert.assertTrue(scessfullogin.getText().contains("You logged into"));
	}
	
}
