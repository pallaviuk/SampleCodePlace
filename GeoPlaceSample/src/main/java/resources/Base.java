package resources;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;

	public WebDriver initilizeDriver(String browser) {
		
		
	// Initialise the driver for the given browser
		
		if(browser.equals("chrome")) {
		
			System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		
		}
	
		else if(browser.equals("firefox")) {
		
			//Write code for driver initialization to firefox browser
		
		}
	
		else if(browser.equals("ie")) {
		
			//Write code for driver initialization to InternetExplorer browser
		
		}
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	
	}

}
