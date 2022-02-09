package coursesTests;

import loginUserTests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.DashboardPage;
import pages.FE_CoursesPage;

import pages.P014_LessonsPage;

public class LessonTest extends TestBase {
	
	DashboardPage dashboardPageObject;
	FE_CoursesPage coursesPageObject;
	P014_LessonsPage lessonPageObject;
	
	
	@Test
	public void openCoursesPage() 
	{
		dashboardPageObject= new DashboardPage(driver);
		dashboardPageObject.open_Courses_Page();
		Assert.assertTrue(driver.getTitle().contains("Courses"));
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.nagwa.com/en/my_courses/");
		
	}
	
	@Test(priority = 1)
	public void openCourseContent() throws InterruptedException
	{
		coursesPageObject= new FE_CoursesPage(driver);
		coursesPageObject.openCourses();
        Assert.assertTrue(coursesPageObject.courseTitle.getText().contains("AQA GCSE • Maths • Foundation"));
        Assert.assertTrue(driver.getCurrentUrl().contains("courses"));
		
		
		
	}
	@Test(priority = 2)
	public void openLessonContent() throws InterruptedException
	{
		coursesPageObject.open_Lesson_Content();
		Assert.assertTrue(coursesPageObject.lessonComponent.isDisplayed());
	}

	@Test(priority = 3)
	public void lessonComponent()
	{
		lessonPageObject= new P014_LessonsPage(driver);
		lessonPageObject.openLessonComponent();
	}

}
