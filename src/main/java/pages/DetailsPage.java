package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DetailsPage extends PageBase{
	
	public DetailsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//span[@class='price']")
	public WebElement XperiaPriceOnDetailsPage;
	
	
}
