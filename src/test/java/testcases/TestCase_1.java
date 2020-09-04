
package testcases;

import org.junit.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
public class TestCase_1 extends TestBaseClass{
	
    private static final Logger logger = LogManager.getLogger(TestCase_1.class);

	   
	   @Test
		public void Check_website() {
		   
	        logger.info("Test case started: Website is working");
			
			driver.get(url);
	        String expected = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	        String actual =driver.getTitle();
	        Assert.assertEquals("Page validation",expected,actual);
	        logger.info("Page Title validation successfull. Expected and actual text matched. Text: " + actual );
	        logger.info("Test case Ended: t_01_check_website_is_working");
			
		}
	   
}