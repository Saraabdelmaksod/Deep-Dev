package workingwithelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithCheckBoxes { 
	ChromeDriver driver;
	@BeforeTest
	public void openrl() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\sara\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
	}
	@Test 
	public void testcheckboxes()
	{
		//WebElement check1=driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
		//check1.click();
		WebElement check2=driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
		if (check2.isSelected()) {
			
			check2.click();

		}
	}

}
