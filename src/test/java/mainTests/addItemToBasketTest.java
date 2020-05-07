package mainTests;

import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Resources.base;
import pageObjects.CartPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.ProductPage;
import pageObjects.SneakersPage;

public class addItemToBasketTest extends base{
	
	
	
	
	@Test
	public void basePageNavigation() throws IOException, InterruptedException {
		
		//initialise driver
		driver = initializeDriver(); 
		driver.get(prop.getProperty("url"));
		
		//initialise Page Objects
		LandingPage l = new LandingPage(driver);
		SneakersPage sp = new SneakersPage(driver);
		ProductPage pp = new ProductPage(driver);
		CartPage cp = new CartPage(driver);
		

		//go to product page
		l.getWomen().click();
		l.getSneakers().click();
		
		//close cookies
		sp.getCloseCookies().click();
		
		//wait for page to load
		Thread.sleep(2000);
		
		
		//select random item
		int size1 = sp.getAllItems().size();
		int randomItem = ThreadLocalRandom.current().nextInt(0, size1);
				
		sp.getAllItems().get(randomItem).click();
		
				
		//click on dropdown menu
		pp.getSizes().click();
		
		//select a random size
		int size2 = pp.getDropdown().size();
		int randomSize = ThreadLocalRandom.current().nextInt(0, size2);
		pp.getDropdown().get(randomSize).click();
		
		//store item name 
		String itemName = pp.getProductName().getAttribute("textContent");
				
		//store item size
		String itemSize = pp.getSelectedSize().getText();
		
		//store item price
		String itemPrice = pp.getPrice().getText();
		
		
		//test
		//System.out.println("Name of the item: "+itemName);
		//System.out.println("Size of the item: "+itemSize);
		//System.out.println("Price of the item: "+itemPrice);
		
		//add to bag
		pp.getAddToBag().click();
				
		//go to cart
		pp.getViewCart().click();
		
		//test
		//System.out.println(cp.getItemAdded().getText());
		//System.out.println(cp.getsizeAdded().getText());
		//System.out.println(cp.getPriceAdded().getText());
		
		//wait for cart to load
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ci-i-title")));
		
		//validate if correct item added
		Assert.assertTrue(itemName.equals(cp.getItemAdded().getText()));
		
		//validate if correct size added
		Assert.assertTrue(itemSize.equals(cp.getsizeAdded().getText()));
		
		//validate if correct price added
		Assert.assertTrue(itemPrice.equals(cp.getPriceAdded().getText()));
		
		//close browser
		driver.close();
		
		
		
		
		
		
	}
	
	
	
	
}


	

