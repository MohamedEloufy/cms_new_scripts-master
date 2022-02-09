package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Classes_Page extends PageBase {

	public Classes_Page(WebDriver driver) {
		super(driver);
		jes=(JavascriptExecutor) driver;
	}
	

	
    
	@FindBy(xpath = "/html/body/div/div/div/div/main/section/div/div/div[1]/a")
	WebElement firstClass;
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/section/div/div/div[2]/a")
	WebElement secondClass;
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/section/div/div/div[3]/a")
	WebElement thirdClass;
	
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/div/div[2]/div[1]/ul/li[2]/a")
	WebElement FilesInsideClass;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/main/div/div/div[2]/div[1]/ul/li[1]/a")
	WebElement postsInsideClass;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/div/div[1]")
	public WebElement classInfo;
	
	
	@FindBy(xpath = "//*[@id=\"list_452172436059\"]/a")
	WebElement downloadLink;

	@FindBy(xpath = "//tbody[@id='libraryfilelist']//tr//td//a//span")
	WebElement downloadLink2;
	
	@FindBy(id = "vid_687154164794_980136705658")
	public WebElement videoPlayer;

	@FindBy(xpath = "//div[@class='posts active-tab' and @id='posts']")
	public WebElement postsContainer;

	@FindBy(xpath = "//div[@class='files active-tab' and @id='filesList']")
	public WebElement filesContainer;




	public void open_first_class_Posts()
	{
		clickOn(firstClass);
		scrollToBottom();
		scrollToUP();

	}
	public void open_first_class_files()
	{
		clickOn(FilesInsideClass);
		scrollToBottom();
		scrollToUP();
	}

		

	public void open_second_class_posts()
	{
		clickOn(secondClass);
		scrollToBottom();
		scrollToUP();
	}
	public void open_second_class_files()
	{
		clickOn(FilesInsideClass);
		scrollToBottom();
		scrollToUP();
	}
	
	public void open_third_class_posts() {
		clickOn(thirdClass);
		scrollToBottom();
		scrollToUP();
	}
	public void open_third_class_files()
	{
		clickOn(FilesInsideClass);
		scrollToBottom();
		scrollToUP();
	}


	public void download_file() 
	{
		boolean downloadElement= downloadLink2.isDisplayed();
		if(downloadElement==true)
		{
			try {
				clickOn(downloadLink2);
			} catch (Exception e) {
				downloadElement=false;
			}
		}

		
	}
	public void play_video() throws InterruptedException 
	{
		clickOn(thirdClass);
		boolean videoPlayerElement= videoPlayer.isDisplayed();
		if(videoPlayerElement==true)
		{
			try {
				openVideos(videoPlayer);
				Thread.sleep(8000);
			} catch (Exception e) {
				videoPlayerElement=false;
			}
		}
		
	}

	
	
	
}
