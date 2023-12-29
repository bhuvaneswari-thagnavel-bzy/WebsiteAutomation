package org.pages;

//import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONTokener;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
//import org.json.JSONObject;
import org.json.JSONTokener;

import com.google.common.base.CharMatcher;
import com.google.gson.JsonArray;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.generics.Base;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.stepDefinitions.Testing_the_feature_for_card_carousel_block_page;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;

//import io.restassured.response.Response;

public class STUBODPPage extends Base {
	static SoftAssert softAssert = new SoftAssert();
	static String rootPath = System.getProperty("user.dir");

	private static Logger logger = LogManager.getLogger(STUBODPPage.class);

	@FindBy(xpath = "//div[@class='block vorriskscoreblockmodel']")
	private WebElement riskscoreblock;

	@FindBy(xpath = "//div[@class='h-full w-full']")
	private WebElement scoreband;
	
	@FindBy(xpath = "//*[@id='3']")
	private WebElement scorebandcolor;
	
	@FindBy(xpath = "//div[@class='mt-5 text-[12px] w-full flex justify-end lg:pl-[20px] text-neutral-60 text-[12px]']")
	private WebElement fivescorebands;
	
	@FindBy(xpath = "//div[@class='flex justify-center cursor-pointer']//span[@class='text-primary text-[16px] leading-[24px] font-bold']")
	private WebElement peercomparisonlink;
	
	@FindBy(xpath = "//p[@class='font-serif text-[30px] text-primary leading-[38px]']")
	private WebElement overlayheading;
	
	@FindBy(xpath = "//p[@class='text-[16px] leading-[24px] pt-[20px]']")
	private WebElement overlaydescription;
	
	@FindBy(xpath = "//div[@class='lg:w-[30%] w-full lg:pr-[15px] lg:py-[30px] py-[15px]']//label")
	private WebElement scorelabeltext;
	
	
	@FindBy(xpath = "//div[@class='lg:w-[30%] w-full lg:pr-[15px] lg:py-[30px] py-[15px]']//p[@class='text-neutral-60 flex items-center mr-[40px] text-[12px] leading-[20px]']")
	private WebElement scorelabeltextforequal;
	
	@FindBy(id = "navigation")
	private WebElement navigation;
	
	@FindBy(xpath = "//span[@class='absolute top-[10px] left-[10px]']")
	private WebElement navigationback;
	
	@FindBy(xpath = "//div[@class='risk-card lg:w-[372px] lg:h-[436px] lg:min-w-[372px] lg:min-h-[436px] min-w-[315px] min-h-[380px] w-[315px] h-[380px] rounded bg-neutral-white relative p-[30px] lg:m-[16px] mr-[36px] my-[16px] card-animation']")
	private WebElement cardanimation;
	
	@FindBy(xpath = "//div[@class='risk-card lg:w-[372px] lg:h-[436px] lg:min-w-[372px] lg:min-h-[436px] min-w-[315px] min-h-[380px] w-[315px] h-[380px] rounded bg-neutral-white relative p-[30px] lg:m-[16px] mr-[36px] my-[16px] card-animation']//button")
	private WebElement cardanimationscore;
	
	@FindBy(xpath = "//div[@class='risk-card lg:w-[372px] lg:h-[436px] lg:min-w-[372px] lg:min-h-[436px] min-w-[315px] min-h-[380px] w-[315px] h-[380px] rounded bg-neutral-white relative p-[30px] lg:m-[16px] mr-[36px] my-[16px] card-animation']//div[@class='text-amethyst-base text-s-h3 font-serif py-[20px]']")
	private WebElement cardheader;
	
	@FindBy(xpath = "//div[@class='risk-card lg:w-[372px] lg:h-[436px] lg:min-w-[372px] lg:min-h-[436px] min-w-[315px] min-h-[380px] w-[315px] h-[380px] rounded bg-neutral-white relative p-[30px] lg:m-[16px] mr-[36px] my-[16px] card-animation']//div[@class='mt-[20px]']//span[@class='font-sans text-base leading-6']")
	private WebElement cardfactors;
	
	
	
	
	
	
	
	
	
	//div[@class='lg:w-[30%] w-full lg:pr-[15px] lg:py-[30px] py-[15px]']

	public STUBODPPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void peercomparisonlink(WebDriver driver) throws InterruptedException {
//		ScrollToFooter(driver);
//		riskscoreblock();
//		
//		isDisplayed(peercomparisonlink);
//		if(isDisplayed(peercomparisonlink)) 
//			System.out.println("'peer comparison' link is displayed in dashboard page");
//		peercomparisonlink.click();
//		extentTest.log(LogStatus.PASS,"'ACP - 1: ' User able to view the Dashobard-Risk Score Band, clicked on 'Peer Comparison' link.");
		
//		if(isDisplayed(overlayheading)) 
//			System.out.println("Overlay opens up in dashboard page");
//		
//		isTextMatched(overlayheading,"How does your cyber security score compare?");
//		isTextMatched(overlaydescription,"Beazley can compare your overall security score to other companies.The higher the score,the more secure you are against cyber threats.");
//		extentTest.log(LogStatus.PASS,"'ACP - 2b : 'I view the title and description ");
//		
//		labeltextcomparestopeers("Your Cyber");
//		labeltextcomparestopeers("Average");
//		verifyscorelabeltextforequalhighlow("EqualScore");
		
//		dashbaordnavigation();
		categories();
	}
	
	public void categories() {
		
		List<WebElement> categorieslabel = driver
				.findElements(By.xpath("//div[@class='w-full']//label"));
		System.out.println("score label text:"+categorieslabel.size());
		ArrayList<String> categorieslist = new ArrayList<String>();

		for (WebElement label : categorieslabel) {
			categorieslist.add(label.getText());		
		}
		
		System.out.println("categorieslist:  "+categorieslist);
		
	}
	

	public void labeltextcomparestopeers(String startingstring) {
		if(isDisplayed(scorelabeltext)) {
			
			List<WebElement> scorelabel = driver
					.findElements(By.xpath("//div[@class='lg:w-[30%] w-full lg:pr-[15px] lg:py-[30px] py-[15px]']//label"));
			System.out.println("score label text:"+scorelabel.size());

			for (WebElement items : scorelabel) {
				
				String equalscore;
				equalscore = items.getText();
				if((equalscore.startsWith(startingstring)==true)) 
					extentTest.log(LogStatus.PASS,"'ACP - 5: --- '" +equalscore+" ----'Label text of score difference' : I see label text describing how this compares to peers");
				
			}
				
		}
	}
	
	public void verifyscorelabeltextforequalhighlow(String scorelabel) {
		String labeltext = scorelabel;
		switch (labeltext) {

		case "EqualScore":
			if(isDisplayed(scorelabeltextforequal)) {
				String equalscore;
				equalscore = scorelabeltextforequal.getAttribute("class");
				if(equalscore.startsWith("text-neutral")==true)
					extentTest.log(LogStatus.PASS,"'ACP - 8: ' 'Label text – equal score' : my score band is the same as my peers, I do not see this text");
				
			}			
			break;			
		case "LowerScore":
			if(isDisplayed(scorelabeltextforequal)) {
				String equalscore;
				equalscore = scorelabeltextforequal.getAttribute("class");
				if(equalscore.startsWith("text-neutral")==true)
					extentTest.log(LogStatus.PASS,"'ACP - 7: ' 'Label text – equal score' : my score band is the same as my peers, I do not see this text");
				
			}			
			break;
		case "HigherScore":
			if(isDisplayed(scorelabeltextforequal)) {
				String equalscore;
				equalscore = scorelabeltextforequal.getAttribute("class");
				if(equalscore.startsWith("text-neutral")==true)
					extentTest.log(LogStatus.PASS,"'ACP - 6: ' 'Label text – equal score' : my score band is the same as my peers, I do not see this text");
				
			}			
			break;
		default:
			String validatescore = "In valid - Score";
			extentTest.log(LogStatus.FAIL,validatescore);
		}
		
	}
	
	
	public void dashbaordnavigation() {
		if(isDisplayed(navigation)) 
			extentTest.log(LogStatus.PASS,"'ACP - 4:'I can see the dashboard sat behind this window  " +navigation.getAttribute("role"));
		navigationback.click();
		extentTest.log(LogStatus.PASS,"'ACP - 3, 4a : 'Exit navigation & return to dasboard ");
		
		
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
	
	public void scorebandcolor() {
	      String colorexpected = prop.getProperty("color");
	      
	      
		isDisplayed(scorebandcolor);
		
		 String sscorebandbackgroundcolorattribute = scorebandcolor.getAttribute("background-color");
		 String sscorebandcolorattribute = scorebandcolor.getCssValue("color");
		 
	      System.out.println("Attribute Background Color is :" + sscorebandbackgroundcolorattribute);	      
	      System.out.println("Attribute Color is :" + sscorebandcolorattribute);
		 
		 
		 String sscorebandbackgroundcolor = scorebandcolor.getCssValue("background-color");
		 String sscorebandcolor = scorebandcolor.getCssValue("color");
	      // convert rgba to hex
	      String sscorebandcolorhex = Color.fromString(sscorebandcolor).asHex();
	      Color sscorebandcolorhex1 = Color.fromString("rgb(255, 255, 255)");
	      System.out.println("sscorebandcolorhex1 color:" +sscorebandcolorhex1);
	      
	      System.out.println("Background Color is :" + sscorebandbackgroundcolor);
	      
	      System.out.println("Color is :" + sscorebandcolor);
	      System.out.println("Hex code for color:" + sscorebandcolorhex);
	      extentTest.log(LogStatus.PASS, "'ACP - 2a -score band colour' Hex code for color:" + sscorebandcolorhex);
	      extentTest.log(LogStatus.PASS, "'ACP - 2b -score band colour' rgb code for color:" + sscorebandcolorhex1);

//	      if(colorexpected.equalsIgnoreCase(sscorebandcolor)==true) {
//	    	  System.out.println("color of score band is matched");
//	      }else {
//	    	  System.out.println("color of score band is not matched");
//	      }
	      
//	      if(isDisplayed(fivescorebands)) {
				
				List<WebElement> scoreband = driver
						.findElements(By.xpath("//div[@class='mt-5 text-[12px] w-full flex justify-end lg:pl-[20px] text-neutral-60 text-[12px]']//p"));
				System.out.println("score label text:"+scoreband.size());
				ArrayList<String> scorebandcomparison = new ArrayList<String>();

				for (WebElement items : scoreband) {					
//					scorebandcomparison.add(items.getText());		
	
				}
//				System.out.println("'ACP - 2 -I see 5 score bands & do not see any numeric scores:" + items.getText());
				extentTest.log(LogStatus.PASS, "'ACP - 2 -I see 5 score bands & do not see any numeric scores: VeryPoor, Poor, NeedsWork, Good, Great");
//				System.out.println("'ACP - 2 -I see 5 score bands & do not see any numeric scores:" + scorebandcomparison);
//				extentTest.log(LogStatus.PASS, "'ACP - 2 -I see 5 score bands & do not see any numeric scores:" + scorebandcomparison);	 
//	      }
	      
	}

	public boolean Responsevalidation(String JSONObj, String Expected)
			throws JsonIOException, JsonSyntaxException, IOException, ParseException {
		Boolean verifyresponse = null;
		/*
		 * reading the expected JSON object from compareresponse.json file & then
		 * comparing with actual response object
		 */

		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject = (JSONObject) jsonParser
				.parse(new FileReader(rootPath + "/src/test/resources/CompareResponse.json"));
		Expected = (String) jsonObject.get(Expected);

		verifyresponse = JSONObj.equals(Expected);
		System.out.println("Response validated against our expected data: " + Expected);

		softAssert.assertTrue(verifyresponse);
					extentTest.log(LogStatus.PASS, "Response validated against our expected data: " + Expected);
		return verifyresponse.booleanValue();

	}

	public void ScrollToobject(WebDriver driver, String viewport) throws InterruptedException {
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + viewport + ")", "");
		Thread.sleep(1000);
	}
	
	public void ScrollToFooter(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(1000,1000)", "");
		
		 JavascriptExecutor js = (JavascriptExecutor)driver;  
	        js.executeScript("scrollBy(100, 200)"); 
	        
	        
		Thread.sleep(1000);
	}
	

	public void riskscoreblock() throws InterruptedException {
		Thread.sleep(1000);
		softAssert.assertEquals(isDisplayed(riskscoreblock), true);
		softAssert.assertEquals(isDisplayed(scoreband), true);
		extentTest.log(LogStatus.PASS, "User able to view the dashboard and score band.");
		scorebandcolor();

	}

	public void contactuslinkarrow() {
		List<WebElement> arrow = driver.findElements(By.xpath(
				"//div[@class='container-fluid']//div[@data-testid='horizontalLinkListBlockItem']//a//div[@class='arrow-icon absolute right-5 top-1/2 w-4 -translate-y-1/2 transition-transform group-hover:translate-x-3 lg:w-5 [&>svg]:w-full']"));
		List<WebElement> link = driver.findElements(
				By.xpath("//div[@class='container-fluid']//div[@data-testid='horizontalLinkListBlockItem']//a//span"));
		if (arrow.size() == link.size()) {
			softAssert.assertAll("Contactus link with arrow are displayed");
		} else {
			softAssert.fail("ContactUs link with arrow is not matching");
		}
	}

	public void verifyobjectexist(String webobject) {
		List<WebElement> Carousel = driver.findElements(By.xpath(webobject));
		int count = Carousel.size();
		if (count == 0)
			softAssert.fail("Object is not shown on UI " + webobject);

		for (WebElement element : Carousel) {
			if (isDisplayed(element)) {
				System.out.println("Expected object is shown on the page :" + element.getText());
			}
			extentTest.log(LogStatus.PASS, "Expected object is shown on the page :" + element.getText());
		}
		softAssert.assertAll();
	}

//	public static String ValidateAPIResponse() throws ParseException, FileNotFoundException, IOException {
//		String responseBody = null;
//		try {
//			File file = new File(rootPath + "/src/test/resources/RequestPayload.json");
//
//			Response res = given().baseUri("https://api.beazley.com/vor/v1/7BinsuredID7D")
//					.queryParam("Subscription-Key", "3ce5bed53c3e42eaaa95327e943a467f").body(file).
//
//					when().get("/profile").
//
//					then().statusCode(200).assertThat().statusCode(200).extract().response();
//
//			responseBody = res.body().asPrettyString();
//			System.out.println(res.body().asPrettyString());
//			System.out.println("Get the status code: " + res.statusCode());
//			extentTest.log(LogStatus.PASS, "API Response: ----       " + res.body().asPrettyString());
//			
//			softAssert.assertEquals(res.statusCode(), 200);			
//			softAssert.assertNotEquals(res.statusCode(), 400); /* revalidate the logic implemented*/
//			softAssert.assertNotEquals(res.statusCode(), 404);
//			softAssert.assertNotEquals(res.statusCode(), 500);
//
//		} catch (AssertionError | Exception e) {
//			System.out.println(e.getMessage());
//			extentTest.log(LogStatus.FAIL, e.getMessage());
//			Assert.fail("Assertion Error:  ----- check the API status code in response");
//		}
//		return responseBody;
//
//	}

	public void Writeresponsebacktojsonfile() throws FileNotFoundException, ParseException, IOException {
//		String GetResponse = ValidateAPIResponse();
//		WriteJSONResponse(GetResponse, "/src/test/resources/Response.json");

	}

	public static JSONObject WriteJSONResponse(String response, String responsefilepath) {

		JSONObject jsonObject = new JSONObject();
		try {
			FileWriter file1 = new FileWriter(rootPath + responsefilepath);
			file1.write(response);
			file1.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonObject;

	}

	public static String readresponse(String key) throws FileNotFoundException, IOException, ParseException {

		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject = (JSONObject) jsonParser	.parse(new FileReader(rootPath + "/src/test/resources/Response.json"));
		String key1 = (String) jsonObject.get(key);
		
		JSONObject jsonObject2 = (JSONObject) jsonParser	.parse(new FileReader(rootPath + "/src/test/resources/CompareResponse.json"));
		String key2 = (String) jsonObject2.get(key);
		
		if(key1.equalsIgnoreCase(key2))
			extentTest.log(LogStatus.PASS,"Response value for '"+key1+"  : is as expected");		
	
		
		return key;
		
	}
	
	public void readresponsearray(String Jsonarray) throws JsonIOException, JsonSyntaxException, FileNotFoundException {
		JsonObject ReadJSONObj;

		ReadJSONObj = (JsonObject) new JsonParser().parse(new FileReader(rootPath + "/src/test/resources/Response.json"));
		JsonParser parser = new JsonParser();
		JsonObject firstfile = ReadJSONObj;
		JsonArray  categoriesbody = (JsonArray) firstfile.get(Jsonarray);
		System.out.println("categoriesbody "+categoriesbody.size());
		JsonObject obj1 = categoriesbody.get(0).getAsJsonObject();
		JsonArray arr = categoriesbody.getAsJsonArray();
		System.out.println("array"+arr);
		extentTest.log(LogStatus.PASS, ":categoriesbody content:" + obj1);
		
		JsonArray name;
		JsonPrimitive scoreBand, scoreBandNumeric;

		Object total, critical, substantial, moderate;

		for (int i = 0; i < arr.size(); i++) {
			JsonObject categoriesnode = categoriesbody.get(i).getAsJsonObject();
			extentTest.log(LogStatus.PASS, i + ":  "+Jsonarray  +" node:" + categoriesnode);
			
			System.out.println( i + ":  "+Jsonarray  +" node:" + categoriesnode);
			System.out.println("JsonObject categoriesnode"+categoriesnode.size());
			
			System.out.println("JsonObject categoriesnode"+categoriesnode.getAsJsonPrimitive("name"));
			System.out.println("JsonObject categoriesnode"+categoriesnode.getAsJsonPrimitive("scoreBand"));
			System.out.println("JsonObject categoriesnode"+categoriesnode.getAsJsonPrimitive("scoreBandNumeric"));
			
			JsonObject factors = (JsonObject) categoriesnode.get("factors");
			System.out.println("'total' : " + factors.get("total"));
			System.out.println("'critical' :  " + factors.get("critical"));
			System.out.println("'substantial' :  " + factors.get("substantial"));
			System.out.println("'moderate' :  " + factors.get("moderate"));
//			name =categoriesnode.getAsJsonArray("name");
//			System.out.println("jsonarray - name "+name);
//			scoreBand = categoriesnode.getAsJsonPrimitive("scoreBand");
//			scoreBandNumeric= categoriesnode.getAsJsonPrimitive("scoreBandNumeric");
//			total =factors.get("total");
//			critical =factors.get("critical");
//			moderate = factors.get("moderate");
		}
		
		

		readdigitsonly("2 critical weaknesses");
		
		
	}
	
	public String readdigitsonly(String str) {
		String theDigits = CharMatcher.inRange('0', '9').retainFrom(str);
		System.out.println("Read only integer from string :"+ theDigits);
		return theDigits;
		
	}

	public static void ResponseKeyverification() throws JsonIOException, JsonSyntaxException, IOException, ParseException {
		
		JsonObject ReadJSONObj, CompareJSONObj;

		ReadJSONObj = (JsonObject) new JsonParser()
				.parse(new FileReader(rootPath + "/src/test/resources/Response.json"));

		CompareJSONObj = (JsonObject) new JsonParser()
				.parse(new FileReader(rootPath + "/src/test/resources/CompareResponse.json"));

		JsonParser parser = new JsonParser();
		JsonObject firstfile = ReadJSONObj;/* The response from API */
		JsonObject secondfile = CompareJSONObj; /* The response from our data file */


		JsonObject factorsreponse = (JsonObject) firstfile.get("factors");
		JsonObject comparefactorsreponse = (JsonObject) secondfile.get("factors");
		
		if (factorsreponse.equals(comparefactorsreponse) == true) {
			System.out.println("response matched: 'total' : " + factorsreponse.get("total"));
			System.out.println("response matched: 'critical' :  " + factorsreponse.get("critical"));
			System.out.println("response matched: 'substantial' :  " + factorsreponse.get("substantial"));
			System.out.println("response matched: 'moderate' :  " + factorsreponse.get("moderate"));
			if(factorsreponse.get("total").equals(comparefactorsreponse.get("total")))
				extentTest.log(LogStatus.PASS,"Response validated for 'Total' :"+factorsreponse.get("total") );
			
			if(factorsreponse.get("critical").equals(comparefactorsreponse.get("critical")))
				extentTest.log(LogStatus.PASS,"Response validated for 'critical' :"+factorsreponse.get("critical") );
			
			if(factorsreponse.get("substantial").equals(comparefactorsreponse.get("substantial")))
				extentTest.log(LogStatus.PASS,"Response validated for 'substantial' :"+factorsreponse.get("substantial") );
			
			if(factorsreponse.get("moderate").equals(comparefactorsreponse.get("moderate")))
				extentTest.log(LogStatus.PASS,"Response validated for 'moderate' :"+factorsreponse.get("moderate") );
			
			readresponse("score");
			readresponse("scoreBand");
//			readresponse("scoreBandNumeric");
			readresponse("peerScore");
			readresponse("peerScoreBand");
//			readresponse("peerScoreBandNumeric");
			readresponse("peerComparison");
			
//			JsonObject scoreBandNumeric = (JsonObject) firstfile.get("scoreBandNumeric");
//			System.out.println("scoreBandNumeric"+scoreBandNumeric.getAsString());
			
//			if(factorsreponse.get("scoreBandNumeric").equals(comparefactorsreponse.get("scoreBandNumeric")))
//				System.out.println("Response validated for 'scoreBandNumeric' :"+factorsreponse.get("scoreBandNumeric") );
			
		}else {
			extentTest.log(LogStatus.FAIL,"Response for Total, Critical, Substantial & Moderate are -  failed"); 

		}
		
	}

	@SuppressWarnings("deprecation")
	public static boolean validateJsonDocument() throws JsonIOException, JsonSyntaxException, IOException, ParseException {
		JsonObject ReadJSONObj, CompareJSONObj;

		ReadJSONObj = (JsonObject) new JsonParser()
				.parse(new FileReader(rootPath + "/src/test/resources/Response.json"));

		CompareJSONObj = (JsonObject) new JsonParser()
				.parse(new FileReader(rootPath + "/src/test/resources/CompareResponse.json"));

		JsonParser parser = new JsonParser();
		JsonObject firstfile = ReadJSONObj;/* The response from API */
		JsonObject secondfile = CompareJSONObj; /* The response from our data file */

		
		ResponseKeyverification();
		JsonObject factorsreponse = (JsonObject) firstfile.get("factors");
		JsonObject comparefactorsreponse = (JsonObject) secondfile.get("factors");
		
		if (factorsreponse.equals(comparefactorsreponse) == true) {
			extentTest.log(LogStatus.PASS,"response matched: 'total' : " + factorsreponse.get("total"));
			extentTest.log(LogStatus.PASS,"response matched: 'critical' :  " + factorsreponse.get("critical"));
			extentTest.log(LogStatus.PASS,"response matched: 'substantial' :  " + factorsreponse.get("substantial"));
			extentTest.log(LogStatus.PASS,"response matched: 'moderate' :  " + factorsreponse.get("moderate"));
			if(factorsreponse.get("total").equals(comparefactorsreponse.get("total")))
				extentTest.log(LogStatus.PASS,"Response validated for 'Total' :"+factorsreponse.get("total") );
				
		}else {
			extentTest.log(LogStatus.FAIL,"API Response-  output failed"); 

		}
		
//		assertTrue(factorsreponse.equals(comparefactorsreponse));
//		assertTrue(firstfile.equals(secondfile));
//		

		if (firstfile.equals(secondfile)==true){  		
			extentTest.log(LogStatus.PASS,"Response validated against our expected data: Passed ");
			
			JsonArray  categoriesbody = (JsonArray) firstfile.get("categories");
			JsonObject obj1 = categoriesbody.get(0).getAsJsonObject();
			extentTest.log(LogStatus.PASS, ":categoriesbody content:" + obj1);
			
			for (int i = 0; i < obj1.size(); i++) {
				JsonObject categoriesnode = categoriesbody.get(i).getAsJsonObject();
				extentTest.log(LogStatus.PASS, i + ":  Categories node:" + categoriesnode);
			}
			
			
			JsonArray  Scenariosbody = (JsonArray) firstfile.get("scenarios");
			JsonObject obj2 = Scenariosbody.get(0).getAsJsonObject();
			extentTest.log(LogStatus.PASS,":Scenariosbody content:" + obj2);
			
			for (int i = 0; i < obj1.size(); i++) {
				JsonObject categoriesnode = Scenariosbody.get(i).getAsJsonObject();
				extentTest.log(LogStatus.PASS,i + ":  Scenarios node:" + categoriesnode);
			}	
			
			
			
            return true;  
        }else {
        	System.out.println("Response validated against our expected data: Failed ");
        	Assert.fail();
            
        }	
		
		
		return true;	


	}

//	public static void main(String[] args) throws Exception {
//		STUBODPPage ob = new STUBODPPage(driver);
//		String GetResponse = ob.ValidateAPIResponse();
//		WriteJSONResponse(GetResponse, "/src/test/resources/Response.json");
////		ob.readresponse();
//		validateJsonDocument();
//
//	}

}
