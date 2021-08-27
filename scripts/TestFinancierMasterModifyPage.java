package Com.UIIC.scripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Com.UIIC.generics.BaseTestclass;
import Com.UIIC.generics.FWUtills;
import Com.UIIC.object.FinancierMasterAddPage;
import Com.UIIC.object.FinancierMasterModifyAndViewPage;
import Com.UIIC.object.GenericMasterPage;
import Com.UIIC.object.GenericPage;
import Com.UIIC.object.HomePage;

public class TestFinancierMasterModifyPage extends BaseTestclass
{
	@Test
	public void FinancierMaster_Modify() throws InterruptedException {

		String us = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 0);
		String ps = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 1);
		String role = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 2);
		String HomePage = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 3);
		Thread.sleep(1000);
		String Fname = FWUtills.read_XL_Data(XL_DATA_PATH, "Financiar Master", 1, 0);
		String Shrtname = FWUtills.read_XL_Data(XL_DATA_PATH, "Financiar Master", 1, 1);
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
			gmp.clickFinancierMasterModify();
			Thread.sleep(1000);
			WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='MyFrame']"));
			driver.switchTo().frame(frame1);
			FinancierMasterModifyAndViewPage fn1 = new FinancierMasterModifyAndViewPage(driver);
			fn1.openLOVFinancier();
			Thread.sleep(2000);
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
      	 		
      	 	 }
      	 	 
      	 	 else  if(t1.contains("Generic-LOV"))
      	 	 {
      	 		
      	 		 fn1.enterLOVFinancierName(Fname);
      	 		 fn1.clickLOVFinancierSearchBtn();
      	 		 fn1.clickLOVFinancierSelectLink();
      	 	 }
      	  }

      	  Thread.sleep(1000);
      	 driver.switchTo().window(p4);
      	 driver.switchTo().frame(frame1);
      	// fn1.enterFinancierShrtName(Shrtname);
      	 fn1.clickSearchBtn();
      	 fn1.clickEditLink();
//      	 Thread.sleep(1000);
//      	FinancierMasterAddPage f = new FinancierMasterAddPage(driver);
//      	f.enterFinancierShortName("mahesh babu");
//      	f.clickSubmitBtn();



}
}
}