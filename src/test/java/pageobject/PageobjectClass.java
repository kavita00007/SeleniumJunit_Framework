package pageobject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PageobjectClass {
	
	private static final Logger logger = LogManager.getLogger(PageobjectClass.class);


	
	private By searchbox = By.id("twotabsearchtextbox");
	private By searchbutton = By.xpath("//input[@value='Go']");
	private By hamburger_menulink =  By.id("nav-hamburger-menu");
	private By logo =  By.xpath("//a[@class='nav-logo-link']");
	private By cart =  By.id("nav-cart");
	private By prime =  By.id("nav-link-prime");
	private By orders =  By.id("nav-orders");
	private By account =  By.id("nav-link-accountList");
	
	private String hamburger_menu_xpath =  "//div[@id='hmenu-content']//div[text()='%s']";
	private String hamburger_sub_category_xpath =  "//div[@id='hmenu-content']//a[text()='%s']";
	private WebDriver driver;
	
	public PageobjectClass(WebDriver driver) {
		this.driver=driver;
	}
	
	public void SetSearchTextBox(String text) {
		driver.findElement(searchbox).sendKeys(text);
		logger.info("Value enetered in search box: " + text);

	}
	
	public void ClickOnSearchButton() {
		driver.findElement(searchbutton).click();
		logger.info("Clicked on Search Button");

	}

	public void ClickOnHamburgerMenuButton() {
		driver.findElement(hamburger_menulink).click();
		logger.info("Clicked on Hamburger Menu Button");

	
}
	
	public void ClickOnHamburgerMenuProductCategoryLink(String linkText) {
		By byElement = By.xpath(String.format(hamburger_menu_xpath,linkText));
		driver.findElement(byElement);
		logger.info("Clicked on Hamburger Menu Category link: " + linkText);

	}
	
	public void ClickOnHamburgerMenuProductSubCategoryLink(String linkText) {
		By byElement = By.xpath(String.format(hamburger_sub_category_xpath,linkText));
		driver.findElement(byElement).click();
		logger.info("Clicked on Hamburger Menu SubCategory link: " + linkText);

	}

	public void validateHamBurgerMenuIsDisplayed() {
		boolean b = driver.findElement(hamburger_menulink).isDisplayed();
		Assert.assertEquals("Hamburger menu Link",true, b);
	}

	public void validateAmazonLogo() {
		boolean b = driver.findElement(logo).isDisplayed();
		Assert.assertEquals("Navigation link logo",true, b);
	}
	public void validatePageTitleMatch(String expectedTitle) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Boolean b = wait.until(ExpectedConditions.titleContains(expectedTitle));
		Assert.assertEquals("Title Validation",true, b);
		logger.info("Page title matched: " + expectedTitle );

	}
	
	
	public void validateElementPresentInHeaderSection(String text) throws Exception {
		boolean b=false;

		switch(text.toLowerCase().trim()) {

		case "hamburger menu":
			b = driver.findElement(hamburger_menulink).isDisplayed();
			break;
		case "amazon prime logo":
			b = driver.findElement(logo).isDisplayed();
			break;
		case "accounts and list link":
			b = driver.findElement(account).isDisplayed();
			break;
		case "return and orders":
			b = driver.findElement(orders).isDisplayed();
			break;
		case "your prime link":
			b = driver.findElement(prime).isDisplayed();
			break;
		case "cart link":
			b = driver.findElement(cart).isDisplayed();
			break;
		case "search text box":
			b = driver.findElement(searchbox).isDisplayed();
			break;
		default:
			logger.fatal("Header Link Description is not present in the case. Please add link description first.");
			throw new Exception("Header Link Description is not present in the case. Please add link description first.");
		}

		if (b) 
		{
			logger.info("Header Link is displayed: " + text);
            Assert.assertEquals("Header Link displayed",true, b);
		}
		else 
		{
			logger.fatal("Header Link is not displayed: " + text);
			Assert.fail("Header Link is not displayed: " + text);
		}

	}

}