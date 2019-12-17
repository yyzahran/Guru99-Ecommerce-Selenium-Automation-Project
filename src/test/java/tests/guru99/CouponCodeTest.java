package tests.guru99;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.MobilePage;
import pages.ShoppingCartPage;

public class CouponCodeTest extends TestBase{
 
	static HomePage homeObj;
	static MobilePage mobileObj;
	static ShoppingCartPage cartObj;
	
	@Test
	public void DiscountCouponIsWorking() {
		homeObj = new HomePage(driver);
		mobileObj = new MobilePage(driver);
		cartObj = new ShoppingCartPage(driver);
		homeObj.clickOnMobile();
		mobileObj.AddToCartiPhone();
		cartObj.AddCouponCode();
		if(cartObj.iPhonePrice.getText().toString() == "$500.00") {
			System.out.println("Disount code works");
			System.out.println(cartObj.iPhonePrice.getText());
		}
		else {
			System.out.println("Discount code is not working");
			System.out.println(cartObj.iPhonePrice.getText());
		}
	}
}
