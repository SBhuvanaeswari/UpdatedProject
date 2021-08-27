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
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.UIIC.generics.BaseTestclass;
import Com.UIIC.generics.FWUtills;
import Com.UIIC.object.CoInsuranceOffMasterPage;
import Com.UIIC.object.GenericMasterPage;
import Com.UIIC.object.GenericPage;
import Com.UIIC.object.HomePage;
import commonFuncctions.CommonFunctions;

public class TestCoInsuranceOfficeMasterAddPage extends BaseTestclass {

	@Test
	public void CoInsuranceOfficeMaster_Add() throws InterruptedException {

		String us = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 0);
		String ps = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 1);
		String role = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 2);
		Thread.sleep(1000);
		String coinsucode = FWUtills.read_XL_Data(XL_DATA_PATH, "CoInsuranceMaster_Add", 1, 0);
		String coinsuname = FWUtills.read_XL_Data(XL_DATA_PATH, "CoInsuranceMaster_Add", 1, 1);
		String offcode = FWUtills.read_XL_Data(XL_DATA_PATH, "CoInsuranceMaster_Add", 1, 2);
		String Addr = FWUtills.read_XL_Data(XL_DATA_PATH, "CoInsuranceMaster_Add", 1, 3);
		String Addr2 = FWUtills.read_XL_Data(XL_DATA_PATH, "CoInsuranceMaster_Add", 1, 4);
		String Addr3 = FWUtills.read_XL_Data(XL_DATA_PATH, "CoInsuranceMaster_Add", 1, 5);
		String pcode = FWUtills.read_XL_Data(XL_DATA_PATH, "CoInsuranceMaster_Add", 1, 6);
		String ploc = FWUtills.read_XL_Data(XL_DATA_PATH, "CoInsuranceMaster_Add", 1, 7);
		String std = FWUtills.read_XL_Data(XL_DATA_PATH, "CoInsuranceMaster_Add", 1, 8);
		String pho = FWUtills.read_XL_Data(XL_DATA_PATH, "CoInsuranceMaster_Add", 1, 9);
		String Email = FWUtills.read_XL_Data(XL_DATA_PATH, "CoInsuranceMaster_Add", 1, 10);
		String gstno = FWUtills.read_XL_Data(XL_DATA_PATH, "CoInsuranceMaster_Add", 1, 11);
		String bcode = FWUtills.read_XL_Data(XL_DATA_PATH, "CoInsuranceMaster_Add", 1, 12);
		String bankname = FWUtills.read_XL_Data(XL_DATA_PATH, "CoInsuranceMaster_Add", 1, 13);
		String brchcode = FWUtills.read_XL_Data(XL_DATA_PATH, "CoInsuranceMaster_Add", 1, 14);
		String brchname = FWUtills.read_XL_Data(XL_DATA_PATH, "CoInsuranceMaster_Add", 1, 15);
		String IFSC = FWUtills.read_XL_Data(XL_DATA_PATH, "CoInsuranceMaster_Add", 1, 16);
		String MICR = FWUtills.read_XL_Data(XL_DATA_PATH, "CoInsuranceMaster_Add", 1, 17);
		String Accno = FWUtills.read_XL_Data(XL_DATA_PATH, "CoInsuranceMaster_Add", 1, 18);
		String Acctype = FWUtills.read_XL_Data(XL_DATA_PATH, "CoInsuranceMaster_Add", 1, 19);

		System.out.println(us);
		System.out.println(ps);
		System.out.println(role);
		System.out.println(coinsucode);
		System.out.println(coinsuname);
		System.out.println(offcode);
		System.out.println(Addr);
		System.out.println(Addr2);
		System.out.println(Addr3);
		System.out.println(pcode);
		System.out.println(ploc);
		System.out.println(std);
		System.out.println(pho);
		System.out.println(Email);
		System.out.println(gstno);
		System.out.println(bcode);
		System.out.println(bankname);
		System.out.println(brchcode);
		System.out.println(brchname);
		System.out.println(IFSC);
		System.out.println(MICR);
		System.out.println(Accno);
		System.out.println(Acctype);
		WebDriverWait wait = new WebDriverWait(driver, 10);
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
			String parent = driver.getWindowHandle();
			Set<String> handles0 = driver.getWindowHandles();
			for (String newwh0 : handles0) {
				String title = driver.getTitle();
				System.out.println(title);

				driver.switchTo().window(newwh0);
				if (title.contains("Genisys Configurator Message Box")) {

					driver.close();
				} else if (title.contains("UIIC - GENISYS CONFIGURATOR LOGIN")) {
					Thread.sleep(2000);
					hp.enterPass(ps);
					Thread.sleep(2000);
					hp.clickLogin();
				}
			}

			driver.switchTo().window(parent);
			String exptitle = driver.getTitle();
			FWUtills.verifyTitleOfHomePage(driver, exptitle);
			driver.navigate().refresh();
			Thread.sleep(2000);
		    GenericPage gm = new GenericPage(driver);
		    gm.clickGenericMaster1();
		    GenericMasterPage gmp = new GenericMasterPage(driver);
		    gmp.clickCoInsuranceOffmaster();
		    gmp.clickCoInsuranceOffmasterAdd();
		    Thread.sleep(1000);
			CoInsuranceOffMasterPage coinsu = new CoInsuranceOffMasterPage(driver);
			WebElement frame1 = coinsu.frame;
			driver.switchTo().frame(frame1);
			coinsu.Comcode();
			Set<String> handles = driver.getWindowHandles();
			for (String newwh : handles) {

				driver.switchTo().window(newwh);

			}
			Thread.sleep(2000);
			// insu.Insurcompcode(coinsucode);
			coinsu.Lovcomname(coinsuname);
			coinsu.LovSearch();
			Thread.sleep(2000);
			coinsu.LovSelect();

			driver.switchTo().window(parent);
			WebElement frame2 = coinsu.frame;
			driver.switchTo().frame(frame2);
			Thread.sleep(1000);
			coinsu.offcode(offcode);
			coinsu.Addr1(Addr);
			coinsu.Addr2(Addr2);
			coinsu.Addr3(Addr3);
			coinsu.pincode();
			Set<String> handles1 = driver.getWindowHandles();
			for (String newwh1 : handles1) {

				driver.switchTo().window(newwh1);
				String t1 = driver.getTitle();
				System.out.println(t1);
				if (t1.contains("GENISYS Configurator Login")) {

					System.out.println("LOV");

				} else if (t1.contains("Generic LOV")) {
					coinsu.Lovpincode(pcode);
					// oinsu.Lovpincodeloc(ploc);
					coinsu.LoSearch();
					coinsu.LoSelect();
				}
			}

			driver.switchTo().window(parent);
			WebElement frame3 = coinsu.frame;
			driver.switchTo().frame(frame3);
			Thread.sleep(1000);
			coinsu.Std(std);
			coinsu.Phoneno(pho);
			coinsu.EmailID(Email);
			coinsu.gstin(gstno);
			Thread.sleep(2000);
			coinsu.Bankcode();
			Thread.sleep(1000);
			Set<String> handles2 = driver.getWindowHandles();
			for (String newwh2 : handles2) {

				driver.switchTo().window(newwh2);
				String t1 = driver.getTitle();
				System.out.println(t1);
				if (t1.contains("GENISYS Configurator Login")) {

					System.out.println("LOV");

				} else if (t1.contains("Generic LOV")) {
					Thread.sleep(2000);
					coinsu.Lovbankbrhcode(bcode);
					// oinsu.Lovbankname.sendKeys(bankname);
					coinsu.LoSearch();
					coinsu.LoSelect();
				}
			}

			driver.switchTo().window(parent);
			WebElement frame4 = coinsu.frame;
			driver.switchTo().frame(frame4);
			Thread.sleep(1000);
			coinsu.Bankbrch();
			Thread.sleep(1000);
			Set<String> handles3 = driver.getWindowHandles();
			for (String newwh3 : handles3) {

				driver.switchTo().window(newwh3);
				String t1 = driver.getTitle();
				System.out.println(t1);
				if (t1.contains("GENISYS Configurator Login")) {

					System.out.println("LOV");

				} else if (t1.contains("Generic LOV")) {
					coinsu.Lovbankbrhcode(brchcode);
					// insu.Lovbankname(brchname);
					// insu.LovIFSC(IFSC);
					// insu.LovMICR(MICR);
					coinsu.LoSearch();
					Thread.sleep(2000);
					coinsu.LoSelect();
				}
			}
			Thread.sleep(2000);

			driver.switchTo().window(parent);
			WebElement frame5 = coinsu.frame;
			driver.switchTo().frame(frame5);
			Thread.sleep(1000);
			coinsu.Accno(Accno);

			coinsu.BankAccType();
			Select offtyp = coinsu.BankAccType();
			offtyp.selectByVisibleText(Acctype);
			Thread.sleep(2000);
			coinsu.Save();

			Set<String> handles4 = driver.getWindowHandles();
			for (String newwh4 : handles4) {
				driver.switchTo().window(newwh4);
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
