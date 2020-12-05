import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static void main(String[] args) {

		
		String projectPath = System.getProperty("user.dir");
		
		// Firefox Browser
		//System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver/geckodriver.exe");
			///System.setProperty("webdriver.firefox.marionette","C:\\Users\\Flex 2\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\geckodriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.selenium.dev/");
		
		// Chrome Driver
		System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver1.exe");
		WebDriver driver2 = new ChromeDriver();
				
		driver2.get("https://www.selenium.dev/");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} // end try catch for Thread.sleep()
		
		driver2.close();
 		
		
	} // end main

} // end class BrowserTest
