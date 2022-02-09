package anonymousUserTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import loginUserTests.TestBase;
import pages.P014_LessonsPage;
import pages.P018_ExplainersPage;
import pages.P002_HomePage;

public class ExplainersTest extends TestBase {


	P002_HomePage homePageObject;
	P018_ExplainersPage ExplainersPageObject;


	@Test
	@Severity(SeverityLevel.CRITICAL)
	public void openLessonsExplainerPage() {
		homePageObject = new P002_HomePage(driver);
		homePageObject.openExplainerPage();
		Assert.assertEquals(driver.getTitle(), "Explainers");
		ExplainersPageObject = new P018_ExplainersPage(driver);
		Assert.assertTrue(ExplainersPageObject.pageTitle.isDisplayed());

	}


	@Test(priority = 1)
	@Severity(SeverityLevel.NORMAL)
	public void showNextAndPreviousLessonExplainerPages() {
		ExplainersPageObject = new P018_ExplainersPage(driver);
		ExplainersPageObject.previewNextExplainerLessonPage();
		ExplainersPageObject.previewPreviousExplainerLessonPage();
	}

	@Test(priority = 2)
	@Severity(SeverityLevel.CRITICAL)
	public void openLessonExplainerOne() throws InterruptedException {

		ExplainersPageObject.openFirstExplainerLesson();
		Thread.sleep(1000);
		Assert.assertTrue(driver.getTitle().contains("Lesson Explainer:"));
		ExplainersPageObject.openLessonComponent();


	}

	@Test(priority = 3)
	@Severity(SeverityLevel.CRITICAL)
	public void openLessonExplainerTwo() throws InterruptedException {
		openLessonsExplainerPage();
		ExplainersPageObject.openSecondExplainerLesson();
		Thread.sleep(1000);
		Assert.assertTrue(driver.getTitle().contains("Lesson Explainer:"));
		ExplainersPageObject.openLessonComponent();


	}

	@Test(priority = 4)
	@Severity(SeverityLevel.CRITICAL)
	public void openLessonThree() throws InterruptedException {
		openLessonsExplainerPage();
		ExplainersPageObject.openThirdExplainerLesson();
		Thread.sleep(1000);
		Assert.assertTrue(driver.getTitle().contains("Lesson Explainer:"));
		ExplainersPageObject.openLessonComponent();


	}
}