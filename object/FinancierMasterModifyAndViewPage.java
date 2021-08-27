package Com.UIIC.object;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinancierMasterModifyAndViewPage 
{
	@FindBy(xpath="//input[@id='txtFinancierCode']")
	private WebElement financier;
	public void openLOVFinancier()
	{
		financier.sendKeys(Keys.ARROW_UP);
	}
	@FindBy(xpath="//input[@id='TxtCode']")
	private WebElement finaCode;
	public void enterLOVFinancierCode(String code)
	{
	   finaCode.sendKeys(code);
	}
	@FindBy(xpath="//input[@id='TxtName']")
	private WebElement finaName;
	public void enterLOVFinancierName(String name)
	{
	   finaName.sendKeys(name);
	}
	@FindBy(xpath="//input[@id='BtnFind']")
	private WebElement finaSearch;
	public void clickLOVFinancierSearchBtn()
	{
	   finaSearch.click();
	}
	@FindBy(xpath="//input[@id='cmd_close']")
	private WebElement finaClose;
	public void clickLOVFinancierCliseBtn()
	{
	   finaClose.click();
	}
	@FindBy(xpath="(//a[text()='Select'])[1]")
	private WebElement link;
	public void clickLOVFinancierSelectLink()
	{
	   link.click();
	}
	@FindBy(xpath="//input[@id='TxtFinancierShrtName']")
	private WebElement financierShrt;
	public void enterFinancierShrtName(String name)
	{
		financierShrt.sendKeys(name);
	}
	@FindBy(xpath="//input[@id='btnSubmit']")
	private WebElement search;
	public void clickSearchBtn()
	{
		search.click();
	}
	@FindBy(xpath="//input[@id='btnClear']")
	private WebElement clear;
	public void clickClearBtn()
	{
	   clear.click();
	}
	@FindBy(xpath="//input[@id='btnClose']")
	private WebElement close;
	public void clickCloseBtn()
	{
	   close.click();
	}
	@FindBy(xpath="(//a[text()='Edit'])[1]")
	private WebElement edit;
	public void clickEditLink()
	{
	  edit.click();
	}
	@FindBy(xpath="(//a[text()='View'])[1]")
	private WebElement view;
	public void clickViewLink()
	{
	  view.click();
	}
	public FinancierMasterModifyAndViewPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
