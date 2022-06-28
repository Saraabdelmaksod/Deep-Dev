package workingwithelements;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCookie {
ChromeDriver driver;
	
	@BeforeTest
	public void openUrl() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\sandy\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.navigate().to("http://magento-demo.lexiconn.com/");
	}

	@Test
	public void testCookie() {
		WebElement languageSelect =driver.findElement(By.id("select-language"));
		Select select =new Select(languageSelect) ;
		Assert.assertEquals("English", select.getFirstSelectedOption().getText());
		Cookie storeCookie= driver.manage().getCookieNamed("store");
		Assert.assertEquals(null, storeCookie);
		
		select.selectByVisibleText("German");
		 storeCookie= driver.manage().getCookieNamed("store");
		 
			Assert.assertEquals("german", storeCookie.getValue());
			System.out.println(storeCookie.getValue());
			Set<Cookie> cookies=driver.manage().getCookies();
			System.out.println("Num of Cookies :" +cookies.size() );
			Iterator<Cookie> iterat =cookies.iterator();
			while (iterat.hasNext()) {
				Cookie cookie =iterat.next();
				System.out.println(cookie.getDomain() );
				System.out.println(cookie.getName() );
				System.out.println(cookie.getPath() );
				System.out.println(cookie.getPath());
				System.out.println(cookie.getExpiry() );
					}
			
		
	}
}
