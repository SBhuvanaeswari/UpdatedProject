package Com.UIIC.scripts;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Com.UIIC.generics.BaseTestclass;
import Com.UIIC.generics.FWUtills;
import Com.UIIC.object.ContractorMasterPage;
import Com.UIIC.object.GenericMasterPage;
import Com.UIIC.object.GenericOfficeLocationMasterAddPage;
import Com.UIIC.object.GenericPage;
import Com.UIIC.object.HomePage;
import commonFuncctions.CommonFunctions;

public class TestContractorMasterAddPage extends BaseTestclass {

	@Test
	public void ContractorMaster_Add() throws InterruptedException {

		String us = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 0);
		String ps = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 1);
		String role = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 2);
		Thread.sleep(1000);
		String conname = FWUtills.read_XL_Data(XL_DATA_PATH, "ContractorMaster_Add", 1, 0);
		String Licensenum = FWUtills.read_XL_Data(XL_DATA_PATH, "ContractorMaster_Add", 1, 1);
		String Appoindt = FWUtills.read_XL_Data(XL_DATA_PATH, "ContractorMaster_Add", 1, 2);
		String expdt = FWUtills.read_XL_Data(XL_DATA_PATH, "ContractorMaster_Add", 1, 3);
		String Email = FWUtills.read_XL_Data(XL_DATA_PATH, "ContractorMaster_Add", 1, 4);
		String offcode = FWUtills.read_XL_Data(XL_DATA_PATH, "ContractorMaster_Add", 1, 5);
		String offname = FWUtills.read_XL_Data(XL_DATA_PATH, "ContractorMaster_Add", 1, 6);
		String std = FWUtills.read_XL_Data(XL_DATA_PATH, "ContractorMaster_Add", 1, 7);
		String stdphone = FWUtills.read_XL_Data(XL_DATA_PATH, "ContractorMaster_Add", 1, 8);
		String resstd = FWUtills.read_XL_Data(XL_DATA_PATH, "ContractorMaster_Add", 1, 9);
		String respho = FWUtills.read_XL_Data(XL_DATA_PATH, "ContractorMaster_Add", 1, 10);
		String Mobile = FWUtills.read_XL_Data(XL_DATA_PATH, "ContractorMaster_Add", 1, 11);
		String bsns = FWUtills.read_XL_Data(XL_DATA_PATH, "ContractorMaster_Add", 1, 12);
		String gst = FWUtills.read_XL_Data(XL_DATA_PATH, "ContractorMaster_Add", 1, 13);
		String Addr = FWUtills.read_XL_Data(XL_DATA_PATH, "ContractorMaster_Add", 1, 14);
		String Add2 = FWUtills.read_XL_Data(XL_DATA_PATH, "ContractorMaster_Add", 1, 15);
		String Add3 = FWUtills.read_XL_Data(XL_DATA_PATH, "ContractorMaster_Add", 1, 16);
		String pcode = FWUtills.read_XL_Data(XL_DATA_PATH, "ContractorMaster_Add", 1, 17);
		String pname = FWUtills.read_XL_Data(XL_DATA_PATH, "ContractorMaster_Add", 1, 18);
		String remar = FWUtills.read_XL_Data(XL_DATA_PATH, "ContractorMaster_Add", 1, 19);
		String Taxno = FWUtills.read_XL_Data(XL_DATA_PATH, "ContractorMaster_Add", 1, 20);
		String cat = FWUtills.read_XL_Data(XL_DATA_PATH, "ContractorMaster_Add", 1, 21);
		String pano = FWUtills.read_XL_Data(XL_DATA_PATH, "ContractorMaster_Add", 1, 22);
		String ctype = FWUtills.read_XL_Data(XL_DATA_PATH, "ContractorMaster_Add", 1, 23);
		String RefNum = FWUtills.read_XL_Data(XL_DATA_PATH, "ContractorMaster_Add", 1, 24);
		String IFScode = FWUtills.read_XL_Data(XL_DATA_PATH, "ContractorMaster_Add", 1, 25);
		String Accnum = FWUtills.read_XL_Data(XL_DATA_PATH, "ContractorMaster_Add", 1, 26);
		String Acctype = FWUtills.read_XL_Data(XL_DATA_PATH, "ContractorMaster_Add", 1, 27);

		System.out.println(us);
		System.out.println(ps);
		System.out.println(role);

		System.out.println(conname);
		System.out.println(Licensenum);
		System.out.println(Appoindt);
		System.out.println(expdt);
		System.out.println(Email);
		System.out.println(offcode);
		System.out.println(offname);
		System.out.println(std);
		System.out.println(stdphone);
		System.out.println(resstd);
		System.out.println(respho);
		System.out.println(Mobile);
		System.out.println(bsns);
		System.out.println(gst);
		System.out.println(Addr);
		System.out.println(Add2);
		System.out.println(Add3);
		System.out.println(pcode);
		System.out.println(pname);
		System.out.println(remar);
		System.out.println(Taxno);
		System.out.println(cat);
		System.out.println(pano);
		System.out.println(ctype);
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
			gmp.clickContractorMaster();
			gmp.clickContractorMasterAdd();
			Thread.sleep(3000);
			ContractorMasterPage contrms = new ContractorMasterPage(driver);
			WebElement frame1 = contrms.iframe;
			driver.switchTo().frame(frame1);
			contrms.ContractName(conname);
			contrms.License(Licensenum);
			contrms.Appoinmentdt(Appoindt);
			contrms.Expirydate(expdt);
			contrms.EmailID(Email);
			contrms.officecode();
			Thread.sleep(1000);

			Set<String> handles = driver.getWindowHandles();
			for (String newwh : handles) {

				driver.switchTo().window(newwh);
				String t1 = driver.getTitle();
				System.out.println(t1);
				if (t1.contains("GENISYS Configurator Login")) {

					System.out.println("LOV");

				} else if (t1.contains("Generic LOV")) {
					Thread.sleep(2000);
					contrms.LovOfficecode(offcode);
					// contrms.LovOfficename(offname);
					contrms.search();
					Thread.sleep(2000);
					contrms.Selectbtn();
				}
			}

			driver.switchTo().window(parent);
			WebElement frame2 = contrms.iframe;
			driver.switchTo().frame(frame2);
			Thread.sleep(1000);
			contrms.OfficeSTD(std);
			contrms.Officephoneno(stdphone);
			contrms.STDResidence(resstd);
			contrms.ResidencePhoneno(respho);
			contrms.Mobilenum(Mobile);
			contrms.ContractorBsns(bsns);
			contrms.GSTNo(gst);
			contrms.Addr1(Addr);
			contrms.Address2(Add2);
			contrms.Address3(Add3);
			contrms.pincode();
			Thread.sleep(1000);
			Set<String> p1 = driver.getWindowHandles();
			for (String lov : p1) {

				driver.switchTo().window(lov);
				String t1 = driver.getTitle();
				System.out.println(t1);
				if (t1.contains("GENISYS Configurator Login")) {

					System.out.println("LOV");

				} else if (t1.contains("Generic LOV")) {
					contrms.LovOfficecode(pcode);
					// contrms.LovOfficename(pname);
					contrms.search();
					Thread.sleep(2000);
					contrms.Selectbtn();
				}
			}

			driver.switchTo().window(parent);
			WebElement frame3 = contrms.iframe;
			driver.switchTo().frame(frame3);
			Thread.sleep(1000);
			contrms.Remark(remar);
			contrms.TaxRegNo(Taxno);
			contrms.catgoryclick();
			Select s1 = contrms.catgory();
			s1.selectByVisibleText(cat);
			contrms.PANno(pano);
			contrms.Individualcompany();
			contrms.Contracttype(ctype);
			contrms.Referencenumber(RefNum);

			contrms.IFSCLink();
			Set<String> p3 = driver.getWindowHandles();
			for (String lov2 : p3) {

				driver.switchTo().window(lov2);
				String t1 = driver.getTitle();
				System.out.println(t1);
				if (t1.contains("GENISYS Configurator Login")) {

					System.out.println("LOV");

				} else if (t1.contains("Generic LOV")) {
					contrms.IFSCCode(IFScode);
					contrms.search();
					contrms.Selectbtn();
				}
			}

			driver.switchTo().window(parent);
			WebElement e = contrms.iframe;
			driver.switchTo().frame(e);
			contrms.AccountNo(Accnum);
			contrms.AccountTypeclick();
			Select s2 = contrms.Acctype();
			s2.selectByVisibleText(Acctype);
			Thread.sleep(2000);
			contrms.Submitclick();

			Thread.sleep(3000);
			Set<String> handles2 = driver.getWindowHandles();
			for (String newwh2 : handles2) {
				driver.switchTo().window(newwh2);
				if (driver.getTitle().equals("Genisys Configurator Message Box")) {
					WebElement con = driver.findElement(By.xpath("//span[@id='lblMessageText']"));
					String data1 = con.getText();
					Thread.sleep(3000);
					System.out.println(data1 + "::::::::PopUp data");
					FWUtills.write_Xl_DATA(REPORT_XL_DATA_PATH, "Contractor Master_Add", 2, 2, data1);
					// driver.close();
				}
			}


		}

	}

}
