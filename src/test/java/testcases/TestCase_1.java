package testcases;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase_1 {
	
	WebDriver driver;
	String url= "https://traveltriangle.com/";
	
	
	@Before
	public void browser_setup() {
		
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	@Test
	public void Check_website() {
		
		driver.get(url);
        String expected = "Personalized Holiday Packages | Customized Tour Packages from multiple local and trusted travel agents";
        String actual =driver.getTitle();
        Assert.assertEquals("Page validation",expected,actual);
		
	}
     
	@After
	public void clean_up() {
		driver.quit();
	}
}
