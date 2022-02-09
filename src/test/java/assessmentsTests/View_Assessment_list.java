package assessmentsTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import loginUserTests.TestBase;
import pages.DashboardPage;
import pages.FEAssignmentPage;

public class View_Assessment_list extends TestBase{
	
	DashboardPage dashboardPageObject;
	FEAssignmentPage assignmentPageObject;
	
	@Test
    public void openAssessmentListPage() throws InterruptedException 
	{
		dashboardPageObject= new DashboardPage(driver);
		dashboardPageObject.open_Assignments_Page();
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Assignments"));
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.nagwa.com/en/assignments/");
		assignmentPageObject=new FEAssignmentPage(driver);
		assignmentPageObject.open_Assessments_Page();
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Assessments"));

	}
}
