package testcases;

import org.openqa.selenium.WebDriver;

public class TestBaseClass {
	
	protected WebDriver driver;
    protected final static String url = "https://amazon.in";
    protected final static int implicit_wait_timeout_in_sec = 20;

}
