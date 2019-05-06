package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import utilities.ExcelReader;


public class TestBase {

	public static WebDriver driver;
	public static Properties OR = new Properties();
	public static Properties Config = new Properties();
	public static FileInputStream fis;
	public static ExcelReader excel = new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\excel\\exceltestdata.xlsx");
	public static Logger log = Logger.getLogger("devpinoyLogger");

	public static WebDriverWait wait;
	public static WebElement dropdown;
	
	
	@BeforeSuite
	public void setUp() throws MalformedURLException {

		if (driver == null) {

			try {
				fis = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				Config.load(fis);
				log.debug("Config properties Loaded!!!");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				fis = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\OR.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				OR.load(fis);
				log.debug("OR Properties Loaded!!!");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (Config.getProperty("OS").equalsIgnoreCase("ANDROID")) {

				//Create  object  of DesiredCapabilities class
				  DesiredCapabilities capabilities = new DesiredCapabilities();
				  
				  capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
				  capabilities.setCapability("deviceName", Config.getProperty("DEVICE_NAME"));
				  capabilities.setCapability("platformVersion", Config.getProperty("PLATFORM_VERSION"));
				  capabilities.setCapability("platformName", Config.getProperty("PLATFORM_Name"));
				  capabilities.setCapability("appPackage", Config.getProperty("APP_PACKAGE")); //Set android app package capability names as:
				  capabilities.setCapability("appActivity", Config.getProperty("APP_ACTIVITY")); //Set app launch activity in capability names as:
				  
				  //Set Android driver in script to launch the app with appium server and port number as:
				  driver = new RemoteWebDriver(new URL(Config.getProperty("APIUM_URL")), capabilities);
				  // OR
				  //driver = new AndroidDriver(new URL(Config.getProperty("APIUM_URL")), capabilities);
				  
				  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			} 
			
			else if (Config.getProperty("OS").equals("iOS")) 
			{

				//Create  object  of DesiredCapabilities class
				  DesiredCapabilities capabilities = new DesiredCapabilities();
				  
				  capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
				  capabilities.setCapability("deviceName", Config.getProperty("DEVICE_NAME"));
				  capabilities.setCapability("platformVersion", Config.getProperty("PLATFORM_VERSION"));
				  capabilities.setCapability("platformName", Config.getProperty("PLATFORM_Name"));
				  capabilities.setCapability("appPackage", Config.getProperty("APP_PACKAGE")); //Set android app package capability names as:
				  capabilities.setCapability("appActivity", Config.getProperty("APP_ACTIVITY")); //Set app launch activity in capability names as:
				  
				  //Set Android driver in script to launch the app with appium server and port number as:
				  driver = new RemoteWebDriver(new URL(Config.getProperty("APIUM_URL")), capabilities);
				  // OR
				  //driver = new AndroidDriver(new URL(Config.getProperty("APIUM_URL")), capabilities);
				  
				  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			} 
			
		}
	}

	@AfterSuite
	public void tearDown() {

		driver.quit();
		log.debug("Test Execution Completed!!!");
	}

}
