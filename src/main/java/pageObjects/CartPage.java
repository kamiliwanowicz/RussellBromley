package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	
	
	public WebDriver driver;
	
	By cartEmpty = By.xpath("//div[@id='cc-cartSummary']/h2]");
	By itemAdded = By.cssSelector(".ci-i-title");
	By sizeAdded = By.xpath("//span[text()='Size:']//following-sibling::span");
	By priceAdded = By.cssSelector(".ci-price");
	
	
	
public CartPage(WebDriver driver) {
	this.driver = driver; 
	
}
	
	
	public WebElement getcartEmpty() {
		
		return driver.findElement(cartEmpty); 
	}
	
	
	
public WebElement getItemAdded() {
		
		return driver.findElement(itemAdded); 
	}

public WebElement getsizeAdded() {
	
	return driver.findElement(sizeAdded); 
}

public WebElement getPriceAdded() {
	
	return driver.findElement(priceAdded); 
}
	
	

}
