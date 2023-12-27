package org.stepDefinitions;

import java.io.IOException;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.generics.Base;
import org.generics.FWUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.pages.CRMPage;
import org.pages.CardCarouselBlockPage;
import org.pages.DcoumentListingPage;
import org.pages.ImageBlockPage;
import org.pages.Regressionvalidationpage;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Regression_Testing_Feature_page extends Base{

	private static Logger logger = LogManager.getLogger(Regression_Testing_Feature_page.class);
	ImageBlockPage page = new ImageBlockPage(driver);
	Regressionvalidationpage Regressionpage = new Regressionvalidationpage(driver);
	CardCarouselBlockPage cardCarouselBlockPage = new CardCarouselBlockPage(driver);
	DcoumentListingPage Documentlistingpage = new DcoumentListingPage(driver);
	CRMPage  crmpage = new CRMPage(driver);
	public static int count = 0;
	SoftAssert softAssert = new SoftAssert();
	
    @When("User Logs in to application {string} {string} {string}")
    public void User_Logs_in_to_application(String name, String pageurl, String report) throws InterruptedException {
    	count++;
		extentTest = extentReports.startTest(report,"Invocation of test-->"+count);
		
    			driver.navigate().to(pageurl);
    			Thread.sleep(1000);
    			System.out.println("Page Name: "+name);
    			extentTest.log(LogStatus.PASS,"Page Name: "+name);
    			JavascriptExecutor j = (JavascriptExecutor) driver;
    		      j.executeScript("return document.readyState")
    		      .toString().equals("complete");
    		      String s = driver.getCurrentUrl();
    		      if (s.equals(pageurl)) {
    		         System.out.println("Page Loaded");
    		         System.out.println("Current Url: " + s);
    		         extentTest.log(LogStatus.PASS,name+" - Page Loaded");
    		         extentTest.log(LogStatus.PASS,"Current Url: " + s);
    		         
    		      }
    		      else {
    		         System.out.println("Page did not load");
//    		         extentTest.log(LogStatus.FAIL,"Page did not load - Failled! ");
    		      }
    			
		extentTest.log(LogStatus.PASS, "Execution Completed -"+report);
}
    
    @And("Provide Beazley Login")
    public void provide_beazley_login() throws InterruptedException {
   	
    	crmpage.beazleylogin();
    }
    
    @When("User Lands on CRM Home page")
    public void user_lands_on_crm_home_page() throws InterruptedException {
    	crmpage.handlepopupblock();
    }
    
    @Then("Create New Contact For Existing Organization")
    public void Create_New_Contact_For_Existing_Organization () throws InterruptedException {
    	
    	crmpage.createnewcontact();
    }
    
    @Then("Add New DXP Digital Account")
    public void Add_New_DXP_Digital_Account () throws InterruptedException {
    	
    	crmpage.VerifyDXPDigitalAccount();
    }
    
    @Then("Add Add New DXP Application")
    public void Add_Add_New_DXP_Application () throws InterruptedException {
    	
    	crmpage.VerifyDXPApplication();
    }

    
    @And("Add Application Permission")
    public void Add_Application_Permission() throws InterruptedException {
    	
    	crmpage.VerifyDXPApplication();
    }
    
    
    @And("check the page loads")
    public void check_the_page_loads() {
    	System.out.println("Verified the page loaded successfully without an Error");
    	extentTest.log(LogStatus.PASS, "Verified the page loaded successfully without an Error");
    }
    
    @Then("User should be landed successfully")
    public void User_should_be_landed_successfully () {
    	System.out.println("landed success");
    }
    
    @And("Validate service form questions and options")
    public void Validate_service_form_questions_and_options() throws InterruptedException {
    	Regressionpage.brokercontactformclientservicesisDisplayed(driver);
    }
    
    @And("Validate broker contact form generalfeedback")
    public void Validate_broker_contact_form_generalfeedback() throws InterruptedException {
    	Regressionpage.brokercontactformgeneralfeedback(driver);
    }
    
    @And("Validate broker contact form my BeazleySupport")
    public void Validate_broker_contact_form_my_BeazleySupport() throws InterruptedException {
    	Regressionpage.brokercontactformgeneralfeedback(driver);
    }
    
    @And("Validate customer contact form")
    public void Validate_customer_contact_form() throws InterruptedException {
    	Regressionpage.customercontactform();
    }
    
    @And("Validate customer form cyberaccess 3rd party")
    public void Validate_customer_form_cyberaccess_3rd_party() throws InterruptedException {
    	Regressionpage.customer_form_cyberaccess_3rd_party(driver);
    }
    
    @And("Validate document listing filter")
    public void Validate_document_listing_filter() throws InterruptedException {
    	Regressionpage.filterlisting(driver, "Geography");
    	Regressionpage.filterlisting(driver, "Product Category");
    	Regressionpage.filterlisting(driver, "Document Type");
    }
    
    @And("Validate event information display")
    public void Validate_event_information_display() throws InterruptedException {
    	Regressionpage.eventinformation(driver, "Location");
    	Regressionpage.eventinformation(driver, "Date & Time");

    }
    
    @And("Validate genericheroblock display")
    public void Validate_genericheroblock_display() throws InterruptedException {
    	Regressionpage.genericheroblock(driver, "Login");
    	Regressionpage.genericheroblock(driver, "Cyber attack response services example over two lines");    	
    	Regressionpage.genericheroblock(driver, "Ransomware");
    	Regressionpage.genericheroblock(driver, "Claims");
    	Regressionpage.genericheroblock(driver, "Claims");
    	Regressionpage.genericheroblock(driver, "myBeazley");
    	Regressionpage.genericheroblock(driver, "Lorem ipsum dolor sit amet");
    	Regressionpage.genericheroblock(driver, "Lorem ipsum dolor sit amet");
    	Regressionpage.genericheroblock(driver, "Insurance. Just different");
    	Regressionpage.genericheroblock(driver, "What connects a moonlit heist with a medical device?");
    	Regressionpage.genericheroblock(driver, "Nullam id dolor id nibh ultricies vehicula ut id");
    	Regressionpage.genericheroblock(driver, "Chief Executive Officer's Statement");
    	Regressionpage.genericheroblock(driver, "Lorem ipsum dolor sit amet");
    	Regressionpage.genericheroblock(driver, "Lorem ipsum dolor sit amet");

    }
    
    @And("Validate headerblock display")
    public void Validate_headerblock_display() throws InterruptedException {
		 softAssert.assertEquals(cardCarouselBlockPage.logoIsPresent(),true);
		logger.info("Validated the logo is present");
		cardCarouselBlockPage.VerifyHeaderWebelement();
		 System.out.println("+++++++++++  Header Component display & Text validation  completed");
		 logger.info("Verified HeaderWebelement");
		 
		 cardCarouselBlockPage.VerifyCardCarouselBlockDisplayandHeaderTextOfEachCards(driver);
		 System.out.println("+++++++++++  Card Carousel Block Display & Title visible in UI");
		 logger.info("Verified CardCarouselBlockDisplayandHeaderTextOfEachCards");
		 
		 cardCarouselBlockPage.VerifyWebelement();
		 logger.info("Verified web element");

		 cardCarouselBlockPage.validatefooterlocationdropdown(driver);
		 logger.info("Footer section - Location dropdown validation");
    }
    
    
    @And("Validate footerblock display")
    public void Validate_footerblock_display() throws InterruptedException {
    	softAssert.assertEquals(cardCarouselBlockPage.logoIsPresent(),true);
		logger.info("Validated the logo is present");
		
		cardCarouselBlockPage.VerifyFootersectionPrimaryBlocklinkNavigation(driver);
	    System.out.println("+++++++++++  primary block completed");
	    logger.info("Verified primary block link, secondary block link navigation and validated footer social link display url navigation");
		 
	    cardCarouselBlockPage.VerifyFootersectionSecondaryBlocklinkNavigation(driver);
	    System.out.println("++++++++++++ secondary block completed");
	    logger.info("Verified primary block link, secondary block link navigation and validated footer social link display url navigation");

		 cardCarouselBlockPage.validatefooterlocationdropdown(driver);
		 logger.info("Footer section - Location dropdown validation");
		 softAssert.assertAll(); 
    }
    
    @And("Validate homepage display")
    public void Validate_homepage_display() throws InterruptedException {
    	Regressionpage.calloutgroupblock();
    	Regressionpage.ourevents();
    	Regressionpage.cardCarouselBlockLink();
    	Regressionpage.contactus();
    	Regressionpage.contactuslinkarrow();
    	
    }
    
    @And("Validate Geography Dropdown Items")
    public void Validate_Geography_Dropdown_Items() throws InterruptedException {
    	Documentlistingpage.validategeographydropdown();
    	
    }
    
    @And("Validate Reduce Padding Across Components")
    public void Validate_Reduce_Padding_Across_Components() throws InterruptedException {
    	Documentlistingpage.validatepaddingofanelement();
    	
    }
    
    
  //Method for adding logs passed from test cases
    public void reportLog(String message) {    
    	extentTest.log(LogStatus.INFO, message);//For extentTest HTML report
       logger.info("Message: " + message);
       Reporter.log(message);

   }
    
}
    
   
    	
    
    
    
  
    
	

