package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends PageBase{

	public DashboardPage(WebDriver driver) {
		super(driver);
		jes=(JavascriptExecutor) driver;
	}
	
	@FindBy(className = "big")
	WebElement DashboardTitle;

	
	@FindBy(xpath = "/html/body/header/div[2]/div/div[2]/nav/ul/li[1]/a")
	WebElement dashboard;
	
	public void open_Dashboard_Page() 
	{
		clickOn(dashboard);
	}
	
	
	@FindBy(xpath = "/html/body/header/div[2]/div/div[2]/nav/ul/li[2]/a")
	WebElement assignments;
	
	public void open_Assignments_Page() 
	{
		clickOn(assignments);
	}
	
	
	@FindBy(xpath = "/html/body/header/div[2]/div/div[2]/nav/ul/li[3]/a")
	WebElement classes;
	
	public void open_Classes_Page() 
	{
		clickOn(classes);
	}
	
	
	@FindBy(xpath = "/html/body/header/div[2]/div/div[2]/nav/ul/li[4]/a")
	WebElement courses;
	
	public void open_Courses_Page() 
	{
		clickOn(courses);
	}
	
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/section[1]/div/div/div[1]/div[3]/a")
	WebElement assessmentsReports;
	
	public void open_Assessments_Reports_Page() 
	{
		clickOn(assessmentsReports);
	}
	
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/section[1]/div/div/div[2]/div[3]/a")
	WebElement examsReports;
	
	public void open_Exams_Report_Page() 
	{
		clickOn(examsReports);
	}
	
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/section[1]/div/div/div[3]/div[3]/a")
	WebElement worksheetReports;
	
	public void open_Worksheet_Reports_Page() 
	{
		clickOn(worksheetReports);
	}

	
	@FindBy(className = "section-title")
	public WebElement statisticsTitle;
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/section[2]/div[2]/div/div/div[1]")
	public WebElement assessmentStatistics;
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/section[2]/div[2]/div/div/div[2]")
	public WebElement examStatistics;
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/section[2]/div[2]/div/div/div[3]")
	public WebElement worksheetStatistics;
	
}
