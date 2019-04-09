package page.tests;

import java.awt.List;
import java.util.Scanner;

import org.openqa.selenium.*;

import page.pageObjects.RegistrationPage;
import utility.Constant;
import utility.ExcelUtils;

public class RegistPageTest {
	
	
	public static void fillForm(WebDriver dr,int i) throws Exception {
		String data;
		ExcelUtils.
		setExcelFile
		(Constant.Path_TestData+Constant.File_TestData,
				Constant.SHEET_REGISTRATION);
		RegistrationPage.clickFirstName(dr);
		data=ExcelUtils.getCellData(i, 0);
		RegistrationPage.sendKeysFirstName(dr, data);
		
		RegistrationPage.clickLastName(dr);
		data = ExcelUtils.getCellData(i, 1);
		RegistrationPage.sendKeysLastName(dr, data);		
		
		RegistrationPage.clickUsername(dr);
		data = ExcelUtils.getCellData(i, 2);
		RegistrationPage.sendKeysUsername(dr, data);
		
		RegistrationPage.clickEmail(dr);
		data = ExcelUtils.getCellData(i, 3);
		RegistrationPage.sendKeysEmail(dr, data);
				
		RegistrationPage.clickPassword(dr);
		data = ExcelUtils.getCellData(i, 4);
		RegistrationPage.sendKeysPassword(dr, data);
		
		
		
		RegistrationPage.clickRegisterButton(dr);
		
	}
	
	//test sa svim podacima iz tabele
	public static void testWithAllData(WebDriver dr) throws Exception {
		ExcelUtils.
		setExcelFile
		(Constant.Path_TestData+Constant.File_TestData,
				Constant.SHEET_REGISTRATION);
		for(int i=0;i<ExcelUtils.getWorkSheet().getLastRowNum()+1;i++) {
			fillForm(dr,i);
			RegistrationPage.navigateTo(dr);  
		}
		
			
			}
	
	
	//test sa jednim podatkom koji unosimo sami
		public static void testWithOneData(WebDriver dr) throws Exception {
		
			Scanner sc = new Scanner(System.in); 
			
		System.out.println("Enter First name");		
		String firstName = sc.nextLine();
		RegistrationPage.sendKeysFirstName(dr,firstName);
		
		System.out.println("Enter Last name");		
		String lastName = sc.nextLine();
		RegistrationPage.sendKeysLastName(dr,lastName);
		
		System.out.println("Enter Username");		
		String username = sc.nextLine();
		RegistrationPage.sendKeysUsername(dr,username);
		
		System.out.println("Enter Email");		
		String email = sc.nextLine();
		RegistrationPage.sendKeysEmail(dr,email);
		
		System.out.println("Password");		
		String password = sc.nextLine();
		RegistrationPage.sendKeysPassword(dr,password);
		
		RegistrationPage.clickRegisterButton(dr);
		}
		
}

