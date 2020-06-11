package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPage {
	public WebDriver driver;

	public AmazonLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="ap_email")
	public WebElement email;
	@FindBy(xpath="//input[@id='continue']")
	public WebElement continuee;
	@FindBy(xpath="//input[@id='ap_password']")
	public WebElement pswd;
	@FindBy(xpath="//input[@id='signInSubmit']")
	public WebElement Login;
	
	
	
}
