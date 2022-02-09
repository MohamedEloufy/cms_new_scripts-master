package anonymousUserTests;

import org.testng.annotations.Test;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import loginUserTests.TestBase;
import pages.P020_ExamsPage;
import pages.P002_HomePage;

public class ExamsTest extends TestBase{

	P002_HomePage homepageobject;
	
	P020_ExamsPage examesbeforesigninpageobject;
	
	@Test(alwaysRun = true)
	@Severity(SeverityLevel.CRITICAL)
	public void openExamesPage() throws InterruptedException 
	{
		homepageobject= new P002_HomePage(driver);
		homepageobject.open_Exams_Page();
		Thread.sleep(1000);
	}
	
	
	
	@Test(dependsOnMethods = {"openExamesPage"})
	@Severity(SeverityLevel.CRITICAL)
	public void openlinksinsidegrades() throws InterruptedException 
	{
		examesbeforesigninpageobject= new P020_ExamsPage(driver);
		examesbeforesigninpageobject.changecountrytoegypt();
		examesbeforesigninpageobject.openlinks();
		//examesbeforesigninpageobject.changecountrytoUnitedKingdom();
		//examesbeforesigninpageobject.openlinks();
		//examesbeforesigninpageobject.changecountrytoUnitedStates();
		//examesbeforesigninpageobject.openlinks();
		//examesbeforesigninpageobject.changecountrytoegypt();
	}
	
	
	
}
