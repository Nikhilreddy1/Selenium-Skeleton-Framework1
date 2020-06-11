package amazon;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.AmazonHomePage;
import pageObjects.AmazonLoginPage;
import resources.base;

public class Homepage extends base{
	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
	}
	@Test
	public void HomePageNavigation() throws InterruptedException
	{
		driver.get(prop.getProperty("url"));
		AmazonHomePage amp = new AmazonHomePage(driver);
		//amp.AccountList.click();
		/*
		AmazonLoginPage alp = new AmazonLoginPage(driver);
		alp.email.sendKeys(prop.getProperty("email"));
		alp.continuee.click();
		alp.pswd.sendKeys(prop.getProperty("pswd"));
		alp.Login.click();
		*/
		//Actions a = new Actions(driver);
		//a.moveToElement(amp.AccountList).build().perform();
		amp.SearchBox.sendKeys(prop.getProperty("searchItem"));
	}
	@AfterTest
	public void teardown() 
	{
		//driver.close();
	}

}
