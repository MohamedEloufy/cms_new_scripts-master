package anonymousUserTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import loginUserTests.TestBase;
import pages.P002_HomePage;
import pages.P014_LessonsPage;

public class LessonsTest extends TestBase{

	P002_HomePage homePageObject;
	P014_LessonsPage lessonPageObject;
	
	
	@Test
	@Severity(SeverityLevel.CRITICAL)
	public void openLessonsPage()  {
		homePageObject = new P002_HomePage(driver);
		homePageObject.open_Lesson_page();
		Assert.assertEquals(driver.getTitle(), "Lessons");
		lessonPageObject = new P014_LessonsPage(driver);
		Assert.assertTrue(lessonPageObject.pageTitle.isDisplayed());
	}
	@Test(priority = 1)
	@Severity(SeverityLevel.NORMAL)
	public void showNextAndPreviousLessonPages()
	{
		lessonPageObject = new P014_LessonsPage(driver);
		lessonPageObject.previewNextLessonPage();
		lessonPageObject.previewPreviousLessonPage();
	}




	@Test(priority = 2)
	@Severity(SeverityLevel.CRITICAL)
	public void openLessonOne() throws InterruptedException
	{

		lessonPageObject.openLessonOne();
		Thread.sleep(1000);
        Assert.assertTrue(driver.getTitle().contains("Lesson:"));
        lessonPageObject.openLessonComponent();

		
	}
	@Test(priority = 3)
	@Severity(SeverityLevel.CRITICAL)
	public void openLessonTwo() throws InterruptedException 
	{
		openLessonsPage();
		lessonPageObject = new P014_LessonsPage(driver);
		lessonPageObject.openLessonTwo();
		Thread.sleep(1000);
        Assert.assertTrue(driver.getTitle().contains("Lesson:"));
		lessonPageObject.openLessonComponent();

		
	}
	@Test(priority = 4)
	@Severity(SeverityLevel.CRITICAL)
	public void openLessonThree() throws InterruptedException 
	{
		openLessonsPage();
		lessonPageObject = new P014_LessonsPage(driver);
		lessonPageObject.openLessonThree();
		Thread.sleep(1000);
        Assert.assertTrue(driver.getTitle().contains("Lesson:"));
		lessonPageObject.openLessonComponent();

		
	}
}
