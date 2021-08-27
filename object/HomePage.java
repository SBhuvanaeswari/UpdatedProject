package Com.UIIC.object;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class HomePage
{
	public static WebDriver driver;
	@FindBy(xpath = "//input[@name='txtUserId']")
	private WebElement userTxt;
	
	@FindBy(xpath = "//select[@id='ddlRole']")
	private WebElement userRole;
	
	@FindBy(xpath = "//input[@name='txtPwd']")
	private WebElement pwdtxt;
	
	@FindBy(xpath = "//input[@name='btnLogin']")
	private WebElement loginLink;
	
	
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement popUP;
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void enterUser(String un)
	{
		userTxt.sendKeys(un);
	}
	public Select selectRole1()
	{
		return new Select(userRole);
	}
	public void selectRole()
	{
		userRole.click();
	}
	

	public void enterPass(String pw)
	{
		
		pwdtxt.sendKeys(pw);
	}
	public void clickLogin()
	{
		loginLink.click();
	}
	public void clickPop()
	{
		popUP.click();
	}
		 
		
	}


