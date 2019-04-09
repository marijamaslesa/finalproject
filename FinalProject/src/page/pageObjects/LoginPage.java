package page.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public static final String PAGE_URL = "http://localhost/izlet/index.php";
	private static final String USERNAME1 = "//input[@placeholder='username']";
	private static final String PASSWORD1 = "//input[@placeholder='password']";
	
	private static final String LOGINBUTTON = "//input[@value='Log in']";
	
	// Username
		public static WebElement getUsername(WebDriver dr) {
			WebElement wb = dr.findElement(By.xpath(USERNAME1));
			return wb;
		}

		public static void clickUsername(WebDriver dr) {
			getUsername(dr).click();
		}

		public static void sendKeysUsername(WebDriver dr, String str) {
			getUsername(dr).sendKeys(str);
		}

//Password
	public static WebElement getPassword(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(PASSWORD1));
		return wb;
	}

	public static void clickPassword(WebDriver dr) {
		getPassword(dr).click();
	}

	public static void sendKeysPassword(WebDriver dr, String str) {
		getPassword(dr).sendKeys(str);
	}
	
	// Register button
		public static WebElement getLoginButton(WebDriver dr) {
			WebElement wb = dr.findElement(By.xpath(LOGINBUTTON));
			return wb;
		}
		
		public static void clickLoginButton(WebDriver dr) {
			getLoginButton(dr).click();
		}
		
		
		public static void navigateTo(WebDriver dr) {
			dr.navigate().to(PAGE_URL);
		}
	}
	