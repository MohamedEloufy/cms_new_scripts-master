package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class P019_WorksheetsPage extends PageBase{

	public P019_WorksheetsPage(WebDriver driver) {
		super(driver);
		jes=(JavascriptExecutor) driver;
	}

	@FindBy(xpath = "/html/body/div/div/div/main/div/div[1]/h1")
	public WebElement pageTitle;

	@FindBy(xpath = "/html/body/div/div/div/main/div/div[2]/a")
	WebElement nextWorksheetPageBtn;

	@FindBy(xpath = "/html/body/div/div/div/main/div/div[2]/a[2]")
	WebElement previousWorksheetPageBtn;

	@FindBy(xpath = "/html/body/div/div/div/main/div/ul/li[1]/a")
	WebElement lessonWorksheetOne;

	@FindBy(xpath = "/html/body/div/div/div/main/div/ul/li[2]/a")
	WebElement lessonWorksheetTwo;

	@FindBy(xpath = "/html/body/div/div/div/main/div/ul/li[3]/a")
	WebElement lessonWorksheetThree;

	@FindBy(id = "NagwaLitePlayer")
	public WebElement videoPlayer;



	@FindBy(xpath = "//div[@class='components']//ul//li//div//a")
	public List<WebElement> lessonComponent;









	
	public void openWorkSheetOne()
	{
		clickOn(lessonWorksheetOne);
	}
	public void openWorksheetTwo()
	{
		clickOn(lessonWorksheetTwo);
	}
	public void openWorksheetThree()
	{
		clickOn(lessonWorksheetThree);
	}
	public void previewNextWorksheetLessonPage()
	{
		scrollToBottom();
		clickOn(nextWorksheetPageBtn);
	}
	public void previewPreviousWorksheetLessonPage()
	{
		scrollToBottom();
		clickOn(previousWorksheetPageBtn);
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
