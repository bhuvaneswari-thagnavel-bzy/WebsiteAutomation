package org.stepDefinitions;

import org.generics.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.pages.DcoumentListingPage;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.*;

public class Testing_the_document_listing_block extends Base{
	public static int count = 0;

	private static Base base;	
	public Testing_the_document_listing_block(Base base) {
        this.base = base;
    }
	
	@Given("User should navigate to {string} {string} {string}")
	public void user_should_navigate_to(String name, String pageurl, String report) throws InterruptedException {
	    
		count++;
		extentTest = extentReports.startTest(report, "Invocation of test-->" + count);

		driver.navigate().to(pageurl);
		Thread.sleep(1000);
		System.out.println("Page Name: " + name);
		extentTest.log(LogStatus.PASS, "Page Name: " + name);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("return document.readyState").toString().equals("complete");
		String s = driver.getCurrentUrl();
		if (s.equals(pageurl)) {
			System.out.println("Page Loaded");
			System.out.println("Current Url: " + s);
			extentTest.log(LogStatus.PASS, name + " - Page Loaded");
			extentTest.log(LogStatus.PASS, "Current Url: " + s);

		} else {
			System.out.println("Page did not load");
//			extentTest.log(LogStatus.FAIL, "Page did not load - Failled! ");
		}

		extentTest.log(LogStatus.PASS, "Execution Completed -" + report);
		
		
	}

	@When("clicking the Geopgraphy dropdown")
	public void clicking_the_geopgraphy_dropdown() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Geography']")).click();
		Thread.sleep(2000);	    
	}

	@When("Select the United Kingdom and click see results")
	public void select_the_united_kingdom_and_click_see_results() throws InterruptedException {
		
		DcoumentListingPage.UKSeeResults();
	}

	@Then("Validate Reputational Risk Wording - UK is not presented in web page")
	public void validate_reputational_risk_wording_uk_is_not_presented_in_web_page() throws InterruptedException {
		
		DcoumentListingPage.validate_UK_inPage();
	}
	
}
