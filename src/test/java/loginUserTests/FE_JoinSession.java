package loginUserTests;

import org.testng.annotations.Test;

import pages.FEAssignmentPage;
import pages.DashboardPage;
import pages.FE_SessionPage;

public class FE_JoinSession extends TestBase{
	 DashboardPage dashboardPageObject;
	    FEAssignmentPage assignmentsPageObject;
	    FE_SessionPage sessionPageObject;
	    
	    
	    @Test
	    public void openSessionPage() 
	    {
	    	dashboardPageObject = new DashboardPage(driver);
	    	dashboardPageObject.open_Assignments_Page();
	    	assignmentsPageObject = new FEAssignmentPage(driver);
	    	assignmentsPageObject.open_Sessions_Page();
	    	
	    }
	    
	    @Test
	    public void joinSession() 
	    {
	    	sessionPageObject = new FE_SessionPage(driver);
	    	sessionPageObject.join();
	    }

}
