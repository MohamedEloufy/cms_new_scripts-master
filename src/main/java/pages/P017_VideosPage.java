package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class P017_VideosPage extends PageBase{

	public P017_VideosPage(WebDriver driver) {
		super(driver);
		jes=(JavascriptExecutor) driver;
	}

	@FindBy(xpath = "/html/body/div/div/div/main/div/div")
	public WebElement pageTitle;

	@FindBy(xpath = "/html/body/div/div/div/main/div/section/div/a")
	WebElement nextLessonVideosPage;

	@FindBy(xpath = "/html/body/div/div/div/main/div/section/div/a[1]")
	WebElement previousLessonVideosPage;


	@FindBy(xpath ="/html/body/div/div/div/main/div/section/ul/li[1]/div/figure/a")
	WebElement firstVideo;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/section/ul/li[2]/div/figure/a")
	WebElement secondVideo;

	@FindBy(xpath = "/html/body/div/div/div/main/div/section/ul/li[3]/div/figure/a")
	WebElement thirdVideo;
	
	
	
	@FindBy(id = "NagwaLitePlayer")
	public WebElement videoPlayer;

	@FindBy(xpath = "//div[@class='components']//ul//li//div//a")
	public List<WebElement> lessonComponent;

	
	
	
	public void openFirstLessonVideo()
	{
		clickOn(firstVideo);
	}
	public void openSecondLessonVideo()
	{
		clickOn(secondVideo);
	}
	public void openThirdLessonVideo()
	{
		clickOn(thirdVideo);
	}
	public void nextLessonVideoPage()
	{
		scrollToBottom();
		clickOn(nextLessonVideosPage);
	}
	public void previousLessonVideoPage()
	{
		scrollToBottom();
		clickOn(previousLessonVideosPage);
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
