package assessmentsTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import loginUserTests.TestBase;
import pages.AssessmentListPage;
import pages.AssessmentQuestionsPage;
import pages.DashboardPage;
import pages.FEAssignmentPage;

public class MCQ_Solving extends TestBase{
	
	DashboardPage dashboardPageObject;
	FEAssignmentPage assignmentPageObject;
	AssessmentListPage assessmentListPageObject;
	AssessmentQuestionsPage assessmentQuestionObject;
	
	
	
	
	
	@Test
    public void openassessment() throws InterruptedException 
	{
		dashboardPageObject= new DashboardPage(driver);
		dashboardPageObject.open_Assignments_Page();
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Assignments"));
		assignmentPageObject=new FEAssignmentPage(driver);
		assignmentPageObject.open_Assessments_Page();
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Assessments"));
		//assessmentListPageObject=new AssessmentListPage(driver);
		//assessmentListPageObject.start_Mcq_Assessment();
		//System.out.println("Assessment_started");
		List<WebElement> NoRows=driver.findElements(By.xpath("//table/tbody/tr"));
		int size=NoRows.size();
		System.out.println("size equal"+size);
		///html/body/div/div[1]/div/main/div/section/div/div[1]/table/tbody/tr[9]/td[1]
		String before_xpath="/html/body/div/div[1]/div/main/div/section/div/div[1]/table/tbody/tr[";
		String after_xpath="]/td[1]";
		for(int i=1;i<=size;i++) 
		{
			try {
				String name= driver.findElement(By.xpath(before_xpath +i+ after_xpath)).getText();
				System.out.println(name);
				if(name.equalsIgnoreCase("ferr")) 
				{
					System.out.println("ferr");
					driver.findElement(By.xpath("/html/body/div/div[1]/div/main/div/section/div/div[1]/table/tbody/tr["+i+"]/td[2]/ul/li/a")).click();
					break;
				}
			} catch (Exception e) {
				System.out.println("000000000000000000000000000000000000000000000000000000000");
			}
				
			} 
			
	}
	
	
	@Test(priority = 1)
	public void solve_Assessment() throws InterruptedException 
	{
		List<WebElement>allQuestionsIcons=driver.findElements(By.cssSelector("a.dev-select-question"));
		System.out.println("number of question = "+allQuestionsIcons.size());
		for(WebElement icons:allQuestionsIcons)
		{
			System.out.println(icons.getAttribute("href"));
		}
		assessmentQuestionObject=new AssessmentQuestionsPage(driver);
		for(int i=1;i<allQuestionsIcons.size();i++) 
		{
			assessmentQuestionObject.solve_MCQ();
			Thread.sleep(1000);
		}
		assessmentQuestionObject.submit_Assessment();
		
		
	}
	
	
	

}

