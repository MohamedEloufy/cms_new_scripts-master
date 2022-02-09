package anonymousUserTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import loginUserTests.TestBase;
import pages.P002_HomePage;
import pages.P005_UserGuidePage;

public class UserGuideTest extends TestBase{

	P002_HomePage homepageobject;
	
	P005_UserGuidePage usergiudepageobject;
	
	@Test(alwaysRun = true)
	@Severity(SeverityLevel.CRITICAL)
	public void openusergiudepage() 
	{
		homepageobject= new P002_HomePage(driver);
		homepageobject.openUserGuIdePage();
		
	}
	
	@Test(priority = 1,dependsOnMethods = {"openusergiudepage"})
	@Severity(SeverityLevel.MINOR)
	public void openAdminVideos1() throws InterruptedException 
	{
		usergiudepageobject= new P005_UserGuidePage(driver);
		usergiudepageobject.openAdminVideos1();
		Assert.assertTrue(usergiudepageobject.video.isDisplayed());
		
		homepageobject.openUserGuIdePage();
	}
	
	@Test(priority = 2,dependsOnMethods = {"openusergiudepage"})
	@Severity(SeverityLevel.MINOR)
	public void openAdminVideos2() throws InterruptedException 
	{
		usergiudepageobject= new P005_UserGuidePage(driver);
		usergiudepageobject.openAdminVideos2();
		Assert.assertTrue(usergiudepageobject.video.isDisplayed());
		
		homepageobject.openUserGuIdePage();
	}
	
	@Test(priority = 3,dependsOnMethods = {"openusergiudepage"})
	@Severity(SeverityLevel.MINOR)
	public void openAdminVideos3() throws InterruptedException  
	{
		usergiudepageobject= new P005_UserGuidePage(driver);
		usergiudepageobject.openAdminVideos3();
		Assert.assertTrue(usergiudepageobject.video.isDisplayed());
		
		homepageobject.openUserGuIdePage();
	}
	
	@Test(enabled = false,priority = 4,dependsOnMethods = {"openusergiudepage"})
	@Severity(SeverityLevel.MINOR)
	public void openAdminVideos4() throws InterruptedException 
	{
		usergiudepageobject= new P005_UserGuidePage(driver);
		usergiudepageobject.openAdminVideos4();
		Assert.assertTrue(usergiudepageobject.video.isDisplayed());

		homepageobject.openUserGuIdePage();
	}
	
	@Test(enabled = false,priority = 5,dependsOnMethods = {"openusergiudepage"})
	@Severity(SeverityLevel.MINOR)
	public void openAdminVideos5() throws InterruptedException 
	{
		usergiudepageobject= new P005_UserGuidePage(driver);
		usergiudepageobject.openAdminVideos5();
		Assert.assertTrue(usergiudepageobject.video.isDisplayed());
		
		homepageobject.openUserGuIdePage();
	}
	
	@Test(enabled = false,priority = 6,dependsOnMethods = {"openusergiudepage"})
	@Severity(SeverityLevel.MINOR)
	public void openAdminVideos6() throws InterruptedException 
	{
		usergiudepageobject= new P005_UserGuidePage(driver);
		usergiudepageobject.openAdminVideos6();
		Assert.assertTrue(usergiudepageobject.video.isDisplayed());
		
		homepageobject.openUserGuIdePage();
	}
	
	@Test(enabled = false,priority = 7,dependsOnMethods = {"openusergiudepage"})
	@Severity(SeverityLevel.MINOR)
	public void openAdminVideos7() throws InterruptedException 
	{
		usergiudepageobject= new P005_UserGuidePage(driver);
		usergiudepageobject.openAdminVideos7();
		Assert.assertTrue(usergiudepageobject.video.isDisplayed());
		
		homepageobject.openUserGuIdePage();
	}
	
	@Test(enabled = false,priority = 8,dependsOnMethods = {"openusergiudepage"})
	@Severity(SeverityLevel.MINOR)
	public void openAdminVideos8() throws InterruptedException 
	{
		usergiudepageobject= new P005_UserGuidePage(driver);
		usergiudepageobject.openAdminVideos8();
		Assert.assertTrue(usergiudepageobject.video.isDisplayed());
		
		homepageobject.openUserGuIdePage();
	}
	
	@Test(enabled = false,priority = 9,dependsOnMethods = {"openusergiudepage"})
	@Severity(SeverityLevel.MINOR)
	public void openAdminVideos9() throws InterruptedException 
	{
		usergiudepageobject= new P005_UserGuidePage(driver);
		usergiudepageobject.openAdminVideos9();
		Assert.assertTrue(usergiudepageobject.video.isDisplayed());
		
		homepageobject.openUserGuIdePage();
	}
	
	@Test(enabled = false,priority = 10,dependsOnMethods = {"openusergiudepage"})
	@Severity(SeverityLevel.MINOR)
	public void openAdminVideos10() throws InterruptedException 
	{
		usergiudepageobject= new P005_UserGuidePage(driver);
		usergiudepageobject.openAdminVideos10();
		Assert.assertTrue(usergiudepageobject.video.isDisplayed());
		
		homepageobject.openUserGuIdePage();
	}
	
	@Test(enabled = false,priority = 11,dependsOnMethods = {"openusergiudepage"})
	@Severity(SeverityLevel.MINOR)
	public void openAdminVideos11() throws InterruptedException 
	{
		usergiudepageobject= new P005_UserGuidePage(driver);
		usergiudepageobject.openAdminVideos11();
		Assert.assertTrue(usergiudepageobject.video.isDisplayed());
		
		homepageobject.openUserGuIdePage();
	}
	
	@Test(enabled = false,priority = 12,dependsOnMethods = {"openusergiudepage"})
	@Severity(SeverityLevel.MINOR)
	public void openEducatorsVideos1() throws InterruptedException 
	{
		usergiudepageobject= new P005_UserGuidePage(driver);
		usergiudepageobject.openEducatorsVideos1();
		Assert.assertTrue(usergiudepageobject.video.isDisplayed());
		
		homepageobject.openUserGuIdePage();
	}
	
	@Test(enabled = false,priority = 13,dependsOnMethods = {"openusergiudepage"})
	@Severity(SeverityLevel.MINOR)
	public void openEducatorsVideos2() throws InterruptedException 
	{
		usergiudepageobject= new P005_UserGuidePage(driver);
		usergiudepageobject.openEducatorsVideos2();
		Assert.assertTrue(usergiudepageobject.video.isDisplayed());
		
		homepageobject.openUserGuIdePage();
	}
	
	@Test(enabled = false,priority = 14,dependsOnMethods = {"openusergiudepage"})
	@Severity(SeverityLevel.MINOR)
	public void openEducatorsVideos3() throws InterruptedException 
	{
		usergiudepageobject= new P005_UserGuidePage(driver);
		usergiudepageobject.openEducatorsVideos3();
		Assert.assertTrue(usergiudepageobject.video.isDisplayed());
		
		homepageobject.openUserGuIdePage();
	}
	
	@Test(enabled = false,priority = 15,dependsOnMethods = {"openusergiudepage"})
	@Severity(SeverityLevel.MINOR)
	public void openEducatorsVideos4() throws InterruptedException 
	{
		usergiudepageobject= new P005_UserGuidePage(driver);
		usergiudepageobject.openEducatorsVideos4();
		Assert.assertTrue(usergiudepageobject.video.isDisplayed());
		
		homepageobject.openUserGuIdePage();
	}
	
	@Test(enabled = false,priority = 16,dependsOnMethods = {"openusergiudepage"})
	@Severity(SeverityLevel.MINOR)
	public void openEducatorsVideos5() throws InterruptedException 
	{
		usergiudepageobject= new P005_UserGuidePage(driver);
		usergiudepageobject.openEducatorsVideos5();
		Assert.assertTrue(usergiudepageobject.video.isDisplayed());
		
		homepageobject.openUserGuIdePage();
	}
	
	@Test(enabled = false,priority = 17,dependsOnMethods = {"openusergiudepage"})
	@Severity(SeverityLevel.MINOR)
	public void openEducatorsVideos6() throws InterruptedException 
	{
		usergiudepageobject= new P005_UserGuidePage(driver);
		usergiudepageobject.openEducatorsVideos6();
		Assert.assertTrue(usergiudepageobject.video.isDisplayed());
		
		homepageobject.openUserGuIdePage();
	}
	
	@Test(enabled = false,priority = 18,dependsOnMethods = {"openusergiudepage"})
	@Severity(SeverityLevel.MINOR)
	public void openEducatorsVideos7() throws InterruptedException 
	{
		usergiudepageobject= new P005_UserGuidePage(driver);
		usergiudepageobject.openEducatorsVideos7();
		Assert.assertTrue(usergiudepageobject.video.isDisplayed());
		
		homepageobject.openUserGuIdePage();
	}
	
	@Test(enabled = false,priority = 19,dependsOnMethods = {"openusergiudepage"})
	@Severity(SeverityLevel.MINOR)
	public void openEducatorsVideos8() throws InterruptedException 
	{
		usergiudepageobject= new P005_UserGuidePage(driver);
		usergiudepageobject.openEducatorsVideos8();
		Assert.assertTrue(usergiudepageobject.video.isDisplayed());
		
		homepageobject.openUserGuIdePage();
	}
	
	@Test(enabled = false,priority = 20,dependsOnMethods = {"openusergiudepage"})
	@Severity(SeverityLevel.MINOR)
	public void openEducatorsVideos9() throws InterruptedException 
	{
		usergiudepageobject= new P005_UserGuidePage(driver);
		usergiudepageobject.openEducatorsVideos9();
		Assert.assertTrue(usergiudepageobject.video.isDisplayed());
		
		homepageobject.openUserGuIdePage();
	}
	
	@Test(enabled = false,priority = 21,dependsOnMethods = {"openusergiudepage"})
	@Severity(SeverityLevel.MINOR)
	public void openEducatorsVideos10() throws InterruptedException 
	{
		usergiudepageobject= new P005_UserGuidePage(driver);
		usergiudepageobject.openEducatorsVideos10();
		Assert.assertTrue(usergiudepageobject.video.isDisplayed());
		
		homepageobject.openUserGuIdePage();
	}
	
	@Test(enabled = false,priority = 22,dependsOnMethods = {"openusergiudepage"})
	@Severity(SeverityLevel.MINOR)
	public void openstudentVideos1() throws InterruptedException 
	{
		usergiudepageobject= new P005_UserGuidePage(driver);
		usergiudepageobject.openStudentVideos1();
		Assert.assertTrue(usergiudepageobject.video.isDisplayed());
		
		homepageobject.openUserGuIdePage();
	}
	
	@Test(enabled = false,priority = 23,dependsOnMethods = {"openusergiudepage"})
	@Severity(SeverityLevel.MINOR)
	public void openstudentVideos2() throws InterruptedException 
	{
		usergiudepageobject= new P005_UserGuidePage(driver);
		usergiudepageobject.openStudentVideos2();
		Assert.assertTrue(usergiudepageobject.video.isDisplayed());
		
		homepageobject.openUserGuIdePage();
	}
	
	@Test(enabled = false,priority = 24,dependsOnMethods = {"openusergiudepage"})
	@Severity(SeverityLevel.MINOR)
	public void openstudentVideos3() throws InterruptedException 
	{
		usergiudepageobject= new P005_UserGuidePage(driver);
		usergiudepageobject.openStudentVideos3();
		Assert.assertTrue(usergiudepageobject.video.isDisplayed());
		
		homepageobject.openUserGuIdePage();
	}
	
	@Test(enabled = false,priority = 25,dependsOnMethods = {"openusergiudepage"})
	@Severity(SeverityLevel.MINOR)
	public void openstudentVideos4() throws InterruptedException 
	{
		usergiudepageobject= new P005_UserGuidePage(driver);
		usergiudepageobject.openStudentVideos4();
		Assert.assertTrue(usergiudepageobject.video.isDisplayed());
		
		homepageobject.openUserGuIdePage();
	}
	
	@Test(enabled = false,priority = 26,dependsOnMethods = {"openusergiudepage"})
	@Severity(SeverityLevel.MINOR)
	public void openstudentVideos5() throws InterruptedException 
	{
		usergiudepageobject= new P005_UserGuidePage(driver);
		usergiudepageobject.openStudentVideos5();
		Assert.assertTrue(usergiudepageobject.video.isDisplayed());
		
		homepageobject.openUserGuIdePage();
	}
	
	@Test(enabled = false,priority = 27,dependsOnMethods = {"openusergiudepage"})
	@Severity(SeverityLevel.MINOR)
	public void openstudentVideos6() throws InterruptedException 
	{
		usergiudepageobject= new P005_UserGuidePage(driver);
		usergiudepageobject.openStudentVideos6();
		Assert.assertTrue(usergiudepageobject.video.isDisplayed());
		
		homepageobject.openUserGuIdePage();
	}
	
	
}
