package testcases;

import org.junit.Test;

import pageobject.PageobjectClass;

public class TestCase_2_Advc extends TestBaseClass{
	 @Test
	    public void t_02_search_for_product() {

	        driver.get(url);

	        PageobjectClass po = new PageobjectClass(driver);
	        po.validatePageTitleMatch(PageTitle);

	        po.SetSearchTextBox("Mobile");
	        po.ClickOnSearchButton();
	        po.validatePageTitleMatch("Amazon.in : Mobile");
	        
	    }

}
