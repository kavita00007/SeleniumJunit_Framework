package testcases;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase_2 extends TestBaseClass{
	
	
	 @Test
		public void Check_website() {
			
			driver.get(url);
	        String expected = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	        String actual =driver.getTitle();
	        Assert.assertEquals("Page validation",expected,actual);
	        
	        WebDriverWait webDriverWait = new WebDriverWait(driver,20);
	        WebElement element = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));

	        element.sendKeys("Mobiles");
	        driver.findElement(By.xpath("//input[@value='Go']")).click();
	        
	        WebDriverWait Wait = new WebDriverWait(driver,20);
	        Wait.until(ExpectedConditions.titleIs("Amazon.in : Mobiles"));

	        Assert.assertEquals("Page Title validation","Amazon.in : Mobiles", driver.getTitle());
	        System.out.println("Page title : " +driver.getTitle());
	 }

	 
	
}
