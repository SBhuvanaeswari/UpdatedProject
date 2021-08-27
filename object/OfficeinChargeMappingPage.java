package Com.UIIC.object;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OfficeinChargeMappingPage {

	
	@FindBy(xpath = "//iframe[@id='MyFrame']")
	public WebElement iframe;

	@FindBy(xpath = "//input[@id='TxtOfficeInCharge']")
	private WebElement officeincharge;

	public void offinchrg() {
		officeincharge.sendKeys(Keys.ARROW_UP);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl2_txtVal']")
	private WebElement Offcode;

	public void LovOffcode(String ofcode) {
		Offcode.sendKeys(ofcode);
	}

	@FindBy(xpath = "//input[@id='dgQuery__ctl3_txtVal']")
	private WebElement Offname;

	public void LovOffname(String ofname) {
		Offname.sendKeys(ofname);
	}

	@FindBy(xpath = "//input[@id='BtnAllMatches']")
	private WebElement btnsubmit;

	public void patsubmit() {
		btnsubmit.click();
	}

	@FindBy(xpath = "(//a[text()='Select'])[1]")
	private WebElement seleclink;

	public void selectlink() {
		seleclink.click();
	}

	@FindBy(xpath = "//input[@id='TxtBusinessLocation']")
	private WebElement buslocation;

	public void BusLoc() {
		buslocation.sendKeys(Keys.ARROW_UP);
	}

	@FindBy(xpath = "//input[@id='CmdSubmit']")
	private WebElement Submitbtn;

	public void Submit() {
		Submitbtn.click();
	}

	@FindBy(xpath = "//a[text()='Edit']")
	private WebElement Editlinks;

	public void EditClick() {
		Editlinks.click();
	}

	@FindBy(xpath = "//a[text()='View']")
	private WebElement Viewlinks;

	public void ViewClick() {
		Viewlinks.click();
	}

	public OfficeinChargeMappingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
