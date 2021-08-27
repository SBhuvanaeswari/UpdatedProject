package Com.UIIC.objects1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpecifiedPersonModifyandViewPage {
	@FindBy(xpath = "//iframe[@id='MyFrame']")
	public WebElement iframe;

	public SpecifiedPersonModifyandViewPage(WebDriver driver) {
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
	@FindBy(xpath="//input[@id='CmdSearch']")
	private WebElement btnsearch;
	public void ClickSearch() {
		btnsearch.click();
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
