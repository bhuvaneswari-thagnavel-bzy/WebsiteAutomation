package org.stepDefinitions;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.generics.Base;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.JavascriptExecutor;
import org.pages.CardCarouselBlockPage;
import org.pages.ImageBlockPage;
import org.pages.Regressionvalidationpage;
import org.pages.STUBODPPage;
import org.testng.asserts.SoftAssert;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StubODP extends Base{
	
	private static Logger logger = LogManager.getLogger(StubODP.class);
	ImageBlockPage page = new ImageBlockPage(driver);
	CardCarouselBlockPage cardCarouselBlockPage = new CardCarouselBlockPage(driver);
	STUBODPPage stub = new STUBODPPage(driver);
	public static int count = 0;
	SoftAssert softAssert = new SoftAssert();
	
	
	@When("User	viewing Dashboard and Risk score band {string} {string} {string}")
    public void User_viewing_Dashboard_and_Risk_score_band(String name, String url, String report) throws InterruptedException {
    	count++;
		extentTest = extentReports.startTest(report,"Invocation of test-->"+count);
		
    			System.out.println("Page Name: "+name);
    			extentTest.log(LogStatus.PASS,"Navigated To :   '"+name  +"' Page");
    			JavascriptExecutor j = (JavascriptExecutor) driver;
    		      j.executeScript("return document.readyState")
    		      .toString().equals("complete");
    		      String s = driver.getCurrentUrl();
    		      if (s.equals(url)) {
    		         System.out.println("Page Loaded");
    		         System.out.println("Current Url: " + s);
    		         extentTest.log(LogStatus.PASS,name+" - Objects Loaded Successfully");
    		         extentTest.log(LogStatus.PASS,"Current Url:  "+ s);
    		         
    		      }
    		      else {
    		         System.out.println("Page did not load");
    		         extentTest.log(LogStatus.FAIL,"Page did not load - Failled! ");
    		      }
    		      
//    		     stub.riskscoreblock();
    		      
    		    
    			
//		extentTest.log(LogStatus.PASS, "Execution Completed -"+report);
     }
	@And("Validate RiskScore API")
	public void Validate_RiskScore_API() throws FileNotFoundException, ParseException, IOException {	
//		stub.ValidateAPIResponse();
		stub.Writeresponsebacktojsonfile();
//		stub.readresponse();
		stub.validateJsonDocument();
		softAssert.assertAll();

	}
	
	@Then("Validate DashboardUI")
	public void validate_dashboard_ui() throws InterruptedException, JsonIOException, JsonSyntaxException, FileNotFoundException {
	    // Write code here that turns the phrase above into concrete actions
//		stub.peercomparisonlink(driver);
		stub.readresponsearray("categories");
		stub.readresponsearray("scenarios");
	  
	}
	
	

}
