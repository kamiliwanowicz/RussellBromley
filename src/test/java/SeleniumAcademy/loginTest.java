package SeleniumAcademy;

import java.io.IOException;
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
import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class loginTest extends base{
	
	
	
	
	@Test
	public void basePageNavigation() throws IOException, InterruptedException {
		
		driver = initializeDriver(); 
		driver.get(prop.getProperty("url"));
		
		
		LandingPage l = new LandingPage(driver);
		LoginPage lp = new LoginPage(driver);
		
		
		//login process
		l.getSignIn().click();
		lp.enterEmail().sendKeys(login1());
		lp.enterPassword().sendKeys(password1());
		lp.pressSubmit().click(); 
		
		//wait for the element to appear
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ib-welcome")));
		
		
		//check if login successful
		Assert.assertTrue(l.getWelcome().isDisplayed()); 
		
		//close browser
		driver.close();
		
		
		
	}
	
	
	
	
}


	

