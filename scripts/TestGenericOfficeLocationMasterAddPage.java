package Com.UIIC.scripts;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;
import org.apache.poi.EncryptedDocumentException;
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
import Com.UIIC.object.GenericOfficeLocationMasterAddPage;
import Com.UIIC.object.GenericPage;
import Com.UIIC.object.HomePage;
import commonFuncctions.CommonFunctions;

public class TestGenericOfficeLocationMasterAddPage extends BaseTestclass {

	@Test
	public void OfficeLoaction_Add()throws InterruptedException, AWTException, EncryptedDocumentException, FileNotFoundException, IOException {

		String us = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 0);
		String ps = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 1);
		String role = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 2);
		Thread.sleep(1000);
		String offcode = FWUtills.read_XL_Data(XL_DATA_PATH, "OfficeLocationMasterAddPage", 1, 0);
		String offname = FWUtills.read_XL_Data(XL_DATA_PATH, "OfficeLocationMasterAddPage", 1, 1);
		String rol = FWUtills.read_XL_Data(XL_DATA_PATH, "OfficeLocationMasterAddPage", 1, 2);
		String lovofcode = FWUtills.read_XL_Data(XL_DATA_PATH, "OfficeLocationMasterAddPage", 1, 3);
		String lovofname = FWUtills.read_XL_Data(XL_DATA_PATH, "OfficeLocationMasterAddPage", 1, 4);
		String Enddate = FWUtills.read_XL_Data(XL_DATA_PATH, "OfficeLocationMasterAddPage", 1, 5);
		String Addr = FWUtills.read_XL_Data(XL_DATA_PATH, "OfficeLocationMasterAddPage", 1, 6);
		String Address2 = FWUtills.read_XL_Data(XL_DATA_PATH, "OfficeLocationMasterAddPage", 1, 7);
		String Address3 = FWUtills.read_XL_Data(XL_DATA_PATH, "OfficeLocationMasterAddPage", 1, 8);
		String Pinlocation = FWUtills.read_XL_Data(XL_DATA_PATH, "OfficeLocationMasterAddPage", 1, 9);
		String pincode = FWUtills.read_XL_Data(XL_DATA_PATH, "OfficeLocationMasterAddPage", 1, 10);
		String std = FWUtills.read_XL_Data(XL_DATA_PATH, "OfficeLocationMasterAddPage", 1, 11);
		String phone = FWUtills.read_XL_Data(XL_DATA_PATH, "OfficeLocationMasterAddPage", 1, 12);
		String std1 = FWUtills.read_XL_Data(XL_DATA_PATH, "OfficeLocationMasterAddPage", 1, 13);
		String phone1 = FWUtills.read_XL_Data(XL_DATA_PATH, "OfficeLocationMasterAddPage", 1, 14);
		String fasstdno = FWUtills.read_XL_Data(XL_DATA_PATH, "OfficeLocationMasterAddPage", 1, 15);
		String faxlandno = FWUtills.read_XL_Data(XL_DATA_PATH, "OfficeLocationMasterAddPage", 1, 16);
		String taxnum = FWUtills.read_XL_Data(XL_DATA_PATH, "OfficeLocationMasterAddPage", 1, 17);
		String gst = FWUtills.read_XL_Data(XL_DATA_PATH, "OfficeLocationMasterAddPage", 1, 18);
		String comoffcode = FWUtills.read_XL_Data(XL_DATA_PATH, "OfficeLocationMasterAddPage", 1, 19);
		String comoffname = FWUtills.read_XL_Data(XL_DATA_PATH, "OfficeLocationMasterAddPage", 1, 20);
		String tdsno = FWUtills.read_XL_Data(XL_DATA_PATH, "OfficeLocationMasterAddPage", 1, 21);

		System.out.println(us);
		System.out.println(ps);
		System.out.println(role);
		System.out.println(offcode);
		System.out.println(offname);
		System.out.println(rol);
		System.out.println(lovofcode);
		System.out.println(lovofname);
		System.out.println(Enddate);
		System.out.println(Addr);
		System.out.println(Address2);
		System.out.println(Address3);
		System.out.println(Pinlocation);
		System.out.println(pincode);
		System.out.println(std);
		System.out.println(phone);
		System.out.println(std1);
		System.out.println(phone1);
		System.out.println(fasstdno);
		System.out.println(faxlandno);
		System.out.println(taxnum);
		System.out.println(gst);
		System.out.println(comoffcode);
		System.out.println(comoffname);
		System.out.println(tdsno);
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

			driver.switchTo().window(pwh);
			String data = driver.getTitle();
			FWUtills.verifyTitleOfHomePage(driver, data);
			driver.navigate().refresh();
			Thread.sleep(2000);
			GenericPage gm = new GenericPage(driver);
			gm.clickGenericMaster1();
			GenericMasterPage gmp = new GenericMasterPage(driver);
			gmp.clickOfficeLocationMaster();
			gmp.clickOfficeLocationMasterAdd();
			Thread.sleep(1000);
			GenericOfficeLocationMasterAddPage offloc = new GenericOfficeLocationMasterAddPage(driver);
			WebElement frame1 = offloc.iframe;
			driver.switchTo().frame(frame1);
			offloc.OfficeCode(offcode);
			offloc.OfficeName(offname);
			offloc.offtypeclick();
			Select offtyp = offloc.OfficeType();
			offtyp.selectByVisibleText(rol);
			Thread.sleep(5000);
			String parent = driver.getWindowHandle();
			if(rol.equalsIgnoreCase("RO")||rol.equalsIgnoreCase("DO")||rol.equalsIgnoreCase("BO")||rol.equalsIgnoreCase("MO")||rol.equalsIgnoreCase("CO")) {
			offloc.ParentOffice();
			
			Set<String> handles = driver.getWindowHandles();
			for (String lov : handles) {

				driver.switchTo().window(lov);
				String t1 = driver.getTitle();
				System.out.println(t1);
				if (t1.contains("GENISYS Configurator Login")) {

					System.out.println("LOV");

				} else if (t1.contains("Generic LOV")) {
					Thread.sleep(2000);
					offloc.LovPatOffcode(lovofcode);
//				offloc.LovPatOffname.sendKeys(lovofname);
					offloc.patsubmit();
					Thread.sleep(2000);
					offloc.selectlink();

				}
			}

			driver.switchTo().window(parent);
			WebElement frame2 = offloc.iframe;
			driver.switchTo().frame(frame2);
			Thread.sleep(1000);
			}
			offloc.Enddt(Enddate);
			offloc.Address(Addr);
			offloc.Addr2(Address2);
			offloc.Addr3(Address3);
			offloc.Pincode();
			Set<String> handles1 = driver.getWindowHandles();
			for (String newwh1 : handles1) {
				driver.switchTo().window(newwh1);
				String t1 = driver.getTitle();
				System.out.println(t1);
				if (t1.contains("GENISYS Configurator Login")) {

					System.out.println("LOV");

				} else if (t1.contains("Generic LOV")) {
//				offloc.LovPatOffcode.sendKeys(Pinlocation);
					offloc.LovPatOffname(pincode);

					offloc.patsubmit();
					Thread.sleep(2000);
					offloc.selectlink();
				}
			}

			driver.switchTo().window(parent);
			WebElement frame3 = offloc.iframe;
			driver.switchTo().frame(frame3);

			offloc.Std(std);
			offloc.PhoneNo(phone);
			offloc.STD2(std1);
			offloc.phoneno2(phone1);
			offloc.faxstd(fasstdno);
			offloc.faxlandline(faxlandno);
			if(rol.equalsIgnoreCase("RO")||rol.equalsIgnoreCase("DO")) {
			offloc.checkhub();
			}
			offloc.Taxno(taxnum);
			offloc.GSTIN(gst);
			offloc.CompOfficeCode();
			Set<String> handles2 = driver.getWindowHandles();
			for (String newwh2 : handles2) {
				driver.switchTo().window(newwh2);
				String t1 = driver.getTitle();
				System.out.println(t1);
				if (t1.contains("GENISYS Configurator Login")) {

					System.out.println("LOV");

				} else if (t1.contains("Generic LOV")) {
					offloc.LovPatOffcode(comoffcode);
//				offloc.LovPatOffname.sendKeys(comoffname);
					offloc.patsubmit();
					Thread.sleep(2000);
					offloc.selectlink();
				}
			}

			driver.switchTo().window(parent);
			WebElement frame4 = offloc.iframe;
			driver.switchTo().frame(frame4);
			offloc.GSTTDS(tdsno);
			Thread.sleep(1000);

			offloc.Submit();
			Set<String> handles3 = driver.getWindowHandles();
			for (String newwh3 : handles3) {
				driver.switchTo().window(newwh3);
				if (driver.getTitle().equals("Genisys Configurator Message Box")) {
					WebElement sucdata = driver.findElement(By.xpath("//span[@id='lblMessageText']"));
					String data1 = sucdata.getText();
					Thread.sleep(3000);
					System.out.println(data1 + "::::::::PopUp data");
					
				}
			}

			/*
			 * Set<String> handles3 = driver.getWindowHandles(); for (String newwh3 :
			 * handles3) { driver.switchTo().window(newwh3); if
			 * (driver.getTitle().equals("Genisys Configurator Message Box")) {
			 * driver.close(); } }
			 * 
			 * driver.switchTo().window(parent); WebElement frame5 = offloc.iframe;
			 * driver.switchTo().frame(frame5); Thread.sleep(1000);
			 * driver.navigate().refresh();
			 */

		}
	}
}
