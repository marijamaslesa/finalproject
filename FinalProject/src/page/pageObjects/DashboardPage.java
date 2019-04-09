package page.pageObjects;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {

	public static final String DASHBOARDPAGE_URL = "http://localhost/izlet/dashboard.php";
	public static final String MAKE_A_POST_BUTTON = "//a[contains(text(),'Make a post')]";
	public static final String NAZIV = "//input[@placeholder='Naziv']";
	public static final String LOKACIJA="//input[@placeholder='Lokacija']";
	public static final String OPIS="//textarea[@placeholder='Opis']";
	public static final String POST_BUTTON = "//div[@class='popupPost']//input[@value='Post']";
	
	public static final String MENU_BUTTON= "fa-ellipsis-v";
	public static final String DELETE_BUTTON="fa-trash-alt";
	public static final String EDIT_BUTTON="fa-edit";
	//naziv
	public static WebElement getNaziv(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(NAZIV));
		return wb;
	}

	public static void clickNaziv(WebDriver dr) {
		getNaziv(dr).click();
	}

	public static void sendKeysNaziv(WebDriver dr, String str) {
		getNaziv(dr).sendKeys(str);
	}

	// Lokacija
	public static WebElement getLokacija(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(LOKACIJA));
		return wb;
	}

	public static void clickLokacija(WebDriver dr) {
		getLokacija(dr).click();
	}

	public static void sendKeysLokacija(WebDriver dr, String str) {
		getLokacija(dr).sendKeys(str);
	}

	

	// Opis
	public static WebElement getOpis(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(OPIS));
		return wb;
	}

	public static void clickOpis(WebDriver dr) {
		getOpis(dr).click();
	}

	public static void sendKeysOpis(WebDriver dr, String str) {
		getOpis(dr).sendKeys(str);
	}
// Make a post button
	public static WebElement getMakeAPostButton(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(MAKE_A_POST_BUTTON));
		return wb;
	}
	
	public static void clickMakeAPostButton(WebDriver dr) {
		getMakeAPostButton(dr).click();
	}
	// Post button
		public static WebElement getPostButton(WebDriver dr) {
			WebElement wb = dr.findElement(By.xpath(POST_BUTTON));
			return wb;
		}
		
		public static void clickPostButton(WebDriver dr) {
			getPostButton(dr).click();
		}	
	
	public static void navigateTo(WebDriver dr) {
		dr.navigate().to(DASHBOARDPAGE_URL);
	}
	public static WebElement getMenuButton(WebDriver driver ) {
		WebElement wb= driver.findElement(By.className("POST_MENU"));
		return wb;
		
	}
	public static void clickMenuButton (WebDriver driver) {
		getMenuButton(driver).click();
	}
	//delete post
	public static WebElement deletePost1 (WebDriver driver) {
		List <WebElement> deletePost= driver.findElements(By.className("DELETE_BUTTON"));					
		return deletePost.get(0);
	}
	
	//edit post
	public static WebElement getEditPost (WebDriver driver) {
		List <WebElement> editPost= driver.findElements(By.className("EDIT_BUTTON"));
		return editPost.get(0) ; }
		
		
		public static WebElement getEditNaziv(WebDriver dr) {
			WebElement wb = dr.findElement(By.xpath("//input[@id='title']"));
			return wb;
		}


		public static void sendKeysEditNaziv(WebDriver dr) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Edit Naziv");
			String editNaziv= sc.nextLine();
			getEditNaziv(dr).sendKeys(editNaziv);
			
		}
		public static WebElement getEditLokacija(WebDriver dr) {
			WebElement wb = dr.findElement(By.xpath("//input[@id='location']"));
			return wb;
		}


		public static void sendKeysEditLokacija(WebDriver dr) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Edit Lokacija");
			String editLokacija= sc.nextLine();
			getEditLokacija(dr).sendKeys(editLokacija);
			
		}
		public static WebElement getEditOpis(WebDriver dr) {
			WebElement wb = dr.findElement(By.xpath("//input[@id='location']"));
			return wb;
		}


		public static void sendKeysEditOpis(WebDriver dr) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Edit Opis");
			String editOpis= sc.nextLine();
			getEditOpis(dr).sendKeys(editOpis);}
			
			
	
}
