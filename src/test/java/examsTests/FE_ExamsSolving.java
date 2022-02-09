package examsTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import loginUserTests.TestBase;
import pages.FEAssignmentPage;
import pages.FE_ExamsPage;
import pages.DashboardPage;

public class FE_ExamsSolving extends TestBase{
	
    DashboardPage homepageafterloginobject;
    FEAssignmentPage assignmentspageobject;
    FE_ExamsPage examspageobject;
    
    
    
    @Test(alwaysRun = true)
    public void openAssignmentspage() 
    {
    	homepageafterloginobject=new DashboardPage(driver);
    	homepageafterloginobject.open_Assignments_Page();
    	Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Assignments"));
    }
    @Test(priority = 1)
    public void openExamespage() 
    {
    	assignmentspageobject= new FEAssignmentPage(driver);
    	assignmentspageobject.open_Exams_Page();
    	Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Exam Assignments"));
    }
    @Test(priority = 2)
    public void startExam() throws InterruptedException 
    {
    	examspageobject=new FE_ExamsPage(driver);
    	examspageobject.startExam();
    	Assert.assertTrue(examspageobject.timer.isDisplayed());
    }
    @Test(priority = 3)
    public void solveExam() throws InterruptedException 
     {
    	examspageobject.solveExam();
    	examspageobject.submitExam();
    	Assert.assertTrue(examspageobject.GoToExamsListBtn.isDisplayed());
    }
    
    
}