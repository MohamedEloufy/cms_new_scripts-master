package anonymousUserTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import loginUserTests.TestBase;
import pages.P002_HomePage;
import pages.P007_SearchPage;

public class SearchForLessonTest extends TestBase {

	
	
	P002_HomePage homePageObject;
	P007_SearchPage searchPageObject;
	
	@Test(alwaysRun = true)
	@Severity(SeverityLevel.CRITICAL)
	public void searchForSubject() 
	{
	
		homePageObject =new P002_HomePage(driver);
		homePageObject.search_For_Lesson("math");
		System.out.println(driver.getCurrentUrl());
		Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://www.nagwa.com/en/search/?q=math"));
		Assert.assertTrue(homePageObject.searchResultTitle.getText().contains("results"));
	}
	
	@Test(dependsOnMethods = {"searchForSubject"})
	@Severity(SeverityLevel.CRITICAL)
	public void openResultAndCheckContent() throws InterruptedException
	{
		searchPageObject = new P007_SearchPage(driver);
		
		searchPageObject.open_third_result();
		Assert.assertTrue(searchPageObject.worksheet_content.isDisplayed());
		
		searchPageObject.view_worksheet();
		
		
		
		
	}
	
}
