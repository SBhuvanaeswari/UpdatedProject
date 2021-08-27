package Com.UIIC.object;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class VendorMasterAddPage {

	
	@FindBy(xpath = "//input[@id='TxtContrLandName']")
	private WebElement VendorName;

	public void vendorname(String VenName) {
		VendorName.sendKeys(VenName);
	}

	@FindBy(xpath = "//input[@id='TxtEmailAddress']")
	private WebElement EmailAddr;

	public void EmailID(String Email) {
		EmailAddr.sendKeys(Email);
	}

	@FindBy(xpath = "//input[@id='LOVOffice']")
	private WebElement OfficeCode;

	public void Officecode() {
		OfficeCode.sendKeys(Keys.ARROW_UP);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl2_txtVal']")
	private WebElement Lovoffcode;

	public void LovOffcode(String code) {
		Lovoffcode.sendKeys(code);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl3_txtVal']")
	private WebElement LovOffname;

	public void LovOffname(String codename) {
		LovOffname.sendKeys(codename);
	}

	@FindBy(xpath = "//input[@id='BtnAllMatches']")
	private WebElement LovSearch;

	public void LovSearch() {
		LovSearch.click();
	}

	@FindBy(xpath = "(//a[text()='Select'])[1]")
	private WebElement LovSelect;

	public void LovSelect() {
		LovSelect.click();
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

	@FindBy(xpath = "//textarea[@id='TxtAddr1']")
	private WebElement VendorAddr;

	public void VendorAddr(String Addr) {
		VendorAddr.sendKeys(Addr);
	}

	@FindBy(xpath = "//input[@id='TxtPin']")
	private WebElement VendorPincode;

	public void VendorPincode() {
		VendorPincode.sendKeys(Keys.ARROW_UP);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl2_txtVal']")
	private WebElement Lovpincode;

	public void Lovpincode(String pcode) {
		Lovpincode.sendKeys(pcode);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl3_txtVal']")
	private WebElement Lovpincodename;

	public void Lovpincodename(String pname) {
		Lovpincodename.sendKeys(pname);
	}

	@FindBy(xpath = "//input[@id='BtnAllMatches']")
	private WebElement PinSearch;

	public void PinSearch() {
		PinSearch.click();
	}

	@FindBy(xpath = "(//a[text()='Select'])[1]")
	private WebElement PinSelect;

	public void PinSelect() {
		PinSelect.click();
	}

	@FindBy(xpath = "//select[@id='ddlPartnerType']")
	private WebElement Subcatgory;

	public Select catgory() {
		return new Select(Subcatgory);
	}

	public void catgoryclick() {
		Subcatgory.click();
	}

	@FindBy(xpath = "//input[@id='TxtRemarks']")
	private WebElement Remarkss;

	public void Remark(String Remarks) {
		Remarkss.sendKeys(Remarks);
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

	@FindBy(xpath = "//input[@id='ChkIfIndividualCompany']")
	private WebElement IndiviCompany;

	public void Individualcompany() {
		IndiviCompany.click();
	}

	@FindBy(xpath = "//input[@id='TxtReferenceId']")
	private WebElement ReferenceID;

	public void Referencenumber(String RefNum) {
		ReferenceID.sendKeys(RefNum);
	}

	@FindBy(xpath = "//a[@id='lnbtn_IFSC']")
	private WebElement IFSClink;

	public void IFSCLink() {
		IFSClink.click();
	}

	@FindBy(xpath = "//input[@id='LOVBank']")
	private WebElement Bank;

	public void Bankclick() {
		Bank.sendKeys(Keys.ARROW_UP);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl2_txtVal']")
	private WebElement Bankcode;

	public void BankCode(String bcode) {
		Bankcode.sendKeys(bcode);
	}

	public void IFSCCode(String IFScode) {
		Bankcode.sendKeys(IFScode);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl3_txtVal']")
	private WebElement Bankname;

	public void BankName(String bname) {
		Bankcode.sendKeys(bname);
	}

	@FindBy(xpath = "//input[@id='BtnAllMatches']")
	private WebElement btnsearch;

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

	public void Search() {
		btnsearch.click();
	}

	@FindBy(xpath = "//input[@id='CmdSubmit']")
	private WebElement VendorSave;
	
	public void save() {
		VendorSave.click();
	}

	@FindBy(xpath = "//div[@id='e0_7120i']")
	private WebElement GenericMaster;

	@FindBy(xpath = "//iframe[@id='MyFrame']")
	public WebElement iframe;

	public void GenericMaster() {
		GenericMaster.click();
	}

	public VendorMasterAddPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void Vendorclear() {
		VendorAddr.clear();
	}

	
}
