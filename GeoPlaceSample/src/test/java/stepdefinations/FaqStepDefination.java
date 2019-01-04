package stepdefinations;

import java.util.NoSuchElementException;

import org.junit.Assert;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.HomePage;
import pageobjects.SupportPage;
import resources.Base;

public class FaqStepDefination extends Base {
	
	HomePage homePage;
	SupportPage supportPage;
	
	@Given("^Initialize the browser with \"([^\"]*)\"$")
	public void initialize_the_browser_with(String browser) throws Throwable {
	    	
		driver = initilizeDriver(browser);
	   
	}

	@Given("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_site(String url) throws Throwable {
	   
	   driver.get(url);
	   
	}

	@When("^Navigate to FAQs link under Support tab$")
	public void navigate_to_FAQs_link_under_Support_tab() throws Throwable {
	        
		homePage = new HomePage(driver);
		try {
			
			homePage.navigateToFaq();
			
		}
		catch(NoSuchElementException e) {
			
			//homePage.navigateToFaq(); //Try again to locate element
			System.out.println("Timeout: was not able to locate element");
			
		}
		
	}
	
	
	@When("^Select faq category \"([^\"]*)\" from dropdown$")
	public void select_faq_category_from_dropdown(String category) throws Throwable {
	    		
		supportPage = new SupportPage(driver);
	    supportPage.faqCategory().selectByVisibleText(category);
		
	}


	@Then("^Corresponding \"([^\"]*)\" checkbox should be checked on left hand side\\.$")
	public void corresponding_checkbox_should_be_checked_on_left_hand_side(String category) throws Throwable {
	   
		supportPage = new SupportPage(driver);
		Assert.assertTrue("Verification failed",supportPage.checkbox(category).isSelected());
	    
	}
	
	@After public void cleanUp() {
		
		driver.close();
		
	}


}
