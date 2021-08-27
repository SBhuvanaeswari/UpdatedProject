package Com.UIIC.object;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FinancierBranchMasterPage {

	
	public FinancierBranchMasterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//iframe[@id='MyFrame']")
	public WebElement iframe;
	
	@FindBy(xpath = "//input[@id='TxtFinancierCode']")
	private WebElement Fincode;

	public void FinancierCode() {
		Fincode.sendKeys(Keys.ARROW_UP);
	}

	@FindBy(xpath = "//input[@id='TxtCode']")
	private WebElement Lofincode;

	public void LovFincode(String code) {
		Lofincode.sendKeys(code);
	}

	@FindBy(xpath = "//input[@id='TxtName']")
	private WebElement Lofinname;

	public void LovFinname(String finname) {
		Lofinname.sendKeys(finname);
	}

	@FindBy(xpath = "//input[@id='BtnFind']")
	private WebElement Lovsearch;

	public void Lovsrch() {
		Lovsearch.click();
	}

	@FindBy(xpath = "(//a[text()='Select'])[1]")
	private WebElement Lovselect;

	public void Select() {
		Lovselect.click();
	}

	@FindBy(xpath = "//input[@id='chkBankAssurance']")
	private WebElement BankAsscheckbox;

	public void CheckBankAssurance() {
		BankAsscheckbox.click();
	}

	@FindBy(xpath = "//input[@id='TxtBranchName']")
	private WebElement Finbranchname;

	public void FinanceBranchname(String branchname) {
		Finbranchname.sendKeys(branchname);
	}

	@FindBy(xpath = "//input[@id='TxtAddress1']")
	private WebElement Addr;

	public void Address(String Addrr) {
		Addr.sendKeys(Addrr);
	}

	@FindBy(xpath = "//input[@id='TxtAddress2']")
	private WebElement Address2;

	public void Addr2(String Add2) {
		Address2.sendKeys(Add2);
	}

	@FindBy(xpath = "//input[@id='TxtAddress3']")
	private WebElement Address3;

	public void Addr3(String Add3) {
		Address3.sendKeys(Add3);
	}

	@FindBy(xpath = "//input[@id='LOVPinCode']")
	private WebElement Lovpincode;

	public void pincode() {
		Lovpincode.sendKeys(Keys.ARROW_UP);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl2_txtVal']")
	private WebElement pinnum;

	public void Lovpincodee(String pcode) {
		pinnum.sendKeys(pcode);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl3_txtVal']")
	private WebElement pinname;

	public void Lovpinlocation(String location) {
		pinname.sendKeys(location);
	}

	@FindBy(xpath = "//input[@id='BtnAllMatches']")
	private WebElement pinsearch;

	public void Pincodesearch() {
		pinsearch.click();

	}

	@FindBy(xpath = "(//a[text()='Select'])[1]")
	private WebElement pinselect;

	public void Pincodeselect() {
		pinselect.click();
	}

	@FindBy(xpath = "//select[@id='drpdwnZoneCircle']")
	private WebElement dropzonecircle;

	public Select Zonecircle() {
		return new Select(dropzonecircle);
	}

	public void Zoneclick() {
		dropzonecircle.click();
	}

	@FindBy(xpath = "//input[@id='txt_landLineSTD']")
	private WebElement Landstd;

	public void landlinestd(String lastd) {
		Landstd.sendKeys(lastd);
	}

	@FindBy(xpath = "//input[@id='txtLandlineNumber']")
	private WebElement Landphoneno;

	public void landlineno(String landline) {
		Landphoneno.sendKeys(landline);
	}

	@FindBy(xpath = "//input[@id='txt_faxSTD']")
	private WebElement faxstd;

	public void faxstdno(String faxstdno) {
		faxstd.sendKeys(faxstdno);
	}

	@FindBy(xpath = "//input[@id='txt_faxISD']")
	private WebElement faxISD;

	public void faxISDno(String faxisd) {
		faxISD.sendKeys(faxisd);
	}

	// *[@id="TxtEmail"]

	@FindBy(xpath = "//input[@id='txt_faxLandline']")
	private WebElement faxlandlineno;

	public void faxlandlinenum(String faxlandno) {
		faxlandlineno.sendKeys(faxlandno);
	}

	@FindBy(xpath = "//input[@id='TxtEmail']")
	private WebElement Email;

	public void EMAILID(String emai) {
		Email.sendKeys(emai);
	}

	@FindBy(xpath = "//input[@id='txtIFSC']")
	private WebElement IFSCcode;

	public void IFSC(String ifccode) {
		IFSCcode.sendKeys(ifccode);
	}

	@FindBy(xpath = "//input[@id='txtMICR']")
	private WebElement MICRcode;

	public void MICR(String miccode) {
		MICRcode.sendKeys(miccode);
	}

	@FindBy(xpath = "//input[@id='txtPAN']")
	private WebElement Panno;

	public void PAN(String pano) {
		Panno.sendKeys(pano);
	}

	@FindBy(xpath = "//select[@id='ddlPartnerType']")
	private WebElement subcate;

	public Select category() {
		return new Select(subcate);
	}

	public void catclick() {
		subcate.click();
	}

	@FindBy(xpath = "//input[@id='txtStartDateNew']")
	private WebElement stdate;

	public void startdate(String Date) {
		stdate.sendKeys(Date);
	}

	@FindBy(xpath = "//input[@id='txtEndDateNew']")
	private WebElement etdate;

	public void enddate(String enddt) {
		etdate.click();
	}

	@FindBy(xpath = "//input[@id='txtEndDateNew']")
	private WebElement Enddate;

	public void Enddt(String enddtt) {
		Enddate.sendKeys(enddtt);
	}

	@FindBy(xpath = "//input[@id='LOVBank']")
	private WebElement clickbank;

	public void Lovbank() {
		clickbank.sendKeys(Keys.ARROW_UP);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl2_txtVal']")
	private WebElement bankcode;

	public void Lovbankcode(String bcode) {
		bankcode.sendKeys(bcode);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl3_txtVal']")
	private WebElement bankname;

	public void Lovbankname(String bname) {
		bankname.sendKeys(bname);
	}

	@FindBy(xpath = "//input[@id='BtnAllMatches']")
	private WebElement banksearch;

	public void lovbanksearch() {
		banksearch.click();

	}

	@FindBy(xpath = "(//a[text()='Select'])[1]")
	private WebElement bankselect;

	public void bankcodeselect() {
		bankselect.click();
	}

	@FindBy(xpath = "//input[@id='LOVBranchCode']")
	private WebElement clickbranchcode;

	public void Lovbranchcode() {
		clickbranchcode.sendKeys(Keys.ARROW_UP);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl4_txtVal']")
	private WebElement LovIFSC;

	public void LOVIFSCcode(String lovifcode) {
		LovIFSC.sendKeys(lovifcode);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl5_txtVal']")
	private WebElement LovMIRC;

	public void LOVMIRCCcode(String lovmircode) {
		LovMIRC.sendKeys(lovmircode);
	}

	@FindBy(xpath = "//select[@id='ddlBankAccountType']")
	private WebElement Accounttype;

	public Select BankAcctype() {
		return new Select(Accounttype);
	}

	public void acctypeclick() {
		Accounttype.click();
	}

	@FindBy(xpath = "//input[@id='txtBankAccountNo']")
	private WebElement BankAccount;

	public void BankAccno(String Acc) {
		BankAccount.sendKeys(Acc);
	}

	@FindBy(xpath = "//input[@id='btnSubmit']")
	private WebElement addsave;

	public void Submit() {
		addsave.click();
	}

	/* Modify View */

	@FindBy(xpath = "//input[@id='TxtFinancierCode']")
	private WebElement viewFincode;

	public void ViewFinanciercode() {
		viewFincode.sendKeys(Keys.ARROW_UP);
	}

	@FindBy(xpath = "//input[@id='txtMICR']")
	private WebElement ModifyMICR;

	public void MICRCode(String MICRcode) {
		ModifyMICR.sendKeys(MICRcode);
	}

	@FindBy(xpath = "//input[@id='txtIFSC']")
	private WebElement ModifyIFSC;

	public void ModifyIFsccode(String ifcode) {
		ModifyIFSC.sendKeys(ifcode);
	}
	// *[@id="TxtCode"]

	@FindBy(xpath = "//input[@id='TxtCode']")
	private WebElement Finbranchcode;

	public void Financierbranchcode(String fbcode) {
		Finbranchcode.sendKeys(fbcode);
	}

	@FindBy(xpath = "//input[@id='TxtBranchCode']")
	private WebElement viewFinbrachcode;

	public void ViewBranchcode() {
		viewFinbrachcode.sendKeys(Keys.ARROW_UP);
	}

	@FindBy(xpath = "//input[@id='TxtName']")
	private WebElement lovbrchname;

	public void LovBranchname(String brchname) {
		lovbrchname.sendKeys(brchname);
	}

	@FindBy(xpath = "//input[@id='BtnFind']")
	private WebElement finbrchsearch;

	public void BranchSearch() {
		finbrchsearch.click();
	}

	@FindBy(xpath = "(//a[text()='Select'])[1]")
	private WebElement branchselect;

	public void SelectBranch() {
		branchselect.click();
	}

	@FindBy(xpath = "//a[text()='Edit']")
	private WebElement Editbtn;

	public void Editlink() {
		Editbtn.click();
	}

	@FindBy(xpath = "//div[@id='btnSubmit']")
	private WebElement editsav;

	public void EditSave() {
		editsav.click();
	}

	@FindBy(xpath = "//input[@id=\"btnSubmit\"]")
	private WebElement Viewsearch;

	public void ViwSearch() {
		Viewsearch.click();
	}

	@FindBy(xpath = "//a[text()='View']")
	private WebElement Viewedt;

	public void ViewEdit() {
		Viewedt.click();
	}

	@FindBy(xpath = "//div[@id='btnClose']")
	private WebElement closebtn;

	public void Viewclose() {
		closebtn.click();

	}

}
