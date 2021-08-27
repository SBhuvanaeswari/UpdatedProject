package Com.UIIC.object;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TenantMasterPage {

	
	
	
	@FindBy(xpath="//input[@id='TxtContrLandName']")
	private WebElement TentlordName;
	public void TentName(String Tenname) {
		TentlordName.sendKeys(Tenname);
	}
	
	@FindBy(xpath="//input[@id='TxtEmailAddress']")
	private WebElement TentEmail;
	
	public void Email(String Emailid) {
		TentEmail.sendKeys(Emailid);
	}
	
	@FindBy(xpath="//input[@id='LOVOffice']")
	private WebElement lovoffice;
	
	public void lovoff() {
		lovoffice.sendKeys(Keys.ARROW_UP);
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
	
	@FindBy(xpath = "//input[@id='txtMobile']")
	private WebElement contact;

	public void Contact(String Mob) {
		contact.sendKeys(Mob);
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

	
	@FindBy(xpath="//input[@id='TxtAddr1']")
	private WebElement Addrs;
	public void Address1(String address) {
		Addrs.sendKeys(address);
	}
	
	@FindBy(xpath="//input[@id='TxtAddr2']")
	private WebElement Addrs2;
	public void Address2(String address2) {
		Addrs2.sendKeys(address2);
	}
	@FindBy(xpath="//input[@id='TxtAddr3']")
	private WebElement Addrs3;
	public void Address3(String address3) {
		Addrs3.sendKeys(address3);
	}
	
	@FindBy(xpath="//input[@id='TxtPin']")
	private WebElement TxtPincode;
	public void Pincode() {
		TxtPincode.sendKeys(Keys.ARROW_UP);
	}
	
	@FindBy(xpath="//input[@id='dgQuery__ctl2_txtVal']")
	private WebElement lovpinncode;
	public void lovpincode(String pcode) {
		lovpinncode.sendKeys(pcode);
	}
	@FindBy(xpath="//input[@id='dgQuery__ctl3_txtVal']")
	private WebElement lovpinnname;
	public void lovpinname(String pname) {
		lovpinnname.sendKeys(pname);
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

	@FindBy(xpath = "//select[@id='ddlPartnerType']")
	private WebElement Subcatgory;

	public Select catgory() {
		return new Select(Subcatgory);
	}

	public void catgoryclick() {
		Subcatgory.click();
	}
	
	@FindBy(xpath = "//select[@id='ddlBankAccountType']")
	private WebElement Accounttype;

	public void AccountTypeclick() {
		Accounttype.click();
	}

	public Select Acctype() {
		return new Select(Accounttype);
	}

	@FindBy(xpath = "//input[@id='txtBankAccountNo']")
	private WebElement Accountnum;

	public void AccountNo(String Accnum) {
		Accountnum.sendKeys(Accnum);
	}
	@FindBy(xpath = "//a[@id='lnbtn_IFSC']")
	private WebElement IFSClink;

	public void IFSCLink() {
		IFSClink.click();
	}
	@FindBy(xpath = "//input[@id='dgQuery__ctl2_txtVal']")
	private WebElement ifsc;
	public void IFSCCode(String IFScode) {
		ifsc.sendKeys(IFScode);
	}
	
	@FindBy(xpath = "//input[@id='CmdSubmit']")
	private WebElement TenantMasterSave;
	
	public void save() {
		TenantMasterSave.click();
	}

	@FindBy(xpath="//input[@id='dgQuery__ctl2_txtVal']")
	private WebElement Lovbankbranchhcode;
	
	public void Lovbankbrhcode(String bankbrchcode) {
		Lovbankbranchhcode.sendKeys(bankbrchcode);
	}
	
	@FindBy(xpath="//input[@id='dgQuery__ctl3_txtVal']")
	private WebElement Lovbanknamefield;
	public void Lovbankname(String lovbname) {
		Lovbanknamefield.sendKeys(lovbname);
	}
	
	
	
	@FindBy(xpath="//input[@id='txtCommissionBranchCode']")
	public WebElement CommissionBranchCode;
	public void Bankbrch(String combcode) {
		CommissionBranchCode.sendKeys(combcode);
	}
	
	@FindBy(xpath="//select[@id='ddlBankAccountType']")
	private WebElement BankAccountType;
	
	public Select BankAccType()
	{
		return new Select( BankAccountType);
	}
	public void BankAccTypeclick()
	{
		 BankAccountType.click();
	}
	
	@FindBy(xpath="//input[@id='LOVBank']")
	private WebElement LovBankname;
	public void LovBank(String bcode) {
		LovBankname.sendKeys(bcode);
	}
	
    @FindBy(xpath="//input[@id='LOVBranchCode']")
    private WebElement BranchCode;
    public void LovBranchCode(String brnchcode) {
    	BranchCode.sendKeys(brnchcode);
    }
    
	
	@FindBy(xpath="//input[@id='btnSave']")
	private WebElement btnsave;
	
	public void Save() {
		btnsave.click();
	}
	
	
	
	@FindBy(xpath="//input[@id='txtBankAccountNo']")
	private WebElement Accnumber;
	public void Accno(String Accnum) {
		Accnumber.sendKeys(Accnum);
		
	}
	
	
	@FindBy(xpath="//iframe[@id='MyFrame']")
	public WebElement iframe;
	
	@FindBy(xpath="//input[@id='txt_telSTD']")
	private WebElement telSTD;
	public void Std(String telcode) {
		telSTD.sendKeys(telcode);
	}
	
	
	
	@FindBy(xpath="//input[@id='TxtPhoneNo']")
	private WebElement Stdno;
	public void StdPhone(String stdnum) {
		Stdno.sendKeys(stdnum);
	}
	
	
	@FindBy(xpath="//input[@id='txtCommissionBankCode']")
	private WebElement Bcode;
	public void Bankcode(String code) {
		Bcode.sendKeys(code);
	}
	
	
	@FindBy(xpath="//input[@id='CmdSubmit']")
	private WebElement btnsubmit;
	
	public void TMsubmit() {
	btnsubmit.click();
	}
	
	
	
	@FindBy(xpath="//input[@id='TxtVendorName']")
	private WebElement ViewTenantName;
	public void ViewTVName(String Tentname) {
		ViewTenantName.sendKeys(Tentname);
	}
	
	@FindBy(xpath="//input[@id='TxtVendorCode']")
	private WebElement ViewTentCode;
	
	public void ViewTXVecode(String txcode) {
		ViewTentCode.sendKeys(txcode);
	}
    @FindBy(xpath="//input[@id='CmdSearch']")
    private WebElement ViewSrch;
    
    public void ViewSearch() {
    	ViewSrch.click();
    	
    }
    
    @FindBy(xpath="//a[text()='View']")
    private WebElement Editbtn;
    
    public void ViewEdit() {
    	Editbtn.click();
    }
    
    
    @FindBy(xpath="//a[text()='Edit']")
    private WebElement Editbutton;
    
    public void Editlink() {
    	Editbutton.click();
    }
	
    
    @FindBy(xpath="//input[@id='CmdClose']")
    private WebElement viewclosebtn;
    
    public void ViewClose() {
    	viewclosebtn.click();
    }
	
	public TenantMasterPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='txtGSTinNo']")
	private WebElement Gstinno;
	
	public void GST(String GSTNO) {
		Gstinno.sendKeys(GSTNO);
	}
	
	@FindBy(xpath="//input[@id='LOVOffice']")
	private WebElement ViewOffcode;
	
	public void officecode() {
		ViewOffcode.sendKeys(Keys.ARROW_UP);
	}
	
	@FindBy(xpath="//input[@id='dgQuery__ctl2_txtVal']")
	private WebElement ViewLovoffcode;
	
	public void Lovoffcode(String Lovcode) {
		ViewLovoffcode.sendKeys(Lovcode);
	}
	
	@FindBy(xpath="//input[@id='dgQuery__ctl3_txtVal']")
	private WebElement ViewLovOffname;
	
	public void Lovoffname(String Lovoffname)
	{
		ViewLovOffname.sendKeys(Lovoffname);
	}
	
	
	/*@FindBy(xpath="//input[@id='BtnAllMatches']")
	private WebElement LovSearch;
	public void search() {
		LovSearch.click();
	}
	
	@FindBy(xpath="(//a[text()='Select'])[1]")
	private WebElement LovSelect;
	public void select() {
		LovSelect.click();
	}*/
}
