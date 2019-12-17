package tests.guru99;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.DetailsPage;
import pages.HomePage;
import pages.MobilePage;

public class VerifyCostTest extends TestBase {
	static HomePage homeObj;
	static MobilePage mobileObj;
	static DetailsPage detailsObj;

	@Test
	public static void UserCanVerifyCostOnProductAndDetailsPages() {
		homeObj = new HomePage(driver);
		mobileObj = new MobilePage(driver);
		detailsObj = new DetailsPage(driver);
		homeObj.clickOnMobile();
		String priceOnProductPage = mobileObj.XperiaPriceOnProductPage.getText();
		
		 // assert mobile price on product page
		Assert.assertEquals("$100.00", priceOnProductPage);
		mobileObj.clickOnSony(); 
		
		String priceOnDetailsPage = detailsObj.XperiaPriceOnDetailsPage.getText();
		 // Assert mobile price on details page 
		 Assert.assertEquals("$100.00", priceOnDetailsPage);
		 // assert both prices
		 Assert.assertEquals(priceOnProductPage, priceOnDetailsPage);
		 
	}
}