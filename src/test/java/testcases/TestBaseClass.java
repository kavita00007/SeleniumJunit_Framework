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
    protected final static String PageTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";

    private String getBrowserName(){
        String browserDefault = "firefox";
        String browserSentFromCmd = System.getProperty("browser");

        if (browserSentFromCmd==null){
            return browserDefault;
        }else{
            return browserSentFromCmd;
        }
    }
    
    @Before
    public void browser_setup() {
    	
        String browser = getBrowserName();

    	try{
            driver = WebDriverFactory.getbrowser(browser);
        }catch(Exception e)
    	{
            e.printStackTrace();
            Assert.fail("Incorrect Browser Sent");
        }
	 }
	 
    @After
	public void clean_up() {
		driver.quit();
	}

}
