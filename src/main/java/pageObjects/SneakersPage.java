package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SneakersPage {
	
	
	public WebDriver driver;
	
	By firstItem = By.xpath("//div[@class='product-image']");
	By allItems = By.cssSelector(".product-image");
	
	
	
	
			
	
public SneakersPage(WebDriver driver) {
	this.driver = driver; 
	
}
	
public WebElement getItem1() {
	
	return driver.findElement(firstItem); 
}

public List<WebElement> getAllItems() {
	
	return driver.findElements(allItems); 
}
	
	

}
