package loginUserTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pages.P002_HomePage;
import pages.P006_SignInPage;

public class SignIn extends TestBase {
	
	
	P002_HomePage homepageobject;
	P006_SignInPage signinobject;
	
	
	String uname="48b6d";
	String pword="123456";
	
	
	@Test
	@Severity(SeverityLevel.BLOCKER)
	public void userCanSigiIn() 
	{
		
		homepageobject= new P002_HomePage(driver);
		homepageobject.open_SignIn_Page();
		signinobject= new P006_SignInPage(driver);
		signinobject.user_Can_Sign_In(uname, pword);
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Dashboard");
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/"));
		
		
		
    }
	
	
	
}