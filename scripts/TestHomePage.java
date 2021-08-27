package Com.UIIC.scripts;


import java.io.IOException;
import java.util.Set;


import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


import Com.UIIC.generics.BaseTestclass;
import Com.UIIC.generics.FWUtills;

import Com.UIIC.object.HomePage;
import commonFuncctions.CommonFunctions;


public class TestHomePage extends BaseTestclass{
	
	@Test
	public void login() throws InterruptedException, IOException {
		
		
		
		String us = FWUtills.read_XL_Data(XL_DATA_PATH,"LoginPage",1,0);
		String ps = FWUtills.read_XL_Data(XL_DATA_PATH,"LoginPage",1,1);
		String role = FWUtills.read_XL_Data(XL_DATA_PATH,"Roles",3,0);
		System.out.println(us);
		System.out.println(ps);
		System.out.println(role);
		HomePage hp=new HomePage(driver);
		
	
		hp.enterUser(us);
		Thread.sleep(1000);
		hp.selectRole();
		Thread.sleep(5000);
		 Select s = hp.selectRole1();
		 s.selectByVisibleText(role);
		hp.enterPass(ps);
		Thread.sleep(500);
		hp.clickLogin();
		Thread.sleep(1000);
		String pwh = driver.getWindowHandle();
		Set<String> handles1 = driver.getWindowHandles();
		for (String newwh1 : handles1) {
			//String title = driver.getTitle();
			//System.out.println(title);
			driver.switchTo().window(newwh1);
			if(driver.getTitle().equals("Genisys Configurator Message Box")) {
				
				driver.close();
			}
		} 
		driver.switchTo().window(pwh);
		Thread.sleep(2000);
		hp.enterPass(ps);
		Thread.sleep(1000);
		hp.clickLogin();
		
	}

	
}
