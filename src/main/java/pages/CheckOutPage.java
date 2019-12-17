package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage extends PageBase{

	public CheckOutPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "billing:street1")
	WebElement addressTxtBox;
	@FindBy(id = "billing:city")
	WebElement cityTxtBox;
	@FindBy(id = "billing:region_id")
	WebElement stateTxtBox;
	@FindBy(id = "billing:postcode")
	WebElement zipTxtBox;
	@FindBy(id = "billing:telephone")
	WebElement phoneTxtBox;
	@FindBy(xpath = "//button[@type='button']")
	WebElement contBtn;
	@FindBy(xpath = "//label[contains(text(),'Fixed')]")
	public WebElement shippingRate;
	@FindBy(xpath = "//div[@id='shipping-method-buttons-container']//button[@class='button']")
	WebElement cont2Btn;
	@FindBy(xpath = "//label[contains(text(),'Check / Money order')]")
	WebElement checkMoneyRadioBtn;
	@FindBy(xpath = "//div[@id='payment-buttons-container']//button[@class='button']")
	WebElement cont3Btn;
	@FindBy(xpath = "//button[@class='button btn-checkout']")
	WebElement placeOrderBtn;
	@FindBy(xpath = "//div[@class='main-container col1-layout']//p[1]")
	public WebElement orderNum;
	
	public void EnterShippingInfoToCheckRate() {
		addressTxtBox.sendKeys("ABC");
		cityTxtBox.sendKeys("New York");
		new Select(stateTxtBox).selectByIndex(43);
		zipTxtBox.sendKeys("542896");
		phoneTxtBox.sendKeys("12345678");
		
	}
	
	public void ContinueCheckingOut() throws InterruptedException {
		clickBtn(contBtn);
		Thread.sleep(2000);
		clickBtn(cont2Btn);
		Thread.sleep(2000);
		clickBtn(checkMoneyRadioBtn);
		Thread.sleep(2000);
		clickBtn(cont3Btn);
		Thread.sleep(2000);
		clickBtn(placeOrderBtn);
	}
}


