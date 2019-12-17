package tests.guru99;

import org.testng.annotations.Test;

import pages.BackendLoginPage;

public class DataSortingTest extends TestBase2 {

	static BackendLoginPage backObj;
	
	@Test
	public static void UserCanSortByDate() throws InterruptedException {
		backObj = new BackendLoginPage(driver);
		backObj.BackendLogin();
		backObj.CloseMessage();
		Thread.sleep(2000);
		backObj.ClickOnInvoices();
		backObj.OrderByDate();
	}
}
