package Com.UIIC.object;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CoInsuranceOffMasterPage {

	@FindBy(xpath = "//iframe[@id='MyFrame']")
	public WebElement frame;

	@FindBy(xpath = "//input[@id='TxtCompanyCode']")
	private WebElement Companycode;

	public void Comcode() {
		Companycode.sendKeys(Keys.ARROW_UP);
	}

	@FindBy(xpath = "//input[@id='txtRole']")
	private WebElement Lovcompanyname;

	public void Lovcomname(String lovcompname) {
		Lovcompanyname.sendKeys(lovcompname);
	}

	@FindBy(xpath = "//input[@id='TxtCode']")
	private WebElement Insurcompanycode;

	public void Insurcompcode(String insucomcode) {
		Insurcompanycode.sendKeys(insucomcode);
	}

	@FindBy(xpath = "//input[@id='BtnFind']")
	private WebElement Searchbutton;

	public void LovSearch() {
		Searchbutton.click();
	}

	@FindBy(xpath = "(//a[text()='Select'])[1]")
	private WebElement Selectlink;

	public void LovSelect() {
		Selectlink.click();
	}

	@FindBy(xpath = "//input[@id='txtOfficeCode']")
	private WebElement officecode;

	public void offcode(String ofcode) {
		officecode.sendKeys(ofcode);
	}

	@FindBy(xpath = "//input[@id='txtAddr1']")
	private WebElement Address1;

	public void Addr1(String Addr1) {
		Address1.sendKeys(Addr1);
	}

	@FindBy(xpath = "//input[@id='txtAddr2']")
	private WebElement Address2;

	public void Addr2(String Addr2) {
		Address2.sendKeys(Addr2);
	}

	@FindBy(xpath = "//input[@id='txtAddr3']")
	private WebElement Address3;

	public void Addr3(String Addr3) {
		Address3.sendKeys(Addr3);
	}

	@FindBy(xpath = "//input[@id='TxtPin']")
	private WebElement clickpincode;

	public void pincode() {
		clickpincode.sendKeys(Keys.ARROW_UP);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl2_txtVal']")
	private WebElement Lovpincodefield;

	public void Lovpincode(String lovpcode) {
		Lovpincodefield.sendKeys(lovpcode);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl3_txtVal']")
	private WebElement Lovpincodelocation;

	public void Lovpincodeloc(String lovploc) {
		Lovpincodelocation.sendKeys(lovploc);
	}

	@FindBy(xpath = "//input[@id='txt_telSTD']")
	private WebElement Stdnumber;

	public void Std(String stdnum) {
		Stdnumber.sendKeys(stdnum);
	}

	@FindBy(xpath = "//input[@id='TxtPhoneNo']")
	private WebElement Phonenumber;

	public void Phoneno(String phonumber) {
		Phonenumber.sendKeys(phonumber);
	}

	@FindBy(xpath = "//input[@id='TxtEmailID']")
	private WebElement AddEmailID;

	public void EmailID(String emailvalue) {
		AddEmailID.sendKeys(emailvalue);
	}

	@FindBy(xpath = "//input[@id='txtgstin']")
	private WebElement gstinno;

	public void gstin(String gstno) {
		gstinno.sendKeys(gstno);
	}

	@FindBy(xpath = "//input[@id='txtCommissionBankCode']")
	private WebElement CommissionBankcode;

	public void Bankcode() {
		CommissionBankcode.sendKeys(Keys.ARROW_UP);
	}

	@FindBy(xpath = "//input[@id='txtCommissionBranchCode']")
	private WebElement commissionBankbrch;

	public void Bankbrch() {
		commissionBankbrch.sendKeys(Keys.ARROW_UP);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl2_txtVal']")
	private WebElement Lovbankbranchcode;

	public void Lovbankbrhcode(String bankbrchcode) {
		Lovbankbranchcode.sendKeys(bankbrchcode);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl3_txtVal']")
	private WebElement Lovbanknam;

	public void Lovbankname(String bankname) {
		Lovbanknam.sendKeys(bankname);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl4_txtVal']")
	private WebElement LovIFSCcode;

	public void LovIFSC(String ifsccode) {
		LovIFSCcode.sendKeys(ifsccode);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl5_txtVal']")
	private WebElement LovMICRcode;

	public void LovMICR(String micrcode) {
		LovMICRcode.sendKeys(micrcode);
	}

	@FindBy(xpath = "//select[@id='ddlBankAccountType']")
	private WebElement BankAccountType;

	public Select BankAccType() {
		return new Select(BankAccountType);
	}

	public void BankAccountTypeclick() {
		BankAccountType.click();
	}

	@FindBy(xpath = "//input[@id='btnSave']")
	private WebElement btnsave;

	public void Save() {
		btnsave.click();
	}

	@FindBy(xpath = "//input[@id='txtCommissionACNo']")
	private WebElement Accountno;

	public void Accno(String Accnum) {
		Accountno.sendKeys(Accnum);
	}

	@FindBy(xpath = "//input[@id='BtnAllMatches']")
	private WebElement LovSearchbutton;

	public void LoSearch() {
		LovSearchbutton.click();
	}

	/* Modify view */
	@FindBy(xpath = "//input[@id='TxtCompanyCodeEdit']")
	private WebElement EditInsurancecompanycode;

	public void EditInsurancecode() {
		EditInsurancecompanycode.sendKeys(Keys.ARROW_UP);
	}

	@FindBy(xpath = "//input[@id='txtOfficeCodeEdit']")
	private WebElement EditOfficeCode;

	public void EdOffCode(String edoffcode) {
		EditOfficeCode.sendKeys(edoffcode);
	}

	@FindBy(xpath = "//input[@id='btnShowDetails']")
	private WebElement ShowDetails;

	public void EdShowDetails() {
		ShowDetails.click();
	}

	@FindBy(xpath = "//input[@id='TxtEmailIDEdit']")
	private WebElement EditEmail;

	public void ViEmail(String Emailid) {
		EditEmail.sendKeys(Emailid);
	}

	@FindBy(xpath = "//input[@id='btnSave']")
	private WebElement savebutton;

	public void ViSave() {
		savebutton.click();
	}

	@FindBy(xpath = "//input[@id='TxtCompanyCodeEdit']")
	private WebElement ViewCompanyCode;

	public void ViewComCode() {
		ViewCompanyCode.sendKeys(Keys.ARROW_UP);
	}

	@FindBy(xpath = "//input[@id='btnShowDetails']")
	private WebElement ViewShowDetails;

	public void ViShowDetails() {
		ViewShowDetails.click();
	}

	@FindBy(xpath = "//input[@id='txtOfficeCodeEdit']")
	private WebElement ViewOfficeCode;

	public void ViOffCode(String viewoffcode) {
		ViewOfficeCode.sendKeys(viewoffcode);
	}

	@FindBy(xpath = "//input[@id='btnclose']")
	private WebElement Closebutton;

	public void ViewClose() {
		Closebutton.click();
	}

	@FindBy(xpath = "(//a[text()='Select'])[1]")
	private WebElement LoSelectlink;

	public void LoSelect() {
		LoSelectlink.click();
	}

	/* Edit fields */

	@FindBy(xpath = "//input[@id='txtAddr1Edit']")
	private WebElement EditAddress1;

	public void editAddr1(String Addr1) {
		EditAddress1.sendKeys(Addr1);
	}

	@FindBy(xpath = "//input[@id='txtAddr2Edit']")
	private WebElement EditAddress2;

	public void editAddr2(String Addr2) {
		EditAddress2.sendKeys(Addr2);
	}

	@FindBy(xpath = "//input[@id='txtAddr3Edit']")
	private WebElement EditAddress3;

	public void editAddr3(String Addr3) {
		EditAddress3.sendKeys(Addr3);
	}

	@FindBy(xpath = "//input[@id='TxtPinEdit']")
	private WebElement Edtpincode;

	public void editpincode() {
		Edtpincode.sendKeys(Keys.ARROW_UP);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl2_txtVal']")
	private WebElement EditLovpincodefield;

	public void editLovpincode(String lovpcode) {
		EditLovpincodefield.sendKeys(lovpcode);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl3_txtVal']")
	private WebElement EditLovpincodelocation;

	public void editLovpincodeloc(String lovploc) {
		EditLovpincodelocation.sendKeys(lovploc);
	}

	@FindBy(xpath = "//input[@id='BtnFind']")
	private WebElement EditSearchbutton;

	public void EditLovSearch() {
		EditSearchbutton.click();
	}

	@FindBy(xpath = "(//a[text()='Select'])[1]")
	private WebElement EditSelectlink;

	public void EditLovSelect() {
		EditSelectlink.click();
	}

	@FindBy(xpath = "//input[@id='txt_telSTDEdit']")
	private WebElement EditStdnumber;

	public void editStd(String stdnum) {
		EditStdnumber.sendKeys(stdnum);
	}

	@FindBy(xpath = "//input[@id='TxtPhoneNoEdit']")
	private WebElement EditPhonenumber;

	public void EditPhoneno(String phonumber) {
		EditPhonenumber.sendKeys(phonumber);
	}

	@FindBy(xpath = "//input[@id='TxtEmailIDEdit']")
	private WebElement EditEmailID;

	public void editEmailID(String emailvalue) {
		EditEmailID.sendKeys(emailvalue);
	}

	@FindBy(xpath = "//input[@id='txtgstinEdit']")
	private WebElement Editgstinno;

	public void Editgstin(String gstno) {
		Editgstinno.sendKeys(gstno);
	}

	public CoInsuranceOffMasterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
