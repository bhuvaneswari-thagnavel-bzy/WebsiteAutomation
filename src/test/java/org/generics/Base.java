package org.generics;

import java.io.FileInputStream;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;



public class Base {

	
	static
	{
//		System.setProperty(CHROME_KEY,CHROME_VALUE);
//		implements IAutoConstant
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/driver/chromedriver.exe");
//		System.setProperty(GECKO_KEY,GECKO_VALUE);
	}
	
	public static WebDriver driver;
	
	public static ExtentReports extentReports;
	
	public static ExtentTest extentTest;
	
	public static Properties prop;
	
	public static FileInputStream fis;
	
	public static long ITO = 20;
	public static  long ETO = 20;
	public static  long MTO = 108000;
	
	public static String excelPath = "./data/data.xlsx";
	public static String photoPath = "./ScreenShots/";
}
