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
import Com.UIIC.object.VendorMasterAddPage;
import Com.UIIC.object.VendorMasterModifyPage;
import commonFuncctions.CommonFunctions;

public class TestLandLordMasterAddPage extends BaseTestclass {

	@Test
	public void LandLordMaster_Add() throws InterruptedException {

		String us = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 0);
		String ps = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 1);
		String role = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 2);
		Thread.sleep(1000);
		String name = FWUtills.read_XL_Data(XL_DATA_PATH, "LandlordMaster_Add", 1, 0);
		String Email = FWUtills.read_XL_Data(XL_DATA_PATH, "LandlordMaster_Add", 1, 1);
		String code = FWUtills.read_XL_Data(XL_DATA_PATH, "LandlordMaster_Add", 1, 2);
		String offname = FWUtills.read_XL_Data(XL_DATA_PATH, "LandlordMaster_Add", 1, 3);
		String std = FWUtills.read_XL_Data(XL_DATA_PATH, "LandlordMaster_Add", 1, 4);
		String phno = FWUtills.read_XL_Data(XL_DATA_PATH, "LandlordMaster_Add", 1, 5);
		String stdres = FWUtills.read_XL_Data(XL_DATA_PATH, "LandlordMaster_Add", 1, 6);
		String phnores = FWUtills.read_XL_Data(XL_DATA_PATH, "LandlordMaster_Add", 1, 7);
		String Mob = FWUtills.read_XL_Data(XL_DATA_PATH, "LandlordMaster_Add", 1, 8);
		String GSTNO = FWUtills.read_XL_Data(XL_DATA_PATH, "LandlordMaster_Add", 1, 9);
		String Addr = FWUtills.read_XL_Data(XL_DATA_PATH, "LandlordMaster_Add", 1, 10);
		String Add1 = FWUtills.read_XL_Data(XL_DATA_PATH, "LandlordMaster_Add", 1, 11);
		String Add2 = FWUtills.read_XL_Data(XL_DATA_PATH, "LandlordMaster_Add", 1, 12);
		String pcode = FWUtills.read_XL_Data(XL_DATA_PATH, "LandlordMaster_Add", 1, 13);
		String pname = FWUtills.read_XL_Data(XL_DATA_PATH, "LandlordMaster_Add", 1, 14);
		String Remarks = FWUtills.read_XL_Data(XL_DATA_PATH, "LandlordMaster_Add", 1, 15);
		String cat = FWUtills.read_XL_Data(XL_DATA_PATH, "LandlordMaster_Add", 1, 16);
		String Taxno = FWUtills.read_XL_Data(XL_DATA_PATH, "LandlordMaster_Add", 1, 17);
		String pano = FWUtills.read_XL_Data(XL_DATA_PATH, "LandlordMaster_Add", 1, 18);
		String RefNum = FWUtills.read_XL_Data(XL_DATA_PATH, "LandlordMaster_Add", 1, 19);
		String IFScode = FWUtills.read_XL_Data(XL_DATA_PATH, "LandlordMaster_Add", 1, 20);
		String Accnum = FWUtills.read_XL_Data(XL_DATA_PATH, "LandlordMaster_Add", 1, 21);
		String Acctype = FWUtills.read_XL_Data(XL_DATA_PATH, "LandlordMaster_Add", 1, 22);

		System.out.println(us);
		System.out.println(ps);
		System.out.println(role);
		System.out.println(name);
		System.out.println(Email);
		System.out.println(code);
		System.out.println(offname);
		System.out.println(std);
		System.out.println(phno);
		System.out.println(stdres);
		System.out.println(phnores);
		System.out.println(Mob);
		System.out.println(Addr);
		System.out.println(Add1);
		System.out.println(Add2);
		System.out.println(pcode);
		System.out.println(pname);
		System.out.println(Remarks);
		System.out.println(cat);
		System.out.println(Taxno);
		System.out.println(pano);
		System.out.println(RefNum);
		System.out.println(IFScode);
		System.out.println(Accnum);
		System.out.println(Acctype);
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
			gmp.clickLandlordMasterAdd();
			Thread.sleep(2000);
			LandlordMasterPage Lm = new LandlordMasterPage(driver);
			WebElement frame1 = Lm.iframe;
			driver.switchTo().frame(frame1);
			Lm.Landname(name);
			Lm.EmailID(Email);
			Thread.sleep(1000);
			Lm.Offcode();

			Set<String> p1 = driver.getWindowHandles();
			for (String lov : p1) {

				driver.switchTo().window(lov);
				String t1 = driver.getTitle();
				System.out.println(t1);
				if (t1.contains("GENISYS Configurator Login")) {

					System.out.println("LOV");

				} else if (t1.contains("Generic LOV")) {
					Lm.Offcode(code);
//				Lm.Offname(offname);
					Thread.sleep(2000);
					Lm.LovSearch();
					Lm.Lovselect();
				}
			}
			Thread.sleep(2000);

			driver.switchTo().window(parent);
			WebElement frame2 = Lm.iframe;
			driver.switchTo().frame(frame2);
			Thread.sleep(1000);
			Lm.OffStd(std);
			Lm.Officenumber(phno);
			Lm.STDResidence(stdres);
			Lm.PhoneNoResidence(phnores);
			Lm.Contact(Mob);
			Lm.GST(GSTNO);

			Lm.Addr(Addr);
			Lm.Addr1(Add1);
			Lm.Addr2(Add2);
			Lm.Pincode();
			Set<String> handles1 = driver.getWindowHandles();
			for (String newwh1 : handles1) {

				driver.switchTo().window(newwh1);
				String t1 = driver.getTitle();
				System.out.println(t1);
				if (t1.contains("GENISYS Configurator Login")) {

					System.out.println("LOV");

				} else if (t1.contains("Generic LOV")) {
					Lm.pincode(pcode);
//		 		Lm.pinname(pname);

					Lm.LovpinSearch();
					Thread.sleep(2000);
					Lm.Lovpinselect();
				}
			}

			driver.switchTo().window(parent);
			WebElement frame3 = Lm.iframe;
			driver.switchTo().frame(frame3);
			Lm.Remark(Remarks);
			Lm.catgoryclick();
			Select s1 = Lm.catgory();
			s1.selectByVisibleText(cat);
			Lm.TaxRegNo(Taxno);
			Lm.PANno(pano);
			Lm.Individualcompany();
			Lm.Referencenumber(RefNum);
			Lm.IFSCLink();
			Set<String> p3 = driver.getWindowHandles();
			for (String lov2 : p3) {

				driver.switchTo().window(lov2);
				String t1 = driver.getTitle();
				System.out.println(t1);
				if (t1.contains("GENISYS Configurator Login")) {

					System.out.println("LOV");

				} else if (t1.contains("Generic LOV")) {
					Lm.IFSCCode(IFScode);
					Lm.Search();
					Lm.Selec();
				}
			}
			Thread.sleep(2000);
			driver.switchTo().window(parent);
			WebElement e = Lm.iframe;
			driver.switchTo().frame(e);
			Lm.AccountNo(Accnum);
			Lm.AccountTypeclick();
			Select s2 = Lm.Acctype();
			s2.selectByVisibleText(Acctype);

			Thread.sleep(3000);

			Lm.save();
			Thread.sleep(4000);

			Set<String> handles3 = driver.getWindowHandles();
			for (String newwh3 : handles3) {
				driver.switchTo().window(newwh3);
				if (driver.getTitle().equals("Genisys Configurator Message Box")) {
					WebElement cust1 = driver.findElement(By.xpath("//span[@id='lblMessageText']"));
					String data1 = cust1.getText();
					Thread.sleep(3000);
					System.out.println(data1 + "::::::::PopUp data");
					FWUtills.write_Xl_DATA(REPORT_XL_DATA_PATH, "LandlordMaster_Add", 1, 1, data1);

				}
			}

		}
	}
}
