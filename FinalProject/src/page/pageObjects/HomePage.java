package page.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	public static final String HOMEPAGE_URL = "http://localhost/izlet/index.php";
	WebDriver driver= new ChromeDriver();
	public static void openHomePage(WebDriver dr) {
		dr.get(HOMEPAGE_URL);
	}
}
