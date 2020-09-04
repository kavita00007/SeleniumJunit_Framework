package testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import pageobject.PageobjectClass;

public class TestCase_2_Advc extends TestBaseClass{
    private static final Logger logger = LogManager.getLogger(TestCase_2_Advc.class);

	 @Test
	    public void t_02_search_for_product() {
		 
	        logger.info("Test case started: t_02_search_for_product");


	        driver.get(url);

	        PageobjectClass po = new PageobjectClass(driver);
	        po.validatePageTitleMatch(PageTitle);

	        po.SetSearchTextBox("Mobile");
	        po.ClickOnSearchButton();
	        po.validatePageTitleMatch("Amazon.in : Mobile");
	        
	        logger.info("Test case Ended: product searched.");

	        
	    }

}
