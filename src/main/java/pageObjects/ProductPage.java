package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
	
	
	public WebDriver driver;
	
	By selectSize = By.cssSelector(".occ-chevron");
	By uk3 = By.xpath("//a[contains(text(), 'EU 36')]");
	By addToBag = By.cssSelector("#addToCartButton");
	By cart = By.cssSelector("a[href='/cart']");
	By productName = By.cssSelector("#CC-prodDetails-displayName");
	By selectedSize = By.cssSelector(".occ-selected-value");
	By dropdown = By.cssSelector(".dropdown");
	By price = By.cssSelector(".product-price");
	
	
	
			
	
public ProductPage(WebDriver driver) {
	this.driver = driver; 
	
}
	
public WebElement getSizes() {
	
	return driver.findElement(selectSize); 
}

public WebElement getUK3() {
	
	return driver.findElement(uk3); 
}

public WebElement getAddToBag() {
	
	return driver.findElement(addToBag); 
}

public WebElement getViewCart() {
	
	return driver.findElement(cart); 
}

public WebElement getProductName() {
	
	return driver.findElement(productName); 
}

public WebElement getSelectedSize() {
	
	return driver.findElement(selectedSize); 
}

public List<WebElement> getDropdown() {
	
	return driver.findElements(dropdown);
}

public WebElement getPrice() {
	
	return driver.findElement(price); 
}
	
	

}
