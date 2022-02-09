package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P005_UserGuidePage extends PageBase {

	public P005_UserGuidePage(WebDriver driver) {
		super(driver);
		jes=(JavascriptExecutor) driver;
	}
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/section[1]/div[2]/ul/li[1]")
	WebElement Using_Your_Portal_As_An_Admin;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/section[1]/div[2]/ul/li[2]")
	WebElement Creating_A_Year;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/section[1]/div[2]/ul/li[3]")
	WebElement Editing_A_Year;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/section[1]/div[2]/ul/li[4]")
	WebElement CreatingAClassAsAnAdmin;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/section[1]/div[2]/ul/li[5]")
	WebElement EditingAClassAsAnAdmin;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/section[1]/div[2]/ul/li[6]")
	WebElement CreatingAStudentAccount;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/section[1]/div[2]/ul/li[7]")
	WebElement CreatingMultipleStudentAccounts;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/section[1]/div[2]/ul/li[8]")
	WebElement CreatingAnEducatorAccount;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/section[1]/div[2]/ul/li[9]")
	WebElement AddingATeacherToAClass;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/section[1]/div[2]/ul/li[10]")
	WebElement AddingACoTeacherToAClass;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/section[1]/div[2]/ul/li[11]")
	WebElement UsingThePortalSearch;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/section[2]/div[2]/ul/li[1]")
	WebElement UsingYourPortalAsAnEducator;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/section[2]/div[2]/ul/li[2]")
	WebElement AssigningACourseToAClass;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/section[2]/div[2]/ul/li[3]")
	WebElement CreatingAnAssessment;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/section[2]/div[2]/ul/li[4]")
	WebElement UsingYourPortalLibrary;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/section[2]/div[2]/ul/li[5]")
	WebElement CreatingAnExamAssignment;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/section[2]/div[2]/ul/li[6]")
	WebElement ManagingYourStudentAccounts;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/section[2]/div[2]/ul/li[7]")
	WebElement CreatingAClassAsAnEducator;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/section[2]/div[2]/ul/li[8]")
	WebElement UsingWorksheetReportsAsAnEducator;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/section[2]/div[2]/ul/li[9]")
	WebElement UsingAssignmentReportsAsAnEducator;

	@FindBy(xpath = "/html/body/div/div/div/main/div/section[2]/div[2]/ul/li[10]")
	WebElement UsingThePortalSearch2;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/section[3]/div[2]/ul/li[1]")
	WebElement UsingYourPortalAsAStudent;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/section[3]/div[2]/ul/li[2]")
	WebElement CompletingALesson;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/section[3]/div[2]/ul/li[3]")
	WebElement CompletingAnAssessment;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/section[3]/div[2]/ul/li[4]")
	WebElement CompletingAnExamAssignment;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/section[3]/div[2]/ul/li[5]")
	WebElement AccessingAndUsingYourClassWalls;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/section[3]/div[2]/ul/li[6]")
	WebElement UsingThePortalSearch3;
	
	
	@FindBy(id = "NagwaLitePlayer")
	public WebElement video;
	
	
	
	
	public void openAdminVideos1() throws InterruptedException 
	{
		clickOn(Using_Your_Portal_As_An_Admin);
		openVideos(video);
	}

	public void openAdminVideos2() throws InterruptedException 
	{
		clickOn(Creating_A_Year);
		openVideos(video);
	}
	
	public void openAdminVideos3() throws InterruptedException 
	{
		clickOn(Editing_A_Year);
		openVideos(video);
	}
	
	public void openAdminVideos4() throws InterruptedException 
	{
		jes.executeScript("scrollBy(0,400)");
		clickOn(CreatingAClassAsAnAdmin);
		openVideos(video);
	}
	
	public void openAdminVideos5() throws InterruptedException 
	{
		jes.executeScript("scrollBy(0,400)");
		clickOn(EditingAClassAsAnAdmin);
		openVideos(video);
	}
	
	public void openAdminVideos6() throws InterruptedException 
	{
		jes.executeScript("scrollBy(0,400)");
		clickOn(CreatingAStudentAccount);
		openVideos(video);
	}
	
	public void openAdminVideos7() throws InterruptedException 
	{
		jes.executeScript("scrollBy(0,800)");
		clickOn(CreatingMultipleStudentAccounts);
		openVideos(video);
	}
	
	public void openAdminVideos8() throws InterruptedException 
	{
		jes.executeScript("scrollBy(0,800)");
		clickOn(CreatingAnEducatorAccount);
		openVideos(video);
	}
	
	public void openAdminVideos9() throws InterruptedException 
	{
		jes.executeScript("scrollBy(0,800)");
		clickOn(AddingATeacherToAClass);
		openVideos(video);
	}
	
	public void openAdminVideos10() throws InterruptedException 
	{
		jes.executeScript("scrollBy(0,1200)");
		clickOn(AddingACoTeacherToAClass);
		openVideos(video);
	}
	
	public void openAdminVideos11() throws InterruptedException 
	{
		jes.executeScript("scrollBy(0,1200)");
		clickOn(UsingThePortalSearch);
		openVideos(video);
	}
	
	public void openEducatorsVideos1() throws InterruptedException 
	{
		jes.executeScript("scrollBy(0,1400)");
		clickOn(UsingYourPortalAsAnEducator);
		openVideos(video);
	}
	
	public void openEducatorsVideos2() throws InterruptedException 
	{
		jes.executeScript("scrollBy(0,1400)");
		clickOn(AssigningACourseToAClass);
		openVideos(video);
	}
	
	public void openEducatorsVideos3() throws InterruptedException 
	{
		jes.executeScript("scrollBy(0,1400)");
		clickOn(CreatingAnAssessment);
		openVideos(video);
	}
	
	public void openEducatorsVideos4() throws InterruptedException 
	{
		jes.executeScript("scrollBy(0,1600)");
		clickOn(UsingYourPortalLibrary);
		openVideos(video);
	}
	
	public void openEducatorsVideos5() throws InterruptedException 
	{
		jes.executeScript("scrollBy(0,1600)");
		clickOn(CreatingAnExamAssignment);
		openVideos(video);
	}
	
	public void openEducatorsVideos6() throws InterruptedException 
	{
		jes.executeScript("scrollBy(0,1600)");
		clickOn(ManagingYourStudentAccounts);
		openVideos(video);
	}
	
	public void openEducatorsVideos7() throws InterruptedException 
	{
		jes.executeScript("scrollBy(0,1900)");
		clickOn(CreatingAClassAsAnEducator);
		openVideos(video);
	}
	
	public void openEducatorsVideos8() throws InterruptedException 
	{
		jes.executeScript("scrollBy(0,1900)");
		clickOn(UsingWorksheetReportsAsAnEducator);
		openVideos(video);
	}
	
	public void openEducatorsVideos9() throws InterruptedException 
	{
		jes.executeScript("scrollBy(0,1900)");
		clickOn(UsingAssignmentReportsAsAnEducator);
		openVideos(video);
	}
	
	public void openEducatorsVideos10() throws InterruptedException 
	{
		jes.executeScript("scrollBy(0,2000)");
		clickOn(UsingThePortalSearch2);
		openVideos(video);
	}
	
	public void openStudentVideos1() throws InterruptedException
	{
		jes.executeScript("scrollBy(0,2200)");
		clickOn(UsingYourPortalAsAStudent);
		openVideos(video);
	}

	public void openStudentVideos2() throws InterruptedException
	{
		jes.executeScript("scrollBy(0,2200)");
		clickOn(CompletingALesson);
		openVideos(video);
	}
	
	public void openStudentVideos3() throws InterruptedException
	{
		jes.executeScript("scrollBy(0,2200)");
		clickOn(CompletingAnAssessment);
		openVideos(video);
	}
	
	public void openStudentVideos4() throws InterruptedException
	{
		jes.executeScript("scrollBy(0,2300)");
		clickOn(CompletingAnExamAssignment);
		openVideos(video);
	}
	
	public void openStudentVideos5() throws InterruptedException
	{
		jes.executeScript("scrollBy(0,2300)");
		clickOn(AccessingAndUsingYourClassWalls);
		openVideos(video);
	}
	
	public void openStudentVideos6() throws InterruptedException
	{
		jes.executeScript("scrollBy(0,2300)");
		clickOn(UsingThePortalSearch3);
		openVideos(video);
	}
}
