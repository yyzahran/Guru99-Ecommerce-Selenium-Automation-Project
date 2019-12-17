package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoggedInPage extends PageBase {

	public LoggedInPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='block-content']//a[contains(text(),'My Wishlist')]")
	WebElement myWishListBtn;
	@FindBy(xpath = "//a[contains(text(),'My Orders')]")
	WebElement myOrdersBtn;
	@FindBy(xpath = "//a[@class='link-reorder']")
	WebElement reorderBtn;
	
	public void ClickOnMyWishList() {
		clickBtn(myWishListBtn);
	}
	
	public void ClickOnMyOrders() {
		clickBtn(myOrdersBtn);
	}
	
	public void ClickOnReorder() {
		clickBtn(reorderBtn);
	}

}
