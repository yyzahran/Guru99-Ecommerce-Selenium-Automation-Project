package tests.guru99;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.CheckOutPage;
import pages.HomePage;
import pages.LoggedInPage;
import pages.MyAccountPage;
import pages.MyOrdersPage;
import pages.ShoppingCartPage;
import pages.TVPage;
import pages.ViewOrderPage;

public class ReorderTest extends TestBase{
	
	static HomePage homeObj;
	static MyAccountPage myAccObj;
	static TVPage tvObj;
	static LoggedInPage logObj;
	static MyOrdersPage orderObj;
	static ViewOrderPage viewObj;
	static ShoppingCartPage cartObj;
	static CheckOutPage outObj;
	@Test(priority = 1)
	public static void UserCanLoginWithPremadeAccount() {
		homeObj = new HomePage(driver);
		myAccObj = new MyAccountPage(driver);
		homeObj.clickOnMyAccount();
		myAccObj.LoginUsingMadeAccount();
	}
	
	@Test(priority = 2)
	public static void UserCanReorder() throws InterruptedException {
		logObj = new LoggedInPage(driver);
		cartObj = new ShoppingCartPage(driver);
		outObj = new CheckOutPage(driver);
		logObj.ClickOnReorder();
		cartObj.ChangeQuantity("10");
		cartObj.UpdateQauntity();
		cartObj.UpdateCart();
		assertEquals("$6,150.00", cartObj.priceOf10Items.getText());
		cartObj.ProceedToCheckOut();
		outObj.ContinueCheckingOut();
		System.out.println(outObj.orderNum.getText());
	}
}
