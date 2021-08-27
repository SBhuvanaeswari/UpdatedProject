package Com.UIIC.objects1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RiskLocationMasterModifyandViewPage {
	@FindBy(xpath = "//iframe[@id='MyFrame']")
	public WebElement iframe;
	
	public RiskLocationMasterModifyandViewPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='txtLocationCode']")
	private WebElement locationcode;
	public void enterlocationcode(String loccode) {
		locationcode.sendKeys(loccode);
	}
	@FindBy(xpath="//input[@id='TxtAddrLine1']")
	private WebElement Address1;
	public void enterAddress1(String addr1) {
		Address1.sendKeys(addr1);
	}
	@FindBy(xpath="//input[@id='TxtAddrLine2']")
	private WebElement Address2;
	public void enterAddress2(String addr2) {
		Address2.sendKeys(addr2);
	}
	@FindBy(xpath="//input[@id='TxtAddrLine3']")
	private WebElement Address3;
	public void enterAddress3(String addr3) {
		Address3.sendKeys(addr3);
	}

	
	@FindBy(xpath="//input[@id='TxtStateCode']")
	private WebElement stateCode;
	public void enterStateCode(String statecode) {
		stateCode.sendKeys(statecode);
	}
	
	@FindBy(xpath="//input[@id='TxtDistrictCode']")
	private WebElement districtCode;
	public void enterDistrictCode(String discode) {
		districtCode.sendKeys(discode);
	}
	@FindBy(xpath="//input[@id='TxtPinCode']")
	private WebElement pinCode;
	public void clickPinCode() {
		pinCode.sendKeys(Keys.ARROW_UP);
	}
	
	@FindBy(xpath="//input[@id='dgQuery__ctl2_txtVal']")
	private WebElement lovpinCode;
	public void enterPinCode(String pcode) {
		lovpinCode.sendKeys(pcode);
	}
	
	@FindBy(xpath="//input[@id='dgQuery__ctl3_txtVal']")
	private WebElement lovpinCodename;
	public void enterPinCodeName(String pname) {
		lovpinCodename.sendKeys(pname);
	}
	
	@FindBy(xpath="//input[@id='BtnAllMatches']")
	private WebElement lovSearch;
	public void clickSearch() {
		lovSearch.click();
	}
	
	@FindBy(xpath = "(//a[text()='Select'])[1]")
	private WebElement lovSelectlink;
	public void Selectlink() {
		lovSelectlink.click();
	}
	
	@FindBy(xpath="//input[@id='TxtEndDate']")
	private WebElement endDate;
	public void enterEndDate(String enddt) {
		endDate.sendKeys(enddt);
	}
	@FindBy(xpath="//input[@id='cmdSubmit']")
	private WebElement Search;
	public void clickModifySearch() {
		Search.click();
	}
	
	@FindBy(xpath="//a[text()='Edit']")
	private WebElement Editlink;
	public void Edit() {
		Editlink.click();
	}
	
	@FindBy(xpath="//a[text()='View']")
	private WebElement Viewlink;
	public void View() {
		Viewlink.click();
	}
	


}
