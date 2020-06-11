package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonAddToCart {
	public WebDriver driver;

	public AmazonAddToCart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='add-to-cart-button']")
	public WebElement AddToCart;
	@FindBy(xpath="//a[@id='hlb-view-cart-announce']")
	public WebElement cart;
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	public WebElement proceedToCheckOut;
	
}
