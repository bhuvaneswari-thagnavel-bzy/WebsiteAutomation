package org.stepDefinitions;

import org.generics.Base;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.pages.DcoumentListingPage;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.*;

public class Testing_the_optiforms_page extends Base {

	public static int count = 0;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	@Given("User should navigate to optiforms Page {string} {string} {string}")
	public void user_should_navigate_to_optiforms_page(String name, String pageurl, String report)
			throws InterruptedException {
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

	@Then("fill the mandatory fields.")
	public void fill_the_mandatory_fields() {
		
		DcoumentListingPage.enter_value_to_fields1();
		
	}

	@Then("click the Submit button.")
	public void click_the_submit_button() {
		
		DcoumentListingPage.click_submit1();
		
	}

	@Then("verify whether the form is successfully submitted.")
	public void verify_whether_the_form_is_successfully_submitted() throws InterruptedException {
		
		DcoumentListingPage.check_form_submitted1();
		
	}

	@Given("User should navigate to optiforms Page1 {string} {string} {string}")
	public void user_should_navigate_to_optiforms_page1(String name, String pageurl, String report)
			throws InterruptedException {
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

	@Then("Click on submit button")
	public void click_on_submit_button() throws InterruptedException {
		
		DcoumentListingPage.click_submit2();
		
	}

	@Then("Verify the mandatory errors")
	public void verify_the_mandatory_errors() {
		
		DcoumentListingPage.empty_field_error();

	}

}
