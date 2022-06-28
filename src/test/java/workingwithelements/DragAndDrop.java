package workingwithelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDrop { 
	ChromeDriver driver;
	@BeforeTest
	public void openrl() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\sandy\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.navigate().to("http://cookbook.seleniumacademy.com/DragDropDemo.html");
	}
	@Test
	public void testDragAndDrop()
	{
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		Actions builder= new Actions(driver);
		
		builder.dragAndDrop(source, target).perform();
		Assert.assertEquals("Dropped!", target.getText());
		
	}

}
