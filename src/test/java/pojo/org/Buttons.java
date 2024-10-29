package pojo.org;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Util.org.BaseClass;
import groovy.transform.Final;

public class Buttons extends BaseClass  {
	
	public Buttons() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Dashboard']")
	private WebElement DashboardMenu;
	
	@FindBy(xpath =" (//span[text()='Invoice Management'])[1]")
	private WebElement InvoiceManagementMainMenu;
	
	@FindBy(xpath = "//a[text()='Manage Invoice']")
	private WebElement ManageInvoiceMenu;
	
	@FindBy(xpath ="//a[text()='Create Invoice']" )
	private WebElement CreateInvoiceMenu;
	
	@FindBy(xpath = "//span[text()='Vendor']")
	private WebElement VendorMainMenu;
	
	@FindBy(xpath = "//a[text()='Vendor Management']")
	private WebElement VendorManagementScreen;
	
	@FindBy(xpath = "(//a[text()='My Actionable'])[2]")
	private WebElement Dashboard_Invoice_MyActionable;
	
	@FindBy(xpath = "(//a[text()='My Actionable'])[1]")
	private WebElement Dashboard_Vendor_MyActionable;
	
	@FindBy(xpath = "(//a[text()='Other Actionable'])[2]")
    private WebElement Dashboard_Invoice_OtherActionable;
	
	@FindBy(xpath = "(//a[text()='Other Actionable'])[1]")
	private WebElement Dashboard_Vendor_OtherActionable;
	
	@FindBy(xpath = "//button[@id='create_service_invoice_btn']")
	private WebElement CreateServiceInvoiceButton_CrtInv;
	
	@FindBy(xpath = "//button[@id='edit_btn']")
	private WebElement CreateInvoiceButton_CrtInv;
	
	@FindBy(xpath = "//button[@id='export']")
	private WebElement ExportButton_CrtInv;
	
	
	//Enter Required PO number on this location
	@FindBy(xpath = "//div[text()='3000288077']")
	private WebElement SelectPO_CreateInvoiceScreen;
	
	@FindBy(xpath = "//a[@id='btn-save']")
	private WebElement NeedInfoButton;
	
	@FindBy(xpath = "//a[@id='btn-save-inv']")
	private WebElement SaveButton;
	
	@FindBy(xpath = "//a[@id='btn-save-submit']")
	private WebElement SubmitButton;
	
	@FindBy(xpath = "//a[@id='btn-approved']")
	private WebElement ApproveButton;
	
	@FindBy(xpath = "//a[@id='btn-void']")
	private WebElement VoidButton;
	
	@FindBy(xpath = "//a[@id='btn-exit']")
	private WebElement ExitButton;
	
	@FindBy(xpath = "//span[text()='Attachment']")
	private WebElement AttachmentTab;
	
	
	
	
	
	@FindBy(xpath ="(//input[@type='text'])[8]")
	private WebElement InvoiceNumber;

	@FindBy(xpath = "(//input[@type='text'])[p]")
	private WebElement InvoiceDateField;
	
	@FindBy(xpath = "//select[@id='daddressvndr']")
	private WebElement AddressDropdown;
	
	
	
	
	
	
	
	
	
	
	
	
	
	public WebElement getInvoiceNumber() {
		return InvoiceNumber;
	}

	public void setInvoiceNumber(WebElement invoiceNumber) {
		InvoiceNumber = invoiceNumber;
	}

	public WebElement getInvoiceDateField() {
		return InvoiceDateField;
	}

	public void setInvoiceDateField(WebElement invoiceDateField) {
		InvoiceDateField = invoiceDateField;
	}

	public WebElement getAddressDropdown() {
		return AddressDropdown;
	}

	public void setAddressDropdown(WebElement addressDropdown) {
		AddressDropdown = addressDropdown;
	}

	public WebElement getDashboardMenu() {
		return DashboardMenu;
	}

	public void setDashboardMenu(WebElement dashboardMenu) {
		DashboardMenu = dashboardMenu;
	}

	public WebElement getInvoiceManagementMainMenu() {
		return InvoiceManagementMainMenu;
	}

	public void setInvoiceManagementMainMenu(WebElement invoiceManagementMainMenu) {
		InvoiceManagementMainMenu = invoiceManagementMainMenu;
	}

	public WebElement getManageInvoiceMenu() {
		return ManageInvoiceMenu;
	}

	public void setManageInvoiceMenu(WebElement manageInvoiceMenu) {
		ManageInvoiceMenu = manageInvoiceMenu;
	}

	public WebElement getCreateInvoiceMenu() {
		return CreateInvoiceMenu;
	}

	public void setCreateInvoiceMenu(WebElement createInvoiceMenu) {
		CreateInvoiceMenu = createInvoiceMenu;
	}

	public WebElement getVendorMainMenu() {
		return VendorMainMenu;
	}

	public void setVendorMainMenu(WebElement vendorMainMenu) {
		VendorMainMenu = vendorMainMenu;
	}

	public WebElement getVendorManagementScreen() {
		return VendorManagementScreen;
	}

	public void setVendorManagementScreen(WebElement vendorManagementScreen) {
		VendorManagementScreen = vendorManagementScreen;
	}

	public WebElement getDashboard_Invoice_MyActionable() {
		return Dashboard_Invoice_MyActionable;
	}

	public void setDashboard_Invoice_MyActionable(WebElement dashboard_Invoice_MyActionable) {
		Dashboard_Invoice_MyActionable = dashboard_Invoice_MyActionable;
	}

	public WebElement getDashboard_Vendor_MyActionable() {
		return Dashboard_Vendor_MyActionable;
	}

	public void setDashboard_Vendor_MyActionable(WebElement dashboard_Vendor_MyActionable) {
		Dashboard_Vendor_MyActionable = dashboard_Vendor_MyActionable;
	}

	public WebElement getDashboard_Invoice_OtherActionable() {
		return Dashboard_Invoice_OtherActionable;
	}

	public void setDashboard_Invoice_OtherActionable(WebElement dashboard_Invoice_OtherActionable) {
		Dashboard_Invoice_OtherActionable = dashboard_Invoice_OtherActionable;
	}

	public WebElement getDashboard_Vendor_OtherActionable() {
		return Dashboard_Vendor_OtherActionable;
	}

	public void setDashboard_Vendor_OtherActionable(WebElement dashboard_Vendor_OtherActionable) {
		Dashboard_Vendor_OtherActionable = dashboard_Vendor_OtherActionable;
	}

	public WebElement getCreateServiceInvoiceButton_CrtInv() {
		return CreateServiceInvoiceButton_CrtInv;
	}

	public void setCreateServiceInvoiceButton_CrtInv(WebElement createServiceInvoiceButton_CrtInv) {
		CreateServiceInvoiceButton_CrtInv = createServiceInvoiceButton_CrtInv;
	}

	public WebElement getCreateInvoiceButton_CrtInv() {
		return CreateInvoiceButton_CrtInv;
	}

	public void setCreateInvoiceButton_CrtInv(WebElement createInvoiceButton_CrtInv) {
		CreateInvoiceButton_CrtInv = createInvoiceButton_CrtInv;
	}

	public WebElement getExportButton_CrtInv() {
		return ExportButton_CrtInv;
	}

	public void setExportButton_CrtInv(WebElement exportButton_CrtInv) {
		ExportButton_CrtInv = exportButton_CrtInv;
	}

	public WebElement getSelectPO_CreateInvoiceScreen() {
		return SelectPO_CreateInvoiceScreen;
	}

	public void setSelectPO_CreateInvoiceScreen(WebElement selectPO_CreateInvoiceScreen) {
		SelectPO_CreateInvoiceScreen = selectPO_CreateInvoiceScreen;
	}

	public WebElement getNeedInfoButton() {
		return NeedInfoButton;
	}

	public void setNeedInfoButton(WebElement needInfoButton) {
		NeedInfoButton = needInfoButton;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}

	public void setSaveButton(WebElement saveButton) {
		SaveButton = saveButton;
	}

	public WebElement getSubmitButton() {
		return SubmitButton;
	}

	public void setSubmitButton(WebElement submitButton) {
		SubmitButton = submitButton;
	}

	public WebElement getApproveButton() {
		return ApproveButton;
	}

	public void setApproveButton(WebElement approveButton) {
		ApproveButton = approveButton;
	}

	public WebElement getVoidButton() {
		return VoidButton;
	}

	public void setVoidButton(WebElement voidButton) {
		VoidButton = voidButton;
	}

	public WebElement getExitButton() {
		return ExitButton;
	}

	public void setExitButton(WebElement exitButton) {
		ExitButton = exitButton;
	}

	public WebElement getAttachmentTab() {
		return AttachmentTab;
	}

	public void setAttachmentTab(WebElement attachmentTab) {
		AttachmentTab = attachmentTab;
	}

	public WebElement getAttachement_FileUploadButton() {
		return Attachement_FileUploadButton;
	}

	public void setAttachement_FileUploadButton(WebElement attachement_FileUploadButton) {
		Attachement_FileUploadButton = attachement_FileUploadButton;
	}

	// Locate the file input element and upload the file
	@FindBy(xpath = "//div[@class='dz-default dz-message']")
	private WebElement Attachement_FileUploadButton;
	
//	Robot r = new Robot();
//	for (int i = 0; i < 7; i++) {
//        r.keyPress(KeyEvent.VK_TAB); // Press the Tab key
//        r.keyRelease(KeyEvent.VK_TAB); // Release the Tab key
//        r.delay(100); // Optional delay between key presses
  
	

}
