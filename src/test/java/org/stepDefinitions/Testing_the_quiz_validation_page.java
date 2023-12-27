package org.stepDefinitions;

import org.generics.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.*;

public class Testing_the_quiz_validation_page extends Base{
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	public static int count = 0;


	@Given("User should navigate to personalactionplanquizblock Page {string} {string} {string}")
	public void user_should_navigate_to_personalactionplanquizblock_page(String name, String pageurl, String report) throws InterruptedException {
		
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

	@Then("Fill the requied fields in the quiz")
	public void fill_the_requied_fields_in_the_quiz() throws InterruptedException {
		Thread.sleep(3000);
		js.executeScript("window.scroll(500,900)");
		driver.findElement(By.xpath("//button[@data-testid='startQuizButton']")).click();
		Thread.sleep(5000);
		
		Select Dropdown = new Select(driver.findElement(By.xpath("//select[@id='question-4750']")));
		Dropdown.selectByVisibleText("Education");
		driver.findElement(By.xpath("//input[@id='question-4752-1-9']")).click();
		driver.findElement(By.xpath("//button[@data-testid='formActionNextButton']")).click();
		Thread.sleep(5000);
		
		js.executeScript("window.scroll(500,900)");
		driver.findElement(By.xpath("//label[@for='notApplicable-question-4756']")).click();
		driver.findElement(By.xpath("//label[@for='notApplicable-question-4758']")).click();
		js.executeScript("window.scroll(500,1500)");
		driver.findElement(By.xpath("//label[@for='notApplicable-question-4760']")).click();
		driver.findElement(By.xpath("//button[@data-testid='formActionNextButton']")).click();
		Thread.sleep(5000);
		
		js.executeScript("window.scroll(500,800)");
		driver.findElement(By.xpath("//span[text()='Active monitoring for malware']")).click();
	}

	@And("Click on the quiz submit button.")
	public void click_on_the_quiz_submit_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[@data-testid='formActionNextButton']")).click();
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//button[@aria-label='Close Dialog']")).click();
	}

	@Then("verify whether the text doesnt leak from the container.")
	public void verify_whether_the_text_doesnt_leak_from_the_container() {
		Boolean cardText1 = driver.findElement(By.xpath("(//h4[@class='text-s-h4 font-headline text-amethyst-base mb-5 text-center'])[1]")).isDisplayed();
		String  cardText2 = driver.findElement(By.xpath("(//div[@data-testid='personalActionPlanOutputStepSummaryText'])[1]")).getText();
		String  cardText3 = driver.findElement(By.xpath("(//span[@data-testid='personalActionPlanOutputStepSummaryResult'])[1]")).getText();
		Boolean cardText4 = driver.findElement(By.xpath("(//span[@data-testid='personalActionPlanOutputStepSummaryIcon'])[1]")).isDisplayed();
		
		String expected1 = "Please check the following options to update the security policy. Please be updated with polices published around the quarter to keep you and your company protected from virus.";
		String expected2 = "3 of 3 responses indicate potential opportunities for improvement and footer text.";
		
		Boolean textResult1 = expected1.equals(cardText2);
		Boolean textResult2 = expected2.equals(cardText3);
		
	    
	      if(textResult1 && textResult2 && cardText1 && cardText4 == true) {
	    	  System.out.println("Red text is visible");
	      }else {
	    	  System.out.println("Red text is not visible");
	      }
	}
	
	
	@Then("click on retake button is functional")
	public void click_on_retake_button_is_functional() throws InterruptedException {
		
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,200)");
		Boolean retakeValue = driver.findElement(By.xpath("//div[@data-testid=\"personalActionPlanOutputLinks\"]")).isDisplayed();
		
		if(retakeValue == true) {
			driver.findElement(By.xpath("//div[@data-testid=\"personalActionPlanOutputLinks\"]")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//h2[text()='Your personalised Cyber Action Plan']")).isDisplayed();
		}
	}
	
	@Then("Fill the requied fields in the quiz page")
	public void fill_the_requied_fields_in_the_quiz_page() throws InterruptedException {
//		Thread.sleep(3000);
//		js.executeScript("window.scroll(500,900)");
//		driver.findElement(By.xpath("//button[@data-testid='startQuizButton']")).click();
//		Thread.sleep(5000);
//		
//		Select Dropdown = new Select(driver.findElement(By.xpath("//select[@id='question-4750']")));
//		Dropdown.selectByVisibleText("Aviation, Aerospace & Space");
//		driver.findElement(By.xpath("//label[@for=\"question-4752-10-49\"]")).click();
//		driver.findElement(By.xpath("//button[@data-testid='formActionNextButton']")).click();
//		Thread.sleep(5000);
//		
//		js.executeScript("window.scroll(500,900)");
//		driver.findElement(By.xpath("(//span[@data-index='10'])[2]")).click();
//		
//		Actions builder = new Actions(driver);
//		WebElement to = driver.findElement(By.xpath("(//span[@data-index='10'])[2]"));
//		WebElement from = driver.findElement(By.xpath("(//span[@data-index='0'])[2]"));
//		builder.dragAndDropBy(from, to).perform();
		
	
//		driver.findElement(By.xpath("")).click();
//		Thread.sleep(5000);
//		js.executeScript("window.scroll(500,1500)");
//		driver.findElement(By.xpath("")).click();
//		driver.findElement(By.xpath("//button[@data-testid='formActionNextButton']")).click();
//		Thread.sleep(5000);
//		
//		js.executeScript("window.scroll(500,800)");
//		driver.findElement(By.xpath("//label[@for=\"notApplicable-question-4766\"]")).click();
	}
	

	@Then("verify whether the text doesnt leaked from the container.")
	public void verify_whether_the_text_doesnt_leaked_from_the_container() {
//		Boolean cardText1 = driver.findElement(By.xpath("(//h4[@class='text-s-h4 font-headline text-amethyst-base mb-5 text-center'])[1]")).isDisplayed();
//		String  cardText2 = driver.findElement(By.xpath("(//div[@data-testid='personalActionPlanOutputStepSummaryText'])[1]")).getText();
//		String  cardText3 = driver.findElement(By.xpath("(//span[@data-testid='personalActionPlanOutputStepSummaryResult'])[1]")).getText();
//		Boolean cardText4 = driver.findElement(By.xpath("(//span[@data-testid='personalActionPlanOutputStepSummaryIcon'])[1]")).isDisplayed();
//		
//		String expected1 = "You seem to be doing a great job and your company needs no improvement as of now. Please be updated with polices published around the quarter to keep you and your company protected from virus.";
//		String expected2 = "0 of 3 responses indicate potential opportunities for improvement and footer text.";
//		
//		Boolean textResult1 = expected1.equals(cardText2);
//		Boolean textResult2 = expected2.equals(cardText3);
//		
//	    
//	      if(textResult1 && textResult2 && cardText1 && cardText4 == true) {
//	    	  System.out.println("Green text is visible");
//	      }else {
//	    	  System.out.println("Green text is not visible");
//	      }
	}
}
