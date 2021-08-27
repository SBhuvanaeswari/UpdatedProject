package Com.UIIC.object;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContractorMasterPage {

	
	@FindBy(xpath = "//input[@id='TxtContrLandName']")
	private WebElement ContrName;

	public void ContractName(String contraname) {
		ContrName.sendKeys(contraname);
	}

	@FindBy(xpath = "//iframe[@id='MyFrame']")
	public WebElement iframe;

	@FindBy(xpath = "//input[@id='TxtLicense']")
	public WebElement Licenses;

	public void License(String Licensenum) {

		Licenses.sendKeys(Licensenum);
	}

	@FindBy(xpath = "//input[@id='TxtAppointment']")
	private WebElement Appoinment;

	public void Appoinmentdt(String Appoindt) {
		Appoinment.sendKeys(Appoindt);
	}

	@FindBy(xpath = "//input[@id='TxtExpiry']")
	private WebElement Expirydate;

	public void Expirydate(String expdt) {
		Expirydate.sendKeys(expdt);
	}

	@FindBy(xpath = "//input[@id='TxtEmailAddress']")
	private WebElement EmailAddress;

	public void EmailID(String Email) {
		EmailAddress.sendKeys(Email);
	}

	@FindBy(xpath = "//input[@id='LOVOffice']")
	private WebElement Offcode;

	public void officecode() {
		Offcode.sendKeys(Keys.ARROW_UP);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl2_txtVal']")
	private WebElement LovOffcode;

	public void LovOfficecode(String lovofcode) {
		LovOffcode.sendKeys(lovofcode);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl3_txtVal']")
	private WebElement LovOffname;

	public void LovOfficename(String lovofname) {
		LovOffname.sendKeys(lovofname);
	}

	@FindBy(xpath = "//input[@id='BtnAllMatches']")
	private WebElement patsubmit;

	public void search() {
		patsubmit.click();
	}

	@FindBy(xpath = "(//a[text()='Select'])[1]")
	private WebElement selectlink;

	public void Selectbtn() {
		selectlink.click();
	}

	@FindBy(xpath = "//input[@id='TxtAppointment']")
	public WebElement AppDate;

	@FindBy(xpath = "//input[@id='TxtExpiry']")
	public WebElement ExpDate;

	@FindBy(xpath = "//input[@id='txt_telSTD']")
	private WebElement offstd;

	public void OfficeSTD(String std) {
		offstd.sendKeys(std);
	}

	@FindBy(xpath = "//input[@id='TxtPhoneNo']")
	private WebElement offphone;

	public void Officephoneno(String stdphone) {
		offphone.sendKeys(stdphone);
	}

	@FindBy(xpath = "//input[@id='txt_telSTDResidence']")
	private WebElement Residencestd;

	public void STDResidence(String resstd) {
		Residencestd.sendKeys(resstd);
	}

	@FindBy(xpath = "//input[@id='TxtPhoneNoResidence']")
	private WebElement phoneResidencestd;

	public void ResidencePhoneno(String respho) {
		phoneResidencestd.sendKeys(respho);
	}

	@FindBy(xpath = "//input[@id='txtMobile']")
	private WebElement mobileno;

	public void Mobile(String Mob) {
		mobileno.sendKeys(Mob);
	}

	@FindBy(xpath = "//input[@id='TxtContractorBsns']")
	private WebElement contractbsns;

	public void ContractorBsns(String bsns) {
		contractbsns.sendKeys(bsns);
	}

	@FindBy(xpath = "//input[@id='txtGSTinNo']")
	private WebElement Gst;

	public void GSTNo(String gst) {
		Gst.sendKeys(gst);
	}

	@FindBy(xpath = "//input[@id='txtMobile']")
	private WebElement Mobileno;

	public void Mobilenum(String mobnum) {
		Mobileno.sendKeys(mobnum);
	}

	@FindBy(xpath = "//input[@id='TxtAddr1']")
	private WebElement Addr1;

	public void Addr1(String Add1) {
		Addr1.sendKeys(Add1);
	}

	@FindBy(xpath = "//input[@id='TxtAddr2']")
	private WebElement Addr2;

	public void Address2(String Add2) {
		Addr2.sendKeys(Add2);
	}

	@FindBy(xpath = "//input[@id='TxtAddr3']")
	private WebElement Addr3;

	public void Address3(String Add3) {
		Addr3.sendKeys(Add3);
	}

	@FindBy(xpath = "//input[@id='TxtPin']")
	private WebElement Pincode;

	public void pincode() {
		Pincode.sendKeys(Keys.ARROW_UP);
	}

	@FindBy(xpath = "//input[@id='TxtRemarks']")
	private WebElement Remarks;

	public void Remark(String remar) {
		Remarks.sendKeys(remar);
	}

	@FindBy(xpath = "//input[@id='TxtSTAXRegistrationNo']")
	private WebElement Tax;

	public void TaxRegNo(String Taxno) {
		Tax.sendKeys(Taxno);
	}

	@FindBy(xpath = "//select[@id='ddlPartnerType']")
	private WebElement Subcatgory;

	public Select catgory() {
		return new Select(Subcatgory);
	}

	public void catgoryclick() {
		Subcatgory.click();
	}

	@FindBy(xpath = "//input[@id='txtPanNo']")
	private WebElement panno;

	public void PANno(String pano) {
		panno.sendKeys(pano);
	}

	@FindBy(xpath = "//input[@id='TxtContractorType']")
	private WebElement contractortype;

	public void Contracttype(String ctype) {
		contractortype.sendKeys(ctype);
	}

	@FindBy(xpath = "//input[@id='ChkIfIndividualCompany']")
	private WebElement IndiviCompany;

	public void Individualcompany() {
		IndiviCompany.click();
	}

	@FindBy(xpath = "//input[@id='TxtReferenceId\']")
	private WebElement ReferenceID;

	public void Referencenumber(String RefNum) {
		ReferenceID.sendKeys(RefNum);
	}

	@FindBy(xpath = "//a[@id='lnbtn_IFSC']")
	private WebElement IFSClink;

	public void IFSCLink() {
		IFSClink.click();
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl2_txtVal']")
	private WebElement IFcode;

	public void IFSCCode(String IFScode) {
		IFcode.sendKeys(IFScode);
	}

	@FindBy(xpath = "//input[@id='txtBankAccountNo']")
	private WebElement Accountnum;

	public void AccountNo(String Accnum) {
		Accountnum.sendKeys(Accnum);
	}

	@FindBy(xpath = "//select[@id='ddlBankAccountType']")
	private WebElement Accounttype;

	public void AccountTypeclick() {
		Accounttype.click();
	}

	public Select Acctype() {
		return new Select(Accounttype);
	}

	@FindBy(xpath = "//input[@id='CmdSubmit']")
	private WebElement Submit;

	public void Submitclick() {
		Submit.click();
	}

	/* Modify view */

	@FindBy(xpath = "//input[@id='TxtVendorCode']")
	private WebElement contrcode;

	public void EditContrcode(String concode) {
		contrcode.sendKeys(concode);
	}

	@FindBy(xpath = "//input[@id='TxtVendorName']")
	private WebElement contrname;

	public void EditContrname(String conname) {
		contrname.sendKeys(conname);
	}

	@FindBy(xpath = "//input[@id='CmdSearch']")
	private WebElement Search;

	public void EditSearch() {
		Search.click();
	}

	@FindBy(xpath = "//a[text()='View']")
	private WebElement View;

	public void Viewlink() {
		View.click();
	}

	@FindBy(xpath = "//a[text()='Edit']")
	private WebElement Edit;

	public void Editlink() {
		Edit.click();
	}

	@FindBy(xpath = "//input[@id='LOVOffice']")
	private WebElement ViewOffcode;

	public void offcode() {
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

	public void searchbutton() {
		LovSearch.click();
	}

	@FindBy(xpath = "(//a[text()='Select'])[1]")
	private WebElement LovSelect;

	public void select() {
		LovSelect.click();
	}

	@FindBy(xpath = "//input[@id='CmdClose']")
	private WebElement btnclose;

	public void close() {
		btnclose.click();
	}

	public ContractorMasterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
