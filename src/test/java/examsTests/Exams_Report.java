package examsTests;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import loginUserTests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AssessmentReportListPage;
import pages.DashboardPage;
import pages.ExamReportListPage;
import pages.ReportQuestionAndDetailsPage;

public class Exams_Report extends TestBase {
	
	DashboardPage dashboardPageObject;
	ExamReportListPage examReportListPageObject;
	ReportQuestionAndDetailsPage reportQuestionAndDetailsPagePageObject;

	@Test
	@Severity(SeverityLevel.CRITICAL)
	public void viewAssessmentReportDetails() throws InterruptedException {
		dashboardPageObject = new DashboardPage(driver);
		dashboardPageObject.open_Exams_Report_Page();
		examReportListPageObject = new ExamReportListPage(driver);
		String ExamNameInExamsList = examReportListPageObject.examNameInRowOne.getText();
		String numberOfQuestions = examReportListPageObject.numberOfExamQuestionInRowOne.getText();
		int numberOfAnsweredQuestionsInReportList = Integer.parseInt(numberOfQuestions);
		examReportListPageObject.viewExamReportInRowOne();
		reportQuestionAndDetailsPagePageObject = new ReportQuestionAndDetailsPage(driver);
		String ExamNameInDetailsPage = reportQuestionAndDetailsPagePageObject.ReportTitleName.getText();
		Assert.assertEquals(ExamNameInExamsList, ExamNameInDetailsPage);
		Assert.assertTrue(reportQuestionAndDetailsPagePageObject.dataChart.isDisplayed());
		Assert.assertTrue(reportQuestionAndDetailsPagePageObject.answerInfoDiagram.isDisplayed());
		String numberOfCorrectAnswer = reportQuestionAndDetailsPagePageObject.numberOfCorrectAnswer.getText();
		int numberOfCorrectAnswers = Integer.parseInt(numberOfCorrectAnswer);
		String numberOfInCorrectAnswer = reportQuestionAndDetailsPagePageObject.numberOfInCorrectAnswer.getText();
		int numberOfIncorrectAnswers = Integer.parseInt(numberOfInCorrectAnswer);
		int numberOfAnsweredQuestionsInDetailsPage = numberOfCorrectAnswers + numberOfIncorrectAnswers;
		String numberOfSkippedQuestion = reportQuestionAndDetailsPagePageObject.numberOfSkippedAnswer.getText();
		int numberOfSkippedQuestions = Integer.parseInt(numberOfSkippedQuestion);
		String numberOfTotalQuestion = reportQuestionAndDetailsPagePageObject.numberOfTotalQuestions.getText();
		int numberOfTotalQuestions = Integer.parseInt(numberOfTotalQuestion);
		int TotalNumberOfQuestionsInReportDetailsPage = numberOfAnsweredQuestionsInDetailsPage + numberOfSkippedQuestions;
		Assert.assertEquals(numberOfTotalQuestions, TotalNumberOfQuestionsInReportDetailsPage);
		int questionsList = reportQuestionAndDetailsPagePageObject.listOfQuestions.size();
		reportQuestionAndDetailsPagePageObject.viewAllQuestions();
		Assert.assertEquals(questionsList, TotalNumberOfQuestionsInReportDetailsPage);
		driver.navigate().back();
		driver.navigate().back();


	}
}
