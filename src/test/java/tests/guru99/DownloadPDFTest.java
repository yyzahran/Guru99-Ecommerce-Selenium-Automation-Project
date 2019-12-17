package tests.guru99;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoggedInPage;
import pages.MyAccountPage;
import pages.MyOrdersPage;
import pages.TVPage;
import pages.ViewOrderPage;

public class DownloadPDFTest extends TestBase {
	static HomePage homeObj;
	static MyAccountPage myAccObj;
	static TVPage tvObj;
	static LoggedInPage logObj;
	static MyOrdersPage orderObj;
	static ViewOrderPage viewObj;
	
	@Test(priority = 1)
	public static void UserCanLoginWithPremadeAccount() {
		homeObj = new HomePage(driver);
		myAccObj = new MyAccountPage(driver);
		homeObj.clickOnMyAccount();
		myAccObj.LoginUsingMadeAccount();
	}
	
	@Test (priority = 2)
	public static void UserCanDownloadOrderASPDF() throws AWTException {
		logObj = new LoggedInPage(driver);
		orderObj = new MyOrdersPage(driver);
		viewObj = new ViewOrderPage(driver);
		logObj.ClickOnMyOrders();
		assertEquals("Pending", orderObj.pendingStatus.getText());
		orderObj.ViewOrder();
		viewObj.PrintOrder();
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
	}
	

}
