package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SneakersPage {
	
	
	public WebDriver driver;
	
	By firstItem = By.xpath("//div[@class='product-image']");
	By allItems = By.xpath("//div[contains(@class, 'items-wrapper')]/div");
	//By allItems = By.cssSelector(".product-image");
	By closeCookies = By.cssSelector(".btn-close");
	
	
	
	
			
	
public SneakersPage(WebDriver driver) {
	this.driver = driver; 
	
}
	
public WebElement getItem1() {
	
	return driver.findElement(firstItem); 
}

public List<WebElement> getAllItems() {
	
	return driver.findElements(allItems); 
}

public WebElement getCloseCookies() {
	
	return driver.findElement(closeCookies); 
}
	
	

}
