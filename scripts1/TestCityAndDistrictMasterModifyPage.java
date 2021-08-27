package Com.UIIC.scripts1;




	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.Test;

	import Com.UIIC.generics.FWUtills;
	import Com.UIIC.object.GenericMasterPage;
	import Com.UIIC.object.GenericPage;
	import Com.UIIC.object.HomePage;
	import Com.UIIC.objects1.CityandDistrictMasterAddPage;
import Com.UIIC.objects1.CityandDistrictMasterModifyViewPage;
import Com.UIIC.generics.BaseTestclass;

	public class TestCityAndDistrictMasterModifyPage  extends BaseTestclass {

		@Test
		public void CityDistrictMaster_Modify() throws InterruptedException {

			String us = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 0);
			String ps = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 1);
			String role = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 2);
			// String HomePage = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 3);
			Thread.sleep(1000);

			String statename = FWUtills.read_XL_Data(XL_DATA_PATH, "CityAndDistrictMaster", 1, 1);
			String citydistrictname = FWUtills.read_XL_Data(XL_DATA_PATH, "CityAndDistrictMaster", 1, 2);
			String flag = FWUtills.read_XL_Data(XL_DATA_PATH, "CityAndDistrictMaster", 1, 3);
			String Zone = FWUtills.read_XL_Data(XL_DATA_PATH, "CityAndDistrictMaster", 1, 4);
			String RSMDZone = FWUtills.read_XL_Data(XL_DATA_PATH, "CityAndDistrictMaster", 1, 5);
			String STFIZone = FWUtills.read_XL_Data(XL_DATA_PATH, "CityAndDistrictMaster", 1, 6);
			String enddate = FWUtills.read_XL_Data(XL_DATA_PATH, "CityAndDistrictMaster", 1, 8);

			System.out.println(us);
			System.out.println(ps);
			System.out.println(role);

			System.out.println(statename);
			System.out.println(citydistrictname);
			System.out.println(flag);
			System.out.println(Zone);
			System.out.println(RSMDZone);
			System.out.println(STFIZone);
			System.out.println(enddate);
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
				 GenericPage Gp = new GenericPage(driver);
				 GenericMasterPage Gm = new GenericMasterPage(driver);
				 Gp.clickGenericMaster1();
				 Gm.clickCityDisMaster();
				 Gm.clickCityDisMasterModify();
				Thread.sleep(1000);
				CityandDistrictMasterModifyViewPage Cm = new CityandDistrictMasterModifyViewPage(driver);
				WebElement frame1 = Cm.iframe;
				driver.switchTo().frame(frame1);
				Cm.cityanddistrictname(citydistrictname);
				Cm.clickstatecode();
				Thread.sleep(2000);
				String parent = driver.getWindowHandle();
				Set<String> p1 = driver.getWindowHandles();
				for (String lov : p1) {

					driver.switchTo().window(lov);
					String t1 = driver.getTitle();
					System.out.println(t1);
					if (t1.contains("GENISYS Configurator Login")) {

						System.out.println(t1);

					} else if (t1.contains("Generic-LOV")) {
				
						Cm.lovstatename(statename);
						Thread.sleep(2000);
						Cm.btnsearch();
						Cm.Selectlink();
					}
				}
				driver.switchTo().window(parent);
				WebElement frame2 = Cm.iframe;
				driver.switchTo().frame(frame2);
				Cm.ModifySearch();
				Thread.sleep(2000);
				Cm.Edit();

			}
		}
	

}
