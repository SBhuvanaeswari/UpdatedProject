package Com.UIIC.RIObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RIReinsuranceBANCSPage 
{
	@FindBy(xpath="(//a[@role='presentation'])[1]")
	private WebElement busEnv;
	public void clickBusinessEnvironmentSetUP()
	{
		busEnv.click();
	}
	@FindBy(xpath="(//a[@role='presentation'])[2]")
	private WebElement pr;
	public void clickProductGroupingAndRules()
	{
		pr.click();
	}
	@FindBy(xpath="(//a[@role='presentation'])[3]")
	private WebElement RIarr;
	public void clickReinsuranceArrangeMent()
	{
		RIarr.click();
	}
	@FindBy(xpath="(//a[@role='presentation'])[4]")
	private WebElement RIUW;
	public void clickReinsuranceUnderWritting()
	{
		RIUW.click();
	}
	@FindBy(xpath="(//a[@role='presentation'])[5]")
	private WebElement INRI;
	public void clickInwardReinsurance()
	{
		INRI.click();
	}
	@FindBy(xpath="(//a[@role='presentation'])[6]")
	private WebElement RIClaim;
	public void clickReinsuranceClaims()
	{
		RIClaim.click();
	}
	@FindBy(xpath="(//a[@role='presentation'])[7]")
	private WebElement AccRI;
	public void clickReinsuranceAccounting()
	{
		AccRI.click();
	}
	@FindBy(xpath="(//a[@role='presentation'])[8]")
	private WebElement Reports;
	public void clickReinsuranceReports()
	{
		Reports.click();
	}
	@FindBy(xpath="(//a[@role='presentation'])[9]")
	private WebElement SOA;
	public void clickSOAReports()
	{
		SOA.click();
	}
  public RIReinsuranceBANCSPage(WebDriver driver)
  {
	  PageFactory.initElements(driver,this);
  }
	

}
