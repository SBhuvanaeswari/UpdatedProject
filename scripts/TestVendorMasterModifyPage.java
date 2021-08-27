package Com.UIIC.scripts;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
import Com.UIIC.object.VendorMasterAddPage;
import Com.UIIC.object.VendorMasterModifyPage;
import commonFuncctions.CommonFunctions;

public class TestVendorMasterModifyPage extends BaseTestclass {

	@Test
	public void VendorMaster_Modify() throws InterruptedException {

		String us = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 0);
		String ps = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 1);
		String role = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 2);
		Thread.sleep(1000);
		String Vename = FWUtills.read_XL_Data(XL_DATA_PATH, "VendorMaster_Modify", 1, 0);
		String Vecode = FWUtills.read_XL_Data(XL_DATA_PATH, "VendorMaster_Modify", 1, 1);
		String offcode = FWUtills.read_XL_Data(XL_DATA_PATH, "VendorMaster_Modify", 1, 2);
		String offname = FWUtills.read_XL_Data(XL_DATA_PATH, "VendorMaster_Modify", 1, 3);

		System.out.println(us);
		System.out.println(ps);
		System.out.println(role);
		System.out.println(Vename);
		System.out.println(Vecode);
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

			driver.switchTo().window(parent);
			String data = driver.getTitle();
			FWUtills.verifyTitleOfHomePage(driver, data);
			driver.navigate().refresh();
			Thread.sleep(2000);
			GenericPage gm = new GenericPage(driver);
			gm.clickGenericMaster1();
			GenericMasterPage gmp = new GenericMasterPage(driver);
			gmp.clickVendorMaster();
			gmp.clickVendorMasterModify();
			Thread.sleep(2000);
			VendorMasterModifyPage Vm = new VendorMasterModifyPage(driver);
			WebElement frame1 = Vm.iframe;
			driver.switchTo().frame(frame1);
			Vm.VenName(Vename);
			Vm.Vencode(Vecode);

			Vm.Viewsrch();
			Thread.sleep(3000);
			Vm.clickedit();
			/*
			 * Thread.sleep(2000);
			 * 
			 * AVm.EmailID(Email);
			 * 
			 * Thread.sleep(2000); Vm.save(); Alert al=driver.switchTo().alert(); String
			 * alertMessage=driver.switchTo().alert().getText();
			 * System.out.println(alertMessage); Thread.sleep(3000); al.accept();
			 * driver.navigate().refresh();
			 */

		}

	}
}
