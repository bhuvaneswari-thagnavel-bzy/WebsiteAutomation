package org.stepDefinitions;

import java.util.List;

import org.generics.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pages.DcoumentListingPage;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.*;

public class Testing_padding_spacing extends Base{
	public static int count = 0;

	@Given("User should navigates to Generic Block Page {string} {string} {string}")
	public void user_should_navigates_to_generic_block_page(String name, String pageurl, String report) throws InterruptedException {
		
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

	@Then("Verify the CSS Values")
	public void verify_the_css_values() {
		
	 
		DcoumentListingPage.validatepaddingofanelement();
		
	}
	}
	
