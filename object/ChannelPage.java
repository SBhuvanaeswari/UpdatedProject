package Com.UIIC.object;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ChannelPage {

	@FindBy(xpath = "//input[@id='LOVIntermediary']")
	private WebElement Interm;

	public void Intermcode() {
		Interm.sendKeys(Keys.ARROW_UP);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl2_txtVal']")
	private WebElement IntermName;

	public void Intermnme(String IntName) {
		IntermName.sendKeys(IntName);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl3_txtVal']")
	private WebElement Cityname;

	public void city(String cityname) {
		Cityname.sendKeys(cityname);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl6_txtVal']")
	private WebElement Statecode;

	public void state(String statecode) {
		Statecode.sendKeys(statecode);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl7_txtVal']")
	private WebElement IntermCode;

	public void Intermecode(String code) {
		IntermCode.sendKeys(code);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl8_txtVal']")
	private WebElement Oficecode;

	public void offcode(String ofcode) {
		Oficecode.sendKeys(ofcode);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl4_txtVal']")
	private WebElement Pincode;

	public void pincode(String pcode) {
		Pincode.sendKeys(pcode);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl5_txtVal']")
	private WebElement Pinlocation;

	public void pinlocation(String ploc) {
		Pinlocation.sendKeys(ploc);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl9_txtVal']")
	private WebElement pannumber;

	public void PanNo(String Pannum) {
		pannumber.sendKeys(Pannum);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl10_txtVal']")
	private WebElement LicenseNumber;

	public void LicenseNo(String Licensenum) {
		LicenseNumber.sendKeys(Licensenum);
	}

	@FindBy(xpath = "//input[@id='BtnAllMatches']")
	private WebElement Search;

	public void LovSearch() {
		Search.click();
	}

	@FindBy(xpath = "(//a[text()='Select'])[1]")
	private WebElement Select;

	public void LovSelect() {
		Select.click();
	}

	@FindBy(xpath = "//div[@id='TvwProductTree_0']/input")
	private WebElement Allcheckbox;

	public void All() {
		Allcheckbox.click();
	}
	
	@FindBy(xpath="//img[@id='TvwProductTree_0_0c']")
	private WebElement clickFireradiobutton;
	
	public void Fireradiobutton() {
		clickFireradiobutton.click();
	}
	@FindBy(xpath = "//div[@id='TvwProductTree_0_0']/input")
	private WebElement Firecheckbox;

	public void Fire() {
		Firecheckbox.click();
	}
	
	@FindBy(xpath="//div[@id='TvwProductTree_0_0_0']/input")
	private WebElement checkFireFloaterDeclarationPolicy;
	public void FireFloaterDeclarationPolicy() {
		checkFireFloaterDeclarationPolicy.click();
	}
	
	@FindBy(xpath="//div[@id='TvwProductTree_0_0_1']/input")
	private WebElement checkSFSPSimpleRiskPolicy;
	public void SFSPSimpleRiskPolicy() {
		checkSFSPSimpleRiskPolicy.click();
	}
	
	@FindBy(xpath="//div[@id='TvwProductTree_0_0_2']/input")
	private WebElement checkSingleBlockSFSPPolicy;
	public void SingleBlockSFSPPolicy() {
		checkSingleBlockSFSPPolicy.click();
	}
	
	@FindBy(xpath="//div[@id='TvwProductTree_0_0_3']/input")
	private WebElement checkFireFloaterPolicy;
	public void FireFloaterPolicy() {
		checkFireFloaterPolicy.click();
	}
	
	@FindBy(xpath="//div[@id='TvwProductTree_0_0_4']/input")
	private WebElement checkStandardFireSpecialPeril;
	public void StandardFireSpecialPeril() {
		checkStandardFireSpecialPeril.click();
	}
	
	
	
	@FindBy(xpath="//div[@id='TvwProductTree_0_0_5']/input")
	private WebElement checkTerrorismStandalonePolicy;
	public void TerrorismStandalonePolicy() {
		checkTerrorismStandalonePolicy.click();
	}
	
	@FindBy(xpath="//div[@id='TvwProductTree_0_0_6']/input")
	private WebElement checkIndustrialAllRisk;
	public void IndustrialAllRisk() {
		checkIndustrialAllRisk.click();
	}
	
	
	@FindBy(xpath="//div[@id='TvwProductTree_0_0_7']/input")
	private WebElement checkBharatLaghuNdSukshmUdymSurksha;
	public void BharatLaghuNdSukshmUdymSurksha() {
		checkBharatLaghuNdSukshmUdymSurksha.click();
	}
	@FindBy(xpath="//div[@id='TvwProductTree_0_0_8']/input")
	private WebElement checkFireDeclarationPolicy;
	public void FireDeclarationPolicy() {
		checkFireDeclarationPolicy.click();
	}
	@FindBy(xpath="//div[@id='TvwProductTree_0_0_9']/input")
	private WebElement checkBharatGrihaRakshaPolicy;
	public void BharatGrihaRakshaPolicy() {
		checkBharatGrihaRakshaPolicy.click();
	}
	@FindBy(xpath="//div[@id='TvwProductTree_0_0_10']/input")
	private WebElement checkFireTerrorismPolicy;
	public void FireTerrorismPolicy() {
		checkFireTerrorismPolicy.click();
	}
	@FindBy(xpath="//div[@id='TvwProductTree_0_0_11']/input")
	private WebElement checkStandardFireBusinessInterruptionPolicy;
	public void StandardFireBusinessInterruptionPolicy() {
		checkStandardFireBusinessInterruptionPolicy.click();
	}
	@FindBy(xpath="//div[@id='TvwProductTree_0_0_12']/input")
	private WebElement checkBITerrorismPolicy;
	public void BITerrorismPolicy() {
		checkBITerrorismPolicy.click();
	}
	@FindBy(xpath="//div[@id='TvwProductTree_0_0_13']/input")
	private WebElement checkPetroChemicalRisksPolicy;
	public void PetroChemicalRisksPolicy() {
		checkPetroChemicalRisksPolicy.click();
	}
	
	@FindBy(xpath="//img[@id='TvwProductTree_0_1c']")
	private WebElement clickPropertyInsurannceradiobutton;
	
	public void PropertyInsurannceradiobutton() {
		clickPropertyInsurannceradiobutton.click();
	}
	@FindBy(xpath = "//div[@id='TvwProductTree_0_1']/input")
	private WebElement PropertyInsuranncecheckbox;

	public void PropertyInsurannce() {
		PropertyInsuranncecheckbox.click();
	}

	@FindBy(xpath = "//div[@id='TvwProductTree_0_2']/input")
	private WebElement MarineCargocheckbox1;

	public void MarineCargo1() {
		MarineCargocheckbox1.click();
	}

	@FindBy(xpath = "//div[@id='TvwProductTree_0_3']/input")
	private WebElement MarineHullcheckbox1;

	public void MarineHull1() {
		MarineHullcheckbox1.click();
	}

	@FindBy(xpath = "//div[@id='TvwProductTree_0_4']/input")
	private WebElement MarineCargocheckbox;

	public void MarineCargo() {
		MarineCargocheckbox.click();
	}

	@FindBy(xpath = "//div[@id='TvwProductTree_0_5']/input")
	private WebElement MarineHullcheckbox;

	public void MarineHull() {
		MarineHullcheckbox.click();
	}

	@FindBy(xpath = "//div[@id='TvwProductTree_0_6']/input")
	private WebElement Packagecheckbox;

	public void Package() {
		Packagecheckbox.click();
	}

	@FindBy(xpath = "//div[@id='TvwProductTree_0_7']/input")
	private WebElement Liabilitycheckbox;

	public void Liability() {
		Liabilitycheckbox.click();
	}

	@FindBy(xpath = "//div[@id='TvwProductTree_0_8']/input")
	private WebElement Healthcheckbox;

	public void Health() {
		Healthcheckbox.click();
	}

	@FindBy(xpath = "//div[@id='TvwProductTree_0_9']/input")
	private WebElement Miscellaneouscheckbox;

	public void Miscellaneous() {
		Miscellaneouscheckbox.click();
	}

	@FindBy(xpath = "//div[@id='TvwProductTree_0_10']/input")
	private WebElement Ruralcheckbox;

	public void Rural() {
		Ruralcheckbox.click();
	}

	@FindBy(xpath = "//div[@id='TvwProductTree_0_11']/input")
	private WebElement Motorcheckbox;

	public void Motor() {
		Motorcheckbox.click();
	}

	@FindBy(xpath = "//div[@id='TvwProductTree_0_12']/input")
	private WebElement Motortpcheckbox;

	public void MotorTP() {
		Motortpcheckbox.click();
	}

	@FindBy(xpath = "//div[@id='TvwProductTree_0_13']/input")
	private WebElement Motordeclinedcheckbox;

	public void Motordeclined() {
		Motordeclinedcheckbox.click();
	}

	@FindBy(xpath = "//div[@id='TvwProductTree_0_14']/input")
	private WebElement Motortppoolcheckbox;

	public void MotorTPPool() {
		Motortppoolcheckbox.click();
	}

	@FindBy(xpath = "//div[@id='TvwProductTree_0_15']/input")
	private WebElement personalaccidentcheckbox;

	public void PersonalAccient() {
		personalaccidentcheckbox.click();
	}

	@FindBy(xpath = "//div[@id='TvwProductTree_0_16']/input")
	private WebElement Aviationcheckbox;

	public void Aviation() {
		Aviationcheckbox.click();
	}

	@FindBy(xpath = "//div[@id='TvwProductTree_0_17']/input")
	private WebElement engncheckbox;

	public void Engineering() {
		engncheckbox.click();
	}

	@FindBy(xpath = "//div[@id='TvwProductTree_0_18']/input")
	private WebElement socialruralcheckbox;

	public void SocialandRural() {
		socialruralcheckbox.click();
	}

	@FindBy(xpath = "//select[@id='ddlCovernoteFlag']")
	private WebElement Covernoteflag;

	public Select Coverflag() {
		return new Select(Covernoteflag);
	}

	@FindBy(xpath = "//input[@id='TxtRemarks']")
	private WebElement Remark;

	public void Remarks(String data) {
		Remark.sendKeys(data);
	}

	@FindBy(xpath = "//input[@id='TxtValidityStartDate']")
	private WebElement startDate;

	public void startDt(String Date) {
		startDate.sendKeys(Date);
	}

	@FindBy(xpath = "//input[@id='TxtValidityEndDate']")
	private WebElement EndDate;

	public void endDt(String EndDatt) {
		EndDate.sendKeys(EndDatt);
	}

	@FindBy(xpath = "//input[@id='btnSave']")
	private WebElement Active;

	public void save() {
		Active.click();
	}

	/* Modify and view page objects */

	@FindBy(xpath = "//input[@id='TxtChannelID']")
	private WebElement EditChanID;

	public void ChannelID(String Channid) {
		EditChanID.sendKeys(Channid);
	}

	@FindBy(xpath = "//input[@id='txtIntermediaryCode']")
	private WebElement Editintcode;

	public void EditIntermcode(String Intercode) {
		Editintcode.sendKeys(Intercode);
	}

	@FindBy(xpath = "//input[@id='TxtIntermediaryName']")
	private WebElement Editintname;

	public void EditIntermname(String Intername) {
		Editintname.sendKeys(Intername);
	}

	@FindBy(xpath = "//input[@id='btnSave']")
	private WebElement modifysave;

	public void Modify() {
		modifysave.click();
	}

	@FindBy(xpath = "//input[@id='btnClose']")
	private WebElement Viewclose;

	public void closebtn() {
		Viewclose.click();
	}

	@FindBy(xpath = "//input[@id='btnDeactivate']")
	private WebElement btndeactive;

	public void deactivate() {
		btndeactive.click();
	}

	@FindBy(xpath = "//input[@id='btnInActivate']")
	private WebElement btnInactive;

	public void Inactivate() {
		btnInactive.click();
	}

	@FindBy(xpath = "//input[@id='btnActivate']")
	public WebElement active;

	@FindBy(xpath = "//input[@id='btnSearch']")
	private WebElement Editsrch;

	public void EditSearch() {
		Editsrch.click();
	}

	@FindBy(xpath = "//a[text()='Edit']")
	private WebElement Editlnk;

	public void EditLink() {
		Editlnk.click();
	}

	@FindBy(xpath = "//a[text()='View']")
	private WebElement Viewlnk;

	public void ViewLink() {
		Viewlnk.click();
	}

	@FindBy(xpath = "//select[@id='ddlLOB']")
	private WebElement EditpageInternLOB;

	public Select InternLOB() {
		return new Select(EditpageInternLOB);
	}

	public void clickInternLOB() {
		EditpageInternLOB.click();
	}

	@FindBy(xpath = "//select[@id='ddlStatus']")
	private WebElement statuss;

	public void clickstatus() {
		statuss.click();
	}

	public Select status() {
		return new Select(statuss);
	}

	@FindBy(xpath = "//iframe[@id='MyFrame']")
	public WebElement iframe;

	public ChannelPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
