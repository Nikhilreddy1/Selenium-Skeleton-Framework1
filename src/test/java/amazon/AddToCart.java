package amazon;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.AmazonAddToCart;
import pageObjects.AmazonHomePage;
import pageObjects.AmazonLoginPage;
import resources.base;

public class AddToCart extends base{
	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
	}
	@Test
	public void HomePageNavigation() throws InterruptedException
	{
		AmazonAddToCart atc = new AmazonAddToCart(driver);
		atc.AddToCart.click();
		atc.cart.click();
		atc.proceedToCheckOut.click();
	}
	@AfterTest
	public void teardown() 
	{
		//driver.close();
	}

}
