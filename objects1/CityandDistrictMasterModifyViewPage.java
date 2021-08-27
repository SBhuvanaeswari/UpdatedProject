package Com.UIIC.objects1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CityandDistrictMasterModifyViewPage {
	
	

	
	@FindBy(xpath="//input[@id='TxtCity']")
	private WebElement txtcitydistrictname;
	public void cityanddistrictname(String citydistrictname) {
		txtcitydistrictname.sendKeys(citydistrictname);
	}
	
	@FindBy(xpath="//input[@id='TxtState']")
	private WebElement statecode;
	public void clickstatecode() {
		statecode.sendKeys(Keys.ARROW_UP);
	}
	
	@FindBy(xpath="//input[@name='TxtCode']")
	private WebElement lovtxtstatecode;
	public void lovstatecode(String statecode) {
		lovtxtstatecode.sendKeys(statecode);
	}
	
	
	@FindBy(xpath="//input[@name='TxtName']")
	private WebElement lovtxtstatename;
	public void lovstatename(String statename) {
		lovtxtstatename.sendKeys(statename);
	}
	
	
	@FindBy(xpath="//input[@id='BtnFind']")
	private WebElement lovbtnsearch;
	public void btnsearch() {
		lovbtnsearch.click();
	}
	
	@FindBy(xpath = "(//a[text()='Select'])[1]")
	private WebElement lovSelectlink;
	public void Selectlink() {
		lovSelectlink.click();
	}
	
	@FindBy(xpath="//input[@id='txtCityCode']")
	private WebElement txtcityanddistrictcode;
	public void CityandDistrictcode(String citycode) {
		txtcityanddistrictcode.sendKeys(citycode);
	}
	
	
	
	
	@FindBy(xpath="//select[@id='DrpCity']")
	private WebElement dropdowncitydistrictflag;
	public void citydistrictflag(){
		dropdowncitydistrictflag.click();
	}
	
	public Select dropdwncitydistrictflag() {
		return new Select(dropdowncitydistrictflag);
	}
	
	
	
	@FindBy(xpath="//select[@id='drpEQZOne']")
	private WebElement dropdownEQZOne;
	public void EQZOne(){
		dropdownEQZOne.click();
	}
	
	public Select dropdwnEQZOne() {
		return new Select(dropdownEQZOne);
	}
	
	
	@FindBy(xpath="//select[@id='drpRSMDZone']")
	private WebElement dropdowndrpRSMDZone;
	public void RSMDZone(){
		dropdowndrpRSMDZone.click();
	}
	
	public Select dropdwnRSMDZone() {
		return new Select(dropdowndrpRSMDZone);
	}
	
	@FindBy(xpath="//select[@id='drpSTFIZone']")
	private WebElement dropdowndrpSTFIZone;
	public void STFIZone(){
		dropdowndrpSTFIZone.click();
	}
	
	public Select dropdwnSTFIZone() {
		return new Select(dropdowndrpSTFIZone);
	}
	
	@FindBy(xpath="//input[@id='TxtEndDate']")
	private WebElement TxtEndDate;
	public void EndDate(String enddate){
		TxtEndDate.sendKeys(enddate);
	}
	
	
	@FindBy(xpath="//input[@id='CmdSubmit']")
	private WebElement btnsave;
	public void save(){
		btnsave.click();
	}
	
	@FindBy(xpath = "//iframe[@id='MyFrame']")
	public WebElement iframe;
	
	
	
	public CityandDistrictMasterModifyViewPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='CmdSubmit']")
	private WebElement btnmodifysave;
	public void modifysave() {
		btnmodifysave.click();
	}
	
	@FindBy(xpath="//input[@id='CmdSearch']")
	private WebElement modifysearchbutton;
	public void ModifySearch() {
		modifysearchbutton.click();
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
