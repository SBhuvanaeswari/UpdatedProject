package Com.UIIC.RIscripts;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Com.UIIC.RIObject.RIReinsuranceBANCSPage;
import Com.UIIC.RIObject.RIUWProposalOverridePage;
import Com.UIIC.RIObject.ReInsuranceUnderwrittingPage;
import Com.UIIC.generics.BaseTestclass;
import Com.UIIC.generics.FWUtills;
import Com.UIIC.object.GenericMasterPage;
import Com.UIIC.object.GenericPage;
import Com.UIIC.object.HomePage;

public class TestRIProposalOverridePage extends BaseTestclass
{
	@Test
	public void RIProposalOverride_FAC() throws InterruptedException {

		String us = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 0);
		String ps = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 1);
		String role = FWUtills.read_XL_Data(XL_DATA_PATH, "LoginPage", 1, 2);
		Thread.sleep(1000);
		String proposalN = FWUtills.read_XL_Data(XL_DATA_PATH, "RI ProposalOverrideFAC", 1, 0);
		String excessA = FWUtills.read_XL_Data(XL_DATA_PATH, "RI ProposalOverrideFAC", 1, 1);
		String pageT = FWUtills.read_XL_Data(XL_DATA_PATH, "RI ProposalOverrideFAC", 1, 2);
		String BrokerN = FWUtills.read_XL_Data(XL_DATA_PATH, "RI ProposalOverrideFAC", 1, 3);
		String brokerNData = FWUtills.read_XL_Data(XL_DATA_PATH, "RI ProposalOverrideFAC", 1, 4);
		String RIN = FWUtills.read_XL_Data(XL_DATA_PATH, "RI ProposalOverrideFAC", 1, 5);
		String RINdata = FWUtills.read_XL_Data(XL_DATA_PATH, "RI ProposalOverrideFAC", 1, 6);
		String cessPer = FWUtills.read_XL_Data(XL_DATA_PATH, "RI ProposalOverrideFAC", 1, 7);
		String install = FWUtills.read_XL_Data(XL_DATA_PATH, "RI ProposalOverrideFAC", 1, 8);
		String ppwDate = FWUtills.read_XL_Data(XL_DATA_PATH, "RI ProposalOverrideFAC", 1, 9);
		String paid = FWUtills.read_XL_Data(XL_DATA_PATH, "RI ProposalOverrideFAC", 1, 10);
		String paymentD = FWUtills.read_XL_Data(XL_DATA_PATH, "RI ProposalOverrideFAC", 1, 11);
		HomePage hp = new HomePage(driver);
		hp.enterUser(us);
		Thread.sleep(1000);
		hp.selectRole();
		Select s = hp.selectRole1();
		s.selectByVisibleText(role);
		hp.enterPass(ps);
		hp.clickLogin();
		Boolean invisible = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("flxGridBoxOverlay")));
		if (invisible) 
		{
			String pwh = driver.getWindowHandle();
			Set<String> handles1 = driver.getWindowHandles();
			System.out.println(handles1.size());
			for (String newwh1 : handles1) 
			{
				String title = driver.getTitle();
				System.out.println(title);
                driver.switchTo().window(newwh1);
				if (title.contains("Genisys Configurator Message Box")) 
				{
					driver.close();
				}
				else if (title.contains("UIIC - GENISYS CONFIGURATOR LOGIN")) 
				{
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
			 GenericPage gen = new GenericPage(driver);
			 gen.clickReinsurance();
			 gen.clickReinsuranceHomePage();
			 Thread.sleep(5000);
			 ArrayList<String> tab=new ArrayList<>(driver.getWindowHandles());
			 System.out.println(tab.size());
			 driver.switchTo().window(tab.get(1));
			RIReinsuranceBANCSPage ban = new RIReinsuranceBANCSPage(driver);
			ban.clickReinsuranceUnderWritting();
			ReInsuranceUnderwrittingPage uw = new ReInsuranceUnderwrittingPage(driver);
			uw.clickProposalOverriding();
			Thread.sleep(1000);
			RIUWProposalOverridePage over = new RIUWProposalOverridePage(driver);
			over.enterProposalNumber(proposalN);
			Thread.sleep(2000);
			over.clickSubmitteArrow();
			Thread.sleep(2000);
			over.selectProposalSelectCHBOX();
			Thread.sleep(2000);
			if(excessA.contains("Is Not Exist"))
			{
				over.clickApprovalBTN();
			}
			over.clickRICessionDetailsBTN();
			Thread.sleep(2000);
			over.SelectDetailsOfProposalNumber();
			Thread.sleep(1000);
			over.SelectCessionDetailsOFProposalExcessCHBOX();
			over.clickProposalOverridePageFACBTN();
			Thread.sleep(3000);
			over.clickProposalOverrideNewQutationAddBTN();
			over.clickProposalOverrideNewQutationSaveBTN();
			Thread.sleep(2000);
			Alert al = driver.switchTo().alert();
			al.dismiss();
			over.clickProposalOverrideNewQutationSelectCHBOX();
			Thread.sleep(2000);
			over.clickReinsuranceDetailsAddBTN();
			over.OPenReinsuranceDetailsBrokerNameLOV();
			Thread.sleep(2000);
			Select broker = over.selectReinsuranceDetailsBrokerNameLOVSelectBOX();
			broker.selectByVisibleText(BrokerN);
			over.enterReinsuranceDetailsBrokerNameLOVData(brokerNData);
			Thread.sleep(2000);
			over.selectReinsuranceDetailsBrokerNameLOVSelectID();
			Thread.sleep(2000);
			over.openReinsuranceDetailsReinsuranceNameLOV();
			Select name = over.selectReinsuranceDetailsReinsuranceNameLOVSelectBOX();
			name.selectByVisibleText(RIN);
			over.enterReinsuranceDetailsReinsuranceNameLOVEnterData(RINdata);
			Thread.sleep(1000);
			over.selectReinsuranceDetailsReinsuranceNameLOVSelectID();
			Thread.sleep(1000);
			over.enterReinsuranceDetailsFACPercentage(cessPer);
			Thread.sleep(3000);
     		over.clickReinsuranceDetailsSaveBTN();
       		over.clickReinsuranceDetailsSaveBTN();
			Thread.sleep(2000);
			WebElement war = driver.findElement(By.xpath("//div[@class='bootstrap-dialog-message']"));
			String data = war.getText();
			String[] sp = data.split(" ");
		    System.out.println(sp[7]);
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//button[@class='btn btn-warning']")).click();
		    over.enterReinsuranceDetailsFACPercentage(sp[7]);
		    Thread.sleep(2000);
		    over.clickReinsuranceDetailsSaveBTN();
	   		over.clickReinsuranceDetailsSaveBTN();
	   		over.clickFACQuoteConfirmBTN();
		    wait.until(ExpectedConditions.alertIsPresent());
		    al.dismiss();
		    Thread.sleep(3000);
		    over.clickPaymentPremiumWarrentyGenPPWBTN();
		    Select pay = over.selectPaymentPremiumWarrentyPaymentType();
		    pay.selectByVisibleText(install);
		    Thread.sleep(1000);
		    over.clickPaymentPremiumWarrentyGoBTN();
		    Thread.sleep(1000);
		    over.enterPremiumWarentyPaymentDetailsPWWDate(ppwDate);
		   Select con = over.selectPremiumWarentyPaymentYesORNO();
		   con.selectByVisibleText(paid);
		   over.enterPremiumWarentyPaymentDate(paymentD);
		   over.clickPremiumWarentyPaymentSaveBTN();
		   wait.until(ExpectedConditions.alertIsPresent());
		   al.dismiss();
		   Thread.sleep(2000);
		   over.clickConfirmBTN();
		   wait.until(ExpectedConditions.alertIsPresent());
		   al.dismiss();
		   Thread.sleep(3000);
		   over.clickExitBTN2();
		   Thread.sleep(3000);
		   over.clickFACQuoteConfirmBTN();
		   Thread.sleep(3000);
		   over.clickProposalOverridePageSaveBTN();
		   over.clickFACQuoteConfirmBTN();
		   Thread.sleep(3000);
		   over.clickProposalOverridePageExitBTN();
		   over.clickFACQuoteConfirmBTN();
		   FWUtills.verifyTitleOfHomePage(driver,pageT);
		   ban.clickReinsuranceUnderWritting();
		   Thread.sleep(2000);
		   uw.clickProposalOverriding();
		   Thread.sleep(2000);
		   over.enterProposalNumber(proposalN);
		   Thread.sleep(3000);
			over.clickSubmitteArrow();
			Thread.sleep(3000);
			over.selectProposalSelectCHBOX();
			Thread.sleep(3000);
			over.clickApprovalBTN();


     }
   }
}