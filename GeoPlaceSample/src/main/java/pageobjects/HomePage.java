package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import resources.Base;

public class HomePage extends Base {
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By supportTab = By.id("item_58");
	By faqLink = By.xpath("(//a[@href = 'https://www.geoplace.co.uk/helpdesk/faqs'])[2]");
	 
	public void navigateToFaq() {
		
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(supportTab)).moveToElement(driver.findElement(faqLink)).click().build().perform();
		
	}
	

}
