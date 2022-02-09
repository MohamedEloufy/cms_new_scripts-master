package anonymousUserTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import loginUserTests.TestBase;
import pages.P002_HomePage;

import pages.P019_WorksheetsPage;

public class WorksheetTest extends TestBase {

	P019_WorksheetsPage worksheetPageObject;
	P002_HomePage homePageObject;

	@Test
	@Severity(SeverityLevel.CRITICAL)
	public void openLessonsWorksheetPage() {
		homePageObject = new P002_HomePage(driver);
		homePageObject.open_Worksheet_page();
		Assert.assertEquals(driver.getTitle(), "Worksheets");
		worksheetPageObject = new P019_WorksheetsPage(driver);
		Assert.assertTrue(worksheetPageObject.pageTitle.isDisplayed());
	}

	@Test(priority = 1)
	@Severity(SeverityLevel.NORMAL)
	public void showNextAndPreviousWorksheetLessonPages() {
		worksheetPageObject = new P019_WorksheetsPage(driver);
		worksheetPageObject.previewNextWorksheetLessonPage();
		worksheetPageObject.previewPreviousWorksheetLessonPage();
	}


	@Test(priority = 2)
	@Severity(SeverityLevel.CRITICAL)
	public void openLessonWorksheetOne() throws InterruptedException {

		worksheetPageObject.openWorkSheetOne();
		Thread.sleep(1000);
		Assert.assertTrue(driver.getTitle().contains("Lesson Worksheet:"));
		worksheetPageObject.openLessonComponent();


	}

	@Test(priority = 3)
	@Severity(SeverityLevel.CRITICAL)
	public void openLessonWorksheetTwo() throws InterruptedException {
		openLessonsWorksheetPage();

		worksheetPageObject.openWorksheetTwo();
		Thread.sleep(1000);
		Assert.assertTrue(driver.getTitle().contains("Lesson Worksheet:"));
		worksheetPageObject.openLessonComponent();


	}

	@Test(priority = 4)
	@Severity(SeverityLevel.CRITICAL)
	public void openLessonWorksheetThree() throws InterruptedException {
		openLessonsWorksheetPage();

		worksheetPageObject.openWorksheetThree();
		Thread.sleep(1000);
		Assert.assertTrue(driver.getTitle().contains("Lesson Worksheet:"));
		worksheetPageObject.openLessonComponent();


	}
}
