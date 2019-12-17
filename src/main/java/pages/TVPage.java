package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TVPage extends PageBase{

	public TVPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//li[1]//div[1]//div[3]//ul[1]//li[1]//a[1]")
	WebElement addLGToWishListBtn;
	
	public void ADDLGToWishList() {
		clickBtn(addLGToWishListBtn);
	}
}
