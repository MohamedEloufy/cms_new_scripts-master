package classesTests;

import loginUserTests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Classes_Page;
import pages.DashboardPage;

public class PlayVideoPostTest extends TestBase {
	
	DashboardPage dashboardPageObject;
	Classes_Page classesPageObject;
	
	@Test
	public void openClassesPage()
	{
		dashboardPageObject=new DashboardPage(driver);
		dashboardPageObject.open_Classes_Page();
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Classes"));
	}
	
	@Test(priority = 1)
	public void play_video_post() throws InterruptedException
	{
		classesPageObject=new Classes_Page(driver);
		classesPageObject.play_video();
		Assert.assertTrue(classesPageObject.videoPlayer.isDisplayed());
	}

}
