package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
	
	public PageBase(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public Select select;
	public Actions action;
	
	public void clickBtn(WebElement btn) {
		btn.click();
	}
	
	public boolean elementPresent(WebElement element) {
		element.isDisplayed();
		return true;
		}
}
