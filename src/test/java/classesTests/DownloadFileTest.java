package classesTests;

import loginUserTests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Classes_Page;
import pages.DashboardPage;

public class DownloadFileTest extends TestBase {
	
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
	public void openThirdClassFiles() throws InterruptedException
	{
        classesPageObject=new Classes_Page(driver);
        classesPageObject.open_third_class_posts();
        classesPageObject.open_third_class_files();
		TestBase.chromeOptions();
        classesPageObject.download_file();
		Thread.sleep(3000);
		Assert.assertTrue(classesPageObject.classInfo.isDisplayed());
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Classes"));
		driver.navigate().back();
	}

}
