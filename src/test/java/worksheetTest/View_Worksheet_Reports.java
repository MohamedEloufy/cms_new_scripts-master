package worksheetTest;

import loginUserTests.TestBase;
import pages.DashboardPage;
import pages.ExamReportListPage;

public class View_Worksheet_Reports extends TestBase {

	DashboardPage dashboardPageObject;
	ExamReportListPage examReportListPageObject;
	
	/*@Test
	public void openWorksheetReports() 
	{
		dashboardPageObject= new DashboardPage(driver);
		dashboardPageObject.open_Worksheet_Reports_Page();
		reportsPageObject= new ReportsPage(driver);
		Assert.assertTrue(reportsPageObject.table.isDisplayed());
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Reports: Worksheets"));
		
		
	}
	
	@Test(priority = 1)
	public void viewReports() 
	{
		reportsPageObject.view_First_Report();
		Assert.assertTrue(reportsPageObject.chartPercent.isDisplayed());
		driver.navigate().back();
		Assert.assertTrue(reportsPageObject.table.isDisplayed());
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Reports: Worksheets"));
		reportsPageObject.view_Second_Report();
		Assert.assertTrue(reportsPageObject.chartPercent.isDisplayed());
		driver.navigate().back();
		Assert.assertTrue(reportsPageObject.table.isDisplayed());
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Reports: Worksheets"));
		reportsPageObject.view_Third_Report();
		Assert.assertTrue(reportsPageObject.chartPercent.isDisplayed());
		driver.navigate().back();
		Assert.assertTrue(reportsPageObject.table.isDisplayed());
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Reports: Worksheets"));
		driver.navigate().back();
	}*/
}
