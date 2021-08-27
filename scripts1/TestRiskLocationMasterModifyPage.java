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
import Com.UIIC.objects1.RiskLocationMasterModifyandViewPage;


public class TestRiskLocationMasterModifyPage extends BaseTestclass {

	@Test
	public void RiskLocationMaster_Modify() throws InterruptedException {

		String us = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 0);
		String ps = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 1);
		String role = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 2);
		// String HomePage = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 3);
		Thread.sleep(1000);

		
		String addr1 = FWUtills.read_XL_Data(XL_DATA_PATH, "RiskLocationMaster", 1, 0);
		String addr2 = FWUtills.read_XL_Data(XL_DATA_PATH, "RiskLocationMaster", 1, 1);
		String addr3 = FWUtills.read_XL_Data(XL_DATA_PATH, "RiskLocationMaster", 1, 2);
		String pcode = FWUtills.read_XL_Data(XL_DATA_PATH, "RiskLocationMaster", 1, 3);
		String loccode = FWUtills.read_XL_Data(XL_DATA_PATH, "RiskLocationMaster", 1, 7);
		
		
		

		System.out.println(us);
		System.out.println(ps);
		System.out.println(role);
		System.out.println(pcode);
		System.out.println(loccode);
		System.out.println(addr1);
		System.out.println(addr2);
		System.out.println(addr3);
		
	
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
			 Gm.clickRiskLocationMaster();
			 Gm.clickRiskLocationMasterModify();
			Thread.sleep(1000);
			RiskLocationMasterModifyandViewPage Rm = new RiskLocationMasterModifyandViewPage(driver);
			WebElement frame1 = Rm.iframe;
			driver.switchTo().frame(frame1);
			Thread.sleep(1000);
            Rm.enterlocationcode(loccode);
            Rm.enterAddress1(addr1);
            Rm.enterAddress2(addr2);
            Rm.enterAddress3(addr3);
			Rm.clickPinCode();
			String parent = driver.getWindowHandle();
			Set<String> p1 = driver.getWindowHandles();
			for (String lov : p1) {

				driver.switchTo().window(lov);
				String t1 = driver.getTitle();
				System.out.println(t1);
				if (t1.contains("GENISYS Configurator Login")) {

					System.out.println(t1);

				} else if (t1.contains("Generic LOV")) {
					Thread.sleep(1000);
					Rm.enterPinCode(pcode);
					Rm.clickSearch();
					Rm.Selectlink();
				}
			}
			driver.switchTo().window(parent);
			WebElement frame2 = Rm.iframe;
			driver.switchTo().frame(frame2);
			Rm.clickModifySearch();
			
			
		}
	}
}
