package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[contains(text(),'Mobile')]")
	WebElement Mobile;
	@FindBy(xpath = "//a[contains(text(),'TV')]")
	WebElement TV;
	@FindBy(xpath = "//h2[contains(text(),'This is demo site for')]")
	public WebElement HomeTitle;
	@FindBy(xpath = "//div[@class='footer']//a[contains(text(),'My Account')]")
	WebElement myAccountBtn;

	public void clickOnMobile() {
		clickBtn(Mobile);
	}

	public void clickOnMyAccount() {
		clickBtn(myAccountBtn);
	}

	public void clickOnTV() {
		clickBtn(TV);
	}
}
