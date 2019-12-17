package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyOrdersPage extends PageBase{

	public MyOrdersPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[contains(text(),'View Order')]")
	WebElement viewOrder;
	@FindBy(xpath = "//em[contains(text(),'Pending')]")
	public WebElement pendingStatus;
	
	public void ViewOrder() {
		clickBtn(viewOrder);
	}

}
