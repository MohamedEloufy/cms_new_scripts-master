package anonymousUserTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import loginUserTests.TestBase;
import pages.P012_CareersPage;
import pages.P002_HomePage;

public class CareersTest extends TestBase{
	
	P002_HomePage homepageobject;
	P012_CareersPage careerspageobject;
	
	
	
	@Test(alwaysRun = true)
	@Severity(SeverityLevel.CRITICAL)
	public void opencareerspage() 
	{
		homepageobject= new P002_HomePage(driver);
		homepageobject.open_careers_page();
		Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://www.nagwa.com/en/careers/"));
	}
	
	@Test(priority = 1)
	@Severity(SeverityLevel.NORMAL)
	public void viewunitedkingdomcareers() throws InterruptedException 
	{
		careerspageobject= new P012_CareersPage(driver);
		careerspageobject.unitedKingdom();
		
	}
	@Test(priority = 2)
	@Severity(SeverityLevel.NORMAL)
	public void viewunitedstatecareers() throws InterruptedException 
	{
		homepageobject.open_careers_page();
		careerspageobject.unitedState();
		

		
	}
	
	@Test(priority = 3)
	public void viewegyptcareers() throws InterruptedException 
	{
		homepageobject.open_careers_page();
		careerspageobject.egypt();
		
	//	String windowhandle= driver.getWindowHandle();
	//	Set<String> handles=driver.getWindowHandles();
	//	handles=driver.getWindowHandles();
	//	for(String h : handles) 
	//	{
	//		if(!h.equals(windowhandle)) 
	//		{
	//			driver.switchTo().window(h);
	//		}
	//	}
		
	}
	
	
	

}
