package testcases;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.After;
import org.junit.Assert;
public class TestCase_1 extends TestBaseClass{
	
	   
	   @Test
		public void Check_website() {
			
			driver.get(url);
	        String expected = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	        String actual =driver.getTitle();
	        Assert.assertEquals("Page validation",expected,actual);
			
		}
	   
}