package classesTests;

import loginUserTests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Classes_Page;
import pages.DashboardPage;

public class ClassesTest extends TestBase {
	
	DashboardPage dashboardPageObject;
	Classes_Page classesPageObject;
	
	@Test()
	public void openClassesPage()
	{
		dashboardPageObject =new DashboardPage(driver);
		dashboardPageObject.open_Classes_Page();
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Classes"));
	}
	
	@Test(priority = 1)
	public void openFirstClass() throws InterruptedException
	{
		classesPageObject =new Classes_Page(driver);
		TestBase.chromeOptions();
		classesPageObject.open_first_class_Posts();
		Assert.assertTrue(classesPageObject.postsContainer.isDisplayed());
		Thread.sleep(1000);
		classesPageObject.open_first_class_files();
		Assert.assertTrue(classesPageObject.filesContainer.isDisplayed());
		Assert.assertTrue(classesPageObject.classInfo.isDisplayed());
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Classes"));
		driver.navigate().back();
	}
	
	@Test(priority = 2)
	public void openSecondClass() throws InterruptedException
	{
		classesPageObject =new Classes_Page(driver);
		classesPageObject.open_second_class_posts();
		Assert.assertTrue(classesPageObject.postsContainer.isDisplayed());
		Thread.sleep(1000);
		classesPageObject.open_second_class_files();
		Assert.assertTrue(classesPageObject.filesContainer.isDisplayed());
		Assert.assertTrue(classesPageObject.classInfo.isDisplayed());
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Classes"));
		driver.navigate().back();
	}
	
	
	
	@Test(priority = 3)
	public void openFourthClass() throws InterruptedException
	{
		classesPageObject =new Classes_Page(driver);
		classesPageObject.open_third_class_posts();
		Assert.assertTrue(classesPageObject.postsContainer.isDisplayed());
		Thread.sleep(1000);
		classesPageObject.open_third_class_files();
		Assert.assertTrue(classesPageObject.filesContainer.isDisplayed());
		Assert.assertTrue(classesPageObject.classInfo.isDisplayed());
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Classes"));
		driver.navigate().back();
	}
	

}
