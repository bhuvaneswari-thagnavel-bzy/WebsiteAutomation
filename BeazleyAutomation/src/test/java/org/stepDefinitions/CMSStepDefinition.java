package org.stepDefinitions;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.generics.Base;
import org.generics.FWUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.pages.CMSPage;
import org.pages.CRMPage;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CMSStepDefinition extends Base{
	
	private static Logger logger = LogManager.getLogger(CMSStepDefinition.class);
	CMSPage cmsPage = new CMSPage(driver);
	CRMPage crmpage = new CRMPage(driver);
	public static int count = 0;

	
	@When("CMS Application Login {string} {string} {string}")
    public void CMS_Application_Login(String name, String pageurl, String report) throws InterruptedException {
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
		
		crmpage.beazleylogin();
		
}
	
	@And("Navigate to respective pages")
	public void navigate_to_respective_pages() throws InterruptedException {
		cmsPage.navigatetorespectivecmspage();
	}

}
