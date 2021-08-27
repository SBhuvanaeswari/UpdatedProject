package Com.UIIC.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorMasterViewPage {

	

	@FindBy(xpath = "//input[@id='TxtVendorName']")
	private WebElement ViewVenName;

	public void VenName(String VenName) {
		ViewVenName.sendKeys(VenName);
	}

	@FindBy(xpath = "//input[@id='TxtVendorCode']")
	private WebElement ViewVenCode;

	public void Vencode(String Vencode) {
		ViewVenCode.sendKeys(Vencode);
	}

	@FindBy(xpath = "//input[@id='LOVOffice']")
	private WebElement ViewOffcode;

	public void Venoffcode(String Venoffcode) {
		ViewOffcode.sendKeys(Venoffcode);
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

	@FindBy(xpath = "//input[@id='btnSearch']")
	private WebElement ViewSearch;

	public void Viewsrch() {
		ViewSearch.click();
	}

	@FindBy(xpath = "//a[text()='View']")
	private WebElement ViewEdit;

	public void View() {
		ViewEdit.click();

	}

	@FindBy(xpath = "//div[@id='e0_7120i']")
	private WebElement GenericMaster;

	public void GenericMaster() {
		GenericMaster.click();
	}

	@FindBy(xpath = "//iframe[@id='MyFrame']")
	public WebElement iframe;

	@FindBy(xpath = "//input[@id='CmdSubmit']")
	private WebElement ViewSave;

	public void save() {
		ViewSave.click();
	}

	@FindBy(xpath = "//input[@id='CmdClose']")
	private WebElement ViewClose;

	public void close() {
		ViewClose.click();
	}

	

	public VendorMasterViewPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
