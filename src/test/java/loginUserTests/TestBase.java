package loginUserTests;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import utilities.Helper;

public class TestBase {

	public static WebDriver driver ;



	@SuppressWarnings("deprecation")
	@BeforeSuite
	@Parameters({"browser"})
	@Severity(SeverityLevel.BLOCKER)
	@Link(name = "nagwa.com",url = "https://www.nagwa.com")
	public void startDriver(@Optional("chrome")String browsername) throws InterruptedException 
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
			driver=new ChromeDriver(chromeOptions());
		}
		else if (browsername.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("chrome-headless")) 
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
			ChromeOptions options= new ChromeOptions();
			options.addArguments("--headless");
			options.addArguments("window-size=1920,1080");
			driver= new ChromeDriver(options);
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.navigate().to("https://www.nagwa.com/");



	}

	@AfterMethod
	public void screenshotFailure(ITestResult results) 
	{
		if (results.getStatus()==ITestResult.FAILURE)
		{
			System.out.println("fail......!");
			System.out.println("taking screenshot........");
			Helper.captureScreenshotOnFailure(driver, results.getName());
		}

	}

	@AfterSuite
	public void closeDriver() 
	{
		driver.quit();

	}

	// used to download files we lazem a7otha fel initiation bta3 el driver 
	public static String downloadpath=System.getProperty("user.dir")+"\\downloads";

	public static ChromeOptions chromeOptions() 
	{
		ChromeOptions options= new ChromeOptions();
		HashMap<String, Object> chromePrefs= new HashMap<String, Object>();
		chromePrefs.put("profile.default.content_settings.popus", 0);
		chromePrefs.put("download.default_directory", downloadpath);
		options.setExperimentalOption("prefs", chromePrefs);
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		return options;

	}

}
