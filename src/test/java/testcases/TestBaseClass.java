package testcases;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBaseClass {
	
	protected WebDriver driver;
    protected final static String url = "https://amazon.in";
    protected final static int implicit_wait_timeout_in_sec = 20;
    
    @Before
    public void browser_setup() {
		
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(implicit_wait_timeout_in_sec, TimeUnit.SECONDS);
	 }
	 
    @After
	public void clean_up() {
		driver.quit();
	}

}
