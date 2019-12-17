package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends PageBase {

	public CreateAccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "firstname")
	WebElement fNameTxtBox;
	@FindBy(id = "lastname")
	WebElement lNameTxtBox;
	@FindBy(id = "email_address")
	WebElement emailTxtBox;
	@FindBy(id = "password")
	WebElement passwordTxtBox;
	@FindBy(id = "confirmation")
	WebElement confirmPasswordTxtBox;
	@FindBy(xpath = "//span[contains(text(),'Register')]")
	WebElement registerBtn;
	@FindBy(xpath = "//span[contains(text(),'Thank you for registering with Main Website Store.')]")
	public WebElement successfulRegistration;
	
	
	public void FillUserRegsitrationInfo(String firstName, String lastName, String email, String password) {
		fNameTxtBox.sendKeys(firstName);
		lNameTxtBox.sendKeys(lastName);
		emailTxtBox.sendKeys(email);
		passwordTxtBox.sendKeys(password);
		confirmPasswordTxtBox.sendKeys(password);
		clickBtn(registerBtn);
	}
}
