package Com.UIIC.scripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Com.UIIC.generics.BaseTestclass;
import Com.UIIC.generics.FWUtills;
import Com.UIIC.object.ChannelPage;
import Com.UIIC.object.FinancierMasterAddPage;

import Com.UIIC.object.GenericMasterPage;
import Com.UIIC.object.GenericPage;
import Com.UIIC.object.HomePage;

public class TestFinancierMasterAddPage extends BaseTestclass
{
	@Test
	public void FinancierMaster_Add() throws InterruptedException {

		String us = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 0);
		String ps = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 1);
		String role = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 2);
		String HomePage = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 3);
		Thread.sleep(1000);
		String Fname = FWUtills.read_XL_Data(XL_DATA_PATH, "Financiar Master", 1, 0);
		String Shrtname = FWUtills.read_XL_Data(XL_DATA_PATH, "Financiar Master", 1, 1);
		String FType = FWUtills.read_XL_Data(XL_DATA_PATH, "Financiar Master", 1, 2);
		String licence = FWUtills.read_XL_Data(XL_DATA_PATH, "Financiar Master", 1, 3);
	//	String PAN = FWUtills.read_XL_Data(XL_DATA_PATH, "Financiar Master", 1, 4);
		String Sub = FWUtills.read_XL_Data(XL_DATA_PATH, "Financiar Master", 1, 5);
		String mobile = FWUtills.read_XL_Data(XL_DATA_PATH, "Financiar Master", 1, 6);
		String Email = FWUtills.read_XL_Data(XL_DATA_PATH, "Financiar Master", 1, 7);
		String StDate = FWUtills.read_XL_Data(XL_DATA_PATH, "Financiar Master", 1, 8);
		String EndDate = FWUtills.read_XL_Data(XL_DATA_PATH, "Financiar Master", 1, 9);
		String IFSC = FWUtills.read_XL_Data(XL_DATA_PATH, "Financiar Master", 1,10);
		String AccType = FWUtills.read_XL_Data(XL_DATA_PATH, "Financiar Master", 1, 11);
		String AccNUmber = FWUtills.read_XL_Data(XL_DATA_PATH, "Financiar Master", 1,12);
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
			gm.clickGenericMaster1();
			GenericMasterPage gmp = new GenericMasterPage(driver);
			gmp.clickFinancierMaster();
			gmp.clickFinancierMasterAdd();
			Thread.sleep(1000);
			WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='MyFrame']"));
			driver.switchTo().frame(frame1);
			FinancierMasterAddPage fn = new FinancierMasterAddPage(driver);
			if(role.equalsIgnoreCase("RO UNDERWRITER")||role.equalsIgnoreCase("DO UNDERWRITER")||role.equalsIgnoreCase("BO UNDERWRITER")) {		
			fn.enterFinancierName(Fname);
			fn.enterFinancierShortName(Shrtname);
			Thread.sleep(1000);
			Select type = fn.selectFinancierType();
			type.selectByVisibleText(FType);
			fn.enterLicenceNumber(licence);
		//	fn.enterPANNumber(PAN);
			Thread.sleep(1000);
			Select cat = fn.selectSubCatageory();
			cat.selectByVisibleText(Sub);
			fn.enterMobileNumber(mobile);
			fn.enterEmailAddress(Email);
			fn.enterStartDate(StDate);
			fn.enterEndDate(EndDate);
			
			}
			else
			{
				fn.enterFinancierName(Fname);
				fn.enterFinancierShortName(Shrtname);
				Thread.sleep(1000);
				Select type = fn.selectFinancierType();
				type.selectByVisibleText(FType);
				fn.enterLicenceNumber(licence);
			//	fn.enterPANNumber(PAN);
				Thread.sleep(1000);
				Select cat = fn.selectSubCatageory();
				cat.selectByVisibleText(Sub);
				fn.enterMobileNumber(mobile);
				fn.enterEmailAddress(Email);
				fn.enterStartDate(StDate);
				fn.enterEndDate(EndDate);
				Thread.sleep(1000);
	            fn.OpenIFSCLink();
	            String p4 = driver.getWindowHandle();
	      	    Set<String> lov4 = driver.getWindowHandles();
	      	  for(String p:lov4)
	      	  {
	      	 	 driver.switchTo().window(p);
	      	 	String t1 = driver.getTitle();
	      	 	System.out.println(t1);
	      	 	 if(t1.contains("GENISYS Configurator Login"))
	      	 	 {
	      	 		 System.out.println(driver.getTitle());
	      	 		 System.out.println("*****");
	      	 		Thread.sleep(2000);
	      	 	 }
	      	 	 
	      	 	 else  if(t1.contains("Generic LOV"))
	      	 	 {
	      	 		fn.enterIFSCCode(IFSC);
	      	 		fn.clickIFSCSearchBtn();
	      	 	    Thread.sleep(500);
	      	 		fn.selectLOVIFSClink();
	      	 	 }
	      	  }

	      	  Thread.sleep(1000);
	      	 driver.switchTo().window(p4);
	      	 driver.switchTo().frame(frame1);
	      	Select acc = fn.selectBankAccType();
	      	acc.selectByVisibleText(AccType);
	      	fn.enterBankAccNumber(AccNUmber);
			}
      	fn.clickSubmitBtn();
      	Set<String> handles4 = driver.getWindowHandles();
		for (String newwh4 : handles4)
		{
			driver.switchTo().window(newwh4);
			String t1=driver.getTitle();
			if(t1.contains("Genisys Configurator Message Box"))
			{
				String message = fn.printMessage();
				System.out.println(message);
				FWUtills.write_Xl_DATA(REPORT_XL_DATA_PATH, "FinancierMaster_Add", 1, 1, "");


           }
      }
	
}
	}
}