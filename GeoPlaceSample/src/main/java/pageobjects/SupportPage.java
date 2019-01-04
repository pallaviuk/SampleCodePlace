package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import resources.Base;

public class SupportPage extends Base {
	
	public WebDriver driver;
	
	//Constructor for driver initialization to Local
	
	public SupportPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//FAQ - Properties (WebElements)
	
	By faqLink = By.xpath("(//a[text()=' FAQs '])[1]");
	By faqDropdown = By.className("faq-filter");
	By checkboxAddresses = By.xpath("//input[@data-val = '36095']");
	By checkboxStreets = By.xpath("//input[@data-val = '36096']");
	By checkboxShowAll = By.xpath("//input[@data-val ='all']"); 
	
	
	//FAQ - Methods
	
	public WebElement faq() {
		
		return driver.findElement(faqLink);
		
	}
	
	public Select faqCategory() {
		
			
			return new Select(driver.findElement(faqDropdown));
		}
	
	
	public WebElement checkbox(String arg1) {
		
		if (arg1.equals("Streets")) {
			
		return driver.findElement(checkboxStreets);
		
		}
		
		else if(arg1.equals("Addresses")) {
			
			return driver.findElement(checkboxAddresses);
			
		}
					
			return driver.findElement(checkboxShowAll);
			
	}
	
}
