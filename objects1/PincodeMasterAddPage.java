package Com.UIIC.objects1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PincodeMasterAddPage {

	
	
	@FindBy(xpath = "//iframe[@id='MyFrame']")
	public WebElement iframe;

	@FindBy(xpath = "//input[@id='TxtStateCode']")
	private WebElement stateCode;

	public void clickStateCode() {
		stateCode.sendKeys(Keys.ARROW_UP);
	}
	
	@FindBy(xpath="//input[@name='TxtCode']")
	private WebElement lovstatecode;
	public void enterStateCode(String statecode) {
		lovstatecode.sendKeys(statecode);
	}
	

	@FindBy(xpath="//input[@name='TxtName']")
	private WebElement lovstatename;
	public void enterStateName(String statename) {
		lovstatename.sendKeys(statename);
	}
	
	
	@FindBy(xpath="//input[@id='BtnFind']")
	private WebElement lovbtnsearch;
	public void btnsearch() {
		lovbtnsearch.click();
	}
	
	@FindBy(xpath = "(//a[text()='Select'])[1]")
	private WebElement lovSelectlink;
	public void Selectlink() {
		lovSelectlink.click();
	}
	
	@FindBy(xpath = "//input[@id='TxtCityCode']")
	private WebElement cityandDistrictCode;
	public void clickCityandDistrictCode() {
		cityandDistrictCode.sendKeys(Keys.ARROW_UP);
	}
	
	@FindBy(xpath="//input[@name='TxtCode']")
	private WebElement lovDistrictcode;
	public void enterDistrictCode(String discode) {
		lovDistrictcode.sendKeys(discode);
	}
	

	@FindBy(xpath="//input[@name='TxtName']")
	private WebElement lovDistrictname;
	public void enterDistrictName(String disname) {
		lovDistrictname.sendKeys(disname);
	}
	
	
	@FindBy(xpath="//input[@id='BtnFind']")
	private WebElement btnsearch;
	public void clicksearch() {
		btnsearch.click();
	}
	
	@FindBy(xpath = "(//a[text()='Select'])[1]")
	private WebElement Selectlink;
	public void clickSelectlink() {
		Selectlink.click();
	}
	
	
	@FindBy(xpath="//input[@name='TxtPinCode']")
	private WebElement pinCode;
	public void enterPinCode(String pincode) {
		pinCode.sendKeys(pincode);
	}
	
	
	@FindBy(xpath="//input[@id='TxtPinCodeLocName']")
	private WebElement pinCodeLocationName;
	public void enterPinCodeLocationName(String pincodelocname) {
		pinCodeLocationName.sendKeys(pincodelocname);
	}
	
	@FindBy(xpath="//input[@id='TxtEndDate']")
	private WebElement endDate;
	public void enterEndDate(String enddt) {
	  endDate.sendKeys(enddt);
	}
	
	@FindBy(xpath="//input[@id='CmdSubmit']")
	private WebElement save;
	public void ClickSave() {
		save.click();
	}
	
	
	public PincodeMasterAddPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
