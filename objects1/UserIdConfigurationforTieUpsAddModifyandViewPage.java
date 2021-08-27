package Com.UIIC.objects1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserIdConfigurationforTieUpsAddModifyandViewPage {

	@FindBy(xpath = "//iframe[@id='MyFrame']")
	public WebElement iframe;
	
	public UserIdConfigurationforTieUpsAddModifyandViewPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='TxtOfficeInCharge']")
	private WebElement OEMuserID;
	public void enterOEMUserID(String userid) {
		OEMuserID.sendKeys(userid);
	}
	
	@FindBy(xpath="//input[@id='CmdSubmit']")
	private WebElement savebutton;
	public void clickSave() {
		savebutton.click();
	}
	
	@FindBy(xpath="//input[@id='txtOEMUserName']")
	private WebElement modifyOEMusername;
	public void EnterModifyOEMUserName(String Modifyuserid) {
		modifyOEMusername.sendKeys(Modifyuserid);
	}
	
	
	@FindBy(xpath="//input[@name='btnSearch']")
	private WebElement modifybtnSearch;
	public void clickModifySearch() {
		modifybtnSearch.click();
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
