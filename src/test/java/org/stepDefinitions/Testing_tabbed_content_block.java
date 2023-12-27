package org.stepDefinitions;

import java.util.List;

import org.generics.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.*;
import junit.framework.Assert;

public class Testing_tabbed_content_block extends Base{

	JavascriptExecutor js = (JavascriptExecutor) driver;
	public static int count = 0;
	
	@Given("User should navigate to tabbedcontentblock Page {string} {string} {string}")
	public void user_should_navigate_to_tabbedcontentblock_page(String name, String pageurl, String report) throws InterruptedException {
		count++;
		extentTest = extentReports.startTest(report, "Invocation of test-->" + count);

		driver.navigate().to(pageurl);
		Thread.sleep(2000);
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
			extentTest.log(LogStatus.FAIL, "Page did not load - Failled! ");
		}

		extentTest.log(LogStatus.PASS, "Execution Completed -" + report);
	}

	@Then("click on tab1 section")
	public void click_on_tab1_section() {
		
}
		


	@And("Verify the table1 is visible")
	public void verify_the_table1_is_visible() {
		WebElement xpathValue = driver.findElement(By.xpath("(//div//div[@class='container-fluid mt-8 mb-8'])[1]"));
		String actualResult = xpathValue.getCssValue("--spacing-x");
	    String expectedResult = "clamp(1.88rem,calc(-0.33rem + 9.39vw),8.13rem)";
	    System.out.println("Value: " + actualResult);
	    
	    Boolean textResult = expectedResult.equals(actualResult);
	    
	      if(textResult = true) {
	    	  System.out.println("Spacing successful between table and footer");
	      }else {
	    	  System.out.println("Spacing failed between table and footer");
	      }
		
//		Boolean value1 = driver.findElement(By.xpath("(//div[@class=\"container-fluid\"])[2]")).isDisplayed();
//		
//		if(value1 == true) {
//			System.out.println("Table-1 is Visible");
//		}else {
//			System.out.println("Table-1 is not Visible");
//			}
		}
	
	@Then("click on tab2 section")
	public void click_on_tab2_section() throws InterruptedException {
		driver.findElement(By.xpath("//section//button[@id='component-12796-tab-13040']")).click();
		Thread.sleep(3000);
	    
	}

	@And("Verify the table2 is visible")
	public void verify_the_table2_is_visible() {
		WebElement xpathValue = driver.findElement(By.xpath("(//div//div[@class='container-fluid mt-8 ])[1]"));
		String actualResult = xpathValue.getCssValue("--spacing-x");
	    String expectedResult = "clamp(1.88rem,calc(-0.33rem + 9.39vw),8.13rem)";
	    System.out.println("Value: " + actualResult);
	    
	    Boolean textResult = expectedResult.equals(actualResult);
	    
	      if(textResult = true) {
	    	  System.out.println("Spacing successful between table and footer");
	      }else {
	    	  System.out.println("Spacing failed between table and footer");
	      }
		
//Boolean value2 = driver.findElement(By.xpath("(//div[@class=\"container-fluid\"])[5]")).isDisplayed();
//		
//		if(value2 == true) {
//			System.out.println("Table-2 is Visible");
//		}else {
//			System.out.println("Table-2 is not Visible");
//			}
	}

	@Then("click on tab3 section")
	public void click_on_tab3_section() throws InterruptedException {
		driver.findElement(By.xpath("//section//button[@id='component-12796-tab-13049']")).click();
		Thread.sleep(3000);
	}

	@And("Verify the table3 is visible")
	public void verify_the_table3_is_visible() {
		WebElement xpathValue = driver.findElement(By.xpath("(//div//div[@class='container-fluid mt- mb-8'])[1]"));
		String actualResult = xpathValue.getCssValue("--spacing-x");
	    String expectedResult = "clamp(1.88rem,calc(-0.33rem + 9.39vw),8.13rem)";
	    System.out.println("Value: " + actualResult);
	    
	    Boolean textResult = expectedResult.equals(actualResult);
	    
	      if(textResult = true) {
	    	  System.out.println("Spacing successful between table and footer");
	      }else {
	    	  System.out.println("Spacing failed between table and footer");
	      }
		
//Boolean value3 = driver.findElement(By.xpath("(//div[@class=\"container-fluid\"])[7]")).isDisplayed();
//		
//		if(value3 == true) {
//			System.out.println("Table-3 is Visible");
//		}else {
//			System.out.println("Table-3 is not Visible");
//			}
	}

	@Then("click on tab4 section")
	public void click_on_tab4_section() throws InterruptedException {
		driver.findElement(By.xpath("//section//button[@id='component-12796-tab-13419']")).click();
		Thread.sleep(3000);
	}

	@And("Verify the table4 is visible")
	public void verify_the_table4_is_visible() {
		WebElement xpathValue = driver.findElement(By.xpath("(//div//div[@class='container-fluid mt-8 mb-8'])[1]"));
		String actualResult = xpathValue.getCssValue("--spacing-x");
	    String expectedResult = "clamp(1.88rem,calc(-0.33rem + 9.39vw),8.13rem)";
	    System.out.println("Value: " + actualResult);
	    
	    Boolean textResult = expectedResult.equals(actualResult);
	    
	      if(textResult = true) {
	    	  System.out.println("Spacing successful between table and footer");
	      }else {
	    	  System.out.println("Spacing failed between table and footer");
	      }
		
//Boolean value4 = driver.findElement(By.xpath("(//div[@class='container-fluid mt-8 mb-8'])[1]")).isDisplayed();
//		
//		if(value4 == true) {
//			System.out.println("Table-4 is Visible");
//		}else {
//			System.out.println("Table-4 is not Visible");
//			}
	}

	@Then("click on tab5 section")
	public void click_on_tab5_section() throws InterruptedException {
		driver.findElement(By.xpath("//section//button[@id='component-12796-tab-13422']")).click();
		Thread.sleep(3000);
	}

	@And("Verify the table5 is visible")
	public void verify_the_table5_is_visible() {
		WebElement xpathValue = driver.findElement(By.xpath("(//div//div[@class='container-fluid mt-8 mb-8'])[1]"));
		String actualResult = xpathValue.getCssValue("--spacing-x");
	    String expectedResult = "clamp(1.88rem,calc(-0.33rem + 9.39vw),8.13rem)";
	    System.out.println("Value: " + actualResult);
	    
	    Boolean textResult = expectedResult.equals(actualResult);
	    
	      if(textResult = true) {
	    	  System.out.println("Spacing successful between table and footer");
	      }else {
	    	  System.out.println("Spacing failed between table and footer");
	      }
		
//Boolean value5 = driver.findElement(By.xpath("(//div[@class='container-fluid mt-8 mb-8'])[2]")).isDisplayed();
//		
//		if(value5 == true) {
//			System.out.println("Table-5 is Visible");
//		}else {
//			System.out.println("Table-5 is not Visible");
//			}
	}

	@Then("click on tab6 section")
	public void click_on_tab6_section() throws InterruptedException {
		driver.findElement(By.xpath("//section//button[@id='component-12796-tab-13425']")).click();
		Thread.sleep(3000);
	}

	@And("Verify the table6 is visible")
	public void verify_the_table6_is_visible() {
		WebElement xpathValue = driver.findElement(By.xpath("//div[@id=\"component-12796-tabpanel-13425\"]/div/div/div"));
		String actualResult = xpathValue.getCssValue("--spacing-x");
	    String expectedResult = "clamp(1.88rem,calc(-0.33rem + 9.39vw),8.13rem)";
	    System.out.println("Value: " + actualResult);
	    
	    Boolean textResult = expectedResult.equals(actualResult);
	    
	      if(textResult = true) {
	    	  System.out.println("Spacing successful between table and footer");
	      }else {
	    	  System.out.println("Spacing failed between table and footer");
	      }
		
//Boolean value6 = driver.findElement(By.xpath("(//div[@class='container-fluid mt-8 mb-8'])[6]")).isDisplayed();
//		
//		if(value6 == true) {
//			System.out.println("Table-6 is Visible");
//		}else {
//			System.out.println("Table-6 is not Visible");
//			}
	}

	@Then("click on tab7 section")
	public void click_on_tab7_section() throws InterruptedException {
		driver.findElement(By.xpath("//section//button[@id='component-12796-tab-13428']")).click();
		Thread.sleep(3000);
	}

	@And("Verify the table7 is visible")
	public void verify_the_table7_is_visible() {
		WebElement xpathValue = driver.findElement(By.xpath("//div[@id=\"component-12796-tabpanel-13428\"]/div/div/div"));
		String actualResult = xpathValue.getCssValue("--spacing-x");
	    String expectedResult = "clamp(1.88rem,calc(-0.33rem + 9.39vw),8.13rem)";
	    System.out.println("Value: " + actualResult);
	    
	    Boolean textResult = expectedResult.equals(actualResult);
	    
	      if(textResult = true) {
	    	  System.out.println("Spacing successful between table and footer");
	      }else {
	    	  System.out.println("Spacing failed between table and footer");
	      }
		
//Boolean value7 = driver.findElement(By.xpath("(//div[@class='container-fluid mt-8 mb-8'])[7]")).isDisplayed();
//		
//		if(value7 == true) {
//			System.out.println("Table-7 is Visible");
//		}else {
//			System.out.println("Table-7 is not Visible");
//			}
	}

	@Then("click on tab8 section")
	public void click_on_tab8_section() throws InterruptedException {
		driver.findElement(By.xpath("//section//button[@id='component-12796-tab-13431']")).click();
		Thread.sleep(3000);
	}

	@And("Verify the table8 is visible")
	public void verify_the_table8_is_visible() {
		WebElement xpathValue = driver.findElement(By.xpath("//div[@id=\"component-12796-tabpanel-13431\"]/div/div/div"));
		String actualResult = xpathValue.getCssValue("--spacing-x");
	    String expectedResult = "clamp(1.88rem,calc(-0.33rem + 9.39vw),8.13rem)";
	    System.out.println("Value: " + actualResult);
	    
	    Boolean textResult = expectedResult.equals(actualResult);
	    
	      if(textResult = true) {
	    	  System.out.println("Spacing successful between table and footer");
	      }else {
	    	  System.out.println("Spacing failed between table and footer");
	      }
		
//Boolean value8 = driver.findElement(By.xpath("(//div[@class='container-fluid mt-8 mb-8'])[8]")).isDisplayed();
//		
//		if(value8 == true) {
//			System.out.println("Table-8 is Visible");
//		}else {
//			System.out.println("Table-8 is not Visible");
//			}
	}
	
}
