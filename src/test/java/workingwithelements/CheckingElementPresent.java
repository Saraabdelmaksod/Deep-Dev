package workingwithelements;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CheckingElementPresent {
	ChromeDriver driver;
	@BeforeTest
	public void openrl() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\sara\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
	}
	@Test
	public void testiselementpresent()
	{
		if (isElementpresent(By.xpath("//*[@id=\"checkboxes\"]/input[1]")))
	{
		WebElement check1= driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
		
		if (!check1.isSelected()) 
		{
			 
			 check1.click();
		}	
	} 
	else 
	{
		Assert.fail("check1box dose not exist");

	}
		
	}
	private boolean isElementpresent (By by) {
		try {
			driver.findElement(by);
			return true ;	
		}
		catch (NoSuchElementException e) {
			
            return false;
}
	}

}
