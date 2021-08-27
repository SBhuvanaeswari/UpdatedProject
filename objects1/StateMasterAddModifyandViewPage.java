package Com.UIIC.objects1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class StateMasterAddModifyandViewPage {
	
	
	@FindBy(xpath = "//iframe[@id='MyFrame']")
	public WebElement iframe;
	
	@FindBy(xpath="//input[@id='TxtState']")
	private WebElement stateName;
	public void enterStateName(String statename) {
		stateName.sendKeys(statename);
	}
	@FindBy(xpath = "//select[@id='drpRegion']")
	private WebElement Region;

	public void clickRegion() {
		Region.click();
	}

	public Select selectRegion() {
		return new Select(Region);
	}
	@FindBy(xpath="//input[@id='TxtEndDate']")
	private WebElement enddate;
	public void enterEndDate(String enddt) {
		enddate.sendKeys(enddt);
	}
	
	@FindBy(xpath="//input[@id='CmdSubmit']")
	private WebElement submit;
	public void clicksave() {
		submit.click();
	}
	public StateMasterAddModifyandViewPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='txtState']")
	private WebElement Statename;
	public void enterModifyStateName(String stname) {
		Statename.sendKeys(stname);
	}
	
	
	
	@FindBy(xpath="//input[@id='txtStateCode']")
	private WebElement Statecode;
	public void enterModifyStateCode(String stcode) {
		Statecode.sendKeys(stcode);
	}
	
	@FindBy(xpath="//input[@id='CmdSearch']")
	private WebElement ModifySearch;
	public void clickModifysearch() {
		ModifySearch.click();
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
