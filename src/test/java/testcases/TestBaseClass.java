package testcases;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import testcases.webdriverfactory.WebDriverFactory;

public class TestBaseClass {
	
	protected WebDriver driver;
    protected final static String url = "https://amazon.in";
    protected final static int implicit_wait_timeout_in_sec = 20;
    
    @Before
    public void browser_setup() {
    	try{
            driver = WebDriverFactory.getbrowser("chrome");
        }catch(Exception e){
            e.printStackTrace();
            Assert.fail("Incorrect Browser Sent. Check the Stack Trace");
        }
	 }
	 
    @After
	public void clean_up() {
		driver.quit();
	}

}
