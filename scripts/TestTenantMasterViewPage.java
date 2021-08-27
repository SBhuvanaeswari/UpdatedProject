package Com.UIIC.scripts;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Com.UIIC.generics.BaseTestclass;
import Com.UIIC.generics.FWUtills;
import Com.UIIC.object.GenericMasterPage;
import Com.UIIC.object.GenericPage;
import Com.UIIC.object.HomePage;
import Com.UIIC.object.TenantMasterPage;
import Com.UIIC.object.TenantMasterViewPage;
import commonFuncctions.CommonFunctions;

public class TestTenantMasterViewPage extends BaseTestclass
{

	@Test
	public void TenantMaster_View() throws InterruptedException {

		String us = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 0);
		String ps = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 1);
		String role = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 2);
		String HomePage = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 3);
		Thread.sleep(1000);
		String Tenname = FWUtills.read_XL_Data(XL_DATA_PATH, "TenantMaster_Modify", 1, 0);
		String Tencode = FWUtills.read_XL_Data(XL_DATA_PATH, "TenantMaster_Modify", 1, 1);
		String offcode = FWUtills.read_XL_Data(XL_DATA_PATH, "TenantMaster_Modify", 1, 1);
		String offname = FWUtills.read_XL_Data(XL_DATA_PATH, "TenantMaster_Modify", 1, 2);
		

		System.out.println(us);
		System.out.println(ps);
		System.out.println(role);
		System.out.println(Tenname);
		System.out.println(Tencode);
		System.out.println(offcode);
		System.out.println(offname);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		HomePage hp = new HomePage(driver);

		hp.enterUser(us);
		Thread.sleep(1000);
		hp.selectRole();
		Thread.sleep(5000);
		Select s = hp.selectRole1();
		s.selectByVisibleText(role);
		hp.enterPass(ps);
		Thread.sleep(1000);
		hp.clickLogin();
		Boolean invisible = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("flxGridBoxOverlay")));
		if (invisible) {
			String pwh = driver.getWindowHandle();
			Set<String> handles1 = driver.getWindowHandles();
			for (String newwh1 : handles1) {
				String title = driver.getTitle();
				System.out.println(title);

				driver.switchTo().window(newwh1);
				if (title.contains("Genisys Configurator Message Box")) {

					driver.close();
				} else if (title.contains("UIIC - GENISYS CONFIGURATOR LOGIN")) {
					Thread.sleep(2000);
					hp.enterPass(ps);
					hp.clickLogin();
				}
			}

			driver.switchTo().window(pwh);
			String expttile =driver.getTitle();
			FWUtills.verifyTitleOfHomePage(driver,expttile);
			driver.navigate().refresh();
			Thread.sleep(2000);
			TenantMasterViewPage Tm = new TenantMasterViewPage(driver);
			GenericPage gm = new GenericPage(driver);
			gm.clickGenericMaster1();
			GenericMasterPage gmp = new GenericMasterPage(driver);
			gmp.clickTenantMaster();
			gmp.clickTenantMasterView();
			Thread.sleep(2000);
			WebElement frame1 = Tm.iframe;
			driver.switchTo().frame(frame1);
			Tm.ViewTVName(Tenname);
			Tm.ViewTXVecode(Tencode);
			Thread.sleep(1000);
			Tm.ViewSearch();
			Tm.ViewEdit();
			/*
			 * Thread.sleep(2000);
			 * 
			 * Tm.ViewClose.click();
			 * 
			 * Thread.sleep(2000); Alert confirm=driver.switchTo().alert();
			 * confirm.dismiss(); Thread.sleep(1000); driver.navigate().refresh();
			 */
		}
	}
}
