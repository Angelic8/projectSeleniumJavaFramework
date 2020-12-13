package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.GoogleSearchPage;

public class GoogleSearchTest {

	private static WebDriver driver = null;
	private static String projectPath;
	
	public static void main(String[] args) throws InterruptedException {

		googleSearch();

	} // end main method

	public static void googleSearch() throws InterruptedException {

		// location of the project
		projectPath = System.getProperty("user.dir");
		
		// location of the chrome driver executable file
		System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver1.exe");
		
		driver = new ChromeDriver();

		// go to the website
		driver.get("https://www.google.com/");

		// enter the text in the search textbox
		GoogleSearchPage.textbox_search(driver).sendKeys("James");
		
		// click the search button
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
		// Sleep
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		
	} // end method googleSearch()	
	
} // end class GoogleSearchTest
