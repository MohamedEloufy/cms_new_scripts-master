package anonymousUserTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import loginUserTests.TestBase;
import pages.P008_AboutUsPage;
import pages.P002_HomePage;

public class AboutUsTest extends TestBase {

	
	P002_HomePage homepageobject;
	P008_AboutUsPage aboutuspageobject;
	
	@Test
	@Severity(SeverityLevel.MINOR)
	public void aboutUsTest() 
	{
		homepageobject= new P002_HomePage(driver);
		homepageobject.open_about_us_page();
		System.out.println(driver.getCurrentUrl());
		Assert.assertEquals(driver.getTitle(),"About Us");
		aboutuspageobject= new P008_AboutUsPage(driver);
		Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://www.nagwa.com/en/about/"));
		Assert.assertTrue(aboutuspageobject.image_in_about_us_page.isDisplayed());
		Assert.assertEquals(aboutuspageobject.about_us_title.getText(), "About Us");
		Assert.assertEquals(aboutuspageobject.paragraph_about_us.getText(), "Nagwa Limited is an educational technology startup with offices in Windsor, UK and in Cairo, Egypt. We have over 450 staff members who are working on creating digital educational products for students.");
		Assert.assertEquals(aboutuspageobject.mission_statement_title.getText(), "Mission Statement");
		Assert.assertEquals(aboutuspageobject.mission_statement_paragraph.getText(), "Our mission is to educate the world.");
		Assert.assertEquals(aboutuspageobject.vision_statement_title.getText(), "Vision Statement");
		Assert.assertEquals(aboutuspageobject.vision_statement_paragraph.getText(), "Our vision is to be a leader in digital education and an innovator at the intersection of education, technology, and design.");
		
	}
}
