package workingwithelements;

import static org.testng.Assert.assertEquals;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestMltibleWindows { 
ChromeDriver driver;
	
	@BeforeTest
	public void openUrl() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\sandy\\chromedriver.exe");
		driver =new ChromeDriver();
		
		driver.navigate().to("http://cookbook.seleniumacademy.com/Config.html");
	}
@Test(priority = 1)
public void testWindowUsingTitle() {
	//store windowhandle of current window
	String currentwindowID =driver.getWindowHandle();
	driver.findElement(By.id("visitbutton")).click();
	for (String windowID :driver.getWindowHandles()) {
		
		String title=driver.switchTo().window(windowID).getTitle();
		if(title.equals("Visit Us"))
        { 
			assertEquals("Visit Us", driver.getTitle());
			driver.close();
			break;	
		}
	}
	driver.switchTo().window(currentwindowID);
}
@Test(priority = 2)
public void testWindowUsingName() {
	//store windowhandle of current window
	String currentwindowID =driver.getWindowHandle();
	driver.findElement(By.id("helpbutton")).click();
	driver.switchTo().window("HelpWindow");
	assertEquals("Help", driver.getTitle());
	System.out.println(driver.getTitle());
	driver.close();
	driver.switchTo().window(currentwindowID);
} 
}
