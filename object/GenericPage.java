

package Com.UIIC.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GenericPage 
{
	@FindBy(xpath = "//span[text()='☰Modules']")
	private WebElement hambergerIconModule;
	
	@FindBy(xpath = "//div[@id='e0_0i']")
	private WebElement UWModule;
	
	@FindBy(xpath = "//div[@id='e0_4687i']")
	private WebElement OfflineExcelModule;
	
	@FindBy(xpath = "//div[@id='e0_4690i']")
	private WebElement AccountsModule;
	
	@FindBy(xpath = "//div[@id='e0_4707i']")
	private WebElement SystemAdminModule;
	
	@FindBy(linkText = "Channel Setup")
	private WebElement ChannelSetupModule;
	
	
	@FindBy(xpath = "//div[@id='e0_4713i']")
	private WebElement BulkPrintingModule;
	
	@FindBy(xpath = "//div[@id='e0_4715i']")
	private WebElement GenericMasterModule;
	
	@FindBy(xpath = "//div[@id='e0_4750i']")
	private WebElement BatchProcceingModule;
	
	@FindBy(xpath = "//div[@id='e0_4755i']")
	private WebElement EclipseBIModule;
	
	@FindBy(xpath = "//div[@id='e0_4756i']")
	private WebElement RenewalAdminModule;
	
	@FindBy(xpath = "//div[@id='e0_4767i']")
	private WebElement ServiceReqModule;
	
	@FindBy(xpath = "//div[@id='e0_4769i']")
	private WebElement URLlinkModule;
	
	@FindBy(linkText="User Configuration")
	private WebElement userConfiguration;
	public void clickUserConfiguration() {
		userConfiguration.click();
	}
	@FindBy(linkText="Reinsurance")
	private WebElement RI;
	public void clickReinsurance() 
	{
		RI.click();
	}
	@FindBy(linkText="Reinsurance Home Page")
	private WebElement RIH;
	public void clickReinsuranceHomePage() 
	{
		RIH.click();
	}
	
	@FindBy(linkText="Generic Master")
	private WebElement genericMaster;
	
	public GenericPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickGenericMaster1()
	{
		genericMaster.click();
		
	}
	public void clickHamberg()
	{
		hambergerIconModule.click();
	}
	public void clickUW()
	{
		UWModule.click();
	}
	public void clickOffile()
	{
		OfflineExcelModule.click();
	}
	public void clickAccount()
	{
		AccountsModule.click();
	}
	public void clickSystemAdmin()
	{
		SystemAdminModule.click();
	}
	public void clickChanelSetup()
	{
	 ChannelSetupModule.click();
	}
	public void clickBUlkPrinting()
	{
		BulkPrintingModule.click();
	}
	public void clickGenericMaster()
	{
		GenericMasterModule.click();
	}
	public void clikBatchProcess()
	{
		BatchProcceingModule.click();
	}
	public void clickEclipseBI()
	{
		EclipseBIModule.click();
	}
	public void clickRenewalAdmin()
	{
		RenewalAdminModule.click();
	}
	public void clickServiceReq()
	{
		ServiceReqModule.click();
	}
	public void clickURlLink()
	{
		URLlinkModule.click();
	}
		

}
