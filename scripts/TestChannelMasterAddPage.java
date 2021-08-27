package Com.UIIC.scripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Com.UIIC.generics.BaseTestclass;
import Com.UIIC.generics.FWUtills;
import Com.UIIC.object.ChannelPage;
import Com.UIIC.object.GenericMasterPage;
import Com.UIIC.object.GenericPage;
import Com.UIIC.object.HomePage;

public class TestChannelMasterAddPage extends BaseTestclass {

	@Test
	public void ChannelMaster_Add() throws InterruptedException {

		String us = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 0);
		String ps = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 1);
		String role = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 2);
		String HomePage = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 3);
		Thread.sleep(1000);
		String Intermedianame = FWUtills.read_XL_Data(XL_DATA_PATH, "Channel Master_Add", 1, 0);
		String city = FWUtills.read_XL_Data(XL_DATA_PATH, "Channel Master_Add", 1, 1);
		String pcode = FWUtills.read_XL_Data(XL_DATA_PATH, "Channel Master_Add", 1, 2);
		String ploca = FWUtills.read_XL_Data(XL_DATA_PATH, "Channel Master_Add", 1, 3);
		String State = FWUtills.read_XL_Data(XL_DATA_PATH, "Channel Master_Add", 1, 4);
		String intermediacode = FWUtills.read_XL_Data(XL_DATA_PATH, "Channel Master_Add", 1, 5);
		String offcode = FWUtills.read_XL_Data(XL_DATA_PATH, "Channel Master_Add", 1, 6);
		String pannum = FWUtills.read_XL_Data(XL_DATA_PATH, "Channel Master_Add", 1, 7);
		String Licensenum = FWUtills.read_XL_Data(XL_DATA_PATH, "Channel Master_Add", 1, 8);
		String Strdt = FWUtills.read_XL_Data(XL_DATA_PATH, "Channel Master_Add", 1, 9);
		String flag = FWUtills.read_XL_Data(XL_DATA_PATH, "Channel Master_Add", 1, 11);
		String remark = FWUtills.read_XL_Data(XL_DATA_PATH, "Channel Master_Add", 1, 12);
		System.out.println(us);
		System.out.println(ps);
		System.out.println(role);
		System.out.println(Intermedianame);
		System.out.println(city);
		System.out.println(pcode);
		System.out.println(ploca);
		System.out.println(State);
		System.out.println(intermediacode);
		System.out.println(offcode);
		System.out.println(pannum);
		System.out.println(Licensenum);
		System.out.println(Strdt);
		System.out.println(flag);
		System.out.println(remark);
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
			GenericPage gm = new GenericPage(driver);
			gm.clickChanelSetup();
			GenericMasterPage gmp = new GenericMasterPage(driver);
			gmp.clickcreatechannel();

			Thread.sleep(1000);
			ChannelPage Cm = new ChannelPage(driver);
			WebElement frame1 = Cm.iframe;
			driver.switchTo().frame(frame1);
			Cm.Intermcode();
			String parent = driver.getWindowHandle();
			Set<String> p1 = driver.getWindowHandles();
			for (String lov : p1) {

				driver.switchTo().window(lov);
				String t1 = driver.getTitle();
				System.out.println(t1);
				if (t1.contains("GENISYS Configurator Login")) {

					System.out.println(t1);

				} else if (t1.contains("Generic LOV")) {
					// Cm.Intermnme(Intermedianame);
					// Cm.city(city);
					// Cm.pincode(pcode);
					// Cm.pinlocation(ploca);
					// Cm.state(State);
					Cm.Intermecode(intermediacode);
					Cm.offcode(offcode);
					// Cm.PanNo(pannum);
					// Cm.LicenseNo(Licensenum);
					Cm.LovSearch();
					Cm.LovSelect();
				}
			}
			driver.switchTo().window(parent);
			WebElement frame2 = Cm.iframe;
			driver.switchTo().frame(frame2);
			Thread.sleep(1000);
			Cm.Fire();
			Cm.Motor();
			Cm.Aviation();
			Cm.startDt(Strdt);
			Cm.Coverflag();
			Select s1 = Cm.Coverflag();
			s1.selectByVisibleText(flag);
			Cm.Remarks(remark);
			Thread.sleep(3000);
			Cm.save();
			Set<String> handles3 = driver.getWindowHandles();
			for (String newwh3 : handles3) {
				driver.switchTo().window(newwh3);
				if (driver.getTitle().equals("Genisys Configurator Message Box")) {
					WebElement sucdata = driver.findElement(By.xpath("//span[@id='lblMessageText']"));
					String data = sucdata.getText();
					Thread.sleep(3000);
					System.out.println(data + "::::::::PopUp data");
					
				}
			}

		}
	}
}
