package tests.guru99;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.DetailsPage;
import pages.HomePage;
import pages.MobilePage;
import pages.ShoppingCartPage;

public class ErrorVerificationTest extends TestBase {
	static HomePage homeObj;
	static MobilePage mobileObj;
	static DetailsPage detailsObj;
	static ShoppingCartPage cartObj;
	
	@Test
	public static void UserChecksQuantityOfXperia() throws InterruptedException {
		homeObj = new HomePage(driver);
		mobileObj = new MobilePage(driver);
		cartObj = new ShoppingCartPage(driver);
		homeObj.clickOnMobile();
		mobileObj.AddXperiaToCart();
		cartObj.ChangeQuantity("1000");
		cartObj.UpdateQauntity();
		Thread.sleep(2000);
		assertEquals(true, cartObj.errorMsg.isDisplayed());
		cartObj.EmptyCart();
		
		assertEquals(true, cartObj.emptyCartMsg.isDisplayed());
	}
}