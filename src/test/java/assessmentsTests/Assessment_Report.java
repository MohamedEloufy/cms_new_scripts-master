package assessmentsTests;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import loginUserTests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AssessmentReportListPage;
import pages.ReportQuestionAndDetailsPage;
import pages.DashboardPage;


public class Assessment_Report extends TestBase {

	DashboardPage dashboardPageObject;
	AssessmentReportListPage assessmentReportListPagePageObject;
	ReportQuestionAndDetailsPage reportQuestionAndDetailsPagePageObject;
	
	@Test
	@Severity(SeverityLevel.CRITICAL)
	public void viewAssessmentReportDetails() throws InterruptedException {
		dashboardPageObject=new DashboardPage(driver);
		dashboardPageObject.open_Assessments_Reports_Page();
		assessmentReportListPagePageObject =new AssessmentReportListPage(driver);
		String AssessmentNameInAssessmentList= assessmentReportListPagePageObject.assessmentNameInRowThree.getText();
		String numberOfAnsweredQuestions= assessmentReportListPagePageObject.numberOfAnsweredQuestionsInRowThree.getText();
		int numberOfAnsweredQuestionsInReportList=Integer.parseInt(numberOfAnsweredQuestions);
		assessmentReportListPagePageObject.ViewTheAssessmentReportInRowThree();
		reportQuestionAndDetailsPagePageObject =new ReportQuestionAndDetailsPage(driver);
		String AssessmentNameInDetailsPage= reportQuestionAndDetailsPagePageObject.ReportTitleName.getText();
		Assert.assertEquals(AssessmentNameInAssessmentList,AssessmentNameInDetailsPage);
		Assert.assertTrue(reportQuestionAndDetailsPagePageObject.dataChart.isDisplayed());
		Assert.assertTrue(reportQuestionAndDetailsPagePageObject.answerInfoDiagram.isDisplayed());
		String numberOfCorrectAnswer= reportQuestionAndDetailsPagePageObject.numberOfCorrectAnswer.getText();
		int numberOfCorrectAnswers=Integer.parseInt(numberOfCorrectAnswer);
		String numberOfInCorrectAnswer= reportQuestionAndDetailsPagePageObject.numberOfInCorrectAnswer.getText();
		int numberOfIncorrectAnswers=Integer.parseInt(numberOfInCorrectAnswer);
		int numberOfAnsweredQuestionsInDetailsPage= numberOfCorrectAnswers + numberOfIncorrectAnswers;
		Assert.assertEquals(numberOfAnsweredQuestionsInReportList,numberOfAnsweredQuestionsInDetailsPage);
		String numberOfSkippedQuestion= reportQuestionAndDetailsPagePageObject.numberOfSkippedAnswer.getText();
		int numberOfSkippedQuestions=Integer.parseInt(numberOfSkippedQuestion);
		String numberOfTotalQuestion= reportQuestionAndDetailsPagePageObject.numberOfTotalQuestions.getText();
		int numberOfTotalQuestions=Integer.parseInt(numberOfTotalQuestion);
		int TotalNumberOfQuestionsInReportDetailsPage=numberOfAnsweredQuestionsInDetailsPage + numberOfSkippedQuestions;
		Assert.assertEquals(numberOfTotalQuestions,TotalNumberOfQuestionsInReportDetailsPage);
		int questionsList= reportQuestionAndDetailsPagePageObject.listOfQuestions.size();
		reportQuestionAndDetailsPagePageObject.viewAllQuestions();
		Assert.assertEquals(questionsList,TotalNumberOfQuestionsInReportDetailsPage);
		driver.navigate().back();
		driver.navigate().back();


	}

















	/*@Test
	public void openAssessmentReportsPage() 
	{
		dashboardPageObject= new DashboardPage(driver);
		dashboardPageObject.open_Assessments_Reports_Page();
		reportsPageObject= new ReportsPage(driver);
		Assert.assertTrue(reportsPageObject.table.isDisplayed());
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Reports: Assessments"));
	}
	@Test(priority = 1)
	public void viewReports() 
	{
		reportsPageObject.view_First_Report();
		Assert.assertTrue(reportsPageObject.chartPercent.isDisplayed());
		driver.navigate().back();
		Assert.assertTrue(reportsPageObject.table.isDisplayed());
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Reports: Assessments"));
		reportsPageObject.view_Second_Report();
		Assert.assertTrue(reportsPageObject.chartPercent.isDisplayed());
		driver.navigate().back();
		Assert.assertTrue(reportsPageObject.table.isDisplayed());
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Reports: Assessments"));
		//reportsPageObject.view_Third_Report();
		//Assert.assertTrue(reportsPageObject.chartpercent.isDisplayed());
		//driver.navigate().back();
		//Assert.assertTrue(reportsPageObject.table.isDisplayed());
		//Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Reports: Assessments"));
		driver.navigate().back();
		
			
	}*/
	
	
	
}
