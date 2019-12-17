package tests.guru99;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import pages.DetailsPage;
import pages.HomePage;
import pages.MobilePage;
import pages.ShoppingCartPage;

public class HandlingWindowsTest extends TestBase {
	static HomePage homeObj;
	static MobilePage mobileObj;
	static DetailsPage detailsObj;
	static ShoppingCartPage cartObj;
	
	@Test
	public static void UserCanAddToProductsToCompare() throws InterruptedException, IOException {
		homeObj = new HomePage(driver);
		mobileObj = new MobilePage(driver);
		cartObj = new ShoppingCartPage(driver);
		homeObj.clickOnMobile();
		String mainWindow = driver.getTitle();
		System.out.println(mainWindow);
		mobileObj.AddToCompareXperia();
		Thread.sleep(2000);
		mobileObj.AddToCompareiPhone();
		mobileObj.ClickOnCompare();
		
		//
		for (String window : driver.getWindowHandles()) {
			String childWindow = driver.switchTo().window(window).getTitle();
			if(!childWindow.equals(mainWindow)) {
				// Take screenshot
				int scc = 0;
				 scc = (scc+1);
					File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					//String png = (System.getProperty("user.dir") + "\\Screenshots") + scc + ".png";
					String png = "C:\\Users\\youss\\eclipse-workspace\\guru99\\Screenshots\\" + scc + ".png";
					FileUtils.copyFile(scrFile, new File(png));
					driver.close();
			}
			
		}
	}
}