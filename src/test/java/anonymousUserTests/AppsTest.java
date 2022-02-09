package anonymousUserTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import loginUserTests.TestBase;
import pages.P022B_AppStorePage;
import pages.P022_AppsPage;
import pages.P022A_GooglePlayPage;
import pages.P002_HomePage;

public class AppsTest extends TestBase{
	
	P002_HomePage homepageobject;
	
	P022_AppsPage appspageobject;
	
	P022A_GooglePlayPage googleplaypageobject;
	
	P022B_AppStorePage appstorepageobject;
	
	
	@Test(alwaysRun = true)
	@Severity(SeverityLevel.NORMAL)
	public void openAppsPages() 
	{
		homepageobject= new P002_HomePage(driver);
		homepageobject.open_apps_page();
		Assert.assertEquals(driver.getTitle(), "Nagwa Apps");
	}
	
	@Test(priority = 1, enabled = true,dependsOnMethods = {"openAppsPages"})
	@Severity(SeverityLevel.MINOR)
	public void downloadNagwaStudyFromGooglePlay() 
	{
		appspageobject= new P022_AppsPage(driver);
		appspageobject.opennagwastudyplaystore();
		googleplaypageobject=new P022A_GooglePlayPage(driver);
		Assert.assertTrue(driver.getTitle().contains("Nagwa Study"));
		driver.navigate().back();
		
	}
	@Test(priority = 2,enabled = true,dependsOnMethods = {"openAppsPages"})
	@Severity(SeverityLevel.MINOR)
	public void downloadNagwaStudyFromAppStore() 
	{
		
		appspageobject.opennagwastudyappstore();
		appstorepageobject= new P022B_AppStorePage(driver);
		Assert.assertTrue(driver.getTitle().contains("Nagwa Study"));
		driver.navigate().back();
	}

	@Test(priority =3, enabled = true,dependsOnMethods = {"openAppsPages"})
	@Severity(SeverityLevel.MINOR)
	public void downloadNagwaStudioFromAppStore() 
	{
		
		appspageobject.opennagwastudio();
		Assert.assertTrue(driver.getTitle().contains("Nagwa Studio"));
		driver.navigate().back();
		
	}
	@Test(priority = 4,enabled = true,dependsOnMethods  = {"openAppsPages"})
	@Severity(SeverityLevel.MINOR)
	public void downloadNagwaStudioFromGooglePlay() 
	{
		appspageobject.openNagwaStudioGoogleplay();
		Assert.assertTrue(driver.getTitle().contains("Nagwa Studio"));
		driver.navigate().back();
	}
	
	@Test(priority = 5,enabled = true,dependsOnMethods = {"openAppsPages"})
	@Severity(SeverityLevel.MINOR)
	public void downloadNagwaconnectorforeducatoresappstore() 
	{
		appspageobject.openNagwaConnectorforeducatorsappstore();
		Assert.assertTrue(driver.getTitle().contains("Nagwa Connect"));
		driver.navigate().back();
	}

	@Test(priority = 6,enabled = true,dependsOnMethods = {"openAppsPages"})
	@Severity(SeverityLevel.MINOR)
	public void downloadNagwaconnectorforeducatoresgoogleplay() 
	{
		appspageobject.openNagwaConnectorforeducatoregoogleplay();
		Assert.assertTrue(driver.getTitle().contains("Nagwa Connect"));
		driver.navigate().back();

	}
	@Test(priority = 7, enabled = true,dependsOnMethods = {"openAppsPages"})
	@Severity(SeverityLevel.MINOR)
	public void downloadNagwaconnectorforstudentappstore() 
	{
		appspageobject.openNagwaconnectorforstudentappstore();
		Assert.assertTrue(driver.getTitle().contains("Nagwa Connect"));
		driver.navigate().back();
	}
	@Test(priority = 8,enabled = true,dependsOnMethods = {"openAppsPages"})
	@Severity(SeverityLevel.MINOR)
	public void downloadNagwaconnectorforstudentgoogleplay() 
	{
		appspageobject.openNagwaConnectorforstudentgoogleplay();
		Assert.assertTrue(driver.getTitle().contains("Nagwa Connect"));
		driver.navigate().back();
	}
}
