package Com.UIIC.objects1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RoleMasterModifyandViewPage {
	@FindBy(xpath = "//iframe[@id='MyFrame']")
	public WebElement iframe;

	public RoleMasterModifyandViewPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='TxtRoleName']")
	private WebElement roleName;
	public void EnterRoleName(String rolename) {
		roleName.sendKeys(rolename);
	}
	
	@FindBy(xpath="//input[@id='TxtParentRole']")
	private WebElement parentRole;
	public void enterPartentRole(String parcode) {
		parentRole.sendKeys(parcode);
	}
	
	@FindBy(xpath="//select[@id='DrpRoleType']")
	private WebElement roleType;
	public void RoleType(){
		roleType.click();
	}
	
	public Select selectRoleType() {
		return new Select(roleType);
	}
	
	@FindBy(xpath="//input[@name='BtnSearch']")
	private WebElement ModifySearch;
	public void clickModifySearch(){
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
