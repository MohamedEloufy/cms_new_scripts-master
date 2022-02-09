package anonymousUserTests;


import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import loginUserTests.TestBase;
import pages.P010_PrivacyPolicyPage;
import pages.P002_HomePage;

public class PrivacyPolicyTest extends TestBase{
	
	P002_HomePage homePageObject;
	P010_PrivacyPolicyPage privacyPolicyPageObject;
	
	
	@Test()
	@Severity(SeverityLevel.MINOR)
	public void privacyTest()
	{
		homePageObject = new P002_HomePage(driver);
		homePageObject.open_privacy_policy_page();
		Assert.assertTrue(driver.getTitle().contains("Privacy Policy"));
		privacyPolicyPageObject =new P010_PrivacyPolicyPage(driver);
		Assert.assertTrue(privacyPolicyPageObject.privacy_Policy_title.getText().contains("Privacy"));
		Assert.assertTrue(privacyPolicyPageObject.privacy_policy_article.getText().contains("We at Nagwa know that you care about how your personal information is used and shared, and we take your privacy seriously."));
		Assert.assertTrue(privacyPolicyPageObject.what_does_this_policy_cover_article.getText().contains("What does this Policy Cover"));
		Assert.assertTrue(privacyPolicyPageObject.our_Commitment_article.getText().contains("Our Commitment"));
		Assert.assertTrue(privacyPolicyPageObject.data_sharing_article.getText().contains("Data Sharing"));
		Assert.assertTrue(privacyPolicyPageObject.personal_Information_that_Nagwa_Collects_and_Stores_article.getText().contains("Personal Information that Nagwa Collects and Stores"));
		Assert.assertTrue(privacyPolicyPageObject.anonymous_data_Collection_Using_Third_Party_Analytic_Services_article.getText().contains("Anonymous Data Collection Using Third-Party Analytic Services"));
		Assert.assertTrue(privacyPolicyPageObject.cookies_article.getText().contains("Cookies"));
		Assert.assertTrue(privacyPolicyPageObject.nagwa_Data_Controllers_Data_Processors_article.getText().contains("Nagwa Data Controllers & Data Processors"));
		Assert.assertTrue(privacyPolicyPageObject.right_to_be_Forgotten_article.getText().contains("Right to be Forgotten"));
		Assert.assertTrue(privacyPolicyPageObject.right_to_Request_Personal_Data_article.getText().contains("Right to Request Personal Data"));
		Assert.assertTrue(privacyPolicyPageObject.updating_or_Correcting_Personal_Information_article.getText().contains("Updating or Correcting Personal Information"));
		
		
	}

}
