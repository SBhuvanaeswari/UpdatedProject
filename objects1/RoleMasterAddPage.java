package Com.UIIC.objects1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoleMasterAddPage {
	@FindBy(xpath = "//iframe[@id='MyFrame']")
	public WebElement iframe;

	public RoleMasterAddPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='TxtRoleName']")
	private WebElement roleName;
	public void EnterRoleName(String rolename) {
		roleName.sendKeys(rolename);
	}
	
	@FindBy(xpath="//input[@id='TxtParentRole']")
	private WebElement parentRole;
	public void clickPartentRole() {
		parentRole.sendKeys(Keys.ARROW_UP);
	}
	@FindBy(xpath="//input[@id='TxtName']")
	private WebElement lovParentRole;
	public void EnterParentRole(String parrole) {
		lovParentRole.sendKeys(parrole);
	}
	@FindBy(xpath="//input[@name='BtnFind']")
	private WebElement lovsearch;
	public void ClickSearch() {
		lovsearch.click();
	}
	
	@FindBy(xpath = "(//a[text()='Select'])[1]")
	private WebElement lovSelectlink;
	public void Selectlink() {
		lovSelectlink.click();
	}
	
	@FindBy(xpath="//input[@id='RdoRoleType_0']")
	private WebElement employeeroletype;
	public void clickemployeeroletype() {
		employeeroletype.click();
	}
	
	@FindBy(xpath="//input[@id='RdoRoleType_1']")
	private WebElement intermroletype;
	public void clickIntermroletype() {
		intermroletype.click();
	}
	@FindBy(xpath="//input[@id='RdoRoleType_2']")
	private WebElement Externalroletype;
	public void clickExternalroletype() {
		Externalroletype.click();
	}
	
	@FindBy(xpath="//input[@id='RdoLstTimeUnit_0']")
	private WebElement timeunitDay;
	public void clickTimeUnitDay() {
		timeunitDay.click();
	}
	@FindBy(xpath="//input[@id='RdoLstTimeUnit_1']")
	private WebElement timeunithour;
	public void clickTimeUnitHour() {
		timeunithour.click();
	}
	@FindBy(xpath="//input[@id='RdoLstTimeUnit_2']")
	private WebElement timeunitminute;
	public void clickTimeUnitMinute() {
		timeunitminute.click();
	}
	@FindBy(xpath="//input[@id='RdoLstTimeUnitType_0']")
	private WebElement timeunittypeworking;
	public void clickTimeUnitTypeWorking() {
		timeunittypeworking.click();
	}
	
	@FindBy(xpath="//input[@id='RdoLstTimeUnitType_1']")
	private WebElement timeunittypecalendar;
	public void clickTimeUnitTypecalendar() {
		timeunittypecalendar.click();
	}
	@FindBy(xpath="//input[@id='TxtTimeOut']")
	private WebElement timeout;
	public void EnterTimeOut(String tmout) {
		timeout.sendKeys(tmout);
	}
	@FindBy(xpath="//input[@id='TxtValidityPeriod']")
	private WebElement validityPeriod;
	public void EnterValidityPeriod(String valperiod) {
		validityPeriod.sendKeys(valperiod);
	}
	@FindBy(xpath="//input[@id='chkClaimEndorsement']")
	private WebElement claimPendingEndorsement;
	public void clickClaimPendingEndorsement() {
		claimPendingEndorsement.click();
	}
	@FindBy(xpath="//input[@id='BtnSave']")
	private WebElement save;
	public void clickSave() {
		save.click();
	}
	
	
	

}
