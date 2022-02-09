package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class P018_ExplainersPage extends PageBase{

	public P018_ExplainersPage(WebDriver driver) {
		super(driver);
		jes=(JavascriptExecutor) driver;
	}

	@FindBy(className = "page-title")
	public WebElement pageTitle;

	@FindBy(id = "next")
	WebElement nextExplainerPageBtn;

	@FindBy(id = "Previous")
	WebElement previousExplainerPageBtn;

	@FindBy(xpath = "/html/body/div/div/div/main/div/ul/li[1]/a")
	WebElement lessonExplainerOne;

	@FindBy(xpath = "/html/body/div/div/div/main/div/ul/li[2]/a")
	WebElement lessonExplainerTwo;

	@FindBy(xpath = "/html/body/div/div/div/main/div/ul/li[3]/a")
	WebElement lessonExplainerThree;

	@FindBy(id = "NagwaLitePlayer")
	public WebElement videoPlayer;



	@FindBy(xpath = "//div[@class='components']//ul//li//div//a")
	public List<WebElement> lessonComponent;





	
	public void openFirstExplainerLesson()
	{
		clickOn(lessonExplainerOne);
	}
	public void openSecondExplainerLesson()
	{
		clickOn(lessonExplainerTwo);
	}
	public void openThirdExplainerLesson()
	{
		clickOn(lessonExplainerThree);

	}
	public void previewNextExplainerLessonPage()
	{
		scrollToBottom();
		clickOn(nextExplainerPageBtn);
	}
	public void previewPreviousExplainerLessonPage()
	{
		scrollToBottom();
		clickOn(previousExplainerPageBtn);
	}
	public void openLessonComponent()
	{
		for(WebElement component:lessonComponent)
		{
			try {
				if (component.getText().equalsIgnoreCase("Lesson")) {
					clickOn(component);
					Thread.sleep(1000);
				}
			}catch (Exception e)
			{
				System.out.println("lesson component doesn't exist");
			}
		}
		for(WebElement component:lessonComponent)
		{
			try {
				if (component.getText().equalsIgnoreCase("Lesson Plan")) {
					clickOn(component);
					Thread.sleep(1000);
					scrollToBottom();
					Thread.sleep(1000);
					scrollToUP();

				}
			}catch (Exception e)
			{
				System.out.println("Lesson Plan component doesn't exist");
			}
		}
		for(WebElement component:lessonComponent)
		{
			try {
				if (component.getText().equalsIgnoreCase("Lesson Presentation")) {
					clickOn(component);
					Thread.sleep(1000);
					scrollToBottom();
					Thread.sleep(1000);
					scrollToUP();

				}
			}catch (Exception e)
			{
				System.out.println("Lesson Presentation component doesn't exist");
			}
		}
		for(WebElement component:lessonComponent)
		{
			try {
				if (component.getText().equalsIgnoreCase("Lesson Video")) {
					clickOn(component);
					Thread.sleep(1000);
					openVideos(videoPlayer);


				}
			}catch (Exception e)
			{
				System.out.println("Lesson Video component doesn't exist");
			}
		}
		for(WebElement component:lessonComponent)
		{
			try {
				if (component.getText().equalsIgnoreCase("Lesson Explainer")) {
					clickOn(component);
					Thread.sleep(1000);
					scrollToBottom();
					Thread.sleep(1000);
					scrollToUP();

				}
			}catch (Exception e)
			{
				System.out.println("Lesson Explainer component doesn't exist");
			}
		}
		for(WebElement component:lessonComponent)
		{
			try {
				if (component.getText().equalsIgnoreCase("Lesson Worksheet")) {
					clickOn(component);
					Thread.sleep(1000);
					scrollToBottom();
					Thread.sleep(1000);
					scrollToUP();

				}
			}catch (Exception e)
			{
				System.out.println("Lesson Worksheet component doesn't exist");
			}
		}


	}
	
	
}
