package Com.UIIC.objects1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpecifiedPersonAddPage {
	
	
	@FindBy(xpath = "//iframe[@id='MyFrame']")
	public WebElement iframe;

	public SpecifiedPersonAddPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='txtSPCode']")
	private WebElement specifiedPersonCode;
	public void EnterSpecifiedPersonCode(String spcode) {
		specifiedPersonCode.sendKeys(spcode);
	}
	@FindBy(xpath="//input[@id='txtSPName']")
	private WebElement specifiedPersonName;
	public void EnterSpecifiedPersonName(String spname) {
		specifiedPersonName.sendKeys(spname);
	}
	@FindBy(xpath="//input[@id='txtStartDate']")
	private WebElement startDate;
	public void EnterStartDate(String stadt) {
		startDate.sendKeys(stadt);
	}
	@FindBy(xpath="//input[@id='chkStatus']")
	private WebElement activeStatus;
	public void clickActiveStatus() {
		activeStatus.click();
	}
	@FindBy(xpath="//input[@id='txtEndDate']")
	private WebElement endDate;
	public void EnterEndDate(String enddt) {
		endDate.sendKeys(enddt);
	}
	
	@FindBy(xpath="//input[@id='LOVLocation']")
	private WebElement copyFromLocation;
	public void EnterCopyFromLocation(String loclov) {
		copyFromLocation.sendKeys(loclov);
	}

	@FindBy(xpath="//input[@id='txtAddressLine1']")
	private WebElement address1;
	public void EnterAddress1(String add1) {
		address1.sendKeys(add1);
	}
	@FindBy(xpath="//input[@id='txtAddressLine2']")
	private WebElement address2;
	public void EnterAddress2(String add2) {
		address2.sendKeys(add2);
	}
	
	@FindBy(xpath="//input[@id='txtAddressLine3']")
	private WebElement address3;
	public void EnterAddress3(String add3) {
		address3.sendKeys(add3);
	}
	
	@FindBy(xpath="//input[@id='LOVPinCode']")
	private WebElement pincode;
	public void clickPincode() {
		pincode.sendKeys(Keys.ARROW_UP);
	}
	
	@FindBy(xpath="//input[@id='dgQuery__ctl2_txtVal']")
	private WebElement lovpincode;
	public void EnterPincode(String pcode) {
		lovpincode.sendKeys(pcode);
	}
	
	
	@FindBy(xpath="//input[@id='dgQuery__ctl3_txtVal']")
	private WebElement lovpincodelocation;
	public void EnterPincodeLocation(String Pcodeloc) {
		lovpincodelocation.sendKeys(Pcodeloc);
	}
	
	@FindBy(xpath="//input[@id='BtnAllMatches']")
	private WebElement lovsearch;
	public void ClickSearch() {
		lovsearch.click();
	}
	
	@FindBy(xpath = "(//a[text()='Select'])[1]")
	private WebElement lovSelectlink;
	public void Selectlink() {
		lovSelectlink.click();
	}
	@FindBy(xpath="//input[@id='CmdSubmit']")
	private WebElement submit;
	public void clickSubmit() {
		submit.click();
	}
}
