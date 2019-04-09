package page.tests;

import java.util.List;
import java.util.Scanner;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import page.pageObjects.DashboardPage;
import page.pageObjects.RegistrationPage;

import org.openqa.selenium.WebElement;
import utility.Constant;
import utility.ExcelUtils;

public class DashboardPageTest {
	
	
	public static void fillForm(WebDriver dr,int i) throws Exception {
		DashboardPage.clickMakeAPostButton(dr);
		String data;
		ExcelUtils.
		setExcelFile
		(Constant.Path_TestData+Constant.File_TestData,
				Constant.SHEET_TEXT);
		DashboardPage.clickNaziv(dr);
		data=ExcelUtils.getCellData(i, 0);
		DashboardPage.sendKeysNaziv(dr, data);
		
		DashboardPage.clickLokacija(dr);
		data = ExcelUtils.getCellData(i, 1);
		DashboardPage.sendKeysLokacija(dr, data);		
		
		DashboardPage.clickOpis(dr);
		data = ExcelUtils.getCellData(i, 2);
		DashboardPage.sendKeysOpis(dr, data);
		
		DashboardPage.clickPostButton(dr);
	}
	//test sa svim podacima iz tabele
		public static void testWithAllData(WebDriver dr) throws Exception {
			ExcelUtils.
			setExcelFile
			(Constant.Path_TestData+Constant.File_TestData,
					Constant.SHEET_TEXT);
			for(int i=0;i<ExcelUtils.getWorkSheet().getLastRowNum()+1;i++) {
				fillForm(dr,i);
				DashboardPage.navigateTo(dr);  
			}
					
				}
		
		//test sa jednim podatkom koji unosimo sami
				public static void testWithOneData(WebDriver dr) throws Exception {
				
					Scanner sc = new Scanner(System.in); 
					DashboardPage.clickMakeAPostButton(dr);
				System.out.println("Enter Naziv");		
				String naziv = sc.nextLine();
				DashboardPage.sendKeysNaziv(dr,naziv);
				
				System.out.println("Enter Lokacija");		
				String lokacija = sc.nextLine();
				DashboardPage.sendKeysLokacija(dr,lokacija);
				
				System.out.println("Enter Opis");		
				String opis = sc.nextLine();
				DashboardPage.sendKeysOpis(dr,opis);
			    DashboardPage.clickPostButton(dr);
}              
				//delete post
				public static void deleteFirstTwoPosts(WebDriver driver) {
					DashboardPage.clickMenuButton(driver);
					DashboardPage.deletePost1(driver);
					DashboardPage.deletePost1(driver);
					
				}
				
				//edit post
				public static void editPost(WebDriver driver) {
					DashboardPage.clickMenuButton(driver);
					DashboardPage.getEditPost(driver).click();
					DashboardPage.sendKeysEditNaziv(driver);
					DashboardPage.sendKeysEditLokacija(driver);
					DashboardPage.sendKeysEditOpis(driver);
				}
						
					}
					
				
				
				
				
				
