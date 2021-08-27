package Com.UIIC.scripts1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Com.UIIC.generics.FWUtills;
import Com.UIIC.object.GenericMasterPage;
import Com.UIIC.object.GenericPage;
import Com.UIIC.object.HomePage;
import Com.UIIC.objects1.CityandDistrictMasterAddPage;
import Com.UIIC.generics.BaseTestclass;

public class TestCityAndDistrictMasterAddPage extends BaseTestclass {

	@Test
	public void CityDistrictMaster_Add() throws InterruptedException {

		String us = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 0);
		String ps = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 1);
		String role = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 2);
		// String HomePage = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 3);
		Thread.sleep(1000);

		String statename = FWUtills.read_XL_Data(XL_DATA_PATH, "CityAndDistrictMaster", 1, 1);
		String citydistrictname = FWUtills.read_XL_Data(XL_DATA_PATH, "CityAndDistrictMaster", 1, 2);
		String flag = FWUtills.read_XL_Data(XL_DATA_PATH, "CityAndDistrictMaster", 1, 3);
		String Zone = FWUtills.read_XL_Data(XL_DATA_PATH, "CityAndDistrictMaster", 1, 4);
		String RSMDZone = FWUtills.read_XL_Data(XL_DATA_PATH, "CityAndDistrictMaster", 1, 5);
		String STFIZone = FWUtills.read_XL_Data(XL_DATA_PATH, "CityAndDistrictMaster", 1, 6);
		String enddate = FWUtills.read_XL_Data(XL_DATA_PATH, "CityAndDistrictMaster", 1, 8);

		System.out.println(us);
		System.out.println(ps);
		System.out.println(role);

		System.out.println(statename);
		System.out.println(citydistrictname);
		System.out.println(flag);
		System.out.println(Zone);
		System.out.println(RSMDZone);
		System.out.println(STFIZone);
		System.out.println(enddate);
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
			String pwh =FWUtills.parentWindow(driver);
			Set<String> handles1 = FWUtills.childWindows(driver);
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
			 Gm.clickCityDisMaster();
			 Gm.clickCityDisMasterAdd();
			Thread.sleep(1000);
			CityandDistrictMasterAddPage Cm = new CityandDistrictMasterAddPage(driver);
	         FWUtills.switchToFrame(driver);
			Cm.clickstatecode();
			Thread.sleep(2000);
			String parent = FWUtills.parentWindow(driver);
			Set<String> p1 =FWUtills.childWindows(driver);
			for (String lov : p1) {

				driver.switchTo().window(lov);
				String t1 = driver.getTitle();
				System.out.println(t1);
				if (t1.contains("GENISYS Configurator Login")) {

					System.out.println(t1);

				} else if (t1.contains("Generic-LOV")) {
					
					
					Cm.lovstatename(statename);
					Thread.sleep(2000);
					Cm.btnsearch();
					Cm.Selectlink();
				}
			}
			driver.switchTo().window(parent);
			FWUtills.switchToFrame(driver);
			Thread.sleep(1000);
			Cm.cityanddistrictname(citydistrictname);
			Cm.citydistrictflag();
			Select s1 = Cm.dropdwncitydistrictflag();
			s1.selectByVisibleText(flag);
			Cm.EQZOne();
			Select s2 = Cm.dropdwnEQZOne();
			s2.selectByVisibleText(Zone);
			Cm.RSMDZone();
			Select s3 = Cm.dropdwnRSMDZone();
			s3.selectByVisibleText(RSMDZone);
			Cm.STFIZone();
			Select s4 = Cm.dropdwnSTFIZone();
			s4.selectByVisibleText(STFIZone);
			Cm.EndDate(enddate);
			Thread.sleep(1000);
			Cm.save();
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
