package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MobilePage extends PageBase{
	
	public MobilePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//html[@id='top']/body/div[@class='wrapper']/div[@class='page']/div[2]/div[@cl"
			+ "ass='main']//div[@class='category-p"
			+ "roducts']/div[@class='toolbar']/div["
			+ "@class='sorter']/div[@class='sort-by']/select[@title='Sort By']")
	public WebElement sortByList;
	@FindBy(xpath = "//h1[contains(text(),'Mobile')]")
	public WebElement MobileTitle;
	@FindBy(xpath = "//h2[@class='product-name']//a[contains(text(),'Sony Xperia')]")
	WebElement SonyBtn;
	@FindBy(xpath = "//span[contains(text(),'$100.00')]")
	public WebElement XperiaPriceOnProductPage;
	@FindBy(xpath = "//li[1]//div[1]//div[3]//button[1]//span[1]//span[1]")
	WebElement AddToCartXperia;
	@FindBy(xpath = "//li[2]//div[1]//div[3]//button[1]//span[1]//span[1]")
	WebElement AddToCartiPhone;
	@FindBy(xpath = "//li[1]//div[1]//div[3]//ul[1]//li[2]//a[1]")
	WebElement addToCompareXperia;
	@FindBy(xpath = "//li[2]//div[1]//div[3]//ul[1]//li[2]//a[1]")
	WebElement addToCompareiPhone;
	@FindBy(xpath = "//button[@class='button']//span//span[contains(text(),'Compare')]")
	WebElement compareBtn;
	
	public void changeSortToName() {
	Select sortDownSelect = new Select(sortByList);
	sortDownSelect.selectByVisibleText("Name");
	}
	
	public void clickOnSony() {
		clickBtn(SonyBtn);
	}
	
	public void AddXperiaToCart() {
		clickBtn(AddToCartXperia);
	}
	
	public void AddToCompareXperia() {
		clickBtn(addToCompareXperia);
	}
	
	public void AddToCompareiPhone() {
		clickBtn(addToCompareiPhone);
	}
	
	public void ClickOnCompare() {
		clickBtn(compareBtn);
	}
	
	public void AddToCartiPhone() {
		clickBtn(AddToCartiPhone);
	}
}
