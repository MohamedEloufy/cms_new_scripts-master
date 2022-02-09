package anonymousUserTests;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import loginUserTests.TestBase;
import pages.*;


public class PortalsTest extends TestBase {
	P002_HomePage homepageObject;
	P004_PortalsPage portalPageObject;
	PortalPricingPage portalPricingPageObject;
	P004A_GetYourPortalStepOnePage getYourPortalStepOnePageObject;
	P004B_GetYourPortalStepTwoPage p004BGetYourPortalStepTwoPageObject;
	P004C_GetYourPortalStepThreePage p004CGetYourPortalStepThreePageObject;
	P004D_GetYourPortalStepFourPage p004DGetYourPortalStepFourPageObject;
	Faker faker=new Faker();
	String fName=faker.name().firstName();
	String lName=faker.name().lastName();
	String phoneNumber=faker.phoneNumber().cellPhone();
	String password=faker.internet().password();
	String portalName="EloufyTesting";
	String suffix="ronaldo";



	@Test
	@Severity(SeverityLevel.CRITICAL)
	public void changeCountryToUnitedKingdom() throws InterruptedException {
		homepageObject = new P002_HomePage(driver);
		homepageObject.countryList();
		homepageObject.change_country_to_United_Kingdom();
		Thread.sleep(1000);


	}

	@Test(priority = 1)
	@Severity(SeverityLevel.CRITICAL)
	public void openPortalPage()
	{
		homepageObject.open_Portal_Page();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.nagwa.com/en/uk/portals/");
		portalPageObject= new P004_PortalsPage(driver);
		Assert.assertEquals(portalPageObject.nagwa_portals_title.getText(),"Nagwa Portals");
		Assert.assertEquals(portalPageObject.nagwa_portal_paragraph.getText(), "A Nagwa Portal is a fantastically cost-effective online educational platform with achievement boosting analytical tools, a brilliant virtual classroom, and an ever-expanding set of outstanding learning resources.");
		Assert.assertEquals(portalPageObject.customized_Content_title.getText(), "Customized Content");
		Assert.assertTrue(portalPageObject.courses_icon_inside_customized_content.isDisplayed());
		Assert.assertTrue(portalPageObject.videos_icon_inside_customized_content.isDisplayed());
		Assert.assertTrue(portalPageObject.questions_icon_inside_customized_content.isDisplayed());
		Assert.assertTrue(portalPageObject.lesson_icon_inside_customized_content.isDisplayed());
		Assert.assertTrue(portalPageObject.worksheet_icon_inside_customized_content.isDisplayed());
		Assert.assertEquals(portalPageObject.testimonials_title.getText(), "Testimonials");
		Assert.assertEquals(portalPageObject.testimonials_paragraph.getText(), "Nagwa makes learning more exciting, and it improves students’ understanding of questions by using different forms of solutions. It helps them enjoy their lessons and encourages them to practice more.");
		
	}
	
	
	@Test(priority = 2)
	@Severity(SeverityLevel.NORMAL)
	public void viewPortalPage() throws InterruptedException
	{
		portalPageObject = new P004_PortalsPage(driver);
		portalPageObject.play_portal_video();
	}
	
	@Test(priority = 3)
	@Severity(SeverityLevel.NORMAL)
	public void preview_testimonials() throws InterruptedException 
	{
		portalPageObject.testimonials_preview();
	}

	@Test(priority = 4)
	@Severity(SeverityLevel.CRITICAL)
	public void openPortalPricePage()
	{
	portalPageObject.open_portal_pricing_page();
	portalPricingPageObject= new PortalPricingPage(driver);
	Assert.assertTrue(portalPricingPageObject.pageTitle.isDisplayed());
	Assert.assertEquals(portalPricingPageObject.pageTitle.getText(),"Pricing");
	Assert.assertEquals(driver.getCurrentUrl(),"https://www.nagwa.com/en/uk/pricing/");




	}
	@Test(priority = 5)
	@Severity(SeverityLevel.BLOCKER)
	public void openGetYourPortalIndividual() throws InterruptedException {
		portalPricingPageObject.getYourPortalIndividual();
	}

	@Test(priority = 6)
	@Severity(SeverityLevel.CRITICAL)
	public void portalStepOne() throws InterruptedException {
		driver.navigate().to("https://www.fakemail.net/");
		String emailValue=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]")).getText();
		driver.navigate().back();
		getYourPortalStepOnePageObject=new P004A_GetYourPortalStepOnePage(driver);
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.nagwa.com/en/uk/portals/payment/step_1/");
		Assert.assertEquals(getYourPortalStepOnePageObject.pageTitle.getText(),"Step 1: Account Information");
		Assert.assertTrue(getYourPortalStepOnePageObject.paymentStepOneGraph.isDisplayed());
		getYourPortalStepOnePageObject.fillTheFormOfStepOne(fName,lName,phoneNumber,emailValue,password);

	}
	@Test(priority = 7)
	@Severity(SeverityLevel.CRITICAL)
	public void portalStepTwo() throws InterruptedException {
		p004BGetYourPortalStepTwoPageObject =new P004B_GetYourPortalStepTwoPage(driver);
		Assert.assertTrue(p004BGetYourPortalStepTwoPageObject.pageTitleStep2.isDisplayed());
		Assert.assertTrue(p004BGetYourPortalStepTwoPageObject.paymentStepTwoGraph.isDisplayed());
		p004BGetYourPortalStepTwoPageObject.addStudent();
		p004BGetYourPortalStepTwoPageObject.subStudent();
		p004BGetYourPortalStepTwoPageObject.moveToStepThree();


	}
	@Test(priority = 8)
	@Severity(SeverityLevel.CRITICAL)
	public void portalStepThree() throws InterruptedException {
		p004CGetYourPortalStepThreePageObject=new P004C_GetYourPortalStepThreePage(driver);
		Assert.assertTrue(p004CGetYourPortalStepThreePageObject.pageTitleStepThree.isDisplayed());
		Assert.assertTrue(p004CGetYourPortalStepThreePageObject.stepThreeGraph.isDisplayed());
		p004CGetYourPortalStepThreePageObject.fillTheFormOnStepThree(portalName,suffix);



	}
	@Test(priority = 9)
	@Severity(SeverityLevel.CRITICAL)
	public void portalStepFour() throws InterruptedException {
		p004DGetYourPortalStepFourPageObject=new P004D_GetYourPortalStepFourPage(driver);
		Assert.assertTrue(p004DGetYourPortalStepFourPageObject.pageTitleStep4.isDisplayed());
		Assert.assertTrue(p004DGetYourPortalStepFourPageObject.step4Graph.isDisplayed());
		p004DGetYourPortalStepFourPageObject.processThePay();
		Thread.sleep(3000);
        driver.navigate().back();
        p004DGetYourPortalStepFourPageObject.homePage();
	}
	
	
	
	
}
