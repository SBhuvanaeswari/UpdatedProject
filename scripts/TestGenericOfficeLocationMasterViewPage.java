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
import Com.UIIC.object.GenericOfficeLocationMasterAddPage;
import Com.UIIC.object.GenericOfficeLocationMasterViewPage;
import Com.UIIC.object.GenericPage;
import Com.UIIC.object.HomePage;
import commonFuncctions.CommonFunctions;

public class TestGenericOfficeLocationMasterViewPage extends BaseTestclass{

	@Test
	public void OfficeLocation_View() throws InterruptedException {
		
		String us = FWUtills.read_XL_Data(XL_DATA_PATH,"LoginPage",1,0);
		String ps = FWUtills.read_XL_Data(XL_DATA_PATH,"LoginPage",1,1);
		String role = FWUtills.read_XL_Data(XL_DATA_PATH,"LoginPage",1,2);
		Thread.sleep(1000);
		
		String officetype = FWUtills.read_XL_Data(XL_DATA_PATH,"OfficeLocationMaster_Modify",1,0);
		String offname = FWUtills.read_XL_Data(XL_DATA_PATH,"OfficeLocationMaster_Modify",1,1);
		String offcode = FWUtills.read_XL_Data(XL_DATA_PATH,"OfficeLocationMaster_Modify",1,2);
		
		System.out.println(us);
		System.out.println(ps);
		System.out.println(role);
		System.out.println(officetype);
		System.out.println(offname);
		System.out.println(offcode);
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
		gmp.clickOfficeLocationMaster();
		gmp.clickOfficeLocationMasterView();
		Thread.sleep(1000);
	    GenericOfficeLocationMasterViewPage offloc=new GenericOfficeLocationMasterViewPage(driver);
		WebElement frame2 = offloc.iframe;
		driver.switchTo().frame(frame2);
		offloc.offtypeclick();
		Select offtyp = offloc.OfficeType();
		offtyp.selectByVisibleText(officetype);
		//offloc.OfficeName(offname);
		offloc.OfficeCode(offcode);
		offloc.Search();
		Thread.sleep(1000);
		offloc.ViewSrch();
	/*	Thread.sleep(1000);
		offloc.btnclose.click();
		Thread.sleep(2000);
		Alert confirm=driver.switchTo().alert();
		confirm.dismiss();
	
	driver.navigate().refresh();*/
		}
	}
}
