package testcases.webdriverfactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
	
    private static WebDriver driver=null;
    
    public static WebDriver getbrowser( String browser) throws Exception {
    	
    	switch(browser.toLowerCase()){
        case "chrome":
            driver = new FirefoxDriver();
            break;
        case "firefox":
            driver = new FirefoxDriver();
            break;
        default:
            throw new Exception("No such browser is implemented : " + browser);
    }
    	
    	driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
    	
    }

}
