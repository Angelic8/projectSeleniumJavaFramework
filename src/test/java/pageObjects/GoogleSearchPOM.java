package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPOM {

	WebDriver driver = null;	// null to save memory
	
	By textbox_search = By.name("q");

	By button_search = By.name("btnK");

	public GoogleSearchPOM(WebDriver driver) {
		
		this.driver = driver;
		
	} // end constructor GoogleSearchPOM

	// search text actions
	public void setTextInSearchBox(String text) {

		driver.findElement(textbox_search).sendKeys(text);
		
	} // end method setTextInSearchBox()

	// search button actions
	public void clickSearchButton() {
		
		driver.findElement(button_search).submit();
		
	} // end method clickSearchButton()
	
	
} // end class GoogleSearchPOM
