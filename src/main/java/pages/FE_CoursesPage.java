package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FE_CoursesPage extends PageBase{

	public FE_CoursesPage(WebDriver driver) {
		super(driver);
		jes=(JavascriptExecutor) driver;
	}
	@FindBy(xpath = "//div//section//div/ul//li//a//h4")
	List<WebElement> coursesList;

	@FindBy(id = "NagwaLitePlayer")
	WebElement videoPlayer4;

	@FindBy(id = "preview")
	WebElement previewBtn;

	@FindBy(id = "practicebutton")
	WebElement practiceBtn;

	@FindBy(xpath = "/html/body/div/div/div/main/div/div[3]/ul/li[1]/ul/li[3]/a")
	WebElement thirdLesson;

	@FindBy(xpath = "//div//div//h1[@class='times']")
	public  WebElement courseTitle;

	@FindBy(className = "components")
	public WebElement lessonComponent;



	public void openCourses()
	{

		for (WebElement course:coursesList)
		{

			try {
				if (course.getText().equalsIgnoreCase("AQA GCSE • Maths • Foundation")) {
					clickOn(course);
					Thread.sleep(1000);
					scrollToBottom();
					scrollToUP();
				}
			} catch (Exception e) {
				System.out.println("error");
			}
		}
	}


	public void open_Lesson_Content() throws InterruptedException 
	{
		clickOn(thirdLesson);
		scrollToBottom();
		scrollToUP();
		
	}
	
	
}
	