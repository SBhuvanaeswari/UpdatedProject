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
import Com.UIIC.object.FinancierBranchMasterPage;
import Com.UIIC.object.GenericMasterPage;
import Com.UIIC.object.GenericPage;
import Com.UIIC.object.HomePage;
import Com.UIIC.object.LandlordMasterPage;
import commonFuncctions.CommonFunctions;

public class TestFinancierBranchMasterAddPage extends BaseTestclass {

	@Test
	public void FinancierBranchMaster_Add() throws InterruptedException {

		String us = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 0);
		String ps = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 1);
		String role = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 2);
		Thread.sleep(1000);
		String fincode = FWUtills.read_XL_Data(XL_DATA_PATH, "FinancierBranchMaster_Add", 1, 0);
		String finaname = FWUtills.read_XL_Data(XL_DATA_PATH, "FinancierBranchMaster_Add", 1, 1);
		String finbrchname = FWUtills.read_XL_Data(XL_DATA_PATH, "FinancierBranchMaster_Add", 1, 2);
		String Addr = FWUtills.read_XL_Data(XL_DATA_PATH, "FinancierBranchMaster_Add", 1, 3);
		String Add2 = FWUtills.read_XL_Data(XL_DATA_PATH, "FinancierBranchMaster_Add", 1, 4);
		String Add3 = FWUtills.read_XL_Data(XL_DATA_PATH, "FinancierBranchMaster_Add", 1, 5);
		String pcode = FWUtills.read_XL_Data(XL_DATA_PATH, "FinancierBranchMaster_Add", 1, 6);
		String pname = FWUtills.read_XL_Data(XL_DATA_PATH, "FinancierBranchMaster_Add", 1, 7);
		String Zone = FWUtills.read_XL_Data(XL_DATA_PATH, "FinancierBranchMaster_Add", 1, 8);
		String lastd = FWUtills.read_XL_Data(XL_DATA_PATH, "FinancierBranchMaster_Add", 1, 9);
		String landline = FWUtills.read_XL_Data(XL_DATA_PATH, "FinancierBranchMaster_Add", 1, 10);
		String faxisd = FWUtills.read_XL_Data(XL_DATA_PATH, "FinancierBranchMaster_Add", 1, 11);
		String faxstdno = FWUtills.read_XL_Data(XL_DATA_PATH, "FinancierBranchMaster_Add", 1, 12);
		String faxlandno = FWUtills.read_XL_Data(XL_DATA_PATH, "FinancierBranchMaster_Add", 1, 13);
		String emai = FWUtills.read_XL_Data(XL_DATA_PATH, "FinancierBranchMaster_Add", 1, 14);
		String ifccode = FWUtills.read_XL_Data(XL_DATA_PATH, "FinancierBranchMaster_Add", 1, 15);
		String miccode = FWUtills.read_XL_Data(XL_DATA_PATH, "FinancierBranchMaster_Add", 1, 16);
		String pano = FWUtills.read_XL_Data(XL_DATA_PATH, "FinancierBranchMaster_Add", 1, 17);
		String subcat = FWUtills.read_XL_Data(XL_DATA_PATH, "FinancierBranchMaster_Add", 1, 18);
		String startdt = FWUtills.read_XL_Data(XL_DATA_PATH, "FinancierBranchMaster_Add", 1, 19);
		String enddt = FWUtills.read_XL_Data(XL_DATA_PATH, "FinancierBranchMaster_Add", 1, 20);
		String bankcode = FWUtills.read_XL_Data(XL_DATA_PATH, "FinancierBranchMaster_Add", 1, 21);
		String bankname = FWUtills.read_XL_Data(XL_DATA_PATH, "FinancierBranchMaster_Add", 1, 22);
		String bcode = FWUtills.read_XL_Data(XL_DATA_PATH, "FinancierBranchMaster_Add", 1, 23);
		String bname = FWUtills.read_XL_Data(XL_DATA_PATH, "FinancierBranchMaster_Add", 1, 24);
		String lovifcode = FWUtills.read_XL_Data(XL_DATA_PATH, "FinancierBranchMaster_Add", 1, 25);
		String lovmircode = FWUtills.read_XL_Data(XL_DATA_PATH, "FinancierBranchMaster_Add", 1, 26);
		String Acc = FWUtills.read_XL_Data(XL_DATA_PATH, "FinancierBranchMaster_Add", 1, 27);
		String subcate = FWUtills.read_XL_Data(XL_DATA_PATH, "FinancierBranchMaster_Add", 1, 28);

		System.out.println(us);
		System.out.println(ps);
		System.out.println(role);

		System.out.println(fincode);
		System.out.println(finaname);
		System.out.println(finbrchname);
		System.out.println(Addr);
		System.out.println(Add2);
		System.out.println(Add3);
		System.out.println(pcode);
		System.out.println(pname);
		System.out.println(Zone);
		System.out.println(lastd);
		System.out.println(landline);
		System.out.println(faxisd);
		System.out.println(faxstdno);
		System.out.println(faxlandno);
		System.out.println(emai);
		System.out.println(ifccode);
		System.out.println(miccode);
		System.out.println(pano);
		System.out.println(subcat);
		System.out.println(startdt);
		System.out.println(enddt);
		System.out.println(bankcode);
		System.out.println(bankname);
		System.out.println(bcode);
		System.out.println(bname);
		System.out.println(lovifcode);
		System.out.println(lovmircode);
		System.out.println(Acc);
		System.out.println(subcate);

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
			gmp.clickFinancierBranchMaster();
			gmp.clickFinancierBranchMasterAdd();
			Thread.sleep(2000);
			FinancierBranchMasterPage Fbm = new FinancierBranchMasterPage(driver);
			WebElement frame1 = Fbm.iframe;
			driver.switchTo().frame(frame1);
			if(role.equalsIgnoreCase("RO UNDERWRITER")||role.equalsIgnoreCase("DO UNDERWRITER")||role.equalsIgnoreCase("BO UNDERWRITER")) {		
			Fbm.FinancierCode();
			Thread.sleep(1000);

			Set<String> handles = driver.getWindowHandles();
			for (String newwh : handles) {

				driver.switchTo().window(newwh);
			}
			Fbm.LovFincode(fincode);
			Fbm.Lovsrch();
			Fbm.Select();
			Thread.sleep(2000);
			driver.switchTo().window(parent);
			WebElement frame2 = Fbm.iframe;
			driver.switchTo().frame(frame2);
			Fbm.FinanceBranchname(finbrchname);
			Fbm.Address(Addr);
			Fbm.Addr2(Add2);
			Fbm.Addr3(Add3);
			Thread.sleep(2000);
			Fbm.pincode();
			Set<String> p3 = driver.getWindowHandles();
			for (String lov1 : p3) {

				driver.switchTo().window(lov1);
			}
			Fbm.Lovpincodee(pcode);
			Fbm.Pincodesearch();
			Thread.sleep(2000);
			Fbm.Pincodeselect();
			driver.switchTo().window(parent);
			WebElement frame3 = Fbm.iframe;
			driver.switchTo().frame(frame3);
			Fbm.Zoneclick();
			Select zone1 = Fbm.Zonecircle();
			zone1.selectByVisibleText(Zone);

			Fbm.landlinestd(lastd);
			Fbm.landlineno(landline);
			Fbm.faxISDno(faxisd);
			Fbm.faxstdno(faxstdno);
			Fbm.faxlandlinenum(faxlandno);
			Fbm.EMAILID(emai);
			Fbm.PAN(pano);
			Thread.sleep(1000);
			Fbm.catclick();
			Select c1 = Fbm.category();
			c1.selectByVisibleText(subcat);

			Fbm.startdate(startdt);
			Fbm.Enddt(enddt);
			
			}
			else {
				Fbm.FinancierCode();
				Thread.sleep(1000);

				Set<String> handles = driver.getWindowHandles();
				for (String newwh : handles) {

					driver.switchTo().window(newwh);
				}
				Fbm.LovFincode(fincode);
	   		    //Fbm.LovFinname(finaname);
				Fbm.Lovsrch();
				Fbm.Select();
				Thread.sleep(2000);
				driver.switchTo().window(parent);
				WebElement frame2 = Fbm.iframe;
				driver.switchTo().frame(frame2);
				Fbm.FinanceBranchname(finbrchname);
				Fbm.Address(Addr);
				Fbm.Addr2(Add2);
				Fbm.Addr3(Add3);
				Thread.sleep(2000);
				Fbm.pincode();
				Set<String> p3 = driver.getWindowHandles();
				for (String lov1 : p3) {

					driver.switchTo().window(lov1);
				}
				Fbm.Lovpincodee(pcode);
			    //Fbm.Lovpinlocation(pname);
				Fbm.Pincodesearch();
				Thread.sleep(2000);
				Fbm.Pincodeselect();
				driver.switchTo().window(parent);
				WebElement frame3 = Fbm.iframe;
				driver.switchTo().frame(frame3);
				Fbm.Zoneclick();
				Select zone1 = Fbm.Zonecircle();
				zone1.selectByVisibleText(Zone);

				Fbm.landlinestd(lastd);
				Fbm.landlineno(landline);
				Fbm.faxISDno(faxisd);
				Fbm.faxstdno(faxstdno);
				Fbm.faxlandlinenum(faxlandno);
				Fbm.EMAILID(emai);
				Fbm.IFSC(ifccode);
				Fbm.MICR(miccode);
				Fbm.PAN(pano);
				Thread.sleep(1000);
				Fbm.catclick();
				Select c1 = Fbm.category();
				c1.selectByVisibleText(subcat);

				Fbm.startdate(startdt);
				Fbm.Enddt(enddt);
				Fbm.Lovbank();
				Set<String> p1 = driver.getWindowHandles();
				for (String lov : p1) {

					driver.switchTo().window(lov);
				}
				Thread.sleep(2000);
				Fbm.Lovbankcode(bankcode);
		        //Fbm.Lovbankname(bankname);
				Fbm.lovbanksearch();
				Thread.sleep(2000);
				Fbm.bankcodeselect();

				driver.switchTo().window(parent);
				WebElement frame4 = Fbm.iframe;
				driver.switchTo().frame(frame4);
				Fbm.Lovbranchcode();

				Set<String> handles2 = driver.getWindowHandles();
				for (String newwh2 : handles2) {

					driver.switchTo().window(newwh2);
				}
				Thread.sleep(2000);
				Fbm.Lovbankcode(bcode);
//			    Fbm.Lovbankname(bname);
//			    Fbm.LOVIFSCcode(lovifcode);
//			    Fbm.LOVMIRCCcode(lovmircode);
				Fbm.lovbanksearch();
				Thread.sleep(2000);
				Fbm.bankcodeselect();

				driver.switchTo().window(parent);
				WebElement frame5 = Fbm.iframe;
				driver.switchTo().frame(frame5);

				Fbm.acctypeclick();
				Select c2 = Fbm.BankAcctype();
				c2.selectByVisibleText(subcate);

				Fbm.BankAccno(Acc);
			}

			Thread.sleep(2000);
			Fbm.Submit();
			Thread.sleep(3000);
			Set<String> handles4 = driver.getWindowHandles();
			for (String newwh4 : handles4) {
				driver.switchTo().window(newwh4);
				if (driver.getTitle().equals("Genisys Configurator Message Box")) {
					WebElement cust1 = driver.findElement(By.xpath("//span[@id='lblMessageText']"));
					String data1 = cust1.getText();
					Thread.sleep(3000);
					System.out.println(data1 + "::::::::PopUp data");
					FWUtills.write_Xl_DATA(REPORT_XL_DATA_PATH, "Financier Branch Master_Add", 1, 1, data1);
//				driver.close();
				}
			}

		}
	}
}
