package Com.UIIC.scripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Com.UIIC.generics.BaseTestclass;
import Com.UIIC.generics.FWUtills;
import Com.UIIC.object.HomePage;


public class TestLoginPage extends BaseTestclass
{
	@Test
	public void testHome() throws InterruptedException
	{
		String us = FWUtills.read_XL_Data(XL_DATA_PATH,"LoginPage",1,0);
		String ps = FWUtills.read_XL_Data(XL_DATA_PATH,"LoginPage",1,1);
		String role = FWUtills.read_XL_Data(XL_DATA_PATH,"LoginPage",1,2);
		
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
		String pwh = driver.getWindowHandle();
		Set<String> whs = driver.getWindowHandles();
		System.out.println(whs.size());
		for(String k:whs)
		{
			driver.switchTo().window(k);
			String title1 = driver.getTitle();
			System.out.println(title1);
			if(title1.contains("Genisys Configurator Message Box"))
			{
				driver.close();
			}
//			else
//			{
//			    Thread.sleep(2000);
//				hp.enterPass(ps);
//				hp.clickLogin();
//				
//			}
			
		}	
				Thread.sleep(2000);
				String pwh1 = driver.getWindowHandle();
				Set<String> whs1 = driver.getWindowHandles();
		
          for(String k1:whs1)
		{
		 driver.switchTo().window(k1);
		String title = driver.getTitle();
		System.out.println(title);
			if(title.contains("Genisys Configurator Message Box"))
			{
				driver.close();
			}
		
		
//
//	    Thread.sleep(2000);
//		hp.enterPass(ps);
//		hp.clickLogin();
  	}
	
}
}