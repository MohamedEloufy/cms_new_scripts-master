package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P013_CoursesPage extends PageBase{

	public P013_CoursesPage(WebDriver driver) {
		super(driver);
		jes=(JavascriptExecutor) driver;
	}
	
	@FindBy(className = "page-title")
	public WebElement coursesTitle;
	
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/ul/li[1]/a")
	WebElement firstCourse;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/ul/li[2]/a")
	public WebElement secondCourse;

	@FindBy(xpath = "/html/body/div/div/div/main/div/ul/li[3]/a")
	public WebElement thirdCourse;

	@FindBy(id = "next")
	WebElement nextBtn;
	
	@FindBy(id = "Previous")
	WebElement PreviousBtn;

	@FindBy(xpath = "//ul[@class='list-nested']")
	public WebElement tableOfContentList;

	@FindBy(xpath = "/html/body/div/div/div/main/div/div[1]")
	public WebElement courseTitle;

	@FindBy(xpath = "/html/body/div/div/div/main/div/div[2]/figure/div")
	public WebElement courseCover;
	
	
	
	public void openFirstCourse()
	{
		clickOn(firstCourse);
	}
	
	
	public void openSecondCourse()
	{
		clickOn(secondCourse);
	}

	public void openThirdCourse()
	{
		clickOn(thirdCourse);
	}
	
	
	public void PreviewTheNextPageOfCourses()
	{
		scrollToBottom();
		clickOn(nextBtn);
	}
	
	
	public void previewThePreviousPageOfCourses()
	{
		scrollToBottom();
		clickOn(PreviousBtn);
	}

	
}
