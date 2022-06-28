package workingwithelements;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestWebTable {
	
	ChromeDriver driver;
	@BeforeTest
	public void openURL()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\sara\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/tables");
}
     @Test
     public void webTableTest()
     {
    	 WebElement webtable =driver.findElement(By.id("table1"));
    	 List<WebElement> rows=webtable.findElements(By.tagName("tr"));
    	 assertEquals(5, rows.size());
    	for (WebElement row : rows) {
    		List<WebElement>  cols =row.findElements(By.tagName("td"));
    		for (WebElement col : cols) {
    			System.out.println(col.getText()+"\t");
    		                             }
			System.out.println();

    		}
    	 
     }
	
}

