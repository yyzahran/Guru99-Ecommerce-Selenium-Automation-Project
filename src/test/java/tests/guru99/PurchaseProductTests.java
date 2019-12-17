package tests.guru99;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.CheckOutPage;
import pages.CreateAccountPage;
import pages.HomePage;
import pages.LoggedInPage;
import pages.MyAccountPage;
import pages.ShareWishListPage;
import pages.ShoppingCartPage;
import pages.TVPage;
import pages.WishListPage;

public class PurchaseProductTests extends TestBase {
	static HomePage homeObj;
	static MyAccountPage myAccObj;
	static CreateAccountPage createAccObj;
	static TVPage tvObj;
	static WishListPage wishObj;
	static ShareWishListPage shareListObj;
	static LoggedInPage logObj;
	static ShoppingCartPage cartObj;
	static CheckOutPage outObj;

	@Test(priority = 1)
	public static void UserCanLoginWithPremadeAccount() {
		homeObj = new HomePage(driver);
		myAccObj = new MyAccountPage(driver);
		createAccObj = new CreateAccountPage(driver);
		homeObj.clickOnMyAccount();
		myAccObj.LoginUsingMadeAccount();
	}
	@Test(priority = 2)
	public static void UserChecksOut() throws InterruptedException {
		logObj = new LoggedInPage(driver);
		wishObj = new WishListPage(driver);
		cartObj = new ShoppingCartPage(driver);
		outObj = new CheckOutPage(driver);
		logObj.ClickOnMyWishList();
		wishObj.ClickOnAddToCart();
		cartObj.ProceedToCheckOut();
		outObj.EnterShippingInfoToCheckRate();
		assertTrue(outObj.shippingRate.isDisplayed());
		outObj.ContinueCheckingOut();
		System.out.println(outObj.orderNum.getText());
	}
}