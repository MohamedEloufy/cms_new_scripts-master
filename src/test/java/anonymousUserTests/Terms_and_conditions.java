package anonymousUserTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import loginUserTests.TestBase;
import pages.P011_TermsAndConditionsPage;
import pages.P002_HomePage;

public class Terms_and_conditions extends TestBase {
	
	P002_HomePage home_page_object;
	P011_TermsAndConditionsPage term_and_condition_object;
	
	@Test
	@Severity(SeverityLevel.NORMAL)
	public void preview_of_term_and_conditions() 
	{
		home_page_object= new P002_HomePage(driver);
		home_page_object.open_term_and_conditions_page();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/terms/"));
		Assert.assertEquals(driver.getTitle(), "Terms and Conditions");
		term_and_condition_object= new P011_TermsAndConditionsPage(driver);
		Assert.assertTrue(term_and_condition_object.terms_and_Conditions_title.getText().contains("Terms and Conditions"));
		Assert.assertTrue(term_and_condition_object.about_us_article.isDisplayed());
		Assert.assertTrue(term_and_condition_object.definitions_Article.isDisplayed());
		Assert.assertTrue(term_and_condition_object.key_facts_article.isDisplayed());
		Assert.assertTrue(term_and_condition_object.general_term_of_use_article.isDisplayed());
		Assert.assertTrue(term_and_condition_object.registration_Obligations.isDisplayed());
		Assert.assertTrue(term_and_condition_object.member_Account_Password_and_Security.isDisplayed());
		Assert.assertTrue(term_and_condition_object.payment_Cancellation_andRenewal_article.isDisplayed());
	}

}
