package start;

import org.openqa.selenium.chrome.ChromeDriver;

import page.tests.DashboardPageTest;
import page.tests.LoginPageTest;
import page.tests.RegistPageTest;
import page.pageObjects.RegistrationPage;
import page.pageObjects.HomePage;
import page.pageObjects.LoginPage;

import org.openqa.selenium.*;

public class MainClass {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		try{
			HomePage.openHomePage(driver);
	
		
		//RegistPageTest.testWithOneData(driver);
		//RegistPageTest.testWithAllData(driver);	
		//LoginPageTest.testWithAllData(driver);
		LoginPage.sendKeysUsername(driver,"tinnmang");
		LoginPage.sendKeysPassword(driver, "PrkOek");
		LoginPage.clickLoginButton(driver);
		//DashboardPageTest.testWithOneData(driver);
		//DashboardPageTest.testWithAllData(driver);
		DashboardPageTest.clickMenuButton(driver);
		DashboardPageTest.editPost(driver);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}


