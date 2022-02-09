package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P007_SearchPage extends PageBase{

	public P007_SearchPage(WebDriver driver) {
		super(driver);
		jes=(JavascriptExecutor) driver;
	}
	
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/div[3]/ul/li[1]/div/a")
	WebElement first_result;
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/div[3]/ul/li[2]/div/a")
	WebElement second_result;
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/div[3]/ul/li[3]/div/a")
	WebElement third_result;
	
	@FindBy(id = "NagwaLitePlayer")
	WebElement video_player;
	
	@FindBy(className = "section-content")
	WebElement video_content;
	
	@FindBy(id = "WorksheetContent")
	WebElement preview_worksheet;
	
	@FindBy(id = "WorksheetContent")
	public WebElement worksheet_content;
	
	

	public void view_worksheet() 
	{
		
		clickOn(preview_worksheet);
		
	}
	
	public void open_video_content() throws InterruptedException 
	{
		clickOn(video_content);
		openVideos(video_player);
	}
	
	
	
	public void conditions_video_worksheet() throws InterruptedException 
	{
		boolean element=video_player.isDisplayed();
				if(element==true) 
				{
					try {
					jes.executeScript("scrollBy(0,300)");
					openVideos(video_player);
					}catch (Exception e) {
						element=false;
					}
				}
		boolean element2=preview_worksheet.isDisplayed();
		        if(element2==true)
		        {
		           try {
		        	   jes.executeScript("scrollBy(300,1000)");
		        	   this.view_worksheet();
		           }catch (Exception e) {
					element2=false;
				}	
		        }


	}
	public void open_first_result() throws InterruptedException 
	{
		clickOn(first_result);
		
		
	}
	
	public void open_second_result() throws InterruptedException 
	{
		clickOn(second_result);
		
	}
	public void open_third_result() throws InterruptedException 
	{
		clickOn(third_result);
		
	}
	
	

}
