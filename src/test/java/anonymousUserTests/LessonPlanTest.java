package anonymousUserTests;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import loginUserTests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P002_HomePage;

import pages.P015_PlansPage;

public class LessonPlanTest extends TestBase {

    P002_HomePage homePageObject;
    P015_PlansPage plansPageObject;

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void openLessonsPlanPage() {
        homePageObject = new P002_HomePage(driver);
        homePageObject.open_plans_page();
        Assert.assertEquals(driver.getTitle(), "Lesson Plans");
        plansPageObject= new P015_PlansPage(driver);
        Assert.assertTrue(plansPageObject.pageTitle.isDisplayed());
    }
    @Test(priority = 1)
    @Severity(SeverityLevel.NORMAL)
    public void showNextAndPreviousLessonPages()
    {
        plansPageObject = new P015_PlansPage(driver);
        plansPageObject.previewTheNextLessonPlanPage();
        plansPageObject.previewThePreviousLessonPlanPage();
    }

    @Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    public void openLessonPlanOne() throws InterruptedException
    {

        plansPageObject.openFirstLessonPlan();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getTitle().contains("Lesson Plan:"));
        plansPageObject.openLessonComponent();


    }
    @Test(priority = 3)
    @Severity(SeverityLevel.CRITICAL)
    public void openLessonPlanTwo() throws InterruptedException
    {
        openLessonsPlanPage();
        plansPageObject.openSecondLessonPlan();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getTitle().contains("Lesson Plan:"));
        plansPageObject.openLessonComponent();


    }
    @Test(priority = 4)
    @Severity(SeverityLevel.CRITICAL)
    public void openLessonPlanThree() throws InterruptedException
    {
        openLessonsPlanPage();
        plansPageObject.openThirdLessonPlan();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getTitle().contains("Lesson Plan:"));
        plansPageObject.openLessonComponent();


    }
}
