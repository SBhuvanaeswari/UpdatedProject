package Com.UIIC.object;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class VendorMasterModifyPage {

	

	@FindBy(xpath = "//input[@id='TxtVendorName']")
	private WebElement ViewVenName;

	public void VenName(String VenName) {
		ViewVenName.sendKeys(VenName);
	}

	@FindBy(xpath = "//input[@id='TxtVendorCode']")
	private WebElement ViewVenCode;

	public void Vencode(String Vencode) {
		ViewVenCode.sendKeys(Vencode);
	}

	@FindBy(xpath = "//input[@id='LOVOffice']")
	private WebElement ViewOffcode;

	public void Venoffcode() {
		ViewOffcode.sendKeys(Keys.ARROW_UP);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl2_txtVal']")
	private WebElement ViewLovoffcode;

	public void Lovoffcode(String Lovcode) {
		ViewLovoffcode.sendKeys(Lovcode);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl3_txtVal']")
	private WebElement ViewLovOffname;

	public void Lovoffname(String Lovoffname) {
		ViewLovOffname.sendKeys(Lovoffname);
	}

	@FindBy(xpath = "//input[@id='BtnAllMatches']")
	private WebElement LovSearch;

	public void search() {
		LovSearch.click();
	}

	@FindBy(xpath = "(//a[text()='Select'])[1]")
	private WebElement LovSelect;

	public void select() {
		LovSelect.click();
	}

	@FindBy(xpath = "//input[@id='btnSearch']")
	private WebElement ViewSearch;

	public void Viewsrch() {
		ViewSearch.click();
	}

	@FindBy(xpath = "//a[text()='Edit']")
	private WebElement ViewEdit;

	public void clickedit() {
		ViewEdit.click();

	}

	@FindBy(xpath = "//input[@id='TxtContrLandName']")
	private WebElement VendorName;

	@FindBy(xpath = "//input[@id='TxtEmailAddress']")
	private WebElement EmailAddr;

	@FindBy(xpath = "//select[@id='ddlPartnerType']")
	private WebElement Subcatgory;

	@FindBy(xpath = "//input[@id='TxtRemarks']")
	private WebElement Remarkss;

	@FindBy(xpath = "//input[@id='ChkIfIndividualCompany']")
	private WebElement IndiviCompany;

	@FindBy(xpath = "//input[@id='TxtReferenceId']")
	private WebElement ReferenceID;

	@FindBy(xpath = "//input[@id='LOVBank']")
	private WebElement Bank;

	@FindBy(xpath = "//input[@id='dgQuery__ctl2_txtVal']")
	private WebElement Bankcode;

	@FindBy(xpath = "//input[@id='dgQuery__ctl3_txtVal']")
	private WebElement Bankname;

	@FindBy(xpath = "//input[@id='BtnAllMatches']")
	private WebElement btnsearch;

	@FindBy(xpath = "//a[@id='lnbtn_IFSC']")
	private WebElement IFSClink;

	public void IFSCCode(String IFScode) {
		Bankcode.sendKeys(IFScode);
	}

	@FindBy(xpath = "//input[@id='txtBankAccountNo']")
	private WebElement Accountnum;

	public void AccountNo(String Accnum) {
		Accountnum.sendKeys(Accnum);
	}

	@FindBy(xpath = "//input[@id='txtgstin']")
	private WebElement gstin;

	public void GST(String GSTNO) {
		gstin.sendKeys(GSTNO);
	}

	@FindBy(xpath = "//input[@id='txt_telSTD']")
	private WebElement offstd;

	public void OffStd(String std) {
		offstd.sendKeys(std);
	}

	@FindBy(xpath = "//input[@id='TxtPhoneNo']")
	private WebElement Offphoneno;

	public void Officenumber(String phno) {
		Offphoneno.sendKeys(phno);
	}

	@FindBy(xpath = "//input[@id='txt_telSTDResidence']")
	private WebElement STDResidence;

	public void STDResidence(String stdres) {
		STDResidence.sendKeys(stdres);
	}

	@FindBy(xpath = "//input[@id='TxtPhoneNoResidence']")
	private WebElement PhoneNoResidence;

	public void PhoneNoResidence(String phnores) {
		PhoneNoResidence.sendKeys(phnores);
	}

	@FindBy(xpath = "//input[@id='txtMobile']")
	private WebElement contact;

	public void Contact(String Mob) {
		contact.sendKeys(Mob);
	}

	@FindBy(xpath = "//input[@id='TxtSTAXRegistrationNo']")
	private WebElement Tax;

	public void TaxRegNo(String Taxno) {
		Tax.sendKeys(Taxno);
	}

	@FindBy(xpath = "//input[@id='txtPanNo']")
	private WebElement panno;

	public void PANno(String pano) {
		panno.sendKeys(pano);
	}

	@FindBy(xpath = "//input[@id='txtDOB']")
	private WebElement DOB;

	public void DOB(String dob) {
		DOB.sendKeys(dob);
	}

	@FindBy(xpath = "//select[@id='ddlNationality']")
	private WebElement Nationalitydrop;

	public void Nationalityclick() {
		Nationalitydrop.click();
	}

	public Select Nationality() {
		return new Select(Nationalitydrop);
	}

	@FindBy(xpath = "//select[@id='ddlBankAccountType']")
	private WebElement Accounttype;

	public void AccountTypeclick() {
		Accounttype.click();
	}

	public Select Acctype() {
		return new Select(Accounttype);
	}

	@FindBy(xpath = "(//a[text()='Select'])[1]")
	private WebElement selectrow;

	public void Selec() {
		selectrow.click();
	}

	public void IFSCLink() {
		IFSClink.click();
	}

	public void Search() {
		btnsearch.click();
	}

	public void BankCode(String bcode) {
		Bankcode.sendKeys(bcode);
	}

	public void BankName(String bname) {
		Bankcode.sendKeys(bname);
	}

	public void Bankclick() {
		Bank.sendKeys(Keys.ARROW_UP);
	}

	public void Referencenumber(String RefNum) {
		ReferenceID.sendKeys(RefNum);
	}

	public void Individualcompany() {
		IndiviCompany.click();
	}

	public void Remark(String Remarks) {
		Remarkss.sendKeys(Remarks);
	}

	public Select catgory() {
		return new Select(Subcatgory);
	}

	public void catgoryclick() {
		Subcatgory.click();
	}

	public void EmailID(String Email) {
		EmailAddr.sendKeys(Email);
	}

	@FindBy(xpath = "//input[@id='LOVOffice']")
	private WebElement OfficeCode;

	@FindBy(xpath = "//input[@id='dgQuery__ctl2_txtVal']")
	private WebElement Lovoffcode;

	@FindBy(xpath = "//input[@id='dgQuery__ctl3_txtVal']")
	private WebElement LovOffname;

	@FindBy(xpath = "//input[@id='TxtSTAXRegistrationNo']")
	private WebElement TaxReg;

	@FindBy(xpath = "//input[@id='BtnAllMatches']")
	private WebElement LovbtnSearch;

	@FindBy(xpath = "(//a[text()='Select'])[1]")
	private WebElement LovbtnSelect;

	@FindBy(xpath = "//textarea[@id='TxtAddr1']")
	private WebElement VendorAddr;

	@FindBy(xpath = "//input[@id='TxtPin']")
	private WebElement VendorPincode;

	@FindBy(xpath = "//input[@id='dgQuery__ctl2_txtVal']")
	private WebElement Lovpincode;

	@FindBy(xpath = "//input[@id='dgQuery__ctl3_txtVal']")
	private WebElement Lovpincodename;

	@FindBy(xpath = "//input[@id='BtnAllMatches']")
	private WebElement PinSearch;

	@FindBy(xpath = "(//a[text()='Select'])[1]")
	private WebElement PinSelect;

	@FindBy(xpath = "//input[@id='CmdSubmit']")
	private WebElement VendorSave;

	@FindBy(xpath = "//div[@id='e0_7120i']")
	private WebElement GenericMaster;

	public void GenericMaster() {
		GenericMaster.click();
	}

	@FindBy(xpath = "//iframe[@id='MyFrame']")
	public WebElement iframe;

	@FindBy(xpath = "//input[@id='CmdSubmit']")
	private WebElement ViewSave;

	public void save() {
		ViewSave.click();
	}

	@FindBy(xpath = "//input[@id='CmdClose']")
	private WebElement ViewClose;

	public void close() {
		ViewClose.click();
	}

	public VendorMasterModifyPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
