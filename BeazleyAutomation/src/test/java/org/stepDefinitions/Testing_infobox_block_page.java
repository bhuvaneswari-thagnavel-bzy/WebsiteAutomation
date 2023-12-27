package org.stepDefinitions;

import org.generics.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.pages.DcoumentListingPage;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.*;

public class Testing_infobox_block_page extends Base{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	public static int count = 0;

	@Given("User should navigate to infoboxblock Page {string} {string} {string}")
	public void user_should_navigate_to_infoboxblock_page(String name, String pageurl, String report) throws InterruptedException {
	    
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

	@Then("Verify the rich text")
	public void verify_the_rich_text() {
		
		DcoumentListingPage.richText_visible();
		
	}
}
