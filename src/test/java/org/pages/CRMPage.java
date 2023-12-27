package org.pages;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.generics.Authenticator;
import org.generics.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.stepDefinitions.Testing_the_feature_for_card_carousel_block_page;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;

import de.taimos.totp.TOTP;
import java.util.Date;
import org.apache.commons.codec.binary.Base32;
import org.apache.commons.codec.binary.Hex;

public class CRMPage extends Base {
	SoftAssert softAssert = new SoftAssert();
	Authenticator auth = new Authenticator();

	private static Logger logger = LogManager.getLogger(CRMPage.class);

	@FindBy(xpath = "//h2[@class='font-headline text-s-h3 text-amethyst-base']")
	private WebElement formBlockHeading;

	@FindBy(xpath = "//h2[text()='Error 404']")
	private WebElement Error404;

	@FindBy(xpath = "//span[@data-testid='contentListingFilterSelectedOptions']//span")
	private WebElement listingfilter;

	@FindBy(xpath = "//section[@data-testid='eventInformation']")
	private WebElement eventinformation;

	@FindBy(xpath = "//div[@class='block genericheroblockmodel']")
	private WebElement genericheroblock;

	@FindBy(xpath = "//p[@data-testid='formBlockDescription'] ")
	private WebElement formBlockDescription;

	@FindBy(xpath = "//a[@data-testid='formBlockLink']")
	private WebElement formBlockLink;

	@FindBy(xpath = "//div[@class='custom-scrollbar w-full overflow-x-auto pb-1 max-md:hidden']//li[@aria-current='true']")
	private WebElement formprogressstep;

	@FindBy(xpath = "//label[@data-testid='formFieldYesNoListItemLabel-0']")
	private WebElement yesradiobutton;

	@FindBy(xpath = "//label[@data-testid='formFieldYesNoListItemLabel-1']")
	private WebElement Noradiobutton;

	@FindBy(xpath = "//span[text()='Anti-phishing training from KnowB4']")
	private WebElement serviceformantiphishing;

	@FindBy(xpath = "//button[@data-testid='formActionNextButton']//span")
	private WebElement nextbutton;

	@FindBy(xpath = "//span[@data-testid='formFieldError']")
	private WebElement formfielderror;

	@FindBy(xpath = "//input[@id='nameOfOrganization']")
	private WebElement nameoforganization;

	@FindBy(xpath = "//input[@id='policyReference']")
	private WebElement policyreference;

	@FindBy(xpath = "//select[@id='country']")
	private WebElement country;

	@FindBy(xpath = "//input[@id='nameOfBrokerage']")
	private WebElement nameofBrokerage;
	@FindBy(xpath = "//input[@id='name']")
	private WebElement name;
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
	@FindBy(xpath = "//input[@id='phoneNumber']")
	private WebElement phonenumber;
	@FindBy(xpath = "//input[@id='privacyPolicy']")
	private WebElement privacypolicy;
	@FindBy(xpath = "//h3[@data-testid='thankYouCardTitle']")
	private WebElement thankyoucardtitle;

	@FindBy(xpath = "//h2[@data-testid='calloutGroupBlockTitleHorizontal']")
	private WebElement calloutgroupblocktitle;

	@FindBy(xpath = "//li[@data-testid='calloutGroupBlockCarouselItemHorizontal']")
	private WebElement calloutgroupblockcarouselitemhorizontal;

	@FindBy(id = "//*[@id='id-7fb17442-1d91-4f7d-a15b-e30f263ff3ac-11-red_account270bd3db-d9af-4782-9025-509e298dec0a-red_account.fieldControl-LookupResultsDropdown_red_account_12_search']")
	private WebElement organisationlookupsearchicon;

	@FindBy(xpath = "//*[@id='id-7fb17442-1d91-4f7d-a15b-e30f263ff3ac-23-red_contacttype3ef39988-22bb-4f0b-bbbe-64b5a3748aee-red_contacttype.fieldControl-option-set-select']")
	private WebElement contacttype;

	@FindBy(xpath = "//input[@data-id='firstname.fieldControl-text-box-text']")
	private WebElement firstname;

	@FindBy(xpath = "/html/body/div[2]/div/div[4]/div[2]/div/div[1]/div/div/div/div/div[1]/div[1]/div[1]/div/div[3]/div/div/ul/li[1]/button/span/span[2]")
	private WebElement savecontact;

	@FindBy(xpath = "//input[@id='emailValidation']")
	private WebElement emailid;

	@FindBy(xpath = "//input[@data-id='red_account.fieldControl-LookupResultsDropdown_red_account_textInputBox_with_filter_new']")
	private WebElement office;

	@FindBy(xpath = "//input[@id='id-7fb17442-1d91-4f7d-a15b-e30f263ff3ac-7-lastname4273edbd-ac1d-40d3-9fb2-095c621b552d-lastname.fieldControl-text-box-text']")
	private WebElement lastname;

//	@FindBy(xpath = "//*[@id='contact|NoRelationship|Form|Mscrm.NewRecordFromForm22-button']")
	@FindBy(xpath = "/html/body/div[2]/div/div[4]/div[2]/div/div[1]/div/div/div/div/div[1]/div[1]/div[1]/div/div[3]/div/div/ul/li[3]/button/span/span[2]")	
	private WebElement newrecord;

//	@FindBy(xpath = "//div[@class='ms-TooltipHost root-344']//span[text()='Admin 0001']")
	@FindBy(xpath = "//*[@id=\"entity_control-pcf_grid_control_container\"]/div/div[1]/div/div/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div[1]/div[3]/div/div/div/div/div[1]/div/a/div/span")
	private WebElement contactname;

	
	
	@FindBy(xpath = "//span[text()='Organizations']")
	private WebElement Organizationsmenu;

	@FindBy(xpath = "//span[text()='Contacts']")
	private WebElement contactmenu;

	@FindBy(xpath = "//input[@id='hiddenformSubmitBtn']")
	private WebElement dyanamiclink;

	@FindBy(xpath = "//input[@id='idSIButton9']")
	private WebElement bezleynext;

	@FindBy(xpath = "//span[@id='submitButton']")
	private WebElement beazleysignin;

	@FindBy(xpath = "//input[@id='passwordInput']")
	private WebElement beazleypassword;

	@FindBy(xpath = "//input[@id='i0116']")
	private WebElement beazleyuserid;
	
	@FindBy(xpath = "//input[@id='idTxtBx_SAOTCC_OTC']")
	private WebElement beazleyotc;
	
	@FindBy(xpath = "//input[@id='idSubmit_SAOTCC_Continue']")
	private WebElement beazleyverifybutton;
	
	
	
	
	
	JavascriptExecutor js = (JavascriptExecutor) driver;

public String code;
	public CRMPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public boolean isDisplayed(WebElement UIelement) {
		return UIelement.isDisplayed();
	}
	


	
	public void beazleylogin() throws InterruptedException {
		Thread.sleep(2000);
		
		beazleyuserid.sendKeys("bhuvaneswari.thangavel@beazley.com");
		bezleynext.click();
		Thread.sleep(2000);
		if (isDisplayed(beazleypassword)==true) {
		beazleypassword.sendKeys("Haveaniceday369");
		Thread.sleep(500);
		beazleysignin.click();
		}else {
			System.out.println("password text box is not displayed");
		}
		
		Thread.sleep(6000);
//		dyanamiclink.click();
		String secretKey = "7kjwpfldc222scmt";		
		beazleyotc.sendKeys(auth.getTOTPCode(secretKey));
		beazleyverifybutton.click();
		Thread.sleep(4000);
		
	}
	public void FramecheckingOnPage() {
		System.out.println("checking.................."+driver.getPageSource().contains("iframe"));
		extentTest.log(LogStatus.PASS, "checking.................."+driver.getPageSource().contains("iframe"));
		int count = driver.findElements(By.tagName("iframe")).size() ;
		if(count == 0){
		   // No frames  
			System.out.println("No Frames exist in the page");
		}else{
		   // Frames present     
			System.out.println("Frames present & count is: "+count);
			extentTest.log(LogStatus.PASS, "Frames present & count is: "+count);
			
		}
	}
	public void handlepopupblock() throws InterruptedException {
//		String popup = "//div[@id='modalDialogContentContainer_2']";
		Thread.sleep(1000);
		FramecheckingOnPage();
		
		for (int i = 2; i <=4; i++) {
			driver.findElement(By.xpath("//div[@id='modalDialogContentContainer_"+i+"']")).isDisplayed();
			driver.findElement(By.xpath("//span[@id='okButtonText_"+i+"']")).click();
			System.out.println(i+":st click");
			extentTest.log(LogStatus.PASS, i+":st click");
			Thread.sleep(1000);
		}
		
		extentTest.log(LogStatus.PASS, "Blank Popup handled successfully. Landed in CRM Homepage");
	}
	
	public void createnewcontact() throws InterruptedException {
		Thread.sleep(2000);
		FramecheckingOnPage();
		contactmenu.click();
		Thread.sleep(1000);
		FramecheckingOnPage();
		
		//By executing a java script
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		Integer noOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		
		System.out.println("No. of iframes on the page are " + noOfFrames);
//		driver.switchTo().parentFrame();
//		driver.switchTo().frame("ClientApiFrame_crm_header_global");
		contactname.click();
		extentTest.log(LogStatus.PASS, "clicked on contact name");
//		driver.switchTo().defaultContent();
		

		
		newrecord.click();
		extentTest.log(LogStatus.PASS, "clicked on new record button");
		AddContactInformation();
		
	}
	public void AddContactInformation() throws InterruptedException {
		Thread.sleep(2000);
		firstname.click();
		firstname.clear();
		firstname.sendKeys("AutomationDemo"+randomnumber());
		extentTest.log(LogStatus.PASS, "Contact - FirstName set it as 'AutomationDemo20'");
		lastname.click();
		lastname.clear();
		lastname.sendKeys("TestContact");
		extentTest.log(LogStatus.PASS, "Contact - LastName set it as 'TestContact'");
		Thread.sleep(1000);
		office.click();
		office.clear();
		Actions action = new Actions(driver);
		action.moveToElement(office).clickAndHold().release().click().perform();
		WebElement typeIntoLookup= office;
		typeIntoLookup.sendKeys("Automation Demo Organisation"); //the lookup text
		

		driver.findElement(By.xpath("//*[contains(text(),'Automation Demo Organisation')]")).click();
		

//       driver.findElement(By.xpath("//button[@data-id='red_account.fieldControl-LookupResultsDropdown_red_account_search']")).click();
//       Thread.sleep(1000);
//       driver.findElement(By.linkText("Advanced lookup")).click();
//       Thread.sleep(4000);
//
////       driver.switchTo().window(subWindowHandler); //*[@id="red_account.fieldControl|advancedLookupPopup_popupContainer"]
//       
//       for (String currentWindow: driver.getWindowHandles())
//           driver.switchTo().window(currentWindow);
//    {
//       //Now you are in Popup window and you can get the pop-up window URL here
//        System.out.println(driver.getCurrentUrl());
//        driver.findElement(By.xpath("//input[@id='checkbox-990']")).click();
//        Thread.sleep(200);
//        driver.findElement(By.xpath("//span[text()='Done']")).click();
////        driver.close();  
//    }
//
//    System.out.println(driver.getCurrentUrl()); // This will return Parent window URL
//    driver.getCurrentUrl();

    
       
       
//	driver.findElement(By.xpath("//button[@aria-label='Automation Demo Organisation']")).click();
//       driver.findElement(By.xpath("//input[@id='checkbox-990']")).click();
//       Thread.sleep(200);
//       driver.findElement(By.xpath("//span[text()='Done']")).click();
     
     

		Thread.sleep(3000);
		extentTest.log(LogStatus.PASS, "Contact - Office set it as 'Automation Demo Organization'");
		Thread.sleep(1000);
		emailid.click();
		emailid.clear();
		emailid.sendKeys("AutomationDemo"+randomnumber()+"@Beazley.com");
		Thread.sleep(4000);
		extentTest.log(LogStatus.PASS, "Contact - emailid set it as 'AutomationDemo@Beazley.com'");
		savecontact.click();
		Thread.sleep(10000);
		
		
//		js.executeScript("arguments[0].scrollIntoView();", contacttype);
//		ScrollToobject(driver, "1000,1000");
//		contacttype.sendKeys(Keys.PAGE_DOWN);
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		scrollToBottomPage();
		
		contacttype.click();
		Thread.sleep(500);
		Select SE = new Select(driver.findElement(By.id("id-7fb17442-1d91-4f7d-a15b-e30f263ff3ac-23-red_contacttype3ef39988-22bb-4f0b-bbbe-64b5a3748aee-red_contacttype.fieldControl-option-set-select")));
		SE.selectByIndex(6);
		extentTest.log(LogStatus.PASS, "Contact type - 'Insured' is selected");
		
		savecontact.click();
//		Thread.sleep(10000);
		
		Thread.sleep(5000);
		
		extentTest.log(LogStatus.PASS, "New Contact Added Successfully !!!!");
		
		
		driver.findElement(By.xpath("//button[@data-id='contact|NoRelationship|Form|Mscrm.Form.contact.Save']")).click();
		
		Thread.sleep(1000);
		
		VerifyDXPDigitalAccount();
		
	}
	
	public void scrollToBottomPage(){
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		actions.keyDown(Keys.CONTROL).release().perform();
	}
	
	public void VerifyDXPDigitalAccount() throws InterruptedException {
//		Thread.sleep(2000);
//		FramecheckingOnPage();
//		contactmenu.click();
//		Thread.sleep(1000);
//		FramecheckingOnPage();
//		
//		//By executing a java script
//		JavascriptExecutor exe = (JavascriptExecutor) driver;
//		Integer noOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
//		
//		System.out.println("No. of iframes on the page are " + noOfFrames);
////		driver.switchTo().parentFrame();
////		driver.switchTo().frame("ClientApiFrame_crm_header_global");
//		contactname.click();
//		extentTest.log(LogStatus.PASS, "clicked on contact name");
////		driver.switchTo().defaultContent();
//		
//
//		
//		newrecord.click();
		
		
		Thread.sleep(1000);
		NavigateToOrgranizationsContactsTab();
		extentTest.log(LogStatus.PASS, "Navigated to Organizations - Contacts Tab - Success");
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//li[@title='DXP']")).click();
		System.out.println("Landed in Digital account page");
		extentTest.log(LogStatus.PASS, "Landed in Digital account page - Success");
		
		createDXPDigitalAccount();
		extentTest.log(LogStatus.PASS, "Added New DXP Digital account to the contact - Success");
	}
	
	public void NavigateToOrgranizationsContactsTab() throws InterruptedException {

		Organizationsmenu.click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[contains(text(),'All Broker Offices_BZY')]")).click();
		Thread.sleep(1000);
		
//		driver.findElement(By.xpath("//*[@id='ViewSelector_8_fe69c474-4082-eb11-a812-000d3ad48a90']")).click();
		
		
		driver.findElement(By.xpath("//*[contains(text(),'All Insured Organizations_BZY')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Automation")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//li[@data-id='tablist-Contacts']")).click();
		Thread.sleep(1000);
		
		
		
//		driver.findElement(By.xpath("//*[contains(text(),'AutomationDemo20 TestContact')]")).click();
		driver.findElement(By.partialLinkText("Automation")).click();
		
		
		
	}
	
	public void createDXPDigitalAccount() throws InterruptedException {
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@data-id='vsi_digitalaccount|NoRelationship|SubGridStandard|Mscrm.SubGrid.vsi_digitalaccount.AddNewStandard']")).click();
		Thread.sleep(1000);
		String StatusReason = driver.findElement(By.xpath("//span[contains(text(),'Not Enabled')]")).getText();
		System.out.println(" Status Reason is displayed as : "+ StatusReason);
		extentTest.log(LogStatus.PASS,  "Status Reason is displayed as : "+ StatusReason);
		
		driver.findElement(By.xpath("//span[contains(text(),'Save and Close')]")).click();
		Thread.sleep(4000);
		
		
		List<WebElement> digitalaccountgridstatus = driver.findElements(By.xpath("//div[@data-control-name='Digital_Account_Grid']//div[@col-id='statuscode']//label"));
		for(WebElement status:digitalaccountgridstatus ) {
			
			if(status.getText().equalsIgnoreCase("Not Enabled")) {
				extentTest.log(LogStatus.PASS,  "Status Reason in Digital Account Grid is displayed as : "+ status.getText());
				System.out.println(" Status Reason is displayed as : 'Not Enabled' ");
			}
		}
		
		VerifyDXPApplication();
		
	}
	
	public void VerifyDXPApplication() throws InterruptedException {
//		Thread.sleep(2000);
//		FramecheckingOnPage();
//		contactmenu.click();
//		Thread.sleep(2000);
//		FramecheckingOnPage();
//		
//		//By executing a java script
//		JavascriptExecutor exe = (JavascriptExecutor) driver;
//		Integer noOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
//		
//		System.out.println("No. of iframes on the page are " + noOfFrames);
////		driver.switchTo().parentFrame();
////		driver.switchTo().frame("ClientApiFrame_crm_header_global");
//		contactname.click();
//		extentTest.log(LogStatus.PASS, "clicked on contact name");
////		driver.switchTo().defaultContent();
//		
//
//		
//		newrecord.click();
//		
//		
//		Thread.sleep(2000);
//		NavigateToOrgranizationsContactsTab();
//		extentTest.log(LogStatus.PASS, "Navigated to Organizations - Contacts Tab - Success");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//li[@title='DXP']")).click();
//		System.out.println("Landed in Digital account page");
//		extentTest.log(LogStatus.PASS, "Landed in Digital account page - Success");
		
		ScrollToobject(driver, "1000,500");
		

		
//		createDXPDigitalAccount(); vsi_application|NoRelationship|SubGridStandard|Mscrm.AddNewRecordFromSubGridStandard0id-873
		
		driver.findElement(By.xpath("//button[@data-id='vsi_application|NoRelationship|SubGridStandard|Mscrm.SubGrid.vsi_application.AddNewStandard']")).click();
		Thread.sleep(2000);	
		
		driver.findElement(By.xpath("//div[@data-id='vsi_servicename.fieldControl-option-set-select-container']")).click();
		Thread.sleep(500);
//		id-7f064a57-1d4b-ee11-be6f-002248c87560-3-vsi_servicename3ef39988-22bb-4f0b-bbbe-64b5a3748aee-vsi_servicename.fieldControl-option-set-select
//		id-7f064a57-1d4b-ee11-be6f-002248c87560-3-vsi_servicename3ef39988-22bb-4f0b-bbbe-64b5a3748aee-vsi_servicename.fieldControl-option-set-select_e2706ea3-df7f-49e5-958c-94e1d58f40a3865520000
		Select ServiceName = new Select(driver.findElement(By.id("id-7f064a57-1d4b-ee11-be6f-002248c87560-3-vsi_servicename3ef39988-22bb-4f0b-bbbe-64b5a3748aee-vsi_servicename.fieldControl-option-set-select")));
		ServiceName.selectByIndex(1);
		extentTest.log(LogStatus.PASS, "Service Name - 'VOR' is selected");
		Thread.sleep(5000);
		
//		String StatusReason = driver.findElement(By.xpath("//span[contains(text(),'Not Enabled')]")).getText();
//		System.out.println(" Status Reason is displayed as : "+ StatusReason);
//		extentTest.log(LogStatus.PASS,  "Status Reason is displayed as : "+ StatusReason);
		
		driver.findElement(By.xpath("//button[@data-id='quickCreateSaveAndCloseBtn']")).click();
		Thread.sleep(4000);
		
		
		List<WebElement> digitalaccountgridstatus = driver.findElements(By.xpath("//div[@data-id='Subgrid_new_6-pcf_grid_control_container']//label"));
		for(WebElement status:digitalaccountgridstatus ) {
			
			if(status.getText().equalsIgnoreCase("Pending")) {
				extentTest.log(LogStatus.PASS,  "Status Reason in 'DXP Application' is displayed as : "+ status.getText());
				System.out.println(" Status Reason in 'DXP Application' is displayed as: 'Pending' ");
			}
		}
		
		
		
//		//delete the added application for next fresh execution
//		driver.findElement(By.xpath("//div[@data-id='Subgrid_new_6-pcf_grid_control_container']//i[@data-icon-name='CheckMark']")).click();		
//		
//		driver.findElement(By.xpath("//li[@title='More commands for DXP Application']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[contains(text(),'Delete DXP Application')]")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//button[@data-id='confirmButton']")).click();
//		Thread.sleep(2000);
//		System.out.println("deleted successfully");
		
		
		
		extentTest.log(LogStatus.PASS, "Added New DXP Application to the contact - Success");
		
		AddApplicationPermission();
	}
	
	public void AddApplicationPermission() throws InterruptedException {
		driver.findElement(By.linkText("App_VOR")).click();
		Thread.sleep(2000);	
		scrollToBottomPage();
		driver.findElement(By.xpath("//button[@data-id='vsi_dxppermission|NoRelationship|SubGridStandard|Mscrm.SubGrid.vsi_dxppermission.AddNewStandard']")).click();
		Thread.sleep(2000);	
		
//		driver.findElement(By.xpath("//div[@data-id='vsi_servicename.fieldControl-option-set-select-container']")).click();
//		Thread.sleep(500);
		
		
		driver.findElement(By.xpath("//input[@data-id='vsi_usertype.fieldControl-LookupResultsDropdown_vsi_usertype_textInputBox_with_filter_new']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@data-id='vsi_usertype.fieldControl-LookupResultsDropdown_vsi_usertype_textInputBox_with_filter_new']")).clear();
		driver.findElement(By.xpath("//input[@data-id='vsi_usertype.fieldControl-LookupResultsDropdown_vsi_usertype_textInputBox_with_filter_new']")).sendKeys("Administration");
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//*[contains(text(),'Administration')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-id='quickCreateSaveAndCloseBtn']")).click();
		Thread.sleep(4000);
		
		System.out.println(" Application permission added successfully: "+driver.findElement(By.linkText("App_VOR")).isDisplayed());
		extentTest.log(LogStatus.PASS, " Application permission added successfully: "+driver.findElement(By.linkText("App_VOR")).isDisplayed());
		
	}
	
	
	public double randomnumber() {
		double R = Math.floor(Math.random() * 1000);
		return R;
	}
	
	public void ScrollToobject(WebDriver driver, String viewport) throws InterruptedException {
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(" + viewport + ")", "");
		Thread.sleep(1000);
	}


	public void verifyobjectexist(String webobject) {
		List<WebElement> Carousel = driver.findElements(By.xpath(webobject));
		int count = Carousel.size();
		if (count == 0)
			softAssert.fail("Object is not shown on UI " + webobject);

		for (WebElement element : Carousel) {
			if (isDisplayed(element)) {
				System.out.println("Expected object is shown on the page :" + element.getText());
			}
			extentTest.log(LogStatus.PASS, "Expected object is shown on the page :" + element.getText());
		}
		softAssert.assertAll();
	}

}
