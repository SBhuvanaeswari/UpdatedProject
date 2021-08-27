package Com.UIIC.scripts;

import java.util.Set;

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
import Com.UIIC.object.CoInsuranceOffMasterPage;
import Com.UIIC.object.GenericMasterPage;
import Com.UIIC.object.GenericPage;
import Com.UIIC.object.HomePage;
import commonFuncctions.CommonFunctions;

public class TestCoInsuranceOfficeMasterModifyPage extends BaseTestclass {

	@Test
	public void CoInsuranceOfficeMaster_Modify() throws InterruptedException {
		
		
	
		String us = FWUtills.read_XL_Data(XL_DATA_PATH,"LoginPage",1,0);
		String ps = FWUtills.read_XL_Data(XL_DATA_PATH,"LoginPage",1,1);
		String role = FWUtills.read_XL_Data(XL_DATA_PATH,"LoginPage",1,2);
		Thread.sleep(1000);
		
		String coinsucode = FWUtills.read_XL_Data(XL_DATA_PATH,"CoInsuranceMaster_Modify",1,0);
		String coinsuname = FWUtills.read_XL_Data(XL_DATA_PATH,"CoInsuranceMaster_Modify",1,1);
		String offcode = FWUtills.read_XL_Data(XL_DATA_PATH,"CoInsuranceMaster_Modify",1,2);
		
		System.out.println(us);
		System.out.println(ps);
		System.out.println(role);
		System.out.println(coinsucode);
		System.out.println(coinsuname);
		System.out.println(offcode);
		WebDriverWait wait=new WebDriverWait(driver,10);
		HomePage hp=new HomePage(driver);
		
		
		hp.enterUser(us);
		Thread.sleep(1000);
		hp.selectRole();
		 Select s = hp.selectRole1();
		 s.selectByVisibleText(role);
		hp.enterPass(ps);
		Thread.sleep(1000);
	    hp.clickLogin();
	    Boolean invisible = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("flxGridBoxOverlay")));
		if(invisible) 
		{
		String parent = driver.getWindowHandle();	
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

    	driver.switchTo().window(parent);
	    String data=driver.getTitle();
		FWUtills.verifyTitleOfHomePage(driver,data);
		driver.navigate().refresh();
	    Thread.sleep(2000);
	    GenericPage gm = new GenericPage(driver);
	    gm.clickGenericMaster1();
	    GenericMasterPage gmp = new GenericMasterPage(driver);
	    gmp.clickCoInsuranceOffmaster();
	    gmp.clickCoInsuranceOffmasterModify();
	    Thread.sleep(1000);
		CoInsuranceOffMasterPage coinsu= new CoInsuranceOffMasterPage(driver);
		
		WebElement frame1 = coinsu.frame;
		driver.switchTo().frame(frame1);
		coinsu.EditInsurancecode();
		Thread.sleep(1000);
		Set<String> handles = driver.getWindowHandles();
		for (String newwh : handles) 
		{
		
		driver.switchTo().window(newwh);
		}
		Thread.sleep(2000);
		coinsu.Insurcompcode(coinsucode);
	    coinsu.Lovcomname(coinsuname);
		coinsu.LovSearch();
		Thread.sleep(2000);
		coinsu.LovSelect();
		driver.switchTo().window(parent);
		WebElement frame2 = coinsu.frame;
        driver.switchTo().frame(frame2);
		coinsu.EdOffCode(offcode);
		Thread.sleep(1000);
		coinsu.EdShowDetails();
//		WebElement frame3 = coinsu.frame;
//		driver.switchTo().frame(frame3);
	//	coinsu.EdEmail.sendKeys("Testing@gmail.com");
		//Thread.sleep(2000);
		//coinsu.EdSave.click();
		
		

		}

		
	}
}
