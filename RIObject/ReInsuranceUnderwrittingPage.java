package Com.UIIC.RIObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReInsuranceUnderwrittingPage
{
	@FindBy(xpath="//span[text()='Proposal Override']")
	private WebElement Prover;
	public void clickProposalOverriding()
	{
		Prover.click();
	}
	@FindBy(xpath="//span[text()='Alter Cession']")
	private WebElement cession;
	public void clickAlterCession()
	{
		cession.click();
	}
	@FindBy(xpath="//span[text()='Pending CP']")
	private WebElement cpPen;
	public void clickPendingCP()
	{
		cpPen.click();
	}
	@FindBy(xpath="//span[text()='CP Approval']")
	private WebElement cpApp;
	public void clickCpApproval()
	{
		cpApp.click();
	}
	@FindBy(xpath="//span[text()='Marine Open Policy / Cover']")
	private WebElement marin;
	public void clickMarinOpenPolicyCover()
	{
		marin.click();
	}
   public ReInsuranceUnderwrittingPage(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }
}
