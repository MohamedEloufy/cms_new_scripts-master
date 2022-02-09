package anonymousUserTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import loginUserTests.TestBase;
import pages.P002_HomePage;
import pages.P017_VideosPage;

public class VideosTest extends TestBase{

	P002_HomePage homePageObject;
	P017_VideosPage videosPageObject;


	@Test
	@Severity(SeverityLevel.CRITICAL)
	public void openLessonsVideoPage() {
		homePageObject = new P002_HomePage(driver);
		homePageObject.open_videos_page();
		Assert.assertEquals(driver.getTitle(), "Videos");
		videosPageObject = new P017_VideosPage(driver);
		Assert.assertTrue(videosPageObject.pageTitle.isDisplayed());
	}


	@Test(priority = 1)
	@Severity(SeverityLevel.NORMAL)
	public void showNextAndPreviousLessonVideosPages() {
		videosPageObject = new P017_VideosPage(driver);
		videosPageObject.nextLessonVideoPage();
		videosPageObject.previousLessonVideoPage();
	}

	@Test(priority = 2)
	@Severity(SeverityLevel.CRITICAL)
	public void openLessonVideoOne() throws InterruptedException {

		videosPageObject.openFirstLessonVideo();
		Thread.sleep(1000);
		Assert.assertTrue(driver.getTitle().contains("Video:"));
		videosPageObject.openLessonComponent();


	}

	@Test(priority = 3)
	@Severity(SeverityLevel.CRITICAL)
	public void openLessonVideoTwo() throws InterruptedException {
		openLessonsVideoPage();
		videosPageObject.openSecondLessonVideo();
		Thread.sleep(1000);
		Assert.assertTrue(driver.getTitle().contains("Video:"));
		videosPageObject.openLessonComponent();


	}

	@Test(priority = 4)
	@Severity(SeverityLevel.CRITICAL)
	public void openLessonVideoThree() throws InterruptedException {
		openLessonsVideoPage();
		videosPageObject.openThirdLessonVideo();
		Thread.sleep(1000);
		Assert.assertTrue(driver.getTitle().contains("Video:"));
		videosPageObject.openLessonComponent();


	}
}
