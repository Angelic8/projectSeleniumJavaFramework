import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static void main(String[] args) throws InterruptedException {

		
		String projectPath = System.getProperty("user.dir");
		
		// Firefox Browser
		//System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver/geckodriver.exe");
			///System.setProperty("webdriver.firefox.marionette","C:\\Users\\Flex 2\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\geckodriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.selenium.dev/");
		
		// Chrome Driver
		System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver1.exe");	// getting the chromedriver executable
		WebDriver driver2 = new ChromeDriver();		// object for initializing the Chrome Driver
				
		driver2.get("https://www.google.com/");	// get the path of the browser
		
		WebElement textBox = driver2.findElement(By.xpath("//input[@class='gLFyf gsfi']"));	// the id element of the textbox
		
		List<WebElement> listOfInputElements = driver2.findElements(By.xpath("//input"));
		int count = listOfInputElements.size();
		System.out.println("The count of input nodes or elements is: " + count);
		
		textBox.sendKeys("James");					// used to simulate typing a value on the textbox
		textBox.submit();								// used to submit the value								
		
		Thread.sleep(3000);							// web interval
		driver2.close();							// after the interval, close the browser
		driver2.quit();								// after closing the browser, quit any associated windows
 		
		
	} // end main

} // end class BrowserTest
