package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewOrderPage extends PageBase{

	public ViewOrderPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[@class='link-print']")
	WebElement printOrderBtn;
	
	public void PrintOrder() {
		clickBtn(printOrderBtn);
	}

}
