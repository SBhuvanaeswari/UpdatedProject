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
import Com.UIIC.object.LandlordMasterPage;
import commonFuncctions.CommonFunctions;

public class TestLandLordMasterModifyPage extends BaseTestclass {

	@Test
	public void LandLordMaster_Modify() throws InterruptedException {

		String us = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 0);
		String ps = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 1);
		String role = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 2);
		Thread.sleep(1000);
		String landname = FWUtills.read_XL_Data(XL_DATA_PATH, "LandlordMaster_Modify", 1, 0);
		String landcode = FWUtills.read_XL_Data(XL_DATA_PATH, "LandlordMaster_Modify", 1, 1);
		String offcode = FWUtills.read_XL_Data(XL_DATA_PATH, "TenantMaster_Modify", 1, 1);
		String offname = FWUtills.read_XL_Data(XL_DATA_PATH, "TenantMaster_Modify", 1, 2);

		System.out.println(us);
		System.out.println(ps);
		System.out.println(role);
		System.out.println(landname);
		System.out.println(landcode);
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
			String parent = driver.getWindowHandle();
			Set<String> p = driver.getWindowHandles();
			for (String neww : p) {
				String title = driver.getTitle();
				System.out.println(title);

				driver.switchTo().window(neww);
				if (title.contains("Genisys Configurator Message Box")) {

					driver.close();
				} else if (title.contains("UIIC - GENISYS CONFIGURATOR LOGIN")) {
					Thread.sleep(2000);
					hp.enterPass(ps);
					hp.clickLogin();
				}
			}

			driver.switchTo().window(parent);
			String data = driver.getTitle();
			FWUtills.verifyTitleOfHomePage(driver, data);
			driver.navigate().refresh();
			Thread.sleep(2000);
			GenericPage gm = new GenericPage(driver);
			gm.clickGenericMaster1();
			GenericMasterPage gmp = new GenericMasterPage(driver);
			gmp.clickLandlordMaster();
			gmp.clickLandlordMasterModify();
			Thread.sleep(2000);
			LandlordMasterPage Lm = new LandlordMasterPage(driver);
			WebElement frame1 = Lm.iframe;
			driver.switchTo().frame(frame1);
			Lm.Viwlandname(landname);
			Lm.Viwlandcode(landcode);
			Thread.sleep(1000);
			Lm.modifysearch();
			Thread.sleep(3000);
			Lm.clickedit();

		}
	}
}
