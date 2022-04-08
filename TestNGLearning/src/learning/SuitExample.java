package learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class SuitExample {
	
	WebDriver driver;
	long startTime;
	long endTime;
	long totalTime;
	
	// Aim open google chrome method
	// open google, open bing, open yahoo
	
	@BeforeSuite
	public void launchBrowser() {
		
		startTime = System.currentTimeMillis();
		
		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = (WebDriver) new ChromeDriver();	
	}
	
	@Test
	public void openGoogle() {
		
		driver.get("https://www.google.com");
	}
	
	@Test
	public void openBing() {
		
		driver.get("https://www.bing.com");	
	}
	
	@Test
	public void openYahoo() {
		
		driver.get("https://www.yahoo.com");	
	}
	
	@AfterSuite
	public void closeBrowser() {
		
		//Close Browser
		driver.quit();
		
		endTime = System.currentTimeMillis();
		totalTime = endTime-startTime;
		System.out.println("Total Time Taken:"+totalTime);
	}
	

}
