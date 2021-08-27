package Com.UIIC.object;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TenantMasterViewPage {

	

	@FindBy(xpath = "//iframe[@id='MyFrame']")
	public WebElement iframe;

	@FindBy(xpath = "//input[@id='TxtVendorName']")
	private WebElement ViewTenantName;

	public void ViewTVName(String Tentname) {
		ViewTenantName.sendKeys(Tentname);
	}

	@FindBy(xpath = "//input[@id='TxtVendorCode']")
	private WebElement ViewTentCode;

	public void ViewTXVecode(String txcode) {
		ViewTentCode.sendKeys(txcode);
	}

	@FindBy(xpath = "//input[@id='LOVOffice']")
	private WebElement ViewOffcode;

	public void officecode() {
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

	public void search() {
		LovSearch.click();
	}

	@FindBy(xpath = "(//a[text()='Select'])[1]")
	private WebElement LovSelect;

	public void select() {
		LovSelect.click();
	}

	@FindBy(xpath = "//input[@id='CmdSearch']")
	private WebElement ViewSrch;

	public void ViewSearch() {
		ViewSrch.click();

	}

	@FindBy(xpath = "//a[text()='View']")
	private WebElement Editbtn;

	public void ViewEdit() {
		Editbtn.click();
	}

	@FindBy(xpath = "//input[@id='CmdClose']")
	private WebElement viewclosebtn;

	public void ViewClose() {
		viewclosebtn.click();
	}

	public TenantMasterViewPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
