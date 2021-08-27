package Com.UIIC.object;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GenericOfficeLocationMasterModifyPage {

	
	@FindBy(xpath = "//iframe[@id='MyFrame']")
	public WebElement iframe;

	@FindBy(xpath = "//input[@id='TxtOfficeCode']")
	private WebElement offcode;

	public void OfficeCode(String ofcode) {
		offcode.sendKeys(ofcode);
	}

	@FindBy(xpath = "//input[@id='TxtOfficeName']")
	private WebElement OffName;

	public void OfficeName(String ofname) {
		OffName.sendKeys(ofname);
	}

	@FindBy(xpath = "//select[@id='DrpOfficeType']")
	private WebElement OffType;

	public void offtypeclick() {
		OffType.click();
	}

	public Select OfficeType() {
		return new Select(OffType);
	}

	@FindBy(xpath = "//input[@id='TxtParentOffice']")
	private WebElement ParentOfficecode;

	public void ParentOffice() {
		ParentOfficecode.sendKeys(Keys.ARROW_UP);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl2_txtVal']")
	private WebElement LovOffcode;

	public void LovPatOffcode(String lovofcode) {
		LovOffcode.sendKeys(lovofcode);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl3_txtVal']")
	private WebElement LovOffname;

	public void LovPatOffname(String lovofname) {
		LovOffname.sendKeys(lovofname);
	}

	@FindBy(xpath = "//input[@id='BtnAllMatches']")
	private WebElement btnsubmit;

	public void patsubmit() {
		btnsubmit.click();
	}

	@FindBy(xpath = "(//a[text()='Select'])[1]")
	private WebElement selectlinks;

	public void selectlink() {
		selectlinks.click();
	}

	@FindBy(xpath = "//input[@id='TxtEndDate']")
	private WebElement Enddat;

	public void Enddt(String enddate) {
		Enddat.sendKeys(enddate);
	}

	@FindBy(xpath = "//input[@id='TxtAddr1']")
	private WebElement Address1;

	public void Address(String addr1) {
		Address1.sendKeys(addr1);
	}

	@FindBy(xpath = "//input[@id='TxtAddr2']")
	private WebElement Address2;

	public void Addr2(String addrr2) {
		Address2.sendKeys(addrr2);
	}

	@FindBy(xpath = "//input[@id='TxtAddr3']")
	private WebElement Address3;

	public void Addr3(String addrr3) {
		Address3.sendKeys(addrr3);
	}

	@FindBy(xpath = "//input[@id='TxtPin']")
	private WebElement clickPincode;

	public void Pincode() {
		clickPincode.sendKeys(Keys.ARROW_UP);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl2_txtVal']")
	private WebElement Lovpincode;

	public void pincode(String pcode) {
		LovOffcode.sendKeys(pcode);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl3_txtVal']")
	private WebElement lovpinlocationname;

	public void pincodelocation(String ploc) {
		lovpinlocationname.sendKeys(ploc);
	}

	@FindBy(xpath = "//input[@id='BtnAllMatches']")
	private WebElement pinbtnsubmit;

	public void pinsubmit() {
		pinbtnsubmit.click();
	}

	@FindBy(xpath = "(//a[text()='Select'])[1]")
	private WebElement pinselectlinks;

	public void pinselectlink() {
		pinselectlinks.click();
	}

	@FindBy(xpath = "//input[@id='txt_telSTD']")
	private WebElement telStd;

	public void Std(String stdnumber) {
		telStd.sendKeys(stdnumber);
	}

	@FindBy(xpath = "//input[@id='TxtPhoneNo']")
	private WebElement PhoneNumber;

	public void PhoneNo(String phonenumb) {
		PhoneNumber.sendKeys(phonenumb);
	}

	@FindBy(xpath = "//input[@id='TxtGSTIN']")
	private WebElement GSTINNO;

	public void GSTIN(String gstno) {
		GSTINNO.sendKeys(gstno);
	}

	@FindBy(xpath = "//input[@id='chkStockManualCN']")
	private WebElement checkhubbox;

	public void checkhub() {
		checkhubbox.click();
	}

	@FindBy(xpath = "//input[@id='LOVCompOfficeCode']")
	private WebElement CompOffCode;

	public void CompOfficeCode() {
		CompOffCode.sendKeys(Keys.ARROW_UP);
	}

	@FindBy(xpath = "//input[@id='TxtCompOfficeeName']")
	private WebElement CompOffName;

	public void CompOfficeName(String comofname) {
		CompOffName.sendKeys(comofname);
	}

	@FindBy(xpath = "//input[@id='CmdSubmit']")
	private WebElement btnSubmit;

	public void Submit() {
		btnSubmit.click();
	}

	@FindBy(xpath = "//input[@id='txt_telSTD_2']")
	private WebElement STDnumber;

	public void STD2(String stdno1) {
		STDnumber.sendKeys(stdno1);
	}

	@FindBy(xpath = "//input[@id='TxtPhoneNo2']")
	private WebElement phonenumber;

	public void phoneno2(String phono) {
		phonenumber.sendKeys(phono);
	}

	@FindBy(xpath = "//input[@id='txt_faxSTD']")
	private WebElement faxstdnumber;

	public void faxstd(String stdno) {
		faxstdnumber.sendKeys(stdno);
	}

	@FindBy(xpath = "//input[@id='txt_faxLandline']")
	private WebElement faxlandlinenumber;

	public void faxlandline(String landlinenum) {
		faxlandlinenumber.sendKeys(landlinenum);
	}

	@FindBy(xpath = "//input[@id='Txttanno']")
	private WebElement Taxnumber;

	public void Taxno(String taxnum) {
		Taxnumber.sendKeys(taxnum);
	}

	@FindBy(xpath = "//input[@id='TxtGSTTDS']")
	private WebElement Gsttdsno;

	public void GSTTDS(String tdsno) {
		Gsttdsno.sendKeys(tdsno);
	}

	public GenericOfficeLocationMasterModifyPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='CmdSearch']")
	private WebElement btnsearch;

	public void Search() {
		btnsearch.click();
	}

	@FindBy(xpath = "//a[text()='Edit']")
	private WebElement Editlink;

	public void Edit() {
		Editlink.click();
	}

	@FindBy(xpath = "//a[text()='View']")
	private WebElement Viewlink;

	public void ViewSrch() {
		Viewlink.click();
	}

	@FindBy(xpath = "//input[@id='CmdClose']")
	private WebElement buttonclose;

	public void btnclose() {
		buttonclose.click();
	}

}
