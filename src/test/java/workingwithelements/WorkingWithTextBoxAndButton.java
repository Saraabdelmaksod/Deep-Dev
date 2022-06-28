package workingwithelements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithTextBoxAndButton {
	ChromeDriver driver;
	@BeforeTest
	public void openURL()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\sara\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/login");
	}
	@Test
	public void loginscreen()
	{
		WebElement usertxt= driver.findElement(By.id("username"));
		WebElement passwordtxt= driver.findElement(By.id("password"));
		WebElement btnlogin=driver.findElement(By.className("radius"));
		usertxt.clear();
		usertxt.sendKeys("tomsmith");
		
		passwordtxt.clear();
		passwordtxt.sendKeys("SuperSecretPassword!");

		btnlogin.click();
		WebElement sucessfullogin= driver.findElement(By.id("flash"));
		System.out.println(sucessfullogin.getText());
		Assert.assertTrue(sucessfullogin.getText().contains("You logged into a secure area"));
		
	}
	@AfterTest
	public void closeurl() {
		driver.quit();
	}
	
}
