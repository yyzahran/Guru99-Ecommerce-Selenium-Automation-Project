package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends PageBase {

	public WishListPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//span[contains(text(),'Share Wishlist')]")
	WebElement shareWishListBtn;
	@FindBy(xpath = "//button[@class='button btn-cart']")
	WebElement addToCartBtn;

	public void CLickOnShareWishList() {
		clickBtn(shareWishListBtn);
	}

	public void ClickOnAddToCart() {
		clickBtn(addToCartBtn);
	}
}
