package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonResultsPage {
	public WebDriver driver;

	public AmazonResultsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//div[@class='sg-row']//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']")
	public List<WebElement> results;

}
