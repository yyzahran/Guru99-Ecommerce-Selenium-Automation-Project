package tests.guru99;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.MobilePage;

public class MobileListTest extends TestBase {
	static HomePage homeObj;
	static MobilePage mobileObj;

	@Test
	public static void UserCanSortByName() throws InterruptedException {
		homeObj = new HomePage(driver);
		mobileObj = new MobilePage(driver);
		assertEquals(true, homeObj.elementPresent(homeObj.HomeTitle));
		homeObj.clickOnMobile();
		Thread.sleep(2000);
		assertEquals(true, mobileObj.elementPresent(mobileObj.MobileTitle));
		mobileObj.changeSortToName();
		//assertEquals(true, mobileObj.sortByList.getText().toString().equalsIgnoreCase("name"));
	}
}