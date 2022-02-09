/*package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FE_LessonContentPage extends PageBase{

	public FE_LessonContentPage(WebDriver driver) {
		super(driver);
		jes=(JavascriptExecutor) driver;
		
	}
	
	@FindBy(xpath = "//div[@class='page-title with-badge flex']")
	WebElement lessonTitle;

	@FindBy(xpath = "//div[@class='components']//ul//li//div//a")
	public List<WebElement> lessonComponent;
	


	@FindBy(id = "NagwaLitePlayer")
	public WebElement videoPlayer;
	
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/div[1]/h1")
	public WebElement titleOfViewQuestion;
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/div[2]/div[1]/div")
	public WebElement questionOne;
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/div[2]/div[1]/div/div[4]/a")
	WebElement videoIconOfQuestion;
	
	@FindBy(id = "NagwaLitePlayer")
	WebElement videoPlayer2;
	

	

	
	

	
	
	
	public void open_video_content() throws InterruptedException
	{
	
		clickOn(videoContent);
		Thread.sleep(1000);
		openVideos(videoPlayer);
	}
	
	
	
	
	
	
	public void openVideo() throws InterruptedException
	{
		
		jes.executeScript("return arguments[0].play()", videoPlayer);
		Thread.sleep(6000);
		jes.executeScript("return arguments[0].pause()", videoPlayer);
		Thread.sleep(2000);
		
	}
	
	public void view_worksheet() throws InterruptedException 
	{
		scrollToBottom();
		clickOn(worksheetContent);
		Thread.sleep(1000);
		
	}
	public void openVideoOfSolvedQuestion() throws InterruptedException
	{
		jes.executeScript("scrollBy(0,250)");
		clickOn(videoIconOfQuestion);
		jes.executeScript("return arguments[0].play()", videoPlayer2);
		Thread.sleep(3000);
		jes.executeScript("return arguments[0].pause()", videoPlayer2);
		Thread.sleep(2000);
	}
}*/
