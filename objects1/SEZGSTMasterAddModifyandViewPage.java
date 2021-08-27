package Com.UIIC.objects1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SEZGSTMasterAddModifyandViewPage {
	
	@FindBy(xpath="//input[@id='TXTGSTin']")
	private WebElement GSTin;
	public void enterGSTIN(String gstnum) {
		GSTin.sendKeys(gstnum);
	}

	@FindBy(xpath="//input[@id='CmdSubmit']")
	private WebElement Addsave;
	public void clicksave() {
		Addsave.click();
	}
	
	@FindBy(xpath="//input[@id='txtSEZGST']")
	private WebElement ModifyGSTIN;
	public void enterModifyGSTIN(String gstin) {
		ModifyGSTIN.sendKeys(gstin);
	}
	
	@FindBy(xpath="//input[@id='btnSearch']")
	private WebElement modifysearch;
	public void clicksearch() {
		modifysearch.click();
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
	
	
	public SEZGSTMasterAddModifyandViewPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//iframe[@id='MyFrame']")
	public WebElement iframe;
	
}
