package Com.UIIC.scripts1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Com.UIIC.generics.BaseTestclass;
import Com.UIIC.generics.FWUtills;
import Com.UIIC.object.GenericMasterPage;
import Com.UIIC.object.GenericPage;
import Com.UIIC.object.HomePage;
import Com.UIIC.objects1.UserIdConfigurationforTieUpsAddModifyandViewPage;

public class TestUseridConfigurationTipupsAddPage extends BaseTestclass {

	@Test
	public void UseridConfigurationTipups_Add() throws InterruptedException {

		String us = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 0);
		String ps = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 1);
		String role = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 2);
		// String HomePage = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 3);
		Thread.sleep(1000);

		String OEMuserid = FWUtills.read_XL_Data(XL_DATA_PATH, "UseridConfigurationTipups", 1, 0);

		System.out.println(us);
		System.out.println(ps);
		System.out.println(role);

		System.out.println(OEMuserid);

		HomePage hp = new HomePage(driver);
		hp.enterUser(us);
		Thread.sleep(1000);
		hp.selectRole();
		Select s = hp.selectRole1();
		s.selectByVisibleText(role);
		hp.enterPass(ps);
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
					Thread.sleep(1000);
					hp.enterPass(ps);
					hp.clickLogin();
				}
			}

			driver.switchTo().window(pwh);
			String exptitle = driver.getTitle();
			FWUtills.verifyTitleOfHomePage(driver, exptitle);
			driver.navigate().refresh();
			Thread.sleep(2000);
			GenericPage Gp = new GenericPage(driver);
			GenericMasterPage Gm = new GenericMasterPage(driver);
			Gp.clickGenericMaster1();
			Gm.clickUserIdConfiguration();
			Gm.clickUseridConfigurationAdd();
			Thread.sleep(1000);
			UserIdConfigurationforTieUpsAddModifyandViewPage Uc = new UserIdConfigurationforTieUpsAddModifyandViewPage(driver);
			WebElement frame1 = Uc.iframe;
			driver.switchTo().frame(frame1);

			Uc.enterOEMUserID(OEMuserid);
			Uc.clickSave();
			Set<String> handles3 = driver.getWindowHandles();
			for (String newwh3 : handles3) {
				driver.switchTo().window(newwh3);
				if (driver.getTitle().equals("Genisys Configurator Message Box")) {
					WebElement sucdata = driver.findElement(By.xpath("//span[@id='lblMessageText']"));
					String data = sucdata.getText();
					Thread.sleep(3000);
					System.out.println(data + "::::::::PopUp data");
					// FWUtills.write_Xl_DATA(REPORT_XL_DATA_PATH, "Vendor Master_Add", 1, 1,
					// data1);
					// driver.close();
				}
			}

		}
	}
}
