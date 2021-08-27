package Com.UIIC.RIObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RIUWProposalOverridePage 
{
	public WebDriver driver;
	@FindBy(xpath="//input[@id='PropProposalNumber']")
	private WebElement prop;
	public void enterProposalNumber(String num)
	{
		prop.sendKeys(num);
	}
	@FindBy(xpath="//input[@alt='Submit']")
	private WebElement arrow;
	public void clickSubmitteArrow()
	{
		arrow.click();
	}
	@FindBy(xpath="(//i[@class='cr-icon glyphicon glyphicon-ok'])[1]")
	private WebElement chBox;
	public void selectProposalSelectCHBOX()
	{
		chBox.click();
	}
	@FindBy(xpath="//input[@id='btnCessionDtls']")
	private WebElement cessionBTN;
	public void clickRICessionDetailsBTN()
	{
		cessionBTN.click();
	}
	@FindBy(xpath="//input[@id='btnApprove']")
	private WebElement apprBTN;
	public void clickApprovalBTN()
	{
		apprBTN.click();
	}
	@FindBy(xpath="//input[@id='btnReject']")
	private WebElement rejBTN;
	public void clickRejectBTN()
	{
		rejBTN.click();
	}
	@FindBy(xpath="//input[@id='btnExit']")
	private WebElement exeBTN;
	public void clickExitBTN()
	{
		exeBTN.click();
	}
	@FindBy(xpath="//input[@id='btnGetAllProp']")
	private WebElement AllBTN;
	public void clickGetAllProposalBTN()
	{
		AllBTN.click();
	}
	@FindBy(xpath="(//i[@class='cr-icon glyphicon glyphicon-ok'])[1]")
	private WebElement propN;
	public void SelectDetailsOfProposalNumber()
	{
		propN.click();
	}
	@FindBy(xpath="(//i[@class='cr-icon glyphicon glyphicon-ok'])[last()]")
	private WebElement Excess;
	public void SelectCessionDetailsOFProposalExcessCHBOX()
	{
		Excess.click();
	}
	@FindBy(xpath="//input[@id='btnFAC']")
	private WebElement facBTN;
	public void clickProposalOverridePageFACBTN()
	{
		facBTN.click();
	}
	@FindBy(xpath="//input[@id='btnExit']")
	private WebElement exitBTN;
	public void clickProposalOverridePageExitBTN()
	{
		exitBTN.click();
	}
	@FindBy(xpath="//input[@id='btnFACPropNonProp']")
	private WebElement propBTN;
	public void clickProposalOverridePageFACProposalNOnProposalBTN()
	{
		propBTN.click();
	}
	@FindBy(xpath="(//input[@id='btnSave'])[1]")
	private WebElement saveBTN;
	public void clickProposalOverridePageSaveBTN()
	{
		saveBTN.click();
	}
	@FindBy(xpath="//input[@id='btnBack']")
	private WebElement backBTN;
	public void clickProposalOverridePageBackBTN()
	{
		backBTN.click();
	}
	@FindBy(xpath="//input[@id='btnGenQuotNo']")
	private WebElement quoteBTN;
	public void clickProposalOverrideNewQutationAddBTN()
	{
		quoteBTN.click();
	}
	@FindBy(xpath="//input[@id='btnSaveQuotation']")
	private WebElement quoteSBTN;
	public void clickProposalOverrideNewQutationSaveBTN()
	{
		quoteSBTN.click();
	}
	@FindBy(xpath="//legend[text()='Add New Quotation']/../div[1]/div/div/div[2]/div/div[2]/div/div/div/div/div/label/span/i")
	private WebElement quoteSelBTN;
	public void clickProposalOverrideNewQutationSelectCHBOX()
	{
		quoteSelBTN.click();
	}
	@FindBy(xpath="//input[@id='btnAddReinsurer']")
	private WebElement reinsAddBTN;
	public void clickReinsuranceDetailsAddBTN()
	{
		reinsAddBTN.click();
	}
	@FindBy(xpath="//input[@id='propBrokerName']")
	private WebElement brokerN;
	public void OPenReinsuranceDetailsBrokerNameLOV()
	{
		brokerN.click();
	}
	@FindBy(xpath="//select[@name='ddlSearchCriteria']")
	private WebElement brokerNSel;
	public Select selectReinsuranceDetailsBrokerNameLOVSelectBOX()
	{
		return new Select(brokerNSel);
	}
	@FindBy(xpath="//input[@id='txtSearchVal']")
	private WebElement brokerNData;
	public void enterReinsuranceDetailsBrokerNameLOVData(String d)
	{
		brokerNData.sendKeys(d,Keys.ENTER);
	}
	@FindBy(xpath="(//div[@class='ui-grid-selection-row-header-buttons ui-grid-icon-ok ng-scope'])[2]")
	private WebElement brokerNDataS;
	public void selectReinsuranceDetailsBrokerNameLOVSelectID()
	{
		brokerNDataS.click();
	}
	@FindBy(xpath="//input[@id='propReinsurerName']")
	private WebElement ReinsLOV;
	public void openReinsuranceDetailsReinsuranceNameLOV()
	{
		ReinsLOV.click();
	}
	@FindBy(xpath="//select[@class='form-control ng-pristine ng-untouched ng-valid ng-empty']")
	private WebElement ReinsLOVSel;
	public Select selectReinsuranceDetailsReinsuranceNameLOVSelectBOX()
	{
		return new Select(ReinsLOVSel);
	}
	@FindBy(xpath="//input[@id='txtSearchVal']")
	private WebElement ReinsLOVED;
	public void enterReinsuranceDetailsReinsuranceNameLOVEnterData(String d)
	{
		ReinsLOVED.sendKeys(d,Keys.ENTER);
	}
	@FindBy(xpath="(//div[@class='ui-grid-selection-row-header-buttons ui-grid-icon-ok ng-scope'])[2]")
	private WebElement ReinsLOVS;
	public void selectReinsuranceDetailsReinsuranceNameLOVSelectID()
	{
		ReinsLOVS.click();
	}
	@FindBy(xpath="//input[@id='propSharePercentage']")
	private WebElement ReinsFACP;
	public void enterReinsuranceDetailsFACPercentage(String per)
	{
		ReinsFACP.clear();
		ReinsFACP.sendKeys(per);
	}
	@FindBy(xpath="//input[@id='btnSaveReinsurer']")
	private WebElement ReinsSaveBTN;
	public void clickReinsuranceDetailsSaveBTN()
	{
	
		ReinsSaveBTN.click();
		
	}
	@FindBy(xpath="//input[@id='btnGeneratePPW']")
	private WebElement genPPW;
	public void clickPaymentPremiumWarrentyGenPPWBTN()
	{
		genPPW.click();
	}
	@FindBy(xpath="//select[@id='txtNoOfInstallmnt']")
	private WebElement instal;
	public Select selectPaymentPremiumWarrentyPaymentType()
	{
		return new Select(instal);
	}
	@FindBy(xpath="//input[@id='btnPopulatePPW']")
	private WebElement GO;
	public void clickPaymentPremiumWarrentyGoBTN()
	{
		GO.click();
	}
	@FindBy(xpath="//input[@id='propInstallmentDate_0']")
	private WebElement date1;
	public void enterPremiumWarentyPaymentDetailsPWWDate(String date)
	{
		date1.sendKeys(date);
	}
	@FindBy(xpath="//input[@id='propPaymentDate_0']")
	private WebElement date2;
	public void enterPremiumWarentyPaymentDate(String date)
	{
		date2.sendKeys(date);
	}
	@FindBy(xpath="(//select[@id='ddlYNSelected'])[2]")
	private WebElement desition;
	public Select selectPremiumWarentyPaymentYesORNO() 
	{
		return new Select(desition);
	}
	@FindBy(xpath="//input[@id='btnSavePPW']")
	private WebElement SaveBTN;
	public void clickPremiumWarentyPaymentSaveBTN()
	{
		SaveBTN.click(); 
	}
	@FindBy(xpath="//input[@id='btnConfirm']")
	private WebElement ConfirmBTN;
	public void clickConfirmBTN() 
	{
		ConfirmBTN.click();
	}
	@FindBy(xpath="(//input[@id='btnExit'])[1]")
	private WebElement ExitBTN;
	public void clickExitBTN2()
	{
		ExitBTN.click();
	}
	@FindBy(xpath="//button[@class='btn btn-success']")
	private WebElement Success;
	public void clickFACQuoteConfirmBTN()
	{
		Success.click();
	}
	
	public RIUWProposalOverridePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
