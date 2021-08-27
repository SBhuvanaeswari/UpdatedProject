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

public class TestFinancierBranchMasterModifyPage extends BaseTestclass {

	@Test
	public void FinancierBranchMaster_Modify() throws InterruptedException {
		
		String us = FWUtills.read_XL_Data(XL_DATA_PATH,"LoginPage",1,0);
		String ps = FWUtills.read_XL_Data(XL_DATA_PATH,"LoginPage",1,1);
		String role = FWUtills.read_XL_Data(XL_DATA_PATH,"LoginPage",1,2);
		Thread.sleep(1000);
		String fincode= FWUtills.read_XL_Data(XL_DATA_PATH,"FinancierBranchMaster_Modify",1,0);
		String finaname = FWUtills.read_XL_Data(XL_DATA_PATH,"FinancierBranchMaster_Modify",1,1);
		String fbcode = FWUtills.read_XL_Data(XL_DATA_PATH,"FinancierBranchMaster_Modify",1,2);
		String finbrchname = FWUtills.read_XL_Data(XL_DATA_PATH,"FinancierBranchMaster_Modify",1,3);
		String ifcode= FWUtills.read_XL_Data(XL_DATA_PATH,"FinancierBranchMaster_Modify",1,4);
		String MICRcode = FWUtills.read_XL_Data(XL_DATA_PATH,"FinancierBranchMaster_Modify",1,5);
		
		System.out.println(us);
		System.out.println(ps);
		System.out.println(role);
		System.out.println(fincode);
		System.out.println(finaname);
		System.out.println(fbcode);
		System.out.println(finbrchname);
		System.out.println(ifcode);
		System.out.println(MICRcode);
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
		String pwh = driver.getWindowHandle();	
	    Set<String> handles1 = driver.getWindowHandles();
    	for (String newwh1 : handles1) {
			String title = driver.getTitle();
		System.out.println(title);
		
			driver.switchTo().window(newwh1);
			if(title.contains("Genisys Configurator Message Box")) {
				
				driver.close();
		}
			else if(title.contains("UIIC - GENISYS CONFIGURATOR LOGIN")) {
				Thread.sleep(2000);
				hp.enterPass(ps);
				hp.clickLogin();
			}
	}

    	driver.switchTo().window(pwh);
	    String data=driver.getTitle();
		FWUtills.verifyTitleOfHomePage(driver,data);
		driver.navigate().refresh();
	    Thread.sleep(2000);
	    GenericPage gm = new GenericPage(driver);
		gm.clickGenericMaster1();
		GenericMasterPage gmp = new GenericMasterPage(driver);
		gmp.clickFinancierBranchMaster();
		gmp.clickFinancierBranchMasterModify();
		Thread.sleep(2000);
		FinancierBranchMasterPage Fbm=new FinancierBranchMasterPage(driver);
		WebElement frame1 = Fbm.iframe;
		driver.switchTo().frame(frame1);
		Fbm.FinancierCode();
		Thread.sleep(1000);
		String parent = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String newwh : handles) 
		{
		
		driver.switchTo().window(newwh);
		}
		Fbm.LovFincode(fincode);
//		Fbm.LovFinname(finaname);
		
		Fbm.Lovsrch();
		Thread.sleep(2000);
		Fbm.Select();
		driver.switchTo().window(parent);
		WebElement frame = Fbm.iframe;
		driver.switchTo().frame(frame);
		Fbm.ViewBranchcode();
		Set<String> handless = driver.getWindowHandles();
		for (String newwhs1 : handless) 
		{
		
		driver.switchTo().window(newwhs1);
		}
		Thread.sleep(2000);
		Fbm.Financierbranchcode(fbcode);
//		Fbm.LovBranchname(finbrchname);
		Fbm.BranchSearch();
		Thread.sleep(2000);
		Fbm.SelectBranch();
		driver.switchTo().window(parent);
		WebElement frame0 = Fbm.iframe;
		driver.switchTo().frame(frame0);
		//Fbm.ModifyIFsccode(ifcode);
		//Fbm.MICRCode(MICRcode);
		Fbm.ViwSearch();
		Fbm.Editlink();
		Thread.sleep(2000);
		
	/*	Fbm.EditSave();
		Thread.sleep(3000);
		Set<String> handles4= driver.getWindowHandles();
		for (String newwh4 : handles4) {
			driver.switchTo().window(newwh4);
			if(driver.getTitle().equals("Genisys Configurator Message Box")) {
				WebElement	Fin=driver.findElement(By.xpath("//span[@id='lblMessageText']"));
				String data1 = Fin.getText();
				Thread.sleep(3000);
				System.out.println(data1+"::::::::PopUp data");
				FWUtills.write_Xl_DATA(REPORT_XL_DATA_PATH,"Finan Master_Modify",1 ,1,data1);
//				driver.close();
			}
		} 
	*/
	}
	}
}
