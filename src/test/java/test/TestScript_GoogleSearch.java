package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript_GoogleSearch {

	public static void main(String[] args) throws InterruptedException {

		googleSearch();

	} // end main method

	public static void googleSearch() throws InterruptedException {

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		WebElement textBox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		textBox.sendKeys("James");
		textBox.submit();

		Thread.sleep(3000);
		driver.close();
		driver.quit();
	} // end method googleSearch()

} // end class TestScript_GoogleSearch
