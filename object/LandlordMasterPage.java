package Com.UIIC.object;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LandlordMasterPage {

	
	
	@FindBy(xpath="//input[@id='TxtContrLandName']")
	private WebElement Landlordname;
	
	public void Landname(String landname) {
		Landlordname.sendKeys(landname);
	}
	
	@FindBy(xpath="//input[@id='LOVOffice']")
	private WebElement Offcode;
	
	public void Offcode() {
		Offcode.sendKeys(Keys.ARROW_UP);
	}
	
	
	@FindBy(xpath="//input[@id='dgQuery__ctl2_txtVal']")
	private WebElement LovOffcode;
	
	public void Offcode(String offcode) {
		LovOffcode.sendKeys(offcode);
	}
	
	@FindBy(xpath="//input[@id='dgQuery__ctl3_txtVal']")
	private WebElement LovOffname;
	
	public void Offname(String offname) {
		LovOffname.sendKeys(offname);
	}
	
	@FindBy(xpath="//input[@id='BtnAllMatches']")
	private WebElement Lovsearch;
	
	public void LovSearch() {
		Lovsearch.click();
		
	}
	
	@FindBy(xpath="(//a[text()='Select'])[1]")
	private WebElement Lovselect;
	public void Lovselect() {
		Lovselect.click();
	}
	
	@FindBy(xpath="//input[@id='TxtAddr1']")
	private WebElement Addr;
	public void Addr(String Addrs) {
		Addr.sendKeys(Addrs);
	}
	
	@FindBy(xpath="//input[@id='TxtAddr2']")
	private WebElement Addre1;
	public void Addr1(String Addrs1) {
		Addre1.sendKeys(Addrs1);
	}
	
	@FindBy(xpath="//input[@id='TxtAddr3']")
	private WebElement Addre2;
	public void Addr2(String Addrs2) {
		Addre2.sendKeys(Addrs2);
	}
	
	@FindBy(xpath="//input[@id='TxtPin']")
	private WebElement Pincode;
	public void Pincode() {
		Pincode.sendKeys(Keys.ARROW_UP);
	}
	
	@FindBy(xpath="//input[@id='dgQuery__ctl2_txtVal']")
	private WebElement Lovpincode;
	public void pincode(String pincode) {
		Lovpincode.sendKeys(pincode);
	}
	
	
	@FindBy(xpath="//input[@id='dgQuery__ctl3_txtVal']")
	private WebElement Lovpinname;
	public void pinname(String name) {
		Lovpinname.sendKeys(name);
	}
	
	@FindBy(xpath="//input[@id='BtnAllMatches']")
	private WebElement Lovpinsearch;
	public void LovpinSearch() {
		Lovpinsearch.click();
		
	}
	
	@FindBy(xpath="(//a[text()='Select'])[1]")
	private WebElement Lovpinselect;
	public void Lovpinselect() {
		Lovpinselect.click();
	}
	
	@FindBy(xpath="//input[@id='CmdSubmit']")
	private WebElement save;
	public void save() {
		save.click();
	}
	
	
	@FindBy(xpath="//input[@id='TxtVendorCode']")
	private WebElement landcode;
	
	public void Viwlandcode(String landcode) {
		ViewLandcode.sendKeys(landcode);
	}
	
	@FindBy(xpath="//iframe[@id='MyFrame']")
	public WebElement iframe;
	
	@FindBy(xpath="//input[@id='CmdSearch']")
	private WebElement Modifysearch;
	
	public void modifysearch() {
		Modifysearch.click();
	}
	
	@FindBy(xpath="//input[@id='TxtVendorName']")
	private WebElement ViewLandName;
	public void Viwlandname(String landname) {
		ViewLandName.sendKeys(landname);
	}
	
	
	@FindBy(xpath="//input[@id='TxtVendorCode']")
	private WebElement ViewLandcode;
	public void lancode(String lancode) {
		landcode.sendKeys(lancode);
	}
	
	@FindBy(xpath="//a[text()='Edit']")
	public WebElement Modifyedit;
	
	public void clickedit() {
		Modifyedit.click();
	}
	@FindBy(xpath="//a[text()='View']")
	public WebElement Viewlnk;
	public void clickView() {
		Viewlnk.click();
	}
	
	@FindBy(linkText="Home")
	private WebElement Home;
	
	@FindBy(xpath="//input[@id='LOVBank']")
	private WebElement Bank;
	public void banklov() {
		Bank.sendKeys(Keys.ARROW_UP);
	}
	
	
	@FindBy(xpath="//input[@id='LOVBranchCode']")
	 private WebElement branchcode;
	
	@FindBy(xpath="//input[@id='txtBankAccountNo']")
	private WebElement BankAccountno;
	
	
	
	@FindBy(xpath="//select[@id='ddlBankAccountType']")
	private WebElement acctype;
	public Select banktype()
	{
	   return new Select(acctype);
	}
	
	
	@FindBy(xpath="//select[@id='ddlPartnerType']")
	public WebElement subcat;
	
	
	
	public void BankAccno(String accno) {
		BankAccountno.sendKeys(accno);
	}
	
	public void brchcode() {
		branchcode.sendKeys(Keys.ARROW_UP);
	}
	
	
	public void HomeLink() {
		Home.click();
	}
	
	
	/*Modify*/
	
	
	
	
	public LandlordMasterPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	

	@FindBy(xpath="//input[@id='CmdClose']")
    private WebElement ViewClose;
	
	public void close() {
		ViewClose.click();
	}
	
	@FindBy(xpath="//input[@id='TxtEmailAddress']")
	private WebElement EmailAddr;
	
	public void EmailID(String Email) {
		EmailAddr.sendKeys(Email);
	}
	
	
	@FindBy(xpath="//input[@id='txtGSTinNo']") 
	private WebElement Gstinno;
	
	public void GST(String GSTNO) {
		Gstinno.sendKeys(GSTNO);
	}
	
	@FindBy(xpath="//select[@id='ddlPartnerType']")
	private WebElement Subcatgory;
	
	public Select catgory()
	{
		return new Select(Subcatgory);
	}
	public void catgoryclick()
	{
		Subcatgory.click();
	}
	
	@FindBy(xpath="//input[@id='TxtRemarks']")
	private WebElement Remarkss;
	public void Remark(String Remarks)
	{
		Remarkss.sendKeys(Remarks);
	}
	
	@FindBy(xpath="//input[@id='ChkIfIndividualCompany']")
	private WebElement IndiviCompany;
	public void Individualcompany() {
		IndiviCompany.click();
	}
	
	@FindBy(xpath="//input[@id='TxtReferenceId']")
	private WebElement ReferenceID;
	public void Referencenumber(String refnum) {
		ReferenceID.sendKeys(refnum);
	}
	
	@FindBy(xpath="//input[@id='LOVBank']")
    private WebElement Banks;
	
	
	@FindBy(xpath="//input[@id='dgQuery__ctl2_txtVal']")
	private WebElement Bankcode;
	
	@FindBy(xpath="//input[@id='dgQuery__ctl3_txtVal']")
	private WebElement Bankname;
	
	public void bankcode(String bcode) {
		LovOffcode.sendKeys(bcode);
	}
	
	public void bankname(String bname) {
		LovOffname.sendKeys(bname);
	}
	
	public void bsrch() {
		Lovpinsearch.click();
	}
	public void bedit() {
		Lovselect.click();
	}
	
	@FindBy(xpath="//input[@id='BtnAllMatches']")
	private WebElement btnsearch;
	
	public void Search() {
		btnsearch.click();
	}
	
	@FindBy(xpath="//a[@id='lnbtn_IFSC']")
	private WebElement IFSClink;
	
	public void IFSCLink(){
		IFSClink.click();
	}
	
	public void IFSCCode(String IFScode) {
		Bankcode.sendKeys(IFScode);
	}
	@FindBy(xpath="//input[@id='txtBankAccountNo']")
	private WebElement Accountnum;
	
	public void AccountNo(String Accnum) {
		Accountnum.sendKeys(Accnum);
	}
	
	
	@FindBy(xpath="//input[@id='txt_telSTD']")
	private WebElement offstd;
	public void OffStd(String std) {
		offstd.sendKeys(std);
	}
	
	@FindBy(xpath="//input[@id='TxtPhoneNo']")
	private WebElement Offphoneno;
	public void Officenumber(String phno) {
		Offphoneno.sendKeys(phno);
	}
	@FindBy(xpath="//input[@id='txt_telSTDResidence']")
	private WebElement STDResidence;
	public void STDResidence(String stdres) {
		STDResidence.sendKeys(stdres);
	}
	
	@FindBy(xpath="//input[@id='TxtPhoneNoResidence']")
	private WebElement PhoneNoResidence;
	public void PhoneNoResidence(String phnores) {
		PhoneNoResidence.sendKeys(phnores);
	}
	@FindBy(xpath="//input[@id='txtMobile']")
	private WebElement contact;
	public void Contact(String Mob) {
		contact.sendKeys(Mob);
	}
	
	@FindBy(xpath="//input[@id='TxtSTAXRegistrationNo']")
	private WebElement Tax;
	
	public void TaxRegNo(String Taxno) {
		Tax.sendKeys(Taxno);
	}
	
	@FindBy(xpath="//input[@id='txtPanNo']")
	private WebElement panno;
	
	public void PANno(String pano) {
		panno.sendKeys(pano);
	}
	
	@FindBy(xpath="(//a[text()='Select'])[1]")
	private WebElement selectrow;
	
	public void Selec() {
		selectrow.click();
	}
	
	@FindBy(xpath="//select[@id='ddlBankAccountType']")
	private WebElement Accounttype;
	
	public void AccountTypeclick() {
		Accounttype.click();
	}
	
	public Select Acctype() {
		return new Select(Accounttype);
	}
	
	@FindBy(xpath="//input[@id='LOVOffice']")
	private WebElement OfficeCode;
	
	@FindBy(xpath="//input[@id='dgQuery__ctl2_txtVal']")
	private WebElement Lovoffcode;
	
	@FindBy(xpath="//input[@id='dgQuery__ctl3_txtVal']")
	private WebElement LovOffiname;
	
	
	public void Officecode() {
		OfficeCode.sendKeys(Keys.ARROW_UP);
	}
	public void LovOffcode(String code) {
		Lovoffcode.sendKeys(code);
	}
	public void LovOffname(String codename) {
		LovOffname.sendKeys(codename);
	}
	
	
}
