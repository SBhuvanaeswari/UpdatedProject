package Com.UIIC.scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
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
import Com.UIIC.object.GenericMasterPage;
import Com.UIIC.object.GenericOfficeLocationMasterAddPage;
import Com.UIIC.object.GenericPage;
import Com.UIIC.object.HomePage;
import Com.UIIC.object.OfficeinChargeMappingPage;
import commonFuncctions.CommonFunctions;

public class TestOfficeInchargeMappingAddPage extends BaseTestclass {

	@Test
	public void Addofficeincharge() throws InterruptedException, AWTException {

		String us = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 0);
		String ps = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 1);
		String role = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 2);
		Thread.sleep(1000);
		String buscode = FWUtills.read_XL_Data(XL_DATA_PATH, "OfficeInchargeMapping_Add", 1, 0);
		String busname = FWUtills.read_XL_Data(XL_DATA_PATH, "OfficeInchargeMapping_Add", 1, 1);
		String empname = FWUtills.read_XL_Data(XL_DATA_PATH, "OfficeInchargeMapping_Add", 1, 2);
		String empno = FWUtills.read_XL_Data(XL_DATA_PATH, "OfficeInchargeMapping_Add", 1, 3);
		System.out.println(us);
		System.out.println(ps);
		System.out.println(role);
		System.out.println(buscode);
		System.out.println(busname);
		System.out.println(empname);
		System.out.println(empno);
		WebDriverWait wait = new WebDriverWait(driver, 10);
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
		if (invisible) {
			String parent = driver.getWindowHandle();
			Set<String> p = driver.getWindowHandles();
			for (String new1 : p) {
				String title = driver.getTitle();
				System.out.println(title);

				driver.switchTo().window(new1);
				if (title.contains("Genisys Configurator Message Box")) {

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
			gmp.clickOfficeandOfficeinChargeMapping();
			gmp.clickOfficeandOfficeinChargeMappingAdd();
			Thread.sleep(1000);
			OfficeinChargeMappingPage offchr = new OfficeinChargeMappingPage(driver);
			WebElement frame1 = offchr.iframe;
			driver.switchTo().frame(frame1);
			offchr.BusLoc();
			Set<String> handles = driver.getWindowHandles();
			for (String newwh : handles) {

				driver.switchTo().window(newwh);
				String t1 = driver.getTitle();
				System.out.println(t1);
				if (t1.contains("GENISYS Configurator Login")) {

					System.out.println("LOV");

				} else if (t1.contains("Generic LOV")) {
					Thread.sleep(2000);

					offchr.LovOffcode(buscode);
					// offchr.LovOffname(busname);
					Thread.sleep(1000);
					offchr.patsubmit();
					Thread.sleep(2000);
					offchr.selectlink();
				}
			}

			Thread.sleep(2000);
			driver.switchTo().window(parent);
			WebElement frame2 = offchr.iframe;
			driver.switchTo().frame(frame2);
			Thread.sleep(1000);

			offchr.offinchrg();
			Set<String> handles1 = driver.getWindowHandles();
			for (String newwh1 : handles1) {
				driver.switchTo().window(newwh1);
				String t1 = driver.getTitle();
				System.out.println(t1);
				if (t1.contains("GENISYS Configurator Login")) {

					System.out.println("LOV");

				} else if (t1.contains("Generic LOV")) {
					Thread.sleep(1000);

					offchr.LovOffcode(empname);
					Thread.sleep(1000);
					// offchr.LovOffname(empno);

					// Thread.sleep(2000);
					offchr.patsubmit();
					Thread.sleep(2000);
					offchr.selectlink();
				}
			}

			driver.switchTo().window(parent);
			WebElement frame3 = offchr.iframe;
			driver.switchTo().frame(frame3);
			Thread.sleep(2000);
			offchr.Submit();
			Set<String> handles3 = driver.getWindowHandles();
			for (String newwh3 : handles3) {
				driver.switchTo().window(newwh3);
				if (driver.getTitle().equals("Genisys Configurator Message Box")) {
					WebElement cust1 = driver.findElement(By.xpath("//span[@id='lblMessageText']"));
					String data1 = cust1.getText();
					Thread.sleep(3000);
					System.out.println(data1 + "::::::::PopUp data");
					
				}
			}

		}

	}
}
