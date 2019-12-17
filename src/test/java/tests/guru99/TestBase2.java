package tests.guru99;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class TestBase2 {
	public static String baseURL = "http://live.demoguru99.com/index.php/backendlogin/";
	public static WebDriver driver;
	
	@Parameters({"browser"})
	@BeforeSuite
	public static void StartDriver(String browserName) {
		if(browserName.equalsIgnoreCase("firefox")) {
		driver = new FirefoxDriver();
		System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir") + "\\resources\\geckodriver.exe");
		} else if(browserName.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\resources\\chromedriver.exe");
		}
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@AfterSuite
	public static void QuitDriver() {
		driver.quit();
	}
}
