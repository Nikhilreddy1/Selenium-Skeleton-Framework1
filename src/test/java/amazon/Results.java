package amazon;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.util.Strings;

import pageObjects.AmazonResultsPage;
import resources.base;

public class Results extends base {
	public WebDriver driver;

	@BeforeTest
	public void initialize(WebDriver driver) throws IOException {
		driver = initializeDriver();
	}

	@Test
	public void results()
	{
		AmazonResultsPage arp = new AmazonResultsPage(driver);
		for(int i=0;i<arp.results.size();i++)
		{
			String title = arp.results.get(i).getText();
			System.out.println(title);
			if(title.equalsIgnoreCase(("Apple iPhone 11 (128GB)")))
			{
				arp.results.get(i).click();
				switchwindows();
			}
			else
			{
				System.out.println("Item not found");
			}
		}
	}

	private WebDriver switchwindows() {
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentID = it.next();
		String childID = it.next();
		return driver.switchTo().window(childID);	
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
