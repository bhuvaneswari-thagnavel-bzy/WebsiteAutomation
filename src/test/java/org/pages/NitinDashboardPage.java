//package org.pages;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.generics.PropertiesFactor;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;
//import org.testng.Reporter;
//
//public class NitinDashboardPage {
//
//	@FindBy(xpath="(//img[@src='/globalassets/logo.svg'])[2]")
//	private WebElement beazleyHeader;
//	
//	@FindBy(xpath="(//div[@class='icon-flip-bg transition-colors md:group-hover:bg-amethyst-80 w-[32px] h-[32px] mr-[10px]'])[2]")
//	private WebElement yourProfile;
//	
//	@FindBy(xpath="//a[text()='Manage access']")
//	private WebElement manageAccess;
//	
//	@FindBy(xpath="//h4[text()='Critical Weaknesses']")
//	private WebElement criticalWeaknessCards;
//	
//	@FindBy(xpath="//div[text()='Widespread Ransomware']")
//	private WebElement wideSpreadRansomwareCards;
//	
//	@FindBy(xpath="//label[text()='Endpoint']")
//	private WebElement endpointCards;
//	
//	@FindBy(xpath="//div[@class='relative']")
//	private WebElement completeBandCards;
//	
//	@FindBy(xpath="//div[@class='h-full w-full']//div[@class='relative']//*[name()='svg']//*[name()='path'][6]")
//	private WebElement bandCSSProperties;
//	
//	@FindBy(xpath="//p[@class='font-headline text-primary leading-5 text-[24px] leading-8']")
//	private WebElement riskFactorSummaryCards;
//	
//	@FindBy(xpath="//h1[text()='You are currently at risk of 7 common types of cyber attack']")
//	private WebElement cyberAttackSummaryCards;
//	
//	@FindBy(xpath="//p[text()='Your cyber security score by category']")
//	private WebElement riskScoreByCategoryCards;
//	
//	@FindBy(xpath="(//h2[text()='Welcome John W'])[2]")
//	private WebElement preferredName;
//	
//	@FindBy(xpath="//div[@class='relative']//*[name()='svg'][1]/*[name()='text'][1]")
//	private WebElement statusCards;
//	
//	@FindBy(xpath="//div[@class='relative']//*[name()='svg']//*[name()='path'][2]")
//	private WebElement band1Cards;
//	
//	@FindBy(xpath="//div[@class='relative']//*[name()='svg']//*[name()='path'][4]")
//	private WebElement band2Cards;
//	
//	@FindBy(xpath="//div[@class='relative']//*[name()='svg']//*[name()='path'][6]")
//	private WebElement band3Cards;
//	
//	@FindBy(xpath="//div[@class='relative']//*[name()='svg']//*[name()='path'][7]")
//	private WebElement band4Cards;
//	
//	@FindBy(xpath="//div[@class='relative']//*[name()='svg']//*[name()='path'][10]")
//	private WebElement band5Cards;
//	
//	@FindBy(xpath="(//div[@class='relative bg-[white] p-6 leading-[30px] rounded-3xl h-[40]'])[1]")
//	private WebElement windowPopup1;
//	
//	@FindBy(xpath="(//div[@class='relative bg-[white] p-6 leading-[30px] rounded-3xl h-[40]'])[2]")
//	private WebElement windowPopup2;
//	
//	@FindBy(xpath="(//div[@class='relative bg-[white] p-6 leading-[30px] rounded-3xl h-[40]'])[3]")
//	private WebElement windowPopup3;
//	
//	@FindBy(xpath="(//div[@class='relative bg-[white] p-6 leading-[30px] rounded-3xl h-[40]'])[4]")
//	private WebElement windowPopup4;
//	
//	@FindBy(xpath="(//div[@class='relative bg-[white] p-6 leading-[30px] rounded-3xl h-[40]'])[5]")
//	private WebElement windowPopup5;
//	
//	@FindBy(xpath="//span[text()='Very Poor']")
//	private WebElement colorOfBand1;
//	
//	@FindBy(xpath="//span[text()='Poor']")
//	private WebElement colorOfBand2;
//	
//	@FindBy(xpath="//span[text()='Needs work']")
//	private WebElement colorOfBand3;
//	
//	@FindBy(xpath="//span[text()='Good']")
//	private WebElement colorOfBand4;
//	
//	@FindBy(xpath="//span[text()='Great']")
//	private WebElement colorOfBand5;
//	
//	@FindBy(xpath="//strong[contains(text(),'strong chance you\"ll suffer from a cyber attack,')]")
//	private WebElement para1OfWindowPopup1;
//	
//	@FindBy(xpath="//strong[contains(text(),'a medium chance you\"ll suffer from a cyber attack,')]")
//	private WebElement para1OfWindowPopup2;
//
//	@FindBy(xpath="//strong[contains(text(),'some chances you\"ll suffer from a cyber attack, ')]")
//	private WebElement para1OfWindowPopup3;
//	
//	@FindBy(xpath="//strong[contains(text(),'low risk of suffering from a cyber attack, ')]")
//	private WebElement para1OfWindowPopup4;
//	
//	@FindBy(xpath="//strong[contains(text(),'very low risk of suffering from a cyber attack, ')]")
//	private WebElement para1OfWindowPopup5;
//	
//	@FindBy(xpath="(//div[@class='risk-card lg:w-[372px] lg:h-[436px] lg:min-w-[372px] lg:min-h-[436px] min-w-[315px] min-h-[380px] w-[315px] h-[380px] rounded bg-neutral-white relative p-[30px] lg:m-[16px] mr-[36px] my-[16px] card-animation'])[1]")
//	private WebElement carousel;
//	
//	@FindBy(xpath="//button[@class='font-sans font-medium text-base rounded-md px-[16px] py-[6px] bg-criticalrisk-10 text-criticalrisk-20']")
//	private List<WebElement> highRiskOfAttackButton;
//	
//	@FindBy(xpath="//button[@class='font-sans font-medium text-base rounded-md px-[16px] py-[6px] bg-substantialrisk-10 text-substantialrisk-20']")
//	private List<WebElement> substantialRiskOfAttackButton;
//	
//	@FindBy(xpath="//button[@class='font-sans font-medium text-base rounded-md px-[16px] py-[6px] bg-moderaterisk-10 text-substantialrisk-20']")
//	private List<WebElement> moderateRiskOfAttackButton;
//	
//	@FindBy(xpath="//button[@class='font-sans font-medium text-base rounded-md px-[16px] py-[6px] bg-lowrisk-10 text-lowrisk-20']")
//	private List<WebElement> lowRiskOfAttackButton;
//	
//	@FindBy(xpath="(//button[text()='High risk of attack'])[1]")
//	private WebElement attribute1;
//	
//	@FindBy(xpath="//div[text()='External Major Data Breach']")
//	private WebElement attribute2;
//	
//	@FindBy(xpath="(//span[text()='2 critical weaknesses'])[1]")
//	private WebElement attribute3;
//	
//	@FindBy(xpath="(//span[text()='2 substantial weaknesses'])[1]")
//	private WebElement attribute4;
//	
//	@FindBy(xpath="(//span[text()='3 moderate weaknesses'])[1]")
//	private WebElement attribute5;
//	
//	@FindBy(xpath="(//a[@href='http://www.google.com/'])[2]")
//	private WebElement attribute6;
//	
//	@FindBy(xpath="(//div[@class='w-full'])[2]")
//	private WebElement barChart;
//	
//	@FindBy(xpath="(//div[@class=' lg:w-[85%] w-full'])[1]")
//	private WebElement barChart1;
//	
//	@FindBy(xpath="//p[text()='Very']")
//	private WebElement veryPoorCategory;
//	
//	@FindBy(xpath="(//p[text()='Poor'])[3]")
//	private WebElement poorCategory;
//	
//	@FindBy(xpath="//p[text()='Needs']")
//	private WebElement needsWorkCategory;
//	
//	@FindBy(xpath="(//p[text()='Good'])[2]")
//	private WebElement goodCategory;
//	
//	@FindBy(xpath="(//p[text()='Great'])[2]")
//	private WebElement greatCategory;
//	
//	@FindBy(xpath="//div[@class='w-full flex items-center relative']//*[name()='svg']")
//	private WebElement tooltipCategory;
//	
//	@FindBy(xpath="//div[@class='message absolute lg:w-[400px]']")
//	private WebElement windowPopupCategory;
//	
//	@FindBy(xpath="//h6[text()='What are the categories?']")
//	private WebElement descriptionCategory;
//	
//	@FindBy(xpath="(//span[text()='Great'])[2]")
//	private WebElement barChart1Category;
//	
//	@FindBy(xpath="(//react-component[@id='react_0HMU674ULDD9U']//descendant::h2[text()='Welcome John W'])[2]")
//	private WebElement reactComponent1;
//	
//	@FindBy(xpath="(//react-component[@id='react_0HMU674ULDDA3']//descendant::button[text()='High risk of attack'])[1]")
//	private WebElement reactComponent2;
//	
//	@FindBy(xpath="//react-component[@id='react_0HMU674ULDDA6']//descendant::p[text()='Your cyber security score by category']")
//	private WebElement reactComponent3;
//	
//	@FindBy(xpath="//react-component[@id='react_0HMU674ULDDAB']//descendant::div[text()='Patricia Kocsondy, Head of US Cyber Risks']")
//	private WebElement reactComponent4;
//	
//	@FindBy(xpath="//div[@class='block-click lg:p-[30px]  p-[20px] risk-status-card rounded-lg flex flex-col justify-around']")
//	private WebElement expandedStateCategory;
//	
//	@FindBy(xpath="(//div[text()='Account'])[1]")
//	private WebElement accountCategory;
//	
//	@FindBy(xpath="(//div[text()='Account'])[2]")
//	private WebElement accountSecurityCategory;
//	
//	@FindBy(xpath="//div[text()='Category Risk factors:']")
//	private WebElement categoryRiskFactors;
//	
//	@FindBy(xpath="//p[text()='3 substantial weaknesses']")
//	private WebElement weaknessCategory;
//	
//	@FindBy(xpath="//span[text()='Your cyber security needs some improvement in this area.']")
//	private WebElement descriptionOfCategory;
//	
//	@FindBy(xpath="//p[text()='See all Account risk factors']")
//	private WebElement linkCategory;
//	
//	@FindBy(xpath="(//div[@class=' lg:w-[85%] w-full'])[2]")
//	private WebElement bar2;
//	
//	@FindBy(xpath="//span[text()='Needs Work']")
//	private WebElement needWorkCategory;
//	
//	@FindBy(xpath="//div[@class='block-click flex text-primary font-headline text-[30px] leading-[38px] font-medium relative items-center']//*[name()='svg']")
//	private WebElement toolTipCategory;
//	
//	@FindBy(xpath="//div[@class='riskInfoMessage absolute']")
//	private WebElement windowPopupOfCategory;
//	
//	@FindBy(xpath="//h6[text()='Account']")
//	private WebElement descriptionOffCategory;
//	
//	@FindBy(xpath="(//div[@class='w-full flex'])[1]")
//	private WebElement collapsedBar;
//	
//	@FindBy(xpath="//p[text()='See all Email risk factors']")
//	private WebElement collapsedLink;
//	
//	@FindBy(xpath="//div[text()='THE COST OF CYBER ATTACKS IS RISING IN 2022, DATA BREACHES COST BUSSINESSES LIKE YOU AN AVERAGE OF $4.35M']")
//	private WebElement textNotMovable;
//	
//	@FindBy(xpath="//img[@src='/globalassets/globe.png']")
//	private WebElement logoNotMovable;
//	
//	@FindBy(xpath="//p[text()='See all types of cyber attacks']")
//	private WebElement seeAllTypesOfCyberAttacks;
//	
//	@FindBy(xpath="//div[contains(text(),'Visit Beazley')]")
//	private WebElement visitBeazley;
//	
//	@FindBy(xpath="//span[text()='Log In']")
//	private WebElement logIn;
//	
//	@FindBy(xpath="//div[@class='top-nav-container md:relative md:z-1 translate-y-[2rem] md:translate-y-0 duration-300 transition-all pointer-events-none opacity-0 md:pointer-events-auto md:opacity-100 md:block bg-neutral-white md:bg-amethyst-deep-base w-full md:h-[52px] px-[30px] pb-[30px] md:pb-0 md:pl-0 md:pr-[40px]']")
//	private WebElement navAfter;
//	
//	@FindBy(xpath="//div[@class='top-nav-container md:relative md:z-1 translate-y-[2rem] md:translate-y-0 duration-300 transition-all pointer-events-none opacity-0 md:pointer-events-auto md:opacity-100 md:block bg-neutral-white md:bg-amethyst-deep-base w-full md:h-[52px] px-[30px] pb-[30px] md:pb-0 md:pl-0 md:pr-[40px]']")
//	private WebElement navBefore;
//	
//	@FindBy(xpath="(//img[@src='/globalassets/logo.svg'])[3]")
//	private WebElement beazleyFooter;
//	
//	@FindBy(xpath="//a[text()='Events']")
//	private WebElement eventsFooter;
//	
//	public DashboardPage(WebDriver driver)
//	{
//		PageFactory.initElements(driver,this);
//	}
//	
//	public boolean checkTheDisplayOfIconInHeader()
//	{
//		return beazleyHeader.isDisplayed();
//	}
//	
//	public void clickOnBeazleyLogo() throws InterruptedException
//	{
//		yourProfile.click();
//		manageAccess.click();
//		Thread.sleep(3000);
//		beazleyHeader.click();
//	}
//	
//	public void clickOnManageAccess()
//	{
//		yourProfile.click();
//		manageAccess.click();
//	}
//	
//	public int checkTheLengthOfTextInCards()
//	{
//		return criticalWeaknessCards.getText().length();
//	}
//	
//	public boolean checkTheDisplayOfTextInCards()
//	{
//		return wideSpreadRansomwareCards.isDisplayed();
//	}
//	
//	public String checksCSSPropertiesInCards()
//	{
//		return endpointCards.getCssValue("font-size");
//	}
//	
//	public String checksCSSPropertiesInCardsOthers()
//	{
//		return endpointCards.getCssValue("font-family");
//	}
//	
//	public String checksCSSpropertiesInCardsAnother()
//	{
//		return endpointCards.getCssValue("color");
//	}
//	
//	public void checkPresenceOfBands() throws IOException
//	{
//		Assert.assertEquals(bandCSSProperties.isDisplayed(),true);
//		Assert.assertEquals(bandCSSProperties.getCssValue("color"),PropertiesFactor.fileReader("presenceOfBandsColor"));
//		Assert.assertEquals(bandCSSProperties.getCssValue("fill"),PropertiesFactor.fileReader("presenceOfBandsFill"));
//		Assert.assertEquals(bandCSSProperties.getCssValue("font-family"),PropertiesFactor.fileReader("presenceOfBandsFontFamily"));
//		Assert.assertEquals(bandCSSProperties.getCssValue("font-size"),PropertiesFactor.fileReader("presenceOfBandsFontSize"));
//		Assert.assertEquals(bandCSSProperties.getCssValue("font-weight"),PropertiesFactor.fileReader("presenceOfBandsFontWeight"));
//		Assert.assertEquals(bandCSSProperties.getCssValue("line-height"),PropertiesFactor.fileReader("presenceOfBandsLineHeight"));
//	}
//	
//	public void checkPresenceOfRiskFactorSummary()
//	{
//		Assert.assertEquals(riskFactorSummaryCards.isDisplayed(),true);
//		Assert.assertEquals(riskFactorSummaryCards.getCssValue("font-family"),"\"Tiempos Headline\", serif");
//		Assert.assertEquals(riskFactorSummaryCards.getCssValue("font-size"),"24px");
//		Assert.assertEquals(riskFactorSummaryCards.getCssValue("color"),"rgba(75, 0, 80, 1)");
//	}
//	
//	public void checkPresenceOfCyberAttackSummary()
//	{
//		Assert.assertEquals(cyberAttackSummaryCards.isDisplayed(),true);
//		Assert.assertEquals(cyberAttackSummaryCards.getCssValue("font-family"),"\"Tiempos Fine\", serif");
//		Assert.assertEquals(cyberAttackSummaryCards.getCssValue("font-size"),"29.085px");
//		Assert.assertEquals(riskFactorSummaryCards.getCssValue("color"),"rgba(75, 0, 80, 1)");
//	}
//	
//	public void checkPresenceOfRiskScoreByCategory()
//	{
//		Assert.assertEquals(riskScoreByCategoryCards.isDisplayed(),true);
//		Assert.assertEquals(riskScoreByCategoryCards.getCssValue("font-family"),"\"Tiempos Headline\", serif");
//		Assert.assertEquals(riskScoreByCategoryCards.getCssValue("font-size"),"30px");
//		Assert.assertEquals(riskScoreByCategoryCards.getCssValue("color"),"rgba(75, 0, 80, 1)");
//	}
//	
//	public void checkPresenceOfPreferredName() throws IOException
//	{
//		Assert.assertEquals(preferredName.isDisplayed(),true);
//		Assert.assertEquals(preferredName.getCssValue("font-family"),PropertiesFactor.fileReader("preferredNameFontFamily"));
//		Assert.assertEquals(preferredName.getCssValue("font-size"),PropertiesFactor.fileReader("preferredNameFontSize"));
//		Assert.assertEquals(preferredName.getCssValue("color"),PropertiesFactor.fileReader("preferredNameColor"));
//	}
//	
//	public void checkPresenceOfBandsOnly() throws IOException
//	{
//		Assert.assertEquals(band2Cards.isDisplayed(),true);
//		Assert.assertEquals(band2Cards.getCssValue("color"),PropertiesFactor.fileReader("presenceOfBandsOnlyColor"));
//		Assert.assertEquals(band2Cards.getCssValue("fill"),PropertiesFactor.fileReader("presenceOfBandsOnlyFill"));
//		Assert.assertEquals(band2Cards.getCssValue("font-family"),PropertiesFactor.fileReader("presenceOfBandsOnlyFontFamily"));
//		Assert.assertEquals(band2Cards.getCssValue("font-size"),PropertiesFactor.fileReader("presenceOfBandsOnlyFontSize"));
//		Assert.assertEquals(band2Cards.getCssValue("font-weight"),PropertiesFactor.fileReader("presenceOfBandsOnlyFontWeight"));
//		Assert.assertEquals(band2Cards.getCssValue("line-height"),PropertiesFactor.fileReader("presenceOfBandsOnlyLineHeight"));
//	}
//	
//	public void checkPresenceOfStatus() throws IOException
//	{
//		Assert.assertEquals(statusCards.isDisplayed(),true);
//		Assert.assertEquals(statusCards.getCssValue("font-family"),PropertiesFactor.fileReader("presenceOfStatusFontFamily"));
//		Assert.assertEquals(statusCards.getCssValue("font-size"),PropertiesFactor.fileReader("presenceOfStatusFontSize"));
//		Assert.assertEquals(statusCards.getCssValue("color"),PropertiesFactor.fileReader("presenceOfStatusColor"));
//		Assert.assertEquals(statusCards.getCssValue("fill"),PropertiesFactor.fileReader("presenceOfStatusFill"));
//		Assert.assertEquals(statusCards.getCssValue("font-weight"),PropertiesFactor.fileReader("presenceOfStatusFontWeight"));
//		Assert.assertEquals(statusCards.getCssValue("line-height"),PropertiesFactor.fileReader("presenceOfStatusLineHeight"));
//	}
//	
//	public int checkTheCountOfBands()
//	{
//		ArrayList<WebElement> a = new ArrayList<>();
//		a.add(band1Cards);
//		a.add(band2Cards);
//		a.add(band3Cards);
//		a.add(band4Cards);
//		a.add(band5Cards);
//		return a.size();
//	}
//	
//	public void clickBand()
//	{
//		band3Cards.click();
//	}
//	
//	public void checkPresenceOfWindowPopup1() throws InterruptedException
//	{
//		band1Cards.click();
//		Assert.assertEquals(windowPopup1.isDisplayed(),true);
//		Assert.assertEquals(windowPopup1.getCssValue("font-family"),"Diatype, sans-serif");
//		Assert.assertEquals(windowPopup1.getCssValue("font-size"),"17.8642px");
//		Assert.assertEquals(windowPopup1.getCssValue("color"),"rgba(49, 49, 49, 1)");
//		Assert.assertEquals(windowPopup1.getCssValue("fill"),"rgb(0, 0, 0)");
//		Assert.assertEquals(windowPopup1.getCssValue("font-weight"),"400");
//		Assert.assertEquals(windowPopup1.getCssValue("line-height"),"30px");
//	}
//	
//	public void checkPresenceOfWindowPopup2()
//	{
//		band2Cards.click();
//		Assert.assertEquals(windowPopup2.isDisplayed(),true);
//		Assert.assertEquals(windowPopup2.getCssValue("font-family"),"Diatype, sans-serif");
//		Assert.assertEquals(windowPopup2.getCssValue("font-size"),"17.8642px");
//		Assert.assertEquals(windowPopup2.getCssValue("color"),"rgba(49, 49, 49, 1)");
//		Assert.assertEquals(windowPopup2.getCssValue("fill"),"rgb(0, 0, 0)");
//		Assert.assertEquals(windowPopup2.getCssValue("font-weight"),"400");
//		Assert.assertEquals(windowPopup2.getCssValue("line-height"),"30px");
//	}
//	
//	public void checkPresenceOfWindowPopup3()
//	{
//		band3Cards.click();
//		Assert.assertEquals(windowPopup3.isDisplayed(),true);
//		Assert.assertEquals(windowPopup3.getCssValue("font-family"),"Diatype, sans-serif");
//		Assert.assertEquals(windowPopup3.getCssValue("font-size"),"17.8642px");
//		Assert.assertEquals(windowPopup3.getCssValue("color"),"rgba(49, 49, 49, 1)");
//		Assert.assertEquals(windowPopup3.getCssValue("fill"),"rgb(0, 0, 0)");
//		Assert.assertEquals(windowPopup3.getCssValue("font-weight"),"400");
//		Assert.assertEquals(windowPopup3.getCssValue("line-height"),"30px");
//	}
//	
//	public void checkPresenceOfWindowPopup4()
//	{
//		band4Cards.click();
//		Assert.assertEquals(windowPopup4.isDisplayed(),true);
//		Assert.assertEquals(windowPopup4.getCssValue("font-family"),"Diatype, sans-serif");
//		Assert.assertEquals(windowPopup4.getCssValue("font-size"),"17.8642px");
//		Assert.assertEquals(windowPopup4.getCssValue("color"),"rgba(49, 49, 49, 1)");
//		Assert.assertEquals(windowPopup4.getCssValue("fill"),"rgb(0, 0, 0)");
//		Assert.assertEquals(windowPopup4.getCssValue("font-weight"),"400");
//		Assert.assertEquals(windowPopup4.getCssValue("line-height"),"30px");
//	}
//	
//	public void checkPresenceOfColorAndDescriptionInWindowPopup1()
//	{
//		band1Cards.click();
//		Assert.assertEquals(colorOfBand1.getText(),"Very Poor");
//		Assert.assertEquals(para1OfWindowPopup1.isDisplayed(),true);
//		Assert.assertEquals(para1OfWindowPopup1.getCssValue("font-family"),"Diatype, sans-serif");
//		Assert.assertEquals(para1OfWindowPopup1.getCssValue("font-size"),"17.8642px");
//		Assert.assertEquals(para1OfWindowPopup1.getCssValue("color"),"rgba(49, 49, 49, 1)");
//	}
//	
//	public void checkPresenceOfColorAndDescriptionInWindowPopup2()
//	{
//		band2Cards.click();
//		Assert.assertEquals(colorOfBand2.getText(),"Poor");
//		Assert.assertEquals(para1OfWindowPopup2.isDisplayed(),true);
//		Assert.assertEquals(para1OfWindowPopup2.getCssValue("font-family"),"Diatype, sans-serif");
//		Assert.assertEquals(para1OfWindowPopup2.getCssValue("font-size"),"17.8642px");
//		Assert.assertEquals(para1OfWindowPopup2.getCssValue("color"),"rgba(49, 49, 49, 1)");
//	}
//	
//	public void checkPresenceOfColorAndDescriptionInWindowPopup3()
//	{
//		band3Cards.click();
//		Assert.assertEquals(colorOfBand3.getText(),"Needs work");
//		Assert.assertEquals(para1OfWindowPopup3.isDisplayed(),true);
//		Assert.assertEquals(para1OfWindowPopup3.getCssValue("font-family"),"Diatype, sans-serif");
//		Assert.assertEquals(para1OfWindowPopup3.getCssValue("font-size"),"17.8642px");
//		Assert.assertEquals(para1OfWindowPopup3.getCssValue("color"),"rgba(49, 49, 49, 1)");
//	}
//	
//	public void checkPresenceOfColorAndDescriptionInWindowPopup4()
//	{
//		band4Cards.click();
//		Assert.assertEquals(colorOfBand4.getText(),"Good");
//		Assert.assertEquals(para1OfWindowPopup4.isDisplayed(),true);
//		Assert.assertEquals(para1OfWindowPopup4.getCssValue("font-family"),"Diatype, sans-serif");
//		Assert.assertEquals(para1OfWindowPopup4.getCssValue("font-size"),"17.8642px");
//		Assert.assertEquals(para1OfWindowPopup4.getCssValue("color"),"rgba(49, 49, 49, 1)");
//	}
//	
//	public void checkPresenceOfCarousel() throws IOException
//	{
//		Assert.assertEquals(carousel.isDisplayed(),true);
//		Assert.assertEquals(carousel.getCssValue("color"),PropertiesFactor.fileReader("carouselColor"));
//		Assert.assertEquals(carousel.getCssValue("fill"),PropertiesFactor.fileReader("carouselFill"));
//		Assert.assertEquals(carousel.getCssValue("font-weight"),PropertiesFactor.fileReader("carouselFontWeight"));
//		Assert.assertEquals(carousel.getCssValue("line-height"),PropertiesFactor.fileReader("carouselLineHeight"));
//	}
//	
//	public void checkTheOrderOfRisk()
//	{	
//		ArrayList<WebElement> a = new ArrayList<>();
//		for(WebElement element:highRiskOfAttackButton)
//		{
//			a.add(element);
//		}
//		for(WebElement element:substantialRiskOfAttackButton)
//		{
//			a.add(element);
//		}
//		for(WebElement element:moderateRiskOfAttackButton)
//		{
//			a.add(element);
//		}
//		for(WebElement element:lowRiskOfAttackButton)
//		{
//			a.add(element);
//		}
//		for(WebElement element:a)
//		{
//			Reporter.log(element.getText(),true);
//		}
//	}
//	
//	public void checkThePresenceOfCaraouselAttributes() throws IOException
//	{
//		Assert.assertEquals(attribute1.getText(),"High risk of attack");
//		Assert.assertEquals(attribute2.getText(),"External Major Data Breach");
//		Assert.assertEquals(attribute3.getText(),"2 critical weaknesses");
//		Assert.assertEquals(attribute4.getText(),"2 substantial weaknesses");
//		Assert.assertEquals(attribute5.getText(),"3 moderate weaknesses");
//		Assert.assertEquals(attribute6.isDisplayed(),true);
//		Assert.assertEquals(attribute6.getCssValue("color"),PropertiesFactor.fileReader("attribute6Color"));
//		Assert.assertEquals(attribute6.getCssValue("fill"),PropertiesFactor.fileReader("attribute6Fill"));
//		Assert.assertEquals(attribute6.getCssValue("font-weight"),PropertiesFactor.fileReader("attribute6FontWeight"));
//		Assert.assertEquals(attribute6.getCssValue("line-height"),PropertiesFactor.fileReader("attribute6LineHeight"));
//	}
//	
//	public void checkTheNumberCategoryAndPluralVersion()
//	{
//		Assert.assertEquals(attribute3.getText(),"2 critical weaknesses");
//		Assert.assertEquals(attribute4.getText(),"2 substantial weaknesses");
//		Assert.assertEquals(attribute5.getText(),"3 moderate weaknesses");
//	}
//	
//	public void checkTheBarChartAndRiskCategories() throws IOException
//	{
//		Assert.assertEquals(barChart.isDisplayed(),true);
//		Assert.assertEquals(barChart.getCssValue("color"),PropertiesFactor.fileReader("barChartColor"));
//		Assert.assertEquals(barChart.getCssValue("fill"),PropertiesFactor.fileReader("barChartFill"));
//		Assert.assertEquals(barChart.getCssValue("font-weight"),PropertiesFactor.fileReader("barChartFontWeight"));
//		Assert.assertEquals(barChart.getCssValue("line-height"),PropertiesFactor.fileReader("barChartLineHeight"));
//		Assert.assertEquals(barChart1.isDisplayed(),true);
//		Assert.assertEquals(barChart1.getCssValue("color"),PropertiesFactor.fileReader("barChart1Color"));
//		Assert.assertEquals(barChart1.getCssValue("fill"),PropertiesFactor.fileReader("barChart1Fill"));
//		Assert.assertEquals(barChart1.getCssValue("font-weight"),PropertiesFactor.fileReader("barChart1FontWeight"));
//		Assert.assertEquals(barChart1.getCssValue("line-height"),PropertiesFactor.fileReader("barChart1LineHeight"));
//		Assert.assertEquals(veryPoorCategory.getText().subSequence(0,4),"Very");
//		Assert.assertEquals(poorCategory.getText(),"Poor");
//		Assert.assertEquals(needsWorkCategory.getText().subSequence(0,5),"Needs");
//		Assert.assertEquals(goodCategory.getText(),"Good");
//		Assert.assertEquals(greatCategory.getText(),"Great");
//	}
//	
//	public void checkTooltipWindowPopupDescription()
//	{
//		Assert.assertEquals(tooltipCategory.isDisplayed(),true);
//		tooltipCategory.click();
//		Assert.assertEquals(windowPopupCategory.isDisplayed(),true);
//		Assert.assertEquals(descriptionCategory.getText(),"What are the categories?");
//	}
//	
//	public void checkCategoryScore()
//	{
//		barChart1.click();
//		Assert.assertEquals(barChart1Category.getText(),"Great");
//	}
//	
//	public void checkCategoryExpandedState()
//	{
//		barChart1.click();
//		Assert.assertEquals(expandedStateCategory.isDisplayed(),true);
//	}
//	
//	public void scrollUsingIdAndReactComponent()
//	{
//		reactComponent1.sendKeys(Keys.PAGE_DOWN);
//		reactComponent2.sendKeys(Keys.PAGE_DOWN);
//		reactComponent3.sendKeys(Keys.PAGE_DOWN);
//		reactComponent4.sendKeys(Keys.PAGE_DOWN);
//	}
//	
//	public void checkExpandedCategoryState()
//	{
//		bar2.click();
//		Assert.assertEquals(needWorkCategory.getText(),"Needs Work");
//		Assert.assertEquals(accountCategory.getText(),"Account");
//		Assert.assertEquals(accountSecurityCategory.getText().subSequence(0,7),"Account");
//		Assert.assertEquals(categoryRiskFactors.getText(),"Category Risk factors:");
//		Assert.assertEquals(weaknessCategory.getText(),"3 substantial weaknesses");
//		Assert.assertEquals(descriptionOfCategory.getText(),"Your cyber security needs some improvement in this area.");
//		Assert.assertEquals(linkCategory.getText(),"See all Account risk factors");
//	}
//	
//	public void checkTooltipWindowPopupAndDescription()
//	{
//		Assert.assertEquals(toolTipCategory.isDisplayed(),true);
//		toolTipCategory.click();
//		Assert.assertEquals(windowPopupCategory.isDisplayed(),true);
//		Assert.assertEquals(descriptionOffCategory.getText(),"Account");
//	}
//	
//	public void countOfRiskFactorInCategoryAndPluralCopy()
//	{
//		Assert.assertEquals(weaknessCategory.getText(),"3 substantial weaknesses");
//	}
//	
//	public void checkDescriptionOfCategory()
//	{
//		Assert.assertEquals(descriptionOfCategory.getText(),"Your cyber security needs some improvement in this area.");
//	}
//	
//	public void clickOnCollapsedBar()
//	{
//		collapsedBar.click();
//		Assert.assertEquals(expandedStateCategory.isDisplayed(),true);
//	}
//	
//	public void clickOnCollapsedLink()
//	{
//		collapsedLink.click();
//	}
//	
//	public void checkNotMovableElement() throws IOException
//	{
//		Assert.assertEquals(textNotMovable.isDisplayed(),true);
//		Assert.assertEquals(textNotMovable.getText(),PropertiesFactor.fileReader("textNotMovable"));
//		Assert.assertEquals(textNotMovable.getCssValue("font-family"),PropertiesFactor.fileReader("textNotMovableFontFamily"));
//		Assert.assertEquals(textNotMovable.getCssValue("font-size"),PropertiesFactor.fileReader("textNotMovableFontSize"));
//		Assert.assertEquals(textNotMovable.getCssValue("color"),PropertiesFactor.fileReader("textNotMovableColor"));
//		Assert.assertEquals(logoNotMovable.isDisplayed(),true);
//		Assert.assertEquals(logoNotMovable.getCssValue("color"),PropertiesFactor.fileReader("logoNotMovableColor"));
//		Assert.assertEquals(logoNotMovable.getCssValue("fill"),PropertiesFactor.fileReader("logoNotMovableFill"));
//		Assert.assertEquals(logoNotMovable.getCssValue("font-weight"),PropertiesFactor.fileReader("logoNotMovableFontWeight"));
//		Assert.assertEquals(logoNotMovable.getCssValue("line-height"),PropertiesFactor.fileReader("logoNotMovableLineHeight"));
//	}
//	
//	public void riskOfCyberAttacks() throws IOException
//	{
//		Assert.assertEquals(cyberAttackSummaryCards.getText(),PropertiesFactor.fileReader("cyberAttackSummaryCards"));
//		Assert.assertEquals(cyberAttackSummaryCards.isDisplayed(),true);
//		Assert.assertEquals(cyberAttackSummaryCards.getCssValue("font-family"),PropertiesFactor.fileReader("cyberAttackSummaryCardsFontFamily"));
//		Assert.assertEquals(cyberAttackSummaryCards.getCssValue("font-size"),PropertiesFactor.fileReader("cyberAttackSummaryCardsFontSize"));
//		Assert.assertEquals(cyberAttackSummaryCards.getCssValue("color"),PropertiesFactor.fileReader("cyberAttackSummaryCardsColor"));;
//	}
//	
//	public void checkTheCountOfRisk()
//	{	
//		ArrayList<WebElement> a = new ArrayList<>();
//		for(WebElement element:highRiskOfAttackButton)
//		{
//			a.add(element);
//		}
//		for(WebElement element:substantialRiskOfAttackButton)
//		{
//			a.add(element);
//		}
//		for(WebElement element:moderateRiskOfAttackButton)
//		{
//			a.add(element);
//		}
//		Assert.assertEquals(a.size(),7);
//	}
//	
//	public void checkTheNavigationToSeeAllCyberAttackType() throws IOException
//	{
//		Assert.assertEquals(seeAllTypesOfCyberAttacks.getText(),PropertiesFactor.fileReader("seeAllTypesOfCyberAttacks"));
//		Assert.assertEquals(seeAllTypesOfCyberAttacks.isDisplayed(),true);
//		Assert.assertEquals(seeAllTypesOfCyberAttacks.getCssValue("font-family"),PropertiesFactor.fileReader("seeAllTypesOfCyberAttacksFontFamily"));
//		Assert.assertEquals(seeAllTypesOfCyberAttacks.getCssValue("font-size"),PropertiesFactor.fileReader("seeAllTypesOfCyberAttacksFontSize"));
//		Assert.assertEquals(seeAllTypesOfCyberAttacks.getCssValue("color"),PropertiesFactor.fileReader("seeAllTypesOfCyberAttacksColor"));
//	}
//	
//	public void checkDashboardNavigationLinks() throws IOException
//	{
//		Assert.assertEquals(navBefore.isDisplayed(),true);
//		Assert.assertEquals(navBefore.getCssValue("color"),PropertiesFactor.fileReader("navBeforeColor"));
//		Assert.assertEquals(navBefore.getCssValue("fill"),PropertiesFactor.fileReader("navBeforeFill"));
//		Assert.assertEquals(navBefore.getCssValue("font-weight"),PropertiesFactor.fileReader("navBeforeFontWeight"));
//		Assert.assertEquals(navBefore.getCssValue("line-height"),PropertiesFactor.fileReader("navBeforeLineHeight"));
//		Assert.assertEquals(visitBeazley.getText(),PropertiesFactor.fileReader("visitBeazley"));
//		Assert.assertEquals(visitBeazley.getCssValue("font-family"),PropertiesFactor.fileReader("visitBeazleyFontFamily"));
//		Assert.assertEquals(visitBeazley.getCssValue("font-size"),PropertiesFactor.fileReader("visitBeazleyFontSize"));
//		Assert.assertEquals(visitBeazley.getCssValue("color"),PropertiesFactor.fileReader("visitBeazleyColor"));
//		visitBeazley.click();
//		Assert.assertEquals(logIn.getText(),PropertiesFactor.fileReader("logIn"));
//		Assert.assertEquals(logIn.getCssValue("font-family"),PropertiesFactor.fileReader("logInFontFamily"));
//		Assert.assertEquals(logIn.getCssValue("font-size"),PropertiesFactor.fileReader("logInFontSize"));
//		Assert.assertEquals(logIn.getCssValue("color"),PropertiesFactor.fileReader("logInColor"));
//		Assert.assertEquals(navAfter.isDisplayed(),true);
//		Assert.assertEquals(navAfter.getCssValue("color"),PropertiesFactor.fileReader("navAfterColor"));
//		Assert.assertEquals(navAfter.getCssValue("fill"),PropertiesFactor.fileReader("navAfterFill"));
//		Assert.assertEquals(navAfter.getCssValue("font-weight"),PropertiesFactor.fileReader("navAfterFontWeight"));
//		Assert.assertEquals(navAfter.getCssValue("line-height"),PropertiesFactor.fileReader("navAfterLineHeight"));
//	}
//	
//	public void loggedInNavigation()
//	{
//		
//	}
//	
//	public void navigationForStandardUser()
//	{
//		
//	}
//	
//	public void navigationForClientAdministrator()
//	{
//		
//	}
//	
//	public void design()
//	{
//		
//	}
//	
//	public void voRPrimaryNavigation()
//	{
//		
//	}
//	
//	public void voRNavigationBeazleyLogo()
//	{
//		
//	}
//	
//	public WebElement getTextNotMovable()
//	{
//		return textNotMovable;
//	}
//	
//	public WebElement getSeeAllTypesOfCyberAttacks()
//	{
//		return seeAllTypesOfCyberAttacks;
//	}
//	
//	public WebElement getBar()
//	{
//		return barChart1;
//	}
//	
//	public WebElement getRiskScoreByCategoryCards()
//	{
//		return riskScoreByCategoryCards;
//	}
//	
//	public WebElement getRiskScoreByCategory()
//	{
//		return riskScoreByCategoryCards;
//	}
//	
//	public WebElement getCriticalWeaknessCards()
//	{
//		return criticalWeaknessCards;
//	}
//	
//	public WebElement getcyberAttackSummaryCards()
//	{
//		return cyberAttackSummaryCards;
//	}
//	
//	public int checkTheLengthOfTextInFooter()
//	{
//		return eventsFooter.getText().length();
//	}
//	
//	public boolean checkTheDisplayOfIconInFooter()
//	{
//		return beazleyFooter.isDisplayed();
//	}
//	
//	public String checksCSSPropertiesInFooter()
//	{
//		return eventsFooter.getCssValue("font-size");
//	}
//	
//	public String checksCSSPropertiesInFooterOthers()
//	{
//		return eventsFooter.getCssValue("font-family");
//	}
//	
//	public String checksCSSpropertiesInFooterAnother()
//	{
//		return eventsFooter.getCssValue("color");
//	}
//	
//	public WebElement getEventsFooter()
//	{
//		return eventsFooter;
//	}
//	
//}
