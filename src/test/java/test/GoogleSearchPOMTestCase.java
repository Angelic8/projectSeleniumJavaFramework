package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.GoogleSearchPOM;

public class GoogleSearchPOMTestCase {

	private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		
		googleSearchTest();
		
	} // end main method

	public static void googleSearchTest() throws InterruptedException {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver1.exe");
		driver = new ChromeDriver();
	
		// calls this class instance variable; the format is the same as the GoogleSearchPOM constructor
		GoogleSearchPOM searchPageObj = new GoogleSearchPOM(driver);	 
	
		// call the browser
		driver.get("https://www.google.com/");
		
		searchPageObj.setTextInSearchBox("James");
		searchPageObj.clickSearchButton();
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		
	} //  end method googleSearchTest()
	
} // end class GoogleSearchPOMTestCase
