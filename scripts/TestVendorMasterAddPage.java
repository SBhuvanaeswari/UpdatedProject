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
import Com.UIIC.object.GenericMasterPage;
import Com.UIIC.object.GenericPage;
import Com.UIIC.object.HomePage;
import Com.UIIC.object.VendorMasterAddPage;

public class TestVendorMasterAddPage extends BaseTestclass {

	@Test
	public void VendorMaster_Add() throws InterruptedException {
		
		String us = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 0);
		String ps = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 1);
		String role = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 2);
		String HomePage = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 3);
		Thread.sleep(1000);
		
		String VenName = FWUtills.read_XL_Data(XL_DATA_PATH, "AddVendorMaster", 1, 0);
		String Email = FWUtills.read_XL_Data(XL_DATA_PATH, "AddVendorMaster", 1, 1);
		String code = FWUtills.read_XL_Data(XL_DATA_PATH, "AddVendorMaster", 1, 2);
		String codename = FWUtills.read_XL_Data(XL_DATA_PATH, "AddVendorMaster", 1, 3);
		String std = FWUtills.read_XL_Data(XL_DATA_PATH, "AddVendorMaster", 1, 4);
		String phno = FWUtills.read_XL_Data(XL_DATA_PATH, "AddVendorMaster", 1, 5);
		String stdres = FWUtills.read_XL_Data(XL_DATA_PATH, "AddVendorMaster", 1, 6);
		String phnores = FWUtills.read_XL_Data(XL_DATA_PATH, "AddVendorMaster", 1, 7);
		String Mob = FWUtills.read_XL_Data(XL_DATA_PATH, "AddVendorMaster", 1, 8);
		String Addr = FWUtills.read_XL_Data(XL_DATA_PATH, "AddVendorMaster", 1, 9);
		String pcode = FWUtills.read_XL_Data(XL_DATA_PATH, "AddVendorMaster", 1, 10);
		String pname = FWUtills.read_XL_Data(XL_DATA_PATH, "AddVendorMaster", 1, 11);
		String Remarks = FWUtills.read_XL_Data(XL_DATA_PATH, "AddVendorMaster", 1, 12);
		String cat = FWUtills.read_XL_Data(XL_DATA_PATH, "AddVendorMaster", 1, 13);
		String Taxno = FWUtills.read_XL_Data(XL_DATA_PATH, "AddVendorMaster", 1, 14);
		String pano = FWUtills.read_XL_Data(XL_DATA_PATH, "AddVendorMaster", 1, 15);
		String RefNum = FWUtills.read_XL_Data(XL_DATA_PATH, "AddVendorMaster", 1, 16);
		String IFScode = FWUtills.read_XL_Data(XL_DATA_PATH, "AddVendorMaster", 1, 17);
		String Accnum = FWUtills.read_XL_Data(XL_DATA_PATH, "AddVendorMaster", 1, 18);
		String Acctype = FWUtills.read_XL_Data(XL_DATA_PATH, "AddVendorMaster", 1, 19);
		String GSTNO = FWUtills.read_XL_Data(XL_DATA_PATH, "AddVendorMaster", 1, 20);
		String Nation = FWUtills.read_XL_Data(XL_DATA_PATH, "AddVendorMaster", 1, 21);
		String dob = FWUtills.read_XL_Data(XL_DATA_PATH, "AddVendorMaster", 1, 22);

		System.out.println(us);
		System.out.println(ps);
		System.out.println(role);
		System.out.println(VenName);
		System.out.println(Email);
		System.out.println(code);
		System.out.println(codename);
		System.out.println(std);
		System.out.println(phno);
		System.out.println(stdres);
		System.out.println(phnores);
		System.out.println(Mob);
		System.out.println(Addr);
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
		System.out.println(GSTNO);
		System.out.println(Nation);
		System.out.println(dob);
		WebDriverWait wait=new WebDriverWait(driver,10);
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
		if(invisible) 
		{
		String parent = driver.getWindowHandle();
		Set<String> p1 = driver.getWindowHandles();
		for (String newh : p1) {
			String title = driver.getTitle();
			System.out.println(title);

			driver.switchTo().window(newh);
			if (title.contains("Genisys Configurator Message Box")) {
				Thread.sleep(2000);
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
		gmp.clickVendorMaster();
		gmp.clickVendorMasterAdd();
		Thread.sleep(2000);
		VendorMasterAddPage Vm = new VendorMasterAddPage(driver);
		WebElement frame1 = Vm.iframe;
		driver.switchTo().frame(frame1);
		Vm.vendorname(VenName);
		Vm.EmailID(Email);
		Vm.Officecode();

		Set<String> p = driver.getWindowHandles();
		for (String lov : p) {

			driver.switchTo().window(lov);
			String t1 = driver.getTitle();
			System.out.println(t1);
			if (t1.contains("GENISYS Configurator Login")) {

				System.out.println("LOV");

			} else if (t1.contains("Generic LOV")) {
				Thread.sleep(1000);
				Vm.LovOffcode(code);
				//Vm.LovOffname(codename);
				Vm.LovSearch();
				Vm.LovSelect();
			}
		}
		Thread.sleep(2000);

		driver.switchTo().window(parent);
		WebElement frame2 = Vm.iframe;
		driver.switchTo().frame(frame2);
		Vm.OffStd(std);
		Vm.Officenumber(phno);
		Vm.STDResidence(stdres);
		Vm.PhoneNoResidence(phnores);
		Vm.Contact(Mob);
		Vm.VendorAddr(Addr);
		Vm.VendorPincode();
		Set<String> p2 = driver.getWindowHandles();
		for (String lov1 : p2) {

			driver.switchTo().window(lov1);
			String t1 = driver.getTitle();
			System.out.println(t1);
			if (t1.contains("GENISYS Configurator Login")) {

				System.out.println("LOV");

			} else if (t1.contains("Generic LOV")) {
				Thread.sleep(1000);
				Vm.Lovpincode(pcode);
				//Vm.Lovpincodename(pname);
				Vm.PinSearch();

				Vm.PinSelect();
			}
		}
		Thread.sleep(2000);
		driver.switchTo().window(parent);
		WebElement frame3 = Vm.iframe;
		driver.switchTo().frame(frame3);
		Vm.Remark(Remarks);
		Vm.catgoryclick();
		Select s1 = Vm.catgory();
		s1.selectByVisibleText(cat);
		Vm.TaxRegNo(Taxno);
		Vm.PANno(pano);
		Vm.Individualcompany();
		Vm.Referencenumber(RefNum);
		Vm.IFSCLink();
		Set<String> p3 = driver.getWindowHandles();
		for (String lov2 : p3) {

			driver.switchTo().window(lov2);
			String t1 = driver.getTitle();
			System.out.println(t1);
			if (t1.contains("GENISYS Configurator Login")) {

				System.out.println("LOV");

			} else if (t1.contains("Generic LOV")) {
				Thread.sleep(1000);
				Vm.IFSCCode(IFScode);
				Vm.Search();
				Vm.Selec();
			}
		}
		Thread.sleep(2000);
		driver.switchTo().window(parent);
		WebElement e = Vm.iframe;
		driver.switchTo().frame(e);
		Vm.AccountNo(Accnum);
		Vm.AccountTypeclick();
		Select s2 = Vm.Acctype();
		s2.selectByVisibleText(Acctype);
		Vm.GST(GSTNO);
		Vm.Nationalityclick();
		Select s3 = Vm.Nationality();
		s3.selectByVisibleText(Nation);
		Vm.DOB(dob);
		Vm.save();
		Thread.sleep(2000);

		Set<String> handles3 = driver.getWindowHandles();
		for (String newwh3 : handles3) {
			driver.switchTo().window(newwh3);
			if (driver.getTitle().equals("Genisys Configurator Message Box")) {
				WebElement cust1 = driver.findElement(By.xpath("//span[@id='lblMessageText']"));
				String data1 = cust1.getText();
				Thread.sleep(3000);
				System.out.println(data1 + "::::::::PopUp data");
				FWUtills.write_Xl_DATA(REPORT_XL_DATA_PATH, "VendorMaster_Add", 1, 1, data1);
				//driver.close();
			}
		}
		/*Thread.sleep(1000);
		driver.switchTo().window(parent);
		WebElement frame4 = Vm.iframe;
		driver.switchTo().frame(frame4);
		Thread.sleep(1000);
		driver.navigate().refresh();*/

	}
	}
}
