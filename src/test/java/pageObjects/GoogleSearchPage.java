package pageObjects;
// this tutorial is not implemented using POM
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {

	private static WebElement element = null;
	
	public static WebElement textbox_search(WebDriver driver1) {
		
		element = driver1.findElement(By.name("q"));
		return element;
		
	} // end function or method textbox_search()

	public static WebElement button_search(WebDriver driver1) {
	 	
		element = driver1.findElement(By.name("btnK"));
		return element;
	} // end method or function button_search
	
} // end class GoogleSearchPage
