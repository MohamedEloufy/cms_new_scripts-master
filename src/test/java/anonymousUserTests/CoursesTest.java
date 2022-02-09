package anonymousUserTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import loginUserTests.TestBase;
import pages.P013_CoursesPage;
import pages.P002_HomePage;

public class CoursesTest extends TestBase{
	
	P002_HomePage homePageObject;
	P013_CoursesPage coursesPageObject;
	
	@Test
	@Severity(SeverityLevel.CRITICAL)
	public void Courses() throws InterruptedException 
	{
		homePageObject = new P002_HomePage(driver);
		homePageObject.open_courses_page();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.nagwa.com/en/courses/");
		coursesPageObject = new P013_CoursesPage(driver);
		Assert.assertTrue(coursesPageObject.coursesTitle.getText().contains("Courses"));
		coursesPageObject.PreviewTheNextPageOfCourses();
		Thread.sleep(2000);
		coursesPageObject.previewThePreviousPageOfCourses();
		Thread.sleep(2000);
	}
	
	
	@Test(priority = 1)
	@Severity(SeverityLevel.CRITICAL)
	public void firstCourse() throws InterruptedException
	{
		
		coursesPageObject.openFirstCourse();
		Thread.sleep(2000);
		Assert.assertTrue(coursesPageObject.courseTitle.isDisplayed());
		Assert.assertTrue(coursesPageObject.tableOfContentList.isDisplayed());
		Assert.assertTrue(coursesPageObject.courseCover.isDisplayed());
		driver.navigate().back();
	}
	
	
	@Test(priority = 2)
	@Severity(SeverityLevel.CRITICAL)
	public void secondCourse() throws InterruptedException
	{
		coursesPageObject.openSecondCourse();
		Thread.sleep(1000);
		Assert.assertTrue(coursesPageObject.courseTitle.isDisplayed());
		Assert.assertTrue(coursesPageObject.tableOfContentList.isDisplayed());
		Assert.assertTrue(coursesPageObject.courseCover.isDisplayed());
		driver.navigate().back();

	}
	@Test(priority = 2)
	@Severity(SeverityLevel.CRITICAL)
	public void thirdCourse() throws InterruptedException
	{
		coursesPageObject.openThirdCourse();
		Thread.sleep(1000);
		Assert.assertTrue(coursesPageObject.courseTitle.isDisplayed());
		Assert.assertTrue(coursesPageObject.tableOfContentList.isDisplayed());
		Assert.assertTrue(coursesPageObject.courseCover.isDisplayed());

	}

}
