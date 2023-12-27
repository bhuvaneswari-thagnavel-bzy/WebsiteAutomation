package org.stepDefinitions;

import org.generics.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.pages.DcoumentListingPage;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.*;

public class Testing_the_Quotecarouselblock_page extends Base{
	
	public static int count = 0;
	
	@Given("User should navigate to quotecarouselblock Page {string} {string} {string}")
	public void user_should_navigate_to_quotecarouselblock_page(String name, String pageurl, String report) throws InterruptedException {
	    
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

	@Then("Verify the page heading")
	public void verify_the_page_heading() {
	    
		DcoumentListingPage.heading_Line_check();
}
	
	@Then("Verify the nextpage")
	public void verify_the_nextpage() throws InterruptedException {
		DcoumentListingPage.next_arrow_validation();
	}

	
	

}
