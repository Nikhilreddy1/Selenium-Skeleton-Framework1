package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {
	public WebDriver driver;

	public AmazonHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	public WebElement SearchBox;
	@FindBy(xpath="//div[@id='nav-xshop']//a[contains(text(),'Mobiles')]")
	public WebElement Mobiles;
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	public WebElement AccountList;
	
	
	
}
