//package org.stepDefinitions;
//
//import java.awt.AWTException;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Properties;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.generics.Base;
//import org.generics.FWUtils;
//import org.generics.PropertiesFactor;
//import org.openqa.selenium.interactions.Actions;
//import org.pages.DashboardPage;
//import org.testng.Assert;
//
//import com.relevantcodes.extentreports.LogStatus;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.When;
//
//public class Dashboard_page_step_definition extends Base{
//
//	private static Logger logger = LogManager.getLogger(Dashboard_page_step_definition.class);
//	DashboardPage dashboardPage = new DashboardPage(driver);
//	
//	@When("User checks the texts of the dashboardPage header")
//	public void user_checks_the_texts_of_the_dashboard_page_header() throws InterruptedException, IOException 
//	{
//		Assert.assertEquals(dashboardPage.checkTheDisplayOfIconInHeader(),true);
//		logger.info("Validated the presence of icon in header");
//		extentTest.log(LogStatus.PASS,"Validated the presence of icon in header",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//		logger.info("Validated the dashboardPage header properties");
//		extentTest.log(LogStatus.PASS,"Validated the dashboardPage header properties",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//	}
//
//	@When("User checks the texts of the dashboardPage cards {string}")
//	public void user_checks_the_texts_of_the_dashboard_page_cards(String text) throws InterruptedException, IOException 
//	{
//		FWUtils.scrollUptoParticularElement(driver,dashboardPage.getCriticalWeaknessCards());
//		prop = new Properties();
//		fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/data.properties");
//		prop.load(fis);
//		Assert.assertEquals(dashboardPage.checkTheLengthOfTextInCards(),19);
//		logger.info("Validated the length of text in cards");
//		extentTest.log(LogStatus.PASS,"Validated the length of text in cards",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//		Assert.assertEquals(dashboardPage.checkTheDisplayOfTextInCards(),true);
//		logger.info("Validated the presence of text in cards");
//		extentTest.log(LogStatus.PASS,"Validated the presence of text in cards",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
//		logger.info("Checked the count of letters");
//		extentTest.log(LogStatus.PASS,"Checked the count of letters",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//		Assert.assertEquals(dashboardPage.checksCSSPropertiesInCards(),"12px");
//		Assert.assertEquals(dashboardPage.checksCSSPropertiesInCardsOthers(),"Diatype, sans-serif");
//		Assert.assertEquals(dashboardPage.checksCSSpropertiesInCardsAnother(),"rgba(49, 49, 49, 1)");
//		logger.info("Validated the CSS properties of cards");
//		extentTest.log(LogStatus.PASS,"Validated the CSS properties of cards",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//		logger.info("Validated the dashboardPage cards properties");
//		extentTest.log(LogStatus.PASS,"Validated the dashboardPage cards properties",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//	}
//
//	@And("User checks the texts of the dashboardPage footer {string}")
//	public void user_checks_the_texts_of_the_dashboard_page_footer(String text) throws InterruptedException, IOException 
//	{
//		FWUtils.scrollUptoParticularElement(driver,dashboardPage.getEventsFooter());
//		Assert.assertEquals(dashboardPage.checkTheLengthOfTextInFooter(),6);
//		logger.info("Validated the length of text in footer");
//		extentTest.log(LogStatus.PASS,"Validated the length of text in footer",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//		Assert.assertEquals(dashboardPage.checkTheDisplayOfIconInFooter(),true);
//		logger.info("Validated the presence of icon in footer");
//		extentTest.log(LogStatus.PASS,"Validated the presence of icon in footer",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
//		logger.info("Checked the count of letters");
//		extentTest.log(LogStatus.PASS,"Checked the count of letters",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//		Assert.assertEquals(dashboardPage.checksCSSPropertiesInFooter(),"15.7842px");
//		Assert.assertEquals(dashboardPage.checksCSSPropertiesInFooterOthers(),"Diatype, sans-serif");
//		Assert.assertEquals(dashboardPage.checksCSSpropertiesInFooterAnother(),"rgba(255, 255, 255, 1)");
//		logger.info("Validated the CSS properties of footer");
//		extentTest.log(LogStatus.PASS,"Validated the CSS properties of footer",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//		logger.info("Validated the dashboardPage footer properties");
//		extentTest.log(LogStatus.PASS,"Validated the dashboardPage footer properties",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//	}
//	
//	@When("User clicks on beazley logo {string}")
//	public void user_clicks_on_beazley_logo(String expected) throws InterruptedException, IOException
//	{
//		dashboardPage.clickOnBeazleyLogo();
//		logger.info("Clicked on Beazley logo");
//		extentTest.log(LogStatus.PASS,"Clicked on Beazley logo",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//		String actual = driver.getTitle();
//		Assert.assertEquals(actual,expected);
//		Assert.assertEquals(driver.getCurrentUrl(),PropertiesFactor.fileReader("dashBoardURL"));
//		logger.info("Validated the title of the page");
//		extentTest.log(LogStatus.PASS,"Validated the title of the page",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//	}
//	
//	@When("User checks the content")
//	public void user_checks_the_content() throws InterruptedException, IOException
//	{
//		dashboardPage.checkPresenceOfPreferredName();
//		logger.info("Validated the presence of preferred name");
//		extentTest.log(LogStatus.PASS,"Validated the presence of preferred name",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//		dashboardPage.checkPresenceOfBands();
//		logger.info("Validated the presence of bands");
//		extentTest.log(LogStatus.PASS,"Validated the presence of bands",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//		dashboardPage.checkPresenceOfRiskFactorSummary();
//		logger.info("Validated the Risk Factor Summary");
//		extentTest.log(LogStatus.PASS,"Validated the Risk Factor Summary",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//		FWUtils.scrollUptoParticularElement(driver,dashboardPage.getcyberAttackSummaryCards());
//		dashboardPage.checkPresenceOfCyberAttackSummary();
//		logger.info("Validated the Cyber Attack Summary");
//		extentTest.log(LogStatus.PASS,"Validated the Cyber Attack Summary",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//		FWUtils.scrollUptoParticularElement(driver,dashboardPage.getRiskScoreByCategory());
//		dashboardPage.checkPresenceOfRiskScoreByCategory();
//		logger.info("Validated the Risk Score By Category");
//		extentTest.log(LogStatus.PASS,"Validated the Risk Score By Category",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//	}
//	
//	@When("User checks the bands")
//	public void user_checks_the_bands() throws InterruptedException, IOException
//	{
//		dashboardPage.checkPresenceOfBandsOnly();
//		logger.info("Validated the presence of bands");
//		extentTest.log(LogStatus.PASS,"Validated the presence of bands",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//	}
//	
//	@When("User checks the status")
//	public void user_checks_the_status() throws InterruptedException, IOException
//	{
//		dashboardPage.checkPresenceOfStatus();
//		logger.info("Validated the presence of status");
//		extentTest.log(LogStatus.PASS,"Validated the presence of status",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//	}
//	
//	@When("User checks there are totally 5 bands and can click on it")
//	public void user_checks_there_are_totally_5_bands_and_can_click_on_it() throws InterruptedException, IOException
//	{
//		Assert.assertEquals(dashboardPage.checkTheCountOfBands(),5);
//		logger.info("Validated there are totally 5 bands");
//		extentTest.log(LogStatus.PASS,"Validated there are totally 5 bands",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//		dashboardPage.clickBand();
//		logger.info("Validated that the bands can be clickable");
//		extentTest.log(LogStatus.PASS,"Validated that the bands can be clickable",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//	}
//	
//	@When("User click on each band and validates the window popup presence")
//	public void user_click_on_each_band_and_validates_the_window_popup_presence() throws InterruptedException, IOException
//	{
//		driver.navigate().refresh();
//		dashboardPage.checkPresenceOfWindowPopup1();
//		logger.info("Validated band 1 window popup");
//		extentTest.log(LogStatus.PASS,"Validated band 1 window popup",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//		driver.navigate().refresh();
//		dashboardPage.checkPresenceOfWindowPopup2();
//		logger.info("Validated band 2 window popup");
//		extentTest.log(LogStatus.PASS,"Validated band 2 window popup",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//		driver.navigate().refresh();
//		dashboardPage.checkPresenceOfWindowPopup3();
//		logger.info("Validated band 3 window popup");
//		extentTest.log(LogStatus.PASS,"Validated band 3 window popup",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//		driver.navigate().refresh();
//		dashboardPage.checkPresenceOfWindowPopup4();
//		logger.info("Validated band 4 window popup");
//		extentTest.log(LogStatus.PASS,"Validated band 4 window popup",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//	}
//	
//	@And("User checks the colors in popup window of each band and validates the presence of description in popup")
//	public void user_checks_the_colors_in_popup_window_of_each_band_and_validates_the_presence_of_description_in_popup() throws InterruptedException, IOException
//	{
//		driver.navigate().refresh();
//		dashboardPage.checkPresenceOfColorAndDescriptionInWindowPopup1();
//		logger.info("Validated color and description in window popup of band 1");
//		extentTest.log(LogStatus.PASS,"Validated color and description in window popup of band 1",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//		driver.navigate().refresh();
//		dashboardPage.checkPresenceOfColorAndDescriptionInWindowPopup2();
//		logger.info("Validated color and description in window popup of band 2");
//		extentTest.log(LogStatus.PASS,"Validated color and description in window popup of band 2",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//		driver.navigate().refresh();
//		dashboardPage.checkPresenceOfColorAndDescriptionInWindowPopup3();
//		logger.info("Validated color and description in window popup of band 3");
//		extentTest.log(LogStatus.PASS,"Validated color and description in window popup of band 3",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//		driver.navigate().refresh();
//		dashboardPage.checkPresenceOfColorAndDescriptionInWindowPopup4();
//		logger.info("Validated color and description in window popup of band 4");
//		extentTest.log(LogStatus.PASS,"Validated color and description in window popup of band 4",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//	}
//	
//	@When("User see carousel component showing each cyber attack that user at risk of")
//	public void user_see_carousel_component_showing_each_cyber_attack_that_user_at_risk_of() throws InterruptedException, IOException
//	{
//		driver.navigate().refresh();
//		dashboardPage.checkPresenceOfCarousel();
//		logger.info("Validated the presence of carousel");
//		extentTest.log(LogStatus.PASS,"Validated the presence of carousel",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//	}
//	
//	@And("User see these are shown in order of risk")
//	public void user_see_these_are_shown_in_order_of_risk() throws InterruptedException, IOException
//	{
//		driver.navigate().refresh();
//		dashboardPage.checkTheOrderOfRisk();
//		logger.info("Validated the order of risk");
//		extentTest.log(LogStatus.PASS,"Validated the order of risk",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//	}
//	
//	@When("User see attributes of caraousel")
//	public void user_see_attributes_of_caraousel() throws InterruptedException, IOException
//	{
//		driver.navigate().refresh();
//		dashboardPage.checkThePresenceOfCaraouselAttributes();
//		logger.info("Validated the attributes of caraousel");
//		extentTest.log(LogStatus.PASS,"Validated the attributes of caraousel",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//	}
//	
//	@And("User see the number of weakness, grouped by severity and plural version")
//	public void user_see_the_number_of_weakness_grouped_by_severity_and_plural_version() throws InterruptedException, IOException
//	{
//		driver.navigate().refresh();
//		dashboardPage.checkTheNumberCategoryAndPluralVersion();
//		logger.info("Validated the number of weakness, grouped by severity and plural version");
//		extentTest.log(LogStatus.PASS,"Validated the number of weakness, grouped by severity and plural version",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//	}
//	
//	@When("User validates bar chart and see the names of all risk categories")
//	public void user_validates_bar_chart_and_see_the_names_of_all_risk_categories() throws InterruptedException, IOException, AWTException
//	{
//		driver.navigate().refresh();
//		dashboardPage.checkTheBarChartAndRiskCategories();
//		logger.info("Validated the bar chart and names of all risk categories");
//		extentTest.log(LogStatus.PASS,"Validated the bar chart and names of all risk categories",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//	}
//	
//	@When("User see tooltip icon, window popup and description in window popup")
//	public void user_see_tooltip_icon_window_popup_and_description_in_window_popup() throws InterruptedException, IOException
//	{
//		driver.navigate().refresh();
//		FWUtils.scrollUptoParticularElement(driver,dashboardPage.getRiskScoreByCategoryCards());
//		dashboardPage.checkTooltipWindowPopupDescription();
//		logger.info("Validated the tooltip icon, window popup and description");
//		extentTest.log(LogStatus.PASS,"Validated the tooltip icon, window popup and description",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//	}
//	
//	@And("User see categories are scored 1 of 5 and there is no numeric value")
//	public void user_see_categories_are_scored_1_of_5_and_there_is_no_numeric_value() throws InterruptedException, IOException
//	{
//		driver.navigate().refresh();
//		FWUtils.scrollUptoParticularElement(driver,dashboardPage.getRiskScoreByCategoryCards());
//		dashboardPage.checkCategoryScore();
//		logger.info("Validated the scored 1 of 5 and there is no numeric value");
//		extentTest.log(LogStatus.PASS,"Validated the scored 1 of 5 and there is no numeric value",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//	}
//	
//	@And("User hovers on bar and validates bar in hover state")
//	public void user_hovers_on_bar_and_validates_bar_in_hover_state() throws InterruptedException, IOException
//	{
//		driver.navigate().refresh();
//		FWUtils.scrollUptoParticularElement(driver,dashboardPage.getRiskScoreByCategoryCards());
//		Actions a = new Actions(driver);
//		a.moveToElement(dashboardPage.getBar()).build().perform();
//		Assert.assertEquals(dashboardPage.getBar().isDisplayed(),true);
//		logger.info("Validated the hover state of bar");
//		extentTest.log(LogStatus.PASS,"Validated the hover state of bar",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//	}
//	
//	@When("User clicks on a category, user can see category information in expanded state")
//	public void user_clicks_on_a_category_user_can_see_category_information_in_expanded_state() throws InterruptedException, IOException
//	{
//		driver.navigate().refresh();
//		FWUtils.scrollUptoParticularElement(driver,dashboardPage.getRiskScoreByCategoryCards());
//		dashboardPage.checkCategoryExpandedState();
//		logger.info("Validated the category in expanded state");
//		extentTest.log(LogStatus.PASS,"Validated the category in expanded state",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//	}
//	
//	@When("User validates category expanded state attributes")
//	public void user_validates_category_expanded_state_attributes() throws InterruptedException, IOException
//	{
//		driver.navigate().refresh();
//		FWUtils.scrollUptoParticularElement(driver,dashboardPage.getRiskScoreByCategoryCards());
//		dashboardPage.checkExpandedCategoryState();
//		logger.info("Validated the category expanded state attributes");
//		extentTest.log(LogStatus.PASS,"Validated the category expanded state attributes",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//	}
//	
//	@And("User validates tooltip icon, window popup and description")
//	public void user_views_tooltip_icon_window_popup_and_description() throws InterruptedException, IOException
//	{
//		driver.navigate().refresh();
//		FWUtils.scrollUptoParticularElement(driver,dashboardPage.getRiskScoreByCategoryCards());
//		dashboardPage.checkExpandedCategoryState();
//		dashboardPage.checkTooltipWindowPopupAndDescription();
//		dashboardPage.countOfRiskFactorInCategoryAndPluralCopy();
//		dashboardPage.checkDescriptionOfCategory();
//		logger.info("Validated the tooltip icon, window popup and description");
//		extentTest.log(LogStatus.PASS,"Validated the tooltip icon, window popup and description",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//	}
//	
//	@And("User validates by closing the expanded state by clicking on other category bar and checks expanded state of that bar")
//	public void user_validates_by_closing_the_expanded_state_by_clicking_on_other_category_bar_and_checks_expanded_state_of_that_bar() throws InterruptedException, IOException
//	{
//		dashboardPage.clickOnCollapsedBar();
//		dashboardPage.clickOnCollapsedLink();
//		logger.info("Validated by closing the expanded state by clicking on other category bar and validates expanded satet of other bar");
//		extentTest.log(LogStatus.PASS,"Validated by closing the expanded state by clicking on other category bar and validates expanded satet of other bar",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//	}
//	
//	@When("User checks the component")
//	public void user_checks_the_component() throws InterruptedException, IOException
//	{
//		dashboardPage.checkNotMovableElement();
//		logger.info("Validated the component");
//		extentTest.log(LogStatus.PASS,"Validated the component",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//	}
//	
//	@When("User checks title and count of risk attack cyber types")
//	public void user_checks_title_and_count_of_risk_attack_cyber_types() throws InterruptedException, IOException
//	{
//		dashboardPage.riskOfCyberAttacks();
//		dashboardPage.checkTheCountOfRisk();
//		logger.info("Validated the title and count of risk attack cyber types");
//		extentTest.log(LogStatus.PASS,"Validated the title and count of risk attack cyber types",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//	}
//	
//	@And("User can see all cyber attack CTA and navigate to other page on click")
//	public void user_can_see_all_cyber_attack_CTA_and_navigate_to_other_page_on_click() throws InterruptedException, IOException
//	{
//		dashboardPage.checkTheNavigationToSeeAllCyberAttackType();
//		FWUtils.scrollUptoParticularElement(driver,dashboardPage.getTextNotMovable());
//		dashboardPage.getSeeAllTypesOfCyberAttacks().click();
//		logger.info("Validated the see all cyber attack CTA and navigated to other page on click");
//		extentTest.log(LogStatus.PASS,"Validated the see all cyber attack CTA and navigated to other page on click",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//	}
//	
//	@When("User checks validation of visit beazley and login in beazley.com page")
//	public void user_checks_validation_of_visit_beazley_and_login_in_beazley_com_page() throws InterruptedException, IOException 
//	{
//		dashboardPage.checkDashboardNavigationLinks();
//		Assert.assertEquals(driver.getCurrentUrl(),PropertiesFactor.fileReader("beazleyWebLink"));
//		logger.info("Validated the visit beazley and login in beazley.com page");
//		extentTest.log(LogStatus.PASS,"Validated the visit beazley and login in beazley.com page",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//	}
//	
//	@When("User validates logged in navigation")
//	public void user_validates_logged_in_navigation() throws InterruptedException, IOException
//	{
//		
//		logger.info("Validated the logged in navigation");
//		extentTest.log(LogStatus.PASS,"Validated the logged in navigation",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//	}
//	
//	@When("User validates navigation for standard user")
//	public void user_validates_navigation_for_standard_user() throws InterruptedException, IOException
//	{
//		
//		logger.info("Validated the navigation for standard user");
//		extentTest.log(LogStatus.PASS,"Validated the navigation for standard user",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//	}
//	
//	@When("User validates navigation for client administrator")
//	public void user_validates_navigation_for_client_administrator() throws InterruptedException, IOException
//	{
//		
//		logger.info("Validated the navigation for client administrator");
//		extentTest.log(LogStatus.PASS,"Validated the navigation for client administrator",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//	}
//	
//	@When("User validates design")
//	public void user_validates_design() throws InterruptedException, IOException
//	{
//		
//		logger.info("Validated the design");
//		extentTest.log(LogStatus.PASS,"Validated the design",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//	}
//	
//	@And("User validates VoR primary navigation")
//	public void user_validates_VoR_primary_navigation() throws InterruptedException, IOException
//	{
//		
//		logger.info("Validated the VoR primary navigation");
//		extentTest.log(LogStatus.PASS,"Validated the VoR primary navigation",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//	}
//	
//	@And("User validates VoR navigation beazley logo")
//	public void user_validates_VoR_navigation_beazley_logo() throws InterruptedException, IOException
//	{
//		
//		logger.info("Validated the VoR navigation beazley logo");
//		extentTest.log(LogStatus.PASS,"Validated the VoR navigation beazley logo",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//	}
//	
//}
