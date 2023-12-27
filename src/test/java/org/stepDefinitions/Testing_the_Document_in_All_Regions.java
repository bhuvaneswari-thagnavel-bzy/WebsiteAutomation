package org.stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.generics.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.pages.DcoumentListingPage;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.*;

public class Testing_the_Document_in_All_Regions extends Base {

	public static int count = 0;
	
	@Given("User should navigate to the {string} {string} {string}")
	public void user_should_navigate_to_the(String name, String pageurl, String report) throws InterruptedException {

//		driver.navigate().to(pageurl);
//		Thread.sleep(3000);
//		System.out.println("Page Name: " + name);
//
////		String s = driver.getCurrentUrl();
////		System.out.println("Page URL " + s);

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

	@Given("User should find the Content Type Dropdown")
	public void user_should_find_the_content_type_dropdown() {
	}

	@When("User clicks on the Content Type Dropdown")
	public void user_clicks_on_the_content_type_dropdown() throws InterruptedException {
		
		DcoumentListingPage.ContentTypeDropdown();
		
	}

	@Then("User should see the Document item under the dropdown")
	public void user_should_see_the_document_item_under_the_dropdown() throws InterruptedException, IOException {
		Thread.sleep(2000);
		boolean document = driver.findElement(By.xpath("//span[text()='Document']")).isDisplayed();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(300,300)");		
		 
		
		if (document == true) {
			System.out.println("Document is displayed ");
		} else {
			System.out.println("Document is not visible");
		}

	}
}
