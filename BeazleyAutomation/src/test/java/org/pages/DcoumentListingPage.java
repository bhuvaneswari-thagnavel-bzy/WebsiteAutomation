package org.pages;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.generics.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.stepDefinitions.Testing_the_feature_for_card_carousel_block_page;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.openqa.selenium.Alert;

import com.relevantcodes.extentreports.LogStatus;

public class DcoumentListingPage extends Base {
	SoftAssert softAssert = new SoftAssert();

	private static Logger logger = LogManager.getLogger(DcoumentListingPage.class);

	@FindBy(xpath = "//div[@data-testid='contentListingFilter']//span[text()='Geography']")
	private WebElement geographydropdown;

	@FindBy(xpath = "//div[@class='relative max-md:flex-1 max-md:overflow-hidden filter-grad-bottom']//div")
	private WebElement geographydropdownitem;
	
	@FindBy(css = "div.block:nth-child(1) > section:nth-child(1)")
	private WebElement paddingelement;
	
	@FindBy(xpath = "//div[@class='section-spacing container-fluid']")
	private WebElement paddingelement1;


	
	
//	public static void validatepaddingofanelement() {
//		isDisplayed(paddingelement);
//		System.out.println("getting the padding of the webelement: "+ paddingelement.getCssValue("padding-bottom"));
//		System.out.println("getting the padding of the webelement: "+ paddingelement.getCssValue("padding-top"));
//		List<WebElement> padding = driver
//				.findElements(By.xpath("//div[@class='section-spacing container-fluid']"));
//		for(WebElement item:padding) {
//			System.out.println("getting the padding of the webelement spacing: "+ item.getCssValue("--spacing-y"));
//			System.out.println("getting the padding of the webelement spacing: "+ item.getCssValue("--spacing-x"));
//		}
//		
//	}
	public static void validatepaddingofanelement() {
		String expectedResult = "clamp(4rem,calc(3.1rem + 4.69vw),6.5rem)";
		String actualResult;
		List<WebElement> padding = driver.findElements(By.xpath("(//div[@class='rich-text'])[1]"));
		for(WebElement item:padding) {
			actualResult = item.getCssValue("--spacing-y");
			System.out.println("getting the padding of the webelement spacing: " + actualResult);
			if(actualResult.equals(expectedResult)) {
				System.out.println("Section Spacing padding are successful");
			} else {
				System.out.println("Section Spacing padding is Failed");
			}
		}
		
		

	}
	
	public void validategeographydropdown() {
		int count;
		isDisplayed(geographydropdown);
		geographydropdown.click();
		ArrayList<String> dropdownlist = new ArrayList<String>();
		List<WebElement> dropdown = driver
				.findElements(By.xpath("//div[@class='relative max-md:flex-1 max-md:overflow-hidden filter-grad-bottom']//div"));
		System.out.println("dropdown items size:"+dropdown.size());

		for (WebElement items : dropdown) {
//			System.out.println("dropdown items:"+items.getText());
			dropdownlist.add(items.getText());
			
			StringOccerances("Germany", items.getText());
			StringOccerances("Switzerland", items.getText());
		}
		System.out.println("dropdown items: "+dropdownlist);
		if(dropdown.size()>=10) {
			System.out.println("More than 10 geographical locations appears in the dropdown.");
			
		}else {
			System.out.println("Less than 10 geographical locations appears in the dropdown.");
		}
		
		}
	
	public void StringOccerances(String string, String stringmatcher) {
		Pattern pattern = Pattern.compile(string, Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(stringmatcher);
	  boolean matchFound = matcher.find();
	    if(matchFound) {
	    	System.out.println("Expected value '"+string  +"' is displayed");
	    }else {
	    	System.out.println("Skipping...");
	    }
	}
	
		
	

	public DcoumentListingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public boolean isDisplayed(WebElement UIelement) {
		return UIelement.isDisplayed();
	}

	public boolean isTextMatched(WebElement UIelement, String Expected) {
		Boolean verifytext = null;
		try {
			Thread.sleep(100);
			verifytext = UIelement.getText().equalsIgnoreCase(Expected);
			System.out.println("verifytext  " + UIelement.getText() + ":  " + verifytext);
			System.out.println("actual text: " + UIelement.getText());
			System.out.println("actual text: " + Expected);

			softAssert.assertTrue(verifytext);
			extentTest.log(LogStatus.PASS, "The expected content displayed in page : '" + Expected + "'");
		} catch (InterruptedException e) {
			e.printStackTrace();
			extentTest.log(LogStatus.FAIL, "The expected content not displayed in page : '" + Expected + "'");
		}
		return verifytext.booleanValue();

	}

	

	public void ScrollToobject(WebDriver driver, String viewport) throws InterruptedException {
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + viewport + ")", "");
		Thread.sleep(1000);
	}

	public static void ContentTypeDropdown() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@aria-label='Close Dialog']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/main/div/div/div/react-component/div/div/div/div[1]/div[1]")).click();
		Thread.sleep(2000);
		

	}

	public static void UKSeeResults() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//label[@for='924'])[1]")).isDisplayed();
		driver.findElement(By.xpath("(//label[@for='924'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(text(),'See ')]")).click();
	}

	public static void validate_UK_inPage() throws InterruptedException {
		Thread.sleep(4000);
		boolean TextResult = driver.findElement(By.xpath("//h4[text()='Reputational Risk wording - UK']"))
				.isDisplayed();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(2000,2000)");

		Thread.sleep(4000);

		// true
		if (TextResult == true) {
			System.out.println("Reputational Risk wording - UK is visible in landing page ---Failed");
		} else {
			System.out.println("Reputational Risk wording - UK is not visible in landing page ---Successful");
		}
	}
	
	//sprint 6
	
	public static void heading_Line_check() {
	    
		boolean FormOurClient = driver.findElement(By.xpath("//h1[text()='From our Clients']")).isDisplayed();
		boolean lineDrawing = driver.findElement(By.xpath("(//img[@alt='line drawing'])[1]")).isDisplayed();
		
		if(FormOurClient && lineDrawing == true) {
			System.out.println("FormOurClient and lineDrawing ---PASS");
		}
		else {
			System.out.println("FormOurClient and lineDrawing -- FAIL");
		}
	}
	
	
	public static void next_arrow_validation() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(300,300)");
		
		Thread.sleep(2000);
		
		boolean ArrowVisible = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[4]/button[2]/*[name()='svg'][1]")).isEnabled();
		
		int i=0;
		while (i<3) {
			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[4]/button[2]/*[name()='svg'][1]")).click();
			heading_Line_check();
			i++;
			
		}
	}
	
	
	public static void rich_text_is_visible() {
			
			Boolean textResult1 = driver.findElement(By.xpath("(//article[@data-testid=\"contentCardBlock\"]//h1)[1]")).isDisplayed();
			Boolean textResult2 = driver.findElement(By.xpath("(//article[@data-testid=\"contentCardBlock\"]//p)[2]")).isDisplayed();
			Boolean textResult3 = driver.findElement(By.xpath("(//article[@data-testid=\"contentCardBlock\"]//p)[4]")).isDisplayed();
			
			if(textResult1 && textResult2 && textResult3 == true) {
				System.out.println("Visible");
			}else {
				System.out.println("Not Visible");
			}
		    
		}
	
	
	public static void richText_visible() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(500,350)");
		Boolean richText1 = driver.findElement(By.xpath("(//div[@class='block infoboxblockmodel']//div//h4//span)[1]")).isDisplayed();
		Boolean richText2 = driver.findElement(By.xpath("(//div//h4//span[@class='text-amethyst-base'])[1]")).isDisplayed();
		Boolean richText3 = driver.findElement(By.xpath("(//div//p//span[@class='text-amethyst-base'])[1]")).isDisplayed();
		Boolean richText4 = driver.findElement(By.xpath("(//div[@class='rich-text text-s-subcopy font-normal text-primary [&>*:last-child]:mb-0'])[1]")).isDisplayed();
		
		if(richText1 && richText2 && richText3 && richText4 == true) {
			System.out.println("Rich text is visible");
		}else {
			System.out.println("Rich text is not visible");
		}
	}
	
	public static void enter_value_to_fields1() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(500,500)");

		driver.findElement(By.xpath("(//input[@id='d03d05d9-5599-4a8f-97f5-5ac269da86d9'])[1]")).sendKeys("Sample");
		driver.findElement(By.xpath("//input[@id='f1c25872-651d-4726-8fb6-10cfca6a6beb']")).sendKeys("Sample City");

		js.executeScript("window.scroll(1000,1000)");
		driver.findElement(By.xpath("//input[@id='5317dc8c-986b-41db-98b0-5f7c04cc69d6']")).sendKeys("06");
	}
	
	
	public static void click_submit1() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(2000,2000)");
		driver.findElement(By.xpath("//button[@id='965a3087-9992-4667-8c53-87d071b8078b']")).click();
	}
	
	
	public static void check_form_submitted1() throws InterruptedException {
		
		Thread.sleep(5000);
		Alert popValue = driver.switchTo().alert();
		String popTextValue = popValue.getText();
		System.out.println("Value of pop up: " + popTextValue);
		popValue.accept();
	}
	
	
	public static void click_submit2() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(2000,2000)");
		driver.findElement(By.xpath("//button[@id='965a3087-9992-4667-8c53-87d071b8078b']")).click();
		Thread.sleep(3000);
	}
	
	
	public static void empty_field_error() {
		
		Boolean firstNameError = driver.findElement(By.xpath("(//span[@class='Form__Element__ValidationError'])[1]")).isDisplayed();
		Boolean AgeError = driver.findElement(By.xpath("//span[text()='This field is required.']")).isDisplayed();
		Boolean birthCityError = driver.findElement(By.xpath("(//span[@class='Form__Element__ValidationError'])[14]")).isDisplayed();
		
		if(firstNameError && AgeError && birthCityError == true) {
			System.out.println("Validation Success");
		}else {
			System.out.println("Page failed");

		}

	}
	
	
	public static void verifyProductPageUnderline() throws InterruptedException {
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@aria-label='Close Dialog']")).click();
			Thread.sleep(2000);
			System.out.println("POP UP CLOSED");
			
			List<WebElement> productTitle = driver.findElements(By.xpath("//a[@class='col-span-12 mb-6 font-serif text-s-h2 text-amethyst-base underline underline-offset-10']"));
			
			int count=1;
			for(WebElement items:productTitle) {
				System.out.println("The result: " + items.getCssValue("text-decoration-line") + count++);
				
				if(items.getCssValue("text-decoration-line").equalsIgnoreCase("underline") == true) {
					System.out.println("The prodtuct title: " + items.getText() + " is underlined");
				}else {
					extentTest.log(LogStatus.FAIL, "The prodtuct title: " + items.getText() + " is not underlined");
				}
			}
		}
	
	
	public static void richTextVerification1() throws InterruptedException {

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@aria-label='Close dialog']")).click();
		Thread.sleep(2000);
		System.out.println("POP UP CLOSED");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0, 500)");
		
		String result = driver.findElement(By.xpath("(//div[@class='rich-text'])[1]")).getAttribute("class");

		if(result.equalsIgnoreCase("rich-text") == true) {
			System.out.println("The article has a rich text class in it: " + result);
		}else {
			System.out.println("The article does not have a rich text class in it: " + result);
		}
		
		String value1 = driver.findElement(By.xpath("(//div[@class=\"rich-text\"])[1]")).getCssValue("font-size");
		String value2 = driver.findElement(By.xpath("(//div[@class=\"rich-text\"])[1]")).getCssValue("font-weight");
		String value3 = driver.findElement(By.xpath("(//div[@class=\"rich-text\"])[1]")).getCssValue("line-height");
		
		String result1 = "17.9433px";
		String result2 = "400";
		String result3 = "29.55px";
		
		
		if(value1.equalsIgnoreCase(result1) && value2.equalsIgnoreCase(result2) && value3.equalsIgnoreCase(result3) == true) {
			System.out.println("The value of all three attributes are matching.");
		}else {
			System.out.println("The value of all three attributes are not matching.");
		}
		
	}

	

}
