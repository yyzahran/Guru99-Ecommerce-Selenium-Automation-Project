package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BackendLoginPage extends PageBase {

	public BackendLoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "username")
	WebElement userName;
	@FindBy(id = "login")
	WebElement password;
	@FindBy(xpath = "//input[@class='form-button']")
	WebElement loginBtn;
	@FindBy(xpath = "//body[@id='html-body']/div[@class='wrapper']/div[@class='header']/div[@class='nav-bar']/ul[@id='nav']/li[@class='parent level0 over']/a[1]")
	WebElement salesTab;
	@FindBy(xpath = "//span[contains(text(),'Orders')]")
	WebElement ordersTab;
	@FindBy(xpath = "//span[contains(text(),'Invoices')]")
	WebElement invoicesTab;
	@FindBy(id = "id_fdcb25190a2d4953da6d7bdea6462f9f")
	WebElement exportBtn;
	@FindBy(xpath = "//span[contains(text(),'Order Date')]")
	WebElement orderDate;
	@FindBy(xpath = "//span[contains(text(),'close')]")
	WebElement closeMsg;
	
	public void CloseMessage() {	
		clickBtn(closeMsg);
	}
	
	public void BackendLogin() {
		userName.sendKeys("user01");
		password.sendKeys("guru99com");
		clickBtn(loginBtn);
	}
	
	public void ClickOnOrders() {
		clickBtn(salesTab);
		clickBtn(ordersTab);
	}
	
	public void ClickOnInvoices() throws InterruptedException {
		//Actions actions = new Actions();
		action.moveToElement(salesTab).perform();
		Thread.sleep(2000);
		action.moveToElement(invoicesTab).click().perform();
//		clickBtn(salesTab);
//		clickBtn(invoicesTab);
	}

	public void ClickOnExport() {
		clickBtn(exportBtn);
	}
	
	public void OrderByDate() {
		clickBtn(orderDate);
	}
}
