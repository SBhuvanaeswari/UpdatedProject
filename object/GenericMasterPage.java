package Com.UIIC.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class GenericMasterPage 
{
	public static WebDriver driver;
	
	@FindBy(linkText = "City/District Master")
	private WebElement cityDistrictMaster; 
	public void clickCityDisMaster()
	{
		cityDistrictMaster.click();
	}
	@FindBy(linkText = "Add")
	private WebElement cityDistrictMasterAdd; 
	public void clickCityDisMasterAdd()
	{
		cityDistrictMasterAdd.click();
	}
	@FindBy(linkText = "Modify")
	private WebElement cityDistrictMasterModify; 
	public void clickCityDisMasterModify()
	{
		cityDistrictMasterModify.click();
	}
	@FindBy(linkText = "View")
	private WebElement cityDistrictMasterView; 
	public void clickCityDisMasterView()
	{
		cityDistrictMasterView.click();
	}
	@FindBy(linkText = "Co-Insurance Office Master")
	private WebElement coInsuranceoffice; 
	public void clickCoInsuranceOffmaster()
	{
		coInsuranceoffice.click();
	}
	@FindBy(linkText = "Add")
	private WebElement coInsuranceofficeAdd; 
	public void clickCoInsuranceOffmasterAdd()
	{
		coInsuranceofficeAdd.click();
	}
	@FindBy(linkText = "Modify")
	private WebElement coInsuranceofficeModify; 
	public void clickCoInsuranceOffmasterModify()
	{
		coInsuranceofficeModify.click();
	}
	@FindBy(linkText = "View")
	private WebElement coInsuranceofficeView; 
	public void clickCoInsuranceOffmasterView()
	{
		coInsuranceofficeView.click();
	}
	@FindBy(linkText = "Contractor Master")
	private WebElement contractorMast; 
	public void clickContractorMaster()
	{
		contractorMast.click();
	}
	@FindBy(linkText = "Add")
	private WebElement contractorMastAdd; 
	public void clickContractorMasterAdd()
	{
		contractorMastAdd.click();
	}
	@FindBy(linkText = "Modify")
	private WebElement contractorMastModify; 
	public void clickContractorMasterModify()
	{
		contractorMastModify.click();
	}
	@FindBy(linkText = "View")
	private WebElement contractorMastView; 
	public void clickContractorMasterView()
	{
		contractorMastView.click();
	}
	
	@FindBy(linkText = "Financier Branch Master")
	private WebElement financierBranMaster; 
	public void clickFinancierBranchMaster()
	{
		financierBranMaster.click();
	}
	@FindBy(linkText = "Add")
	private WebElement financierBranMasterAdd; 
	public void clickFinancierBranchMasterAdd()
	{
		financierBranMasterAdd.click();
	}
	@FindBy(linkText = "Modify")
	private WebElement financierBranMastermodify; 
	public void clickFinancierBranchMasterModify()
	{
		financierBranMastermodify.click();
	}
	@FindBy(linkText = "View")
	private WebElement financierBranMasterView; 
	public void clickFinancierBranchMasterView()
	{
		financierBranMasterView.click();
	}
	@FindBy(linkText = "Financier Master")
	private WebElement financierMaster; 
	public void clickFinancierMaster()
	{
		financierMaster.click();
	}
	@FindBy(linkText = "Add")
	private WebElement financierMasterAdd; 
	public void clickFinancierMasterAdd()
	{
		financierMasterAdd.click();
	}
	@FindBy(linkText = "Modify")
	private WebElement financierMasterModi; 
	public void clickFinancierMasterModify()
	{
		financierMasterModi.click();
	}
	@FindBy(linkText = "View")
	private WebElement financierMasterView; 
	public void clickFinancierMasterView()
	{
		financierMasterView.click();
	}
	
	@FindBy(linkText = "Landlord Master")
	private WebElement landlordMaster; 
	public void clickLandlordMaster()
	{
		landlordMaster.click();
	}
	@FindBy(linkText = "Add")
	private WebElement landlordMasterAdd; 
	public void clickLandlordMasterAdd()
	{
		landlordMasterAdd.click();
	}
	
	@FindBy(linkText = "Modify")
	private WebElement landlordMasterModify; 
	public void clickLandlordMasterModify()
	{
		landlordMasterModify.click();
	}
	
	@FindBy(linkText = "View")
	private WebElement landlordMasterView; 
	public void clickLandlordMasterView()
	{
		landlordMasterView.click();
	}
	
	@FindBy(linkText = "Office Location Master")
	private WebElement officeLocationMaster; 
	public void clickOfficeLocationMaster()
	{
		officeLocationMaster.click();
	}
	@FindBy(linkText = "Add")
	private WebElement officeLocationMasterAdd; 
	public void clickOfficeLocationMasterAdd()
	{
		officeLocationMasterAdd.click();
	}
	
	@FindBy(linkText = "Modify")
	private WebElement officeLocationMasterModify; 
	public void clickOfficeLocationMasterModify()
	{
		officeLocationMasterModify.click();
	}
	
	@FindBy(linkText = "View")
	private WebElement officeLocationMasterView; 
	public void clickOfficeLocationMasterView()
	{
		officeLocationMasterView.click();
	}

	@FindBy(linkText = "Office and Office in Charge Mapping")
	private WebElement officeandOfficeinChargeMapping; 
	public void clickOfficeandOfficeinChargeMapping()
	{
		officeandOfficeinChargeMapping.click();
	}
	@FindBy(linkText = "Add")
	private WebElement officeandOfficeinChargeMappingAdd; 
	public void clickOfficeandOfficeinChargeMappingAdd()
	{
		officeandOfficeinChargeMappingAdd.click();
	}
	
	@FindBy(linkText = "Modify")
	private WebElement officeandOfficeinChargeMappingModify; 
	public void clickOfficeandOfficeinChargeMappingModify()
	{
		officeandOfficeinChargeMappingModify.click();
	}
	
	@FindBy(linkText = "View")
	private WebElement officeandOfficeinChargeMappingView; 
	public void clickOfficeandOfficeinChargeMappingView()
	{
		officeandOfficeinChargeMappingView.click();
	}
	
	@FindBy(linkText="PinCode Master")
	private WebElement pincodeMaster;
	public void clickPinCodeMaster()
	{
		pincodeMaster.click();
	}
	@FindBy(linkText = "Add")
	private WebElement pincodeMasterAdd; 
	public void clickPinCodeMasterAdd()
	{
		pincodeMasterAdd.click();
	}
	@FindBy(linkText = "Modify")
	private WebElement pincodeMasterModify; 
	public void clickPinCodeMasterModify()
	{
		pincodeMasterModify.click();
	}
	@FindBy(linkText = "View")
	private WebElement pincodeMasterView; 
	public void clickPinCodeMasterView()
	{
		pincodeMasterView.click();
	}
	
	@FindBy(linkText="Risk Location Master")
	private WebElement riskLocationMaster;
	public void clickRiskLocationMaster()
	{
		riskLocationMaster.click();
	}
	@FindBy(linkText = "Add")
	private WebElement riskLocationMasterAdd; 
	public void clickriskLocationMasterAdd()
	{
		riskLocationMasterAdd.click();
	}
	@FindBy(linkText = "Modify")
	private WebElement riskLocationMasterModify; 
	public void clickRiskLocationMasterModify()
	{
		riskLocationMasterModify.click();
	}
	@FindBy(linkText = "View")
	private WebElement riskLocationMasterView; 
	public void clickRiskLocationMasterView()
	{
		riskLocationMasterView.click();
	}
	
	@FindBy(linkText="Role Master")
	private WebElement roleMaster;
	public void clickRoleMaster()
	{
		roleMaster.click();
	}
	@FindBy(linkText = "Add")
	private WebElement roleMasterAdd; 
	public void clickRoleMasterAdd()
	{
		roleMasterAdd.click();
	}
	@FindBy(linkText = "Modify")
	private WebElement roleMasterModify; 
	public void clickRoleMasterModify()
	{
		roleMasterModify.click();
	}
	@FindBy(linkText = "View")
	private WebElement roleMasterView; 
	public void clickRoleMasterView()
	{
		roleMasterView.click();
	}
	
	@FindBy(linkText="SEZ GST Master")
	private WebElement SEZMaster;
	public void clickSEZGSTMaster() {
		SEZMaster.click();
	}
	@FindBy(linkText = "Add")
	private WebElement SEZMasterAdd; 
	public void clickSEZGSTMasterAdd()
	{
		SEZMasterAdd.click();
	}
	
	@FindBy(linkText = "Modify")
	private WebElement SEZMasterModify; 
	public void clickSEZGSTMasterModify()
	{
		SEZMasterModify.click();
	}
	
	@FindBy(linkText = "View")
	private WebElement SEZMasterView; 
	public void clickSEZGSTMasterView()
	{
		SEZMasterView.click();
	}
	
	@FindBy(linkText="State Master")
	private WebElement stateMaster;
	public void clickStateMaster() {
		stateMaster.click();
	}
	@FindBy(linkText = "Add")
	private WebElement stateMasterAdd; 
	public void clickStateMasterAdd()
	{
		stateMasterAdd.click();
	}
	
	@FindBy(linkText = "Modify")
	private WebElement stateMasterModify; 
	public void clickStateMasterModify()
	{
		stateMasterModify.click();
	}
	
	@FindBy(linkText = "View")
	private WebElement stateMasterView; 
	public void clickStateMasterView()
	{
		stateMasterView.click();
	}
	
	@FindBy(linkText="Specified Person Details")
	private WebElement specifiedPersonDetails;
	public void clickSpecifiedPersonDetails() {
		specifiedPersonDetails.click();
	}
	
	@FindBy(linkText="Add")
	private WebElement specifiedPersonDetailsAdd;
	public void clickSpecifiedPersonDetailsAdd() {
		specifiedPersonDetailsAdd.click();
	}
	
	@FindBy(linkText="Modify")
	private WebElement specifiedPersonDetailsModify;
	public void clickSpecifiedPersonDetailsModify() {
		specifiedPersonDetailsModify.click();
	}
	@FindBy(linkText="View")
	private WebElement specifiedPersonDetailsView;
	public void clickSpecifiedPersonDetailsView() {
		specifiedPersonDetailsView.click();
	}
	@FindBy(linkText = "Tenant Master")
	private WebElement tenantMaster; 
	public void clickTenantMaster()
	{
		tenantMaster.click();
	}
	@FindBy(linkText = "Add")
	private WebElement tenantMasterAdd; 
	public void clickTenantMasterAdd()
	{
		tenantMasterAdd.click();
	}
	
	@FindBy(linkText = "Modify")
	private WebElement tenantMasterModify; 
	public void clickTenantMasterModify()
	{
		tenantMasterModify.click();
	}
	
	@FindBy(linkText = "View")
	private WebElement tenantMasterView; 
	public void clickTenantMasterView()
	{
		tenantMasterView.click();
	}
	
	@FindBy(linkText="User Id Configuration for Tie-Ups")
	private WebElement useridconfigurationfortieups;
	public void clickUserIdConfiguration() {
		useridconfigurationfortieups.click();
	}
	
	@FindBy(linkText="Add")
	private WebElement useridConfigurationAdd;
	public void clickUseridConfigurationAdd() {
		useridConfigurationAdd.click();
	}
	
	@FindBy(linkText="Modify")
	private WebElement useridConfigurationModify;
	public void clickUseridConfigurationModify(){
		useridConfigurationModify.click();
	}
	
	@FindBy(linkText="View")
	private WebElement useridConfigurationView;
	public void clickUseridConfigurationView(){
		useridConfigurationView.click();
	}
	
	@FindBy(linkText = "Vendor Master")
	private WebElement vendorMaster; 
	public void clickVendorMaster()
	{
		vendorMaster.click();
	}
	@FindBy(linkText = "Add")
	private WebElement vendorMasterAdd; 
	public void clickVendorMasterAdd()
	{
		vendorMasterAdd.click();
	}
	
	@FindBy(linkText = "Modify")
	private WebElement vendorMasterModify; 
	public void clickVendorMasterModify()
	{
		vendorMasterModify.click();
	}
	
	@FindBy(linkText = "View")
	private WebElement vendorMasterView; 
	public void clickVendorMasterView()
	{
		vendorMasterView.click();
	}
	
	
  public GenericMasterPage(WebDriver driver)
  {
	  PageFactory.initElements(driver,this);
  }
  
  @FindBy(linkText="Create Channel")
  private WebElement createchannel;
  public void clickcreatechannel() {
	  createchannel.click();
  }
  
  @FindBy(linkText="Edit Channel")
  private WebElement editchannel;
  public void clickeditchannel() {
	  editchannel.click();
  }
  
  @FindBy(linkText="View Channel")
  private WebElement viewchannel;
  public void clickviewchannel() {
	  viewchannel.click();
  }
}
