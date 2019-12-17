package tests.guru99;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.CreateAccountPage;
import pages.HomePage;
import pages.MyAccountPage;
import pages.ShareWishListPage;
import pages.TVPage;
import pages.WishListPage;

public class AccountCreationTest extends TestBase {
	static HomePage homeObj;
	static MyAccountPage myAccObj;
	static CreateAccountPage createAccObj;
	static TVPage tvObj;
	static WishListPage wishObj;
	static ShareWishListPage shareListObj;
	
	@Test(priority = 1)
	public static void UserCanCreateAccount() {
		homeObj = new HomePage(driver);
		myAccObj = new MyAccountPage(driver);
		createAccObj = new CreateAccountPage(driver);
		homeObj.clickOnMyAccount();
		myAccObj.ClickOnCreateAccount();
		createAccObj.FillUserRegsitrationInfo("Joe", "Jack", "tes121212@13email.com", "123456789");
		assertEquals(true, createAccObj.successfulRegistration.isDisplayed());
	}
	
	@Test(priority = 2)
	public static void UserCanAddToAndShareWishList() {
		homeObj = new HomePage(driver);
		tvObj = new TVPage(driver);
		wishObj = new WishListPage(driver);
		shareListObj = new ShareWishListPage(driver);
		homeObj.clickOnTV();
		tvObj.ADDLGToWishList();
		wishObj.CLickOnShareWishList();
		shareListObj.ShareWishListWithEmails("test@kalabala.com, test@kolobaly.com", "Have a look!");
		assertEquals(true, shareListObj.listSharedMsg.isDisplayed());
	}
}
