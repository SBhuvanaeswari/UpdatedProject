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

public class TestLandLordMasterViewPage extends BaseTestclass {

	@Test
	public void LandLordMaster_View() throws InterruptedException {

		String us = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 0);
		String ps = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 1);
		String role = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 2);
		Thread.sleep(1000);
		String name = FWUtills.read_XL_Data(XL_DATA_PATH, "LandlordMaster_Modify", 1, 0);
		String code = FWUtills.read_XL_Data(XL_DATA_PATH, "LandlordMaster_Modify", 1, 1);

		System.out.println(us);
		System.out.println(ps);
		System.out.println(role);
		System.out.println(name);
		System.out.println(code);

		WebDriverWait wait = new WebDriverWait(driver, 30);
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
			String data = driver.getTitle();
			FWUtills.verifyTitleOfHomePage(driver, data);
			driver.navigate().refresh();
			Thread.sleep(2000);
			GenericPage gm = new GenericPage(driver);
			gm.clickGenericMaster1();
			GenericMasterPage gmp = new GenericMasterPage(driver);
			gmp.clickLandlordMaster();
			gmp.clickLandlordMasterView();
			Thread.sleep(1000);
			LandlordMasterPage Lm = new LandlordMasterPage(driver);
			WebElement frame2 = Lm.iframe;
			driver.switchTo().frame(frame2);
			Lm.Viwlandname(name);
			Lm.Viwlandcode(code);
			Thread.sleep(1000);
			Lm.modifysearch();
			Lm.clickView();

		}
	}
}