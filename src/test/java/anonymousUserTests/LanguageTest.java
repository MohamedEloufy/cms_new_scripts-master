package anonymousUserTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import loginUserTests.TestBase;
import pages.P001_LanguagePage;

public class LanguageTest extends TestBase{
	
	P001_LanguagePage languagePageObject;
	
	
	@Test(priority = 4)
	@Severity(SeverityLevel.CRITICAL)
	public void openHomePageInEnglishLanguage() throws InterruptedException
	{
		languagePageObject = new P001_LanguagePage(driver);
		languagePageObject.openHomePageWithEnglishLanguage();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		//languagePageObject.removeCookie();
		Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://www.nagwa.com/en/"));
	
			
		
	}
	
	@Test(priority = 1)
	@Severity(SeverityLevel.CRITICAL)
	public void openHomePageInArabicLanguage() throws InterruptedException
	{
		languagePageObject = new P001_LanguagePage(driver);
		languagePageObject.openHomePageWithArabicLanguage();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		//languagePageObject.removeCookie();
		Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://www.nagwa.com/ar/"));
		driver.navigate().back();
	}
	
	@Test()
	@Severity(SeverityLevel.CRITICAL)
	public void openHomePageInSpanishLanguage() throws InterruptedException
	{
		languagePageObject = new P001_LanguagePage(driver);
		languagePageObject.openHomePageWithSpanishLanguage();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		languagePageObject.removeCookie();
		Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://www.nagwa.com/es/"));
		driver.navigate().back();
	}
	
	@Test(priority = 2)
	@Severity(SeverityLevel.CRITICAL)
	public void openHomePageInFrancaisLanguage() throws InterruptedException
	{
		languagePageObject = new P001_LanguagePage(driver);
		languagePageObject.openHomePageWithFrancaisLanguage();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		//languagePageObject.removeCookie();
		Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://www.nagwa.com/fr/"));
		driver.navigate().back();
	}
	
	@Test(priority = 3)
	@Severity(SeverityLevel.CRITICAL)
	public void openHomePageInPortugalLanguage() throws InterruptedException
	{
		languagePageObject = new P001_LanguagePage(driver);
		languagePageObject.openHomePageWithPortugalLanguage();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		//languagePageObject.removeCookie();
		Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://www.nagwa.com/pt/"));
		driver.navigate().back();
	}
	
	

}
