package anonymousUserTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import loginUserTests.TestBase;
import pages.P003_GradesPage;
import pages.P002_HomePage;

public class GradesTest extends TestBase{
	
	P002_HomePage homePageObject;
	
	P003_GradesPage gradesPageObject;
	
	

	@Test(priority = 1)
	@Severity(SeverityLevel.NORMAL)
	public void open_egypt_grade() throws InterruptedException 
	{
		homePageObject = new P002_HomePage(driver);
		homePageObject.countryList();
		homePageObject.change_country_to_egypt();
		Thread.sleep(2000);
		homePageObject.open_Grades_Page();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/eg/"));
		gradesPageObject = new P003_GradesPage(driver);
		Assert.assertEquals(gradesPageObject.country_name.getText(),"Egypt");
		gradesPageObject.open_grade_one();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/eg/grades/1/"));
		driver.navigate().back();
		gradesPageObject.open_grade_two();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/eg/grades/2/"));
	    gradesPageObject.click_on_nagwa_logo();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/"));
		
	}
	
	
	@Test(priority = 2)
	@Severity(SeverityLevel.NORMAL)
	public void open_france_grade() throws InterruptedException 
	{
		homePageObject = new P002_HomePage(driver);
		homePageObject.countryList();
		homePageObject.change_country_to_france();
		Thread.sleep(2000);
		homePageObject.open_Grades_Page();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/fr/"));
		gradesPageObject = new P003_GradesPage(driver);
		Assert.assertEquals(gradesPageObject.country_name.getText(),"France");
		gradesPageObject.open_grade_one();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/fr/grades/1/"));
		driver.navigate().back();
		gradesPageObject.open_grade_two();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/fr/grades/2/"));
		gradesPageObject.click_on_nagwa_logo();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/"));
		
	
	}
	@Test(priority = 3)
	@Severity(SeverityLevel.CRITICAL)
	public void open_india_grade() throws InterruptedException  
	{
		homePageObject = new P002_HomePage(driver);
		homePageObject.countryList();
		homePageObject.change_country_to_india();
		Thread.sleep(2000);
		homePageObject.open_Grades_Page();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/in/"));
		gradesPageObject = new P003_GradesPage(driver);
		Assert.assertEquals(gradesPageObject.country_name.getText(),"India");
		gradesPageObject.open_grade_one();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/in/grades/1/"));
		driver.navigate().back();
		gradesPageObject.open_grade_two();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/in/grades/2/"));
		gradesPageObject.click_on_nagwa_logo();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/"));
		
	
	}
	
	@Test(priority = 4)
	@Severity(SeverityLevel.CRITICAL)
	public void open_iraq_grade() throws InterruptedException  
	{
		homePageObject = new P002_HomePage(driver);
		homePageObject.countryList();
		homePageObject.change_country_to_iraq();
		Thread.sleep(2000);
		homePageObject.open_Grades_Page();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/iq/"));
		gradesPageObject = new P003_GradesPage(driver);
		Assert.assertEquals(gradesPageObject.country_name.getText(),"Iraq");
		gradesPageObject.open_grade_one();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/iq/grades/1/"));
		driver.navigate().back();
		gradesPageObject.open_grade_two();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/iq/grades/2/"));
		gradesPageObject.click_on_nagwa_logo();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/"));
		
	}
	@Test(priority = 5)
	@Severity(SeverityLevel.CRITICAL)
	public void open_jamaica_grade() throws InterruptedException 
	{
		homePageObject = new P002_HomePage(driver);
		homePageObject.countryList();
		homePageObject.change_country_to_jamaica();
		Thread.sleep(2000);
		homePageObject.open_Grades_Page();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/jm/"));
		gradesPageObject = new P003_GradesPage(driver);
		Assert.assertEquals(gradesPageObject.country_name.getText(),"Jamaica");
		gradesPageObject.open_grade_one();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/jm/grades/1/"));
		driver.navigate().back();
		gradesPageObject.open_grade_two();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/jm/grades/2/"));
		gradesPageObject.click_on_nagwa_logo();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/"));
		
	}
	@Test(priority = 6)
	@Severity(SeverityLevel.CRITICAL)
	public void open_jordan_grade() throws InterruptedException  
	{
		homePageObject = new P002_HomePage(driver);
		homePageObject.countryList();
		homePageObject.change_country_to_jordan();
		Thread.sleep(2000);
		homePageObject.open_Grades_Page();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/jo/"));
		gradesPageObject = new P003_GradesPage(driver);
		Assert.assertEquals(gradesPageObject.country_name.getText(),"Jordan");
		gradesPageObject.open_grade_one();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/jo/grades/1/"));
		driver.navigate().back();
		gradesPageObject.open_grade_two();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/jo/grades/2/"));
		gradesPageObject.click_on_nagwa_logo();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/"));
		
	}
	@Test(priority = 7)
	@Severity(SeverityLevel.CRITICAL)
	public void open_kuwait_grade() throws InterruptedException  
	{
		homePageObject = new P002_HomePage(driver);
		homePageObject.countryList();
		homePageObject.change_country_to_kuwait();
		Thread.sleep(2000);
		homePageObject.open_Grades_Page();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/kw/"));
		gradesPageObject = new P003_GradesPage(driver);
		Assert.assertEquals(gradesPageObject.country_name.getText(),"Kuwait");
		gradesPageObject.open_grade_one();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/kw/grades/1/"));
		driver.navigate().back();
		gradesPageObject.open_grade_two();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/kw/grades/2/"));
		gradesPageObject.click_on_nagwa_logo();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/"));
	}
	@Test(priority = 8)
	@Severity(SeverityLevel.CRITICAL)
	public void open_oman_grade() throws InterruptedException  
	{
		homePageObject = new P002_HomePage(driver);
		homePageObject.countryList();
		homePageObject.change_country_to_oman();
		Thread.sleep(2000);
		homePageObject.open_Grades_Page();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/om/"));
		gradesPageObject = new P003_GradesPage(driver);
		Assert.assertEquals(gradesPageObject.country_name.getText(),"Oman");
		gradesPageObject.open_grade_one();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/om/grades/1/"));
		driver.navigate().back();
		gradesPageObject.open_grade_two();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/om/grades/2/"));
		gradesPageObject.click_on_nagwa_logo();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/"));
	
	}
	@Test(priority = 9)
	@Severity(SeverityLevel.CRITICAL)
	public void open_portugal_grade() throws InterruptedException  
	{
		homePageObject = new P002_HomePage(driver);
		homePageObject.countryList();
		homePageObject.change_country_to_portugal();
		Thread.sleep(2000);
		homePageObject.open_Grades_Page();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/pt/"));
		gradesPageObject = new P003_GradesPage(driver);
		Assert.assertEquals(gradesPageObject.country_name.getText(),"Portugal");
		gradesPageObject.open_grade_one();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/pt/grades/1/"));
		driver.navigate().back();
		gradesPageObject.open_grade_two();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/pt/grades/2/"));
		gradesPageObject.click_on_nagwa_logo();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/"));
		
	}
	@Test(priority = 10)
	@Severity(SeverityLevel.CRITICAL)
	public void open_saudi_arabia_grade() throws InterruptedException
	{
		homePageObject = new P002_HomePage(driver);
		homePageObject.countryList();
		homePageObject.change_country_to_saudi_arabia();
		Thread.sleep(2000);
		homePageObject.open_Grades_Page();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/sa/"));
		gradesPageObject = new P003_GradesPage(driver);
		Assert.assertEquals(gradesPageObject.country_name.getText(),"Saudi Arabia");
		gradesPageObject.open_grade_one();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/sa/grades/1/"));
		driver.navigate().back();
		gradesPageObject.open_grade_two();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/sa/grades/2/"));
		gradesPageObject.click_on_nagwa_logo();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/"));
		
	}
	
	@Test(priority = 12)
	@Severity(SeverityLevel.CRITICAL)
	public void open_united_kingdom_grade() throws InterruptedException  
	{
		homePageObject = new P002_HomePage(driver);
		homePageObject.countryList();
		homePageObject.change_country_to_United_Kingdom();
		Thread.sleep(2000);
		homePageObject.open_Grades_Page();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/uk/"));
		gradesPageObject = new P003_GradesPage(driver);
		Assert.assertEquals(gradesPageObject.country_name.getText(),"United Kingdom");
		gradesPageObject.open_grade_one();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/uk/grades/1/"));
		driver.navigate().back();
		gradesPageObject.open_grade_two();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/uk/grades/2/"));
		gradesPageObject.click_on_nagwa_logo();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/"));
		
	}
	
	@Test(priority = 11)
	@Severity(SeverityLevel.CRITICAL)
	public void open_united_states_grade() throws InterruptedException  
	{
		homePageObject = new P002_HomePage(driver);
		homePageObject.countryList();
		homePageObject.change_country_to_United_States();
		Thread.sleep(2000);
		homePageObject.open_Grades_Page();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/us/"));
		gradesPageObject = new P003_GradesPage(driver);
		Assert.assertEquals(gradesPageObject.country_name.getText(),"United States");
		gradesPageObject.open_grade_one();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/us/grades/k/"));
		driver.navigate().back();
		gradesPageObject.open_grade_two();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/us/grades/1/"));
		gradesPageObject.click_on_nagwa_logo();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/"));
		
	}
	
	@Test
	@Severity(SeverityLevel.CRITICAL)
	public void open_bahrain_grade() throws InterruptedException  
	{
		homePageObject = new P002_HomePage(driver);
		homePageObject.countryList();
		System.out.println(homePageObject.countries);
		homePageObject.change_country_to_bahrain();
		Thread.sleep(2000);
		homePageObject.open_Grades_Page();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/bh/"));
		gradesPageObject = new P003_GradesPage(driver);
		Assert.assertEquals(gradesPageObject.country_name.getText(),"Bahrain");
		gradesPageObject.open_grade_one();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/bh/grades/1/"));
		driver.navigate().back();
		gradesPageObject.open_grade_two();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/bh/grades/2/"));
		gradesPageObject.click_on_nagwa_logo();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/"));
	
	}
	
	
	

}
