package worksheetTest;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import loginUserTests.TestBase;
import org.testng.annotations.Test;
import pages.P002_HomePage;
import pages.P019AA_WorksheetPreviewPage;
import pages.P019A_worksheetPracticePage;
import pages.P019_WorksheetsPage;

public class PracticeWorksheetTest extends TestBase {

    P002_HomePage homePageObject;
    P019_WorksheetsPage worksheetPageObject;
    P019AA_WorksheetPreviewPage worksheetPreviewPage;
    P019A_worksheetPracticePage worksheetPracticePage;

    @Test
    @Severity(SeverityLevel.BLOCKER)
    public void openWorksheetPage()
    {
        homePageObject= new P002_HomePage(driver);
        homePageObject.open_Worksheet_page();
    }
    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    public  void openWorksheetPreviewPage()
    {
      worksheetPageObject=new P019_WorksheetsPage(driver);
      worksheetPageObject.openWorksheetTwo();
    }
    @Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    public void practiceWorksheet() throws InterruptedException {
        worksheetPreviewPage=new P019AA_WorksheetPreviewPage(driver);
        worksheetPreviewPage.openWorksheetPracticing();
        worksheetPracticePage= new P019A_worksheetPracticePage(driver);
        worksheetPracticePage.solveWorksheet();
        Thread.sleep(3000);
    }

}
