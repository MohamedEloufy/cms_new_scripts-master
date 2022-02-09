package anonymousUserTests;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import loginUserTests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P002_HomePage;
import pages.P014_LessonsPage;
import pages.P016_PresentationPage;

public class PresentationLessonTest extends TestBase {
    P002_HomePage homePageObject;
    P016_PresentationPage presentationPageObject;

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void openLessonsPresentationPage() {
        homePageObject = new P002_HomePage(driver);
        homePageObject.openPresentationPage();
        Assert.assertEquals(driver.getTitle(), "Presentations");
    }

    @Test(priority = 1)
    @Severity(SeverityLevel.NORMAL)
    public void showNextAndPreviousLessonPresentationPages()
    {
        presentationPageObject = new P016_PresentationPage(driver);
        presentationPageObject.previewTheNextPresentationLessonPage();
        presentationPageObject.previewThePreviousPresentationLessonPage();
    }
    @Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    public void openLessonPresentationOne() throws InterruptedException
    {

        presentationPageObject.openFirstPresentationLesson();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getTitle().contains("Lesson Presentation:"));
        presentationPageObject.openLessonComponent();


    }
    @Test(priority = 3)
    @Severity(SeverityLevel.CRITICAL)
    public void openLessonPresentationTwo() throws InterruptedException
    {
        openLessonsPresentationPage();
        presentationPageObject.openSecondPresentationLesson();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getTitle().contains("Lesson Presentation:"));
        presentationPageObject.openLessonComponent();


    }
    @Test(priority = 4)
    @Severity(SeverityLevel.CRITICAL)
    public void openLessonPresentationThree() throws InterruptedException
    {
        openLessonsPresentationPage();

        presentationPageObject.openThirdPresentationLesson();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getTitle().contains("Lesson Presentation:"));
        presentationPageObject.openLessonComponent();


    }
}
