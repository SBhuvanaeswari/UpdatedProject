package Com.UIIC.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResetPasswordPortalPage {
	
	@FindBy(xpath = "//iframe[@id='MyFrame']")
	public WebElement iframe;
	

	public ResetPasswordPortalPage(WebDriver driver)
	  {
		  PageFactory.initElements(driver,this);
	  }
	@FindBy(xpath= "//input[@id='txtUserId']")
	private WebElement txtuserid;
	public void EnterUserID(String userid) {
		txtuserid.sendKeys(userid);
	}
	
	
	
	@FindBy(xpath= "//input[@id='txtPassword']")
	private WebElement txtPassword;
	public void EnterPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	//@FindBy(xpath="//input[@name='btnResetPassword']")
	
	@FindBy(xpath="//input[@name='btnResetPassword']")
	private WebElement resetPassword;
	public void clickResetPassword() {
		resetPassword.click();
	}
	
	
}
