package coursesTests;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import loginUserTests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.FE_CoursesPage;
import pages.DashboardPage;

public class CoursesTest extends TestBase {

	
	DashboardPage dashboardPageObject;
	FE_CoursesPage coursesPageObject;
	
	
	@Test
	@Severity(SeverityLevel.CRITICAL)
	public void openCoursesPage() 
	{
		dashboardPageObject= new DashboardPage(driver);
		dashboardPageObject.open_Courses_Page();
		Assert.assertTrue(driver.getTitle().contains("Courses"));
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.nagwa.com/en/my_courses/");
		
	}
	
	@Test(priority = 1)
	@Severity(SeverityLevel.BLOCKER)
	public void openCourseContent() throws InterruptedException
	{
		coursesPageObject= new FE_CoursesPage(driver);
		coursesPageObject.openCourses();
		Assert.assertTrue(coursesPageObject.courseTitle.getText().contains("AQA GCSE • Maths • Foundation"));
		Assert.assertTrue(driver.getCurrentUrl().contains("courses"));
		
	}

	@Test(priority = 2)
	@Severity(SeverityLevel.NORMAL)
	public void openLessonContent() throws InterruptedException {
		coursesPageObject.open_Lesson_Content();
		Assert.assertTrue(coursesPageObject.lessonComponent.isDisplayed());
	}
	


	
}