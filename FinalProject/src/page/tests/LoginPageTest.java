package page.tests;




	import java.util.Scanner;

	import org.openqa.selenium.*;

	import page.pageObjects.LoginPage;
import page.pageObjects.RegistrationPage;
import utility.Constant;
	import utility.ExcelUtils;
	public class LoginPageTest {
		
		public static void fillForm(WebDriver dr,int i) throws Exception {
			String data;
			ExcelUtils.
			setExcelFile
			(Constant.Path_TestData+Constant.File_TestData,
					Constant.SHEET_REGISTRATION);
			LoginPage.clickUsername(dr);
			data = ExcelUtils.getCellData(i, 2);
			LoginPage.sendKeysUsername(dr, data);
			
			LoginPage.clickPassword(dr);
			data = ExcelUtils.getCellData(i, 4);
			LoginPage.sendKeysPassword(dr, data);
			
			LoginPage.clickLoginButton(dr);
		}
		//test sa svim podacima iz tabele
		public static void testWithAllData(WebDriver dr) throws Exception {
			ExcelUtils.
			setExcelFile
			(Constant.Path_TestData+Constant.File_TestData,
					Constant.SHEET_REGISTRATION);
			for(int i=0;i<ExcelUtils.getWorkSheet().getLastRowNum()+1;i++) {
				fillForm(dr,i);
				LoginPage.navigateTo(dr);   

			}}
		//test sa jednim podatkom koji unosimo sami
				public static void testWithOneData(WebDriver dr) throws Exception {
				
					Scanner sc = new Scanner(System.in); 
					
						
				System.out.println("Enter Username");		
				String username = sc.nextLine();
				LoginPage.sendKeysUsername(dr,username);
				
				
				System.out.println("Enter Password");		
				String password = sc.nextLine();
				LoginPage.sendKeysPassword(dr,password);
				
				LoginPage.clickLoginButton(dr);
			}
}
