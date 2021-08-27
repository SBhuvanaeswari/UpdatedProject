package Com.UIIC.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GenericOfficeLocationMasterViewPage {

	
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
	
	@FindBy(xpath = "//input[@id='CmdSearch']")
	private WebElement btnsearch;

	public void Search() {
		btnsearch.click();
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
	public GenericOfficeLocationMasterViewPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}

