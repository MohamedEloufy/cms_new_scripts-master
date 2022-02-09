package assessmentsTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import loginUserTests.TestBase;
import pages.AssessmentListPage;
import pages.FE_AssessmentsQuestions;
import pages.FEAssignmentPage;
import pages.DashboardPage;

public class FREE_FORM_Editing extends TestBase {
	
	DashboardPage homepageafterpageobject;
	FEAssignmentPage assignmentpageobject;
	AssessmentListPage assessmentlistpageobject;
	FE_AssessmentsQuestions assessmentquestionpageobject;
	
	
	@Test(alwaysRun = true)
    public void openassessment() throws InterruptedException 
	{
		homepageafterpageobject= new DashboardPage(driver);
		homepageafterpageobject.open_Assignments_Page();
		//Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Assignments"));
		assignmentpageobject=new FEAssignmentPage(driver);
		assignmentpageobject.open_Assessments_Page();
		//Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Assessments"));
		assessmentlistpageobject= new AssessmentListPage(driver);
		//assessmentlistpageobject.edit_FREE_FORM_Assessment();
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
				if(name.equalsIgnoreCase("2223")) 
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
	@Test(dependsOnMethods = {"openassessment"})
	public void assessmentsolving() throws InterruptedException 
	{
		assessmentquestionpageobject=new FE_AssessmentsQuestions(driver);
		
		assessmentquestionpageobject=new FE_AssessmentsQuestions(driver);
		assessmentquestionpageobject.edit_FREEFORM_questions();
		Thread.sleep(1000);
		assessmentquestionpageobject.submitQuestions();
		//Thread.sleep(2000);
		Assert.assertTrue(assessmentquestionpageobject.submitScreen.isDisplayed()==true);
		assessmentquestionpageobject.returnToAssessmentScreen();
	}


}
