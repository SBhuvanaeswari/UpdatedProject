package Com.UIIC.object;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FinancierMasterAddPage
{
	@FindBy(xpath="//input[@id='TxtFinancier']")
	private WebElement finName;
	public void enterFinancierName(String name)
	{  
		finName.clear();
		finName.sendKeys(name);
	}
	@FindBy(xpath="//input[@id='TxtFinancierShrtName']")
	private WebElement finShrtName;
	public void enterFinancierShortName(String name)
	{
		finShrtName.clear();
		finShrtName.sendKeys(name);
	}
	@FindBy(xpath="//select[@id='drpFinancierType']")
	private WebElement finType;
	public Select selectFinancierType()
	{
		return new Select(finType);
	}
	@FindBy(xpath="//input[@id='txtLisenceNo']")
	private WebElement licence;
	public void enterLicenceNumber(String number)
	{
		licence.sendKeys(number);
	}
	@FindBy(xpath="//input[@id='txtPAN']")
	private WebElement PAN;
	public void enterPANNumber(String pan)
	{
		PAN.sendKeys(pan);
	}
	@FindBy(xpath="//select[@id='ddlPartnerType']")
	private WebElement subCata;
	public Select selectSubCatageory()
	{
		return new Select(subCata);
	}
	@FindBy(xpath="//input[@id='txtMobileNo']")
	private WebElement mobile;
	public void enterMobileNumber(String mob)
	{
		mobile.sendKeys(mob);
	}
	@FindBy(xpath="//input[@id='txtEmailID']")
	private WebElement email;
	public void enterEmailAddress(String mail)
	{
		email.sendKeys(mail);
	}
	@FindBy(xpath="//input[@id='txtStartDateNew']")
	private WebElement StDate;
	public void enterStartDate(String date)
	{
		StDate.sendKeys(date);
	}
	@FindBy(xpath="//input[@id='txtEndDateNew']")
	private WebElement endDate;
	public void enterEndDate(String date)
	{
		endDate.sendKeys(date);
	}
	@FindBy(xpath = "//input[@id='LOVBank']")
	private WebElement clickbank;
	public void openLovbank() 
	{
		clickbank.sendKeys(Keys.ARROW_UP);
	}
	@FindBy(xpath = "//input[@id='dgQuery__ctl2_txtVal']")
	private WebElement bankcode;
	public void enterLovbankcode(String bcode)
	{
		bankcode.sendKeys(bcode);
	}
	@FindBy(xpath = "//input[@id='dgQuery__ctl3_txtVal']")
	private WebElement bankname;
	public void enterLovbankname(String bname)
	{
		bankname.sendKeys(bname);
	}
	@FindBy(xpath = "//input[@id='BtnAllMatches']")
	private WebElement banksearch;
	public void clicklovbanksearchBtn() 
	{
		banksearch.click();

	}
	@FindBy(xpath = "//input[@id='BtnClose']")
	private WebElement bankclose;
	public void clicklovbankCloseBtn() 
	{
		bankclose.click();

	}
	@FindBy(xpath = "(//a[text()='Select'])[1]")
	private WebElement bankselect;
	public void selectBankcodeselect()
	{
		bankselect.click();
	}
	@FindBy(xpath = "//input[@id='LOVBranchCode']")
	private WebElement clickbranchcode;
	public void openLovbranchcode() 
	{
		clickbranchcode.sendKeys(Keys.ARROW_UP);
	}
	@FindBy(xpath = "//input[@id='dgQuery__ctl4_txtVal']")
	private WebElement LovIFSC;
	public void enterLOVIFSCcode(String lovifcode)
	{
		LovIFSC.sendKeys(lovifcode);
	}
	@FindBy(xpath = "//input[@id='dgQuery__ctl5_txtVal']")
	private WebElement LovMIRC;
	public void enterLOVMIRCCcode(String lovmircode)
	{
		LovMIRC.sendKeys(lovmircode);
	}
	@FindBy(xpath = "//input[@id='dgQuery__ctl2_txtVal']")
	private WebElement LovBranch;
	public void enterBranchcode(String code)
	{
		LovBranch.sendKeys(code);
	}
	@FindBy(xpath = "//input[@id='dgQuery__ctl3_txtVal']")
	private WebElement LovBranchName;
	public void enterBranchName(String name)
	{
		LovBranchName.sendKeys(name);
	}
	@FindBy(xpath = "//input[@id='BtnAllMatche']")
	private WebElement LovSearch;
	public void clickBranchSearchBtn()
	{
		LovSearch.click();
	}
	@FindBy(xpath = "//input[@id='BtnClose']")
	private WebElement LovClose;
	public void clickBranchCloseBtn()
	{
		LovClose.click();
	}
	@FindBy(xpath = "(//a[text()='Select'])[1]")
	private WebElement LovBRselect;
	public void selectLOVBankBranchlink()
	{
		LovBRselect.click();
	}
	@FindBy(xpath = "//a[text()='Search by IFSC Code']")
	private WebElement IFSC;
	public void OpenIFSCLink()
	{
		IFSC.click();
	}
	@FindBy(xpath = "//input[@id='dgQuery__ctl2_txtVal']")
	private WebElement IFSCCode;
	public void enterIFSCCode(String code)
	{
		IFSCCode.sendKeys(code);
	}
	@FindBy(xpath = "//input[@id='BtnAllMatches']")
	private WebElement IFSCSearch;
	public void clickIFSCSearchBtn()
	{
		IFSCSearch.click();
	}
	@FindBy(xpath = "//input[@id='BtnClose']")
	private WebElement IFSCClose;
	public void clickIFSCCloseBtn()
	{
		IFSCClose.click();
	}
	@FindBy(xpath = "(//a[text()='Select'])[1]")
	private WebElement IFSClink;
	public void selectLOVIFSClink()
	{
		IFSClink.click();
	}
	@FindBy(xpath = "//select[@id='ddlBankAccountType']")
	private WebElement bankAcctype;
	public Select selectBankAccType()
	{
		return new Select(bankAcctype);
	}
	@FindBy(xpath = "//input[@id='txtBankAccountNo']")
	private WebElement bankAccNUM;
	public void enterBankAccNumber(String acc)
	{
		bankAccNUM.sendKeys(acc);
	}
	@FindBy(xpath = "//input[@id='btnSubmit']")
	private WebElement submit;
	public void clickSubmitBtn()
	{
		submit.click();
	}
	@FindBy(xpath = "//input[@id='btnClear']")
	private WebElement clear;
	public void clickClearBtn()
	{
		clear.click();
	}
	@FindBy(xpath = "//input[@id='btnClose']")
	private WebElement close;
	public void clickCloseBtn()
	{
		close.click();
	}
	@FindBy(xpath = "//span[@id='lblMessageText']")
	private WebElement message;
	public String printMessage()
	{
		return message.getText();
	}
	public FinancierMasterAddPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
