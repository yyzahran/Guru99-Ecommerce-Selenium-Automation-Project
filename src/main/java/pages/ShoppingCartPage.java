package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends PageBase{

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = ".//*[@id='shopping-cart-table']/tbody/tr/td[4]/input")
	WebElement quantityBox;
	@FindBy(xpath = "//td[@class='product-cart-actions']//button[@name='update_cart_action']//span//span[contains(text(),'Update')]")
	WebElement updateBtn;
	@FindBy(xpath = "//li[@class='error-msg']")
	public WebElement errorMsg;
	@FindBy(xpath = "//span[contains(text(),'Empty Cart')]")
	WebElement emptyCartBtn;
	@FindBy(xpath = "//h1[contains(text(),'Shopping Cart is Empty')]")
	public WebElement emptyCartMsg;
	@FindBy(id = "shopping-cart-table")
	WebElement cartTable;
	@FindBy(xpath = "//ul[@class='checkout-types top']//"
			+ "li//button[@class='button btn-proceed-checkout btn-checkout']//span//span[contains(text(),'Proceed to Checkout')]")
	WebElement proceedToCheckOutBtn;
	@FindBy(xpath = "//button[3]//span[1]//span[1]")
	WebElement updateCartBtn;
	@FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][contains(text(),'$6,150.00')]")
	public WebElement priceOf10Items;
	@FindBy(id = "coupon_code")
	WebElement couponBox;
	@FindBy(xpath = "//span[contains(text(),'Apply')]")
	WebElement applyCouponBtn;
	@FindBy(xpath = "//td[@class='product-cart-total']//span[@class='price'][contains(text(),'$500.00')]")
	public WebElement iPhonePrice;
	
	public void ChangeQuantity(String quantity) throws InterruptedException {
		quantityBox.clear();
		quantityBox.sendKeys(quantity);
		quantityBox.click();
	}
	
	public void UpdateQauntity() {
		clickBtn(updateBtn);
	}
	public void EmptyCart() {
		clickBtn(emptyCartBtn);
		
	}
	
	public void ProceedToCheckOut() {
		clickBtn(proceedToCheckOutBtn);
	}
	
	public void UpdateCart() {
		clickBtn(updateCartBtn);
	}
	
	public void AddCouponCode() {
		couponBox.sendKeys("GURU50");
		clickBtn(applyCouponBtn);
	}
}
