package testcases;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.After;
import org.junit.Assert;
public class TestCase_1 extends TestBaseClass{
	
	
	   @Before
       public void browser_setup() {
		
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(implicit_wait_timeout_in_sec, TimeUnit.SECONDS);

	   }
	   
	   @Test
		public void Check_website() {
			
			driver.get(url);
	        String expected = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	        String actual =driver.getTitle();
	        Assert.assertEquals("Page validation",expected,actual);
			
		}
	   
	   @After
		public void clean_up() {
			driver.quit();
		}
	   

}