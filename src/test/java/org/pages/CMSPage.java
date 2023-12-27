package org.pages;

import java.util.concurrent.TimeUnit;

import org.generics.Authenticator;
import org.generics.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CMSPage extends Base{
	
	Authenticator auth = new Authenticator();

	@FindBy(xpath="//h1[text()='Your Applications']")
	private WebElement yourApplicationsHeaderCMS;
	
	@FindBy(xpath="//input[@name='loginfmt']")
	private WebElement beazleyLogin;
	
	@FindBy(xpath="//input[@id='passwordInput']")
	private WebElement beazleyPassword;
	
	@FindBy(xpath="//input[@id='idSIButton9']")
	private WebElement nextButton;
	
	@FindBy(xpath="//span[text()='Sign in']")
	private WebElement signInButton;
	
	@FindBy(xpath="//input[@id='idSubmit_SAOTCC_Continue']")
	private WebElement verifyButton;
	
	@FindBy(xpath="//input[@id='uniqName_4_0']")
	private WebElement hierarchyTextBox;
	
	@FindBy(xpath="//div[text()='Login']")
	private WebElement autoSuggestLogin;
	
	@FindBy(xpath="//span[@id='uniqName_45_55']//span[@data-dojo-attach-point='iconNode']")
	private WebElement togglenavigationpage;
	
	@FindBy(xpath="//span[@id='dijit_form_ToggleButton_0']")
	private WebElement expandnavigation;
	
	@FindBy(xpath="//span[@class='dijitPlaceHolder dijitInputField']")
	private WebElement search;
	
	@FindBy(xpath = "//input[@id='idTxtBx_SAOTCC_OTC']")
	private WebElement beazleyotc;
	
	@FindBy(xpath = "//input[@id='idSubmit_SAOTCC_Continue']")
	private WebElement beazleyverifybutton;
	
	@FindBy(xpath = "//input[@id='idSIButton9']")
	private WebElement bezleynext;

	@FindBy(xpath = "//span[@id='submitButton']")
	private WebElement beazleysignin;

	@FindBy(xpath = "//input[@id='passwordInput']")
	private WebElement beazleypassword;

	@FindBy(xpath = "//input[@id='i0116']")
	private WebElement beazleyuserid;
	

	
	
	public CMSPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public boolean isDisplayed(WebElement UIelement) {
		return UIelement.isDisplayed();
	}
	
	public void cmspagenavigation(String url) throws InterruptedException {	
			
		Thread.sleep(1000);
		driver.navigate().to(url);
		Thread.sleep(1000);
			
		
	}
	public void cmsbeazleylogin() throws InterruptedException {
		Thread.sleep(2000);
		
		beazleyuserid.sendKeys("bhuvaneswari.thangavel@beazley.com");
		bezleynext.click();
		Thread.sleep(2000);
		if (isDisplayed(beazleypassword)==true) {
		beazleypassword.sendKeys("Haveaniceday369");
		Thread.sleep(500);
		beazleysignin.click();
		}else {
			System.out.println("password text box is not displayed");
		}
		
		Thread.sleep(6000);
//		dyanamiclink.click();
		String secretKey = "7kjwpfldc222scmt";		
		beazleyotc.sendKeys(auth.getTOTPCode(secretKey));
		beazleyverifybutton.click();
		Thread.sleep(4000);
		
	}
	
	
	public void navigatetorespectivecmspage() throws InterruptedException {
		Thread.sleep(1000);
		cmspagenavigation("https://qa.dxp.beazley.com/EPiServer/CMS/#context=epi.cms.contentdata:///7974&viewsetting=viewlanguage:///en");
		Thread.sleep(4000);
		
//		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	      WebDriverWait w = new WebDriverWait(driver,10000);
	      w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//div[@id='dijit_layout_ContentPane_0']")));
	      System.out.println("Page container displayed");
			Thread.sleep(7000);
			
			driver.findElement(By.xpath("//span[@class='dijitReset dijitInline dijitIcon epi-iconForms epi-icon--active']")).click();
			Thread.sleep(7000);
		
		
		
//		
//		togglenavigationpage.click();
//		
//		System.out.println("clickded on toggle navigation icon");
//		expandnavigation.click();
//		Thread.sleep(5000);
//		System.out.println("Expanded navigation list");
////		search.click();
////		System.out.println("clicked on search");
////		search.sendKeys("Homepage");
//		Thread.sleep(10000);
////		if(search.isDisplayed()==true) {
////			search.click();
////			System.out.println("clicked on search");
////			search.sendKeys("VOR");
////		}
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//	      WebDriverWait w = new WebDriverWait(driver,10000);
//	      // presenceOfElementLocated condition
//	      w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//span[text()='VOR']")));
//	      // get text of element and print
//	      System.out.println("VOR is displayed");
//	      Thread.sleep(1000);
//		driver.findElement(By.xpath("//span[text()='VOR']")).click();
//	      Thread.sleep(1000);
//		 System.out.println("clicked on VOR");
//		
//
////	      driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
////	      // identify element and click()
////	      WebElement l=driver.findElement(By.linkText("Terms of Use"));
////	      l.click();
////	      // explicit wait condition
////	      WebDriverWait w = new WebDriverWait(driver,3);
////	      // presenceOfElementLocated condition
////	      w.until(ExpectedConditions.presenceOfElementLocated (By.cssSelector("h1")));
////	      // get text of element and print
////	      System.out.println("Element present having text:" + l.getText());
////	      driver.quit()
	      
	      
		
		
	}
}
