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
import Com.UIIC.object.GenericMasterPage;
import Com.UIIC.object.GenericPage;
import Com.UIIC.object.HomePage;
import Com.UIIC.object.TenantMasterPage;
import Com.UIIC.object.VendorMasterAddPage;
import commonFuncctions.CommonFunctions;

public class TestTenantMasterAddPage extends BaseTestclass {

	@Test
	public void TenantMaster_Add() throws InterruptedException {
		
		
		
		String us = FWUtills.read_XL_Data(XL_DATA_PATH,"LoginPage",1,0);
		String ps = FWUtills.read_XL_Data(XL_DATA_PATH,"LoginPage",1,1);
		String role = FWUtills.read_XL_Data(XL_DATA_PATH,"LoginPage",1,2);
		Thread.sleep(1000);
		String Tenname = FWUtills.read_XL_Data(XL_DATA_PATH,"TenantMaster_Add",1,0);
		String Email = FWUtills.read_XL_Data(XL_DATA_PATH,"TenantMaster_Add",1,1);
		String code = FWUtills.read_XL_Data(XL_DATA_PATH,"TenantMaster_Add",1,2);
		String codename = FWUtills.read_XL_Data(XL_DATA_PATH,"TenantMaster_Add",1,3);
		String std = FWUtills.read_XL_Data(XL_DATA_PATH,"TenantMaster_Add",1,4);
		String phno = FWUtills.read_XL_Data(XL_DATA_PATH,"TenantMaster_Add",1,5);
		String stdres = FWUtills.read_XL_Data(XL_DATA_PATH,"TenantMaster_Add",1,6);
		String phnores = FWUtills.read_XL_Data(XL_DATA_PATH,"TenantMaster_Add",1,7);
		String Mob = FWUtills.read_XL_Data(XL_DATA_PATH,"TenantMaster_Add",1,8);
		String address = FWUtills.read_XL_Data(XL_DATA_PATH,"TenantMaster_Add",1,9);
		String address2 = FWUtills.read_XL_Data(XL_DATA_PATH,"TenantMaster_Add",1,10);
		String address3 = FWUtills.read_XL_Data(XL_DATA_PATH,"TenantMaster_Add",1,11);
		String pcode = FWUtills.read_XL_Data(XL_DATA_PATH,"TenantMaster_Add",1,12);
    	String pname = FWUtills.read_XL_Data(XL_DATA_PATH,"TenantMaster_Add",1,13);
    	String Remarks = FWUtills.read_XL_Data(XL_DATA_PATH,"TenantMaster_Add",1,14);
    	String cat = FWUtills.read_XL_Data(XL_DATA_PATH,"TenantMaster_Add",1,15);
    	String Taxno = FWUtills.read_XL_Data(XL_DATA_PATH,"TenantMaster_Add",1,16);
    	String pano = FWUtills.read_XL_Data(XL_DATA_PATH,"TenantMaster_Add",1,17);
    	String RefNum = FWUtills.read_XL_Data(XL_DATA_PATH,"TenantMaster_Add",1,18);
    	String IFScode = FWUtills.read_XL_Data(XL_DATA_PATH,"TenantMaster_Add",1,19);
    	String Accnum = FWUtills.read_XL_Data(XL_DATA_PATH,"TenantMaster_Add",1,20);
    	String Acctype = FWUtills.read_XL_Data(XL_DATA_PATH,"TenantMaster_Add",1,21);
    	String GSTNO = FWUtills.read_XL_Data(XL_DATA_PATH,"TenantMaster_Add",1,22);
    	
    	System.out.println(us);
		System.out.println(ps);
		System.out.println(role);
		System.out.println(Tenname);
		System.out.println(Email);
		System.out.println(code);
		System.out.println(codename);
		System.out.println(std);
		System.out.println(phno);
		System.out.println(stdres);
		System.out.println(phnores);
		System.out.println(Mob);
		System.out.println(address);
		System.out.println(address2);
		System.out.println(address3);
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
		WebDriverWait wait=new WebDriverWait(driver,10);
		HomePage hp=new HomePage(driver);
		
		
		
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
			if(title.contains("Genisys Configurator Message Box")) {
				Thread.sleep(2000);
				driver.close();
		}
			else if(title.contains("UIIC - GENISYS CONFIGURATOR LOGIN")) {
				Thread.sleep(2000);
				hp.enterPass(ps);
				hp.clickLogin();
			}
	}

    	driver.switchTo().window(parent);
	    String data=driver.getTitle();
		FWUtills.verifyTitleOfHomePage(driver,data);
		driver.navigate().refresh();
	    Thread.sleep(2000);
	    GenericPage gm = new GenericPage(driver);
		gm.clickGenericMaster1();
		GenericMasterPage gmp = new GenericMasterPage(driver);
		gmp.clickTenantMaster();
		gmp.clickTenantMasterAdd();
		Thread.sleep(2000);
		TenantMasterPage Tm = new TenantMasterPage(driver);
		WebElement frame1 = Tm.iframe;
		driver.switchTo().frame(frame1);
		Tm.TentName(Tenname);
		Tm.Email(Email);
		Thread.sleep(1000);
		Tm.lovoff();
		
		Set<String> handles = driver.getWindowHandles();
		for (String lov : handles) 
		{
		
			driver.switchTo().window(lov);
		 	String t1 = driver.getTitle();
		 	System.out.println(t1);
		 	 if(t1.contains("GENISYS Configurator Login"))
		 	 {
		 		
		 		 System.out.println("LOV");
		 		
		 	 }
		 	else  if(t1.contains("Generic LOV"))
		 	 {
		 		Tm.LovOffcode(code);
				//Tm.LovOffname(codename);
				Tm.LovSearch();
				Tm.LovSelect();
		 	 }
		}

		
		
     driver.switchTo().window(parent);
     WebElement frame2 = Tm.iframe;
		     driver.switchTo().frame(frame2);
		   
		        Tm.OffStd(std);
				Tm.Officenumber(phno);
				Tm.STDResidence(stdres);
				Tm.PhoneNoResidence(phnores);
				Tm.Contact(Mob);
				Tm.GST(GSTNO);
				Tm.Address1(address);
				Tm.Address2(address2);
				Tm.Address3(address3);
	

				Tm.Pincode();
				Set<String> p2 = driver.getWindowHandles();
				for (String lov1 : p2) 
				{
				
					driver.switchTo().window(lov1);
				 	String t1 = driver.getTitle();
				 	System.out.println(t1);
				 	 if(t1.contains("GENISYS Configurator Login"))
				 	 {
				 		
				 		 System.out.println("LOV");
				 		
				 	 }
				 	else  if(t1.contains("Generic LOV"))
				 	 {
				 		Tm.lovpincode(pcode);
						//Tm.lovpinname(pname);
						Tm.PinSearch();
						Tm.PinSelect();
				 	 }
				}
				Thread.sleep(2000);
				driver.switchTo().window(parent);
				WebElement frame3 = Tm.iframe;
				driver.switchTo().frame(frame3);
				Tm.Remark(Remarks);
				Tm.TaxRegNo(Taxno);
				Tm.catgoryclick();
				Select s1 = Tm.catgory();
				s1.selectByVisibleText(cat);
				Tm.PANno(pano);
				Tm.Individualcompany();
				Tm.Referencenumber(RefNum);
				Tm.IFSCLink();
				Set<String> p3 = driver.getWindowHandles();
				for (String lov2 : p3) 
				{
				
					driver.switchTo().window(lov2);
				 	String t1 = driver.getTitle();
				 	System.out.println(t1);
				 	 if(t1.contains("GENISYS Configurator Login"))
				 	 {
				 		
				 		 System.out.println("LOV");
				 		
				 	 }
				 	else  if(t1.contains("Generic LOV"))
				 	 {
				 		Tm.IFSCCode(IFScode);
				 		Tm.LovSearch();
				 		Tm.LovSelect();
				 	 }
				}
			
				Thread.sleep(2000);
				driver.switchTo().window(parent);
				WebElement e = Tm.iframe;
				driver.switchTo().frame(e);
				Tm.AccountNo(Accnum);
				Tm.AccountTypeclick();
				Select s2 = Tm.Acctype();
			    s2.selectByVisibleText(Acctype);
			    Thread.sleep(4000);
				Tm.save();
				Thread.sleep(5000);	
						Set<String> handles4= driver.getWindowHandles();
						for (String newwh4 : handles4) {
							driver.switchTo().window(newwh4);
							if(driver.getTitle().equals("Genisys Configurator Message Box")) {
								WebElement	cust1=driver.findElement(By.xpath("//span[@id='lblMessageText']"));
								String data1 = cust1.getText();
								Thread.sleep(3000);
								System.out.println(data1+"::::::::PopUp data");
								FWUtills.write_Xl_DATA(REPORT_XL_DATA_PATH,"TenantMaster_Add",1 ,1,data1);
								//driver.close();
							}
						} 
						
		}				
						
	}
	
}
