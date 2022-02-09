package anonymousUserTests;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import loginUserTests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P002_HomePage;
import pages.P003_GradesPage;

public class StudentTest extends TestBase {

    P002_HomePage homePageObject;
    P003_GradesPage gradesPageObject;

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void openAsStudent()
    {
        homePageObject= new P002_HomePage(driver);
        homePageObject.open_Student_Grades();
        gradesPageObject= new P003_GradesPage(driver);
        Assert.assertTrue(gradesPageObject.country_name.isDisplayed());
        driver.navigate().back();

    }
}
