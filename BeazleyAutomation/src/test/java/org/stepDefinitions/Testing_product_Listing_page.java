package org.stepDefinitions;

import org.generics.Base;
import org.openqa.selenium.JavascriptExecutor;
import org.pages.DcoumentListingPage;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.*;

public class Testing_product_Listing_page extends Base {

	public static int count = 0;
	
	@Given("User should navigate to products Page {string} {string} {string}")
	public void user_should_navigate_to_products_page(String name, String pageurl, String report) throws InterruptedException {
	    
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
//			extentTest.log(LogStatus.FAIL, "Page did not load - Failed! ");
		}

		extentTest.log(LogStatus.PASS, "Execution Completed -" + report);
		
	}

	@Then("Verify underline is visible in all product title")
	public void verify_underline_is_visible_in_all_product_title() throws InterruptedException {
		
		DcoumentListingPage.verifyProductPageUnderline();
	}
	
}
