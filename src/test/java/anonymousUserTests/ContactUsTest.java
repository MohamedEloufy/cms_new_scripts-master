package anonymousUserTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import loginUserTests.TestBase;
import pages.P009_ContactUsPage;
import pages.P002_HomePage;

public class ContactUsTest extends TestBase{
	
	P002_HomePage homePageObject;
	P009_ContactUsPage contactUsObject;
	Faker fakeDate= new Faker();
	String name= fakeDate.name().fullName();
	String email= fakeDate.internet().emailAddress();
	String message= fakeDate.funnyName().name();
	String phone=fakeDate.phoneNumber().cellPhone();
	
	@Test()
	@Severity(SeverityLevel.CRITICAL)
	public void contactUs() throws InterruptedException {
		homePageObject = new P002_HomePage(driver);
		homePageObject.openContactUsPage();
		Thread.sleep(2000);
		contactUsObject =new P009_ContactUsPage(driver);
		Assert.assertEquals(driver.getTitle(), "Contact Us");
		Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://www.nagwa.com/en/contact/"));
		Assert.assertEquals(contactUsObject.title.getText(), "Contact Us");
		Assert.assertTrue(contactUsObject.map.isDisplayed());
		Assert.assertEquals(contactUsObject.contact_information_title.getText(), "Contact Information");
		Assert.assertTrue(contactUsObject.location_icon.isDisplayed());
		Assert.assertEquals(contactUsObject.nagwa_location.getText(), "Nagwa Limited, 1st Floor York House Sheet Street, Windsor, SL4 1DD, UK");
		Assert.assertTrue(contactUsObject.phone_icon.isDisplayed());
		Assert.assertEquals(contactUsObject.general_Enquiries_number.getText(), "+44 (0) 1753 832522");
		Assert.assertEquals(contactUsObject.sales_number.getText(), "+44 (0) 1753 874445");
		Assert.assertEquals(contactUsObject.customer_service_number.getText(), "+44 (0) 1753 832226");
		Assert.assertTrue(contactUsObject.message_icon.isDisplayed());
		Assert.assertEquals(contactUsObject.nagwa_mail.getText(), "nagwa@nagwa.com");
		contactUsObject.contactNagwa(name, email,phone, message);
		Assert.assertTrue(contactUsObject.alert_error.isDisplayed());
		Assert.assertEquals(contactUsObject.alert_error.getText(), "Please verify that you are not a robot.");
	}

}
