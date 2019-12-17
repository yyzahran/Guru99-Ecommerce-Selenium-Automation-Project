package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//span[contains(text(),'Create an Account')]")
	WebElement createAccount;
	@FindBy(id = "email")
	WebElement emailTxtBox;
	@FindBy(id = "pass")
	WebElement passwordTxtBox;
	@FindBy(id = "send2")
	WebElement loginBtn;
	
	String regEmail = "test1111@test.com";
	String regPassword = "123456789";
	
	public void ClickOnCreateAccount() {
		clickBtn(createAccount);
	}
	
	public void LoginUsingMadeAccount () {
		emailTxtBox.sendKeys(regEmail);
		passwordTxtBox.sendKeys(regPassword);
		clickBtn(loginBtn);
	}

}
