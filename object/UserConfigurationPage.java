package Com.UIIC.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserConfigurationPage {
	
	public UserConfigurationPage(WebDriver driver)
	  {
		  PageFactory.initElements(driver,this);
	  }
	@FindBy(linkText="a.Reset Password For Portal User")
	private WebElement resetPasswordPortal;
	public void clickResetPasswordPortal() {
		resetPasswordPortal.click();
	}
	
	@FindBy(linkText="View Master Configuration")
	private WebElement ViewMasterConfig;
	public void clickViewMasterConfigurator() {
		ViewMasterConfig.click();
	}
}
