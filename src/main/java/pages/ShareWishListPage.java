package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShareWishListPage extends PageBase{

	public ShareWishListPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "email_address")
	WebElement emailaddsTxtBox;
	@FindBy(id = "message")
	WebElement msgTxtBox;
	@FindBy(xpath = "//span[contains(text(),'Share Wishlist')]")
	WebElement shareListBtn;
	@FindBy(xpath = "//span[contains(text(),'Your Wishlist has been shared.')]")
	public WebElement listSharedMsg;
	
	public void ShareWishListWithEmails(String emails, String Msg) {
		emailaddsTxtBox.sendKeys(emails);
		msgTxtBox.sendKeys(Msg);
		shareListBtn.click();
	}

}
