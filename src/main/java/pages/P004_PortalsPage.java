package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P004_PortalsPage extends PageBase{

	public P004_PortalsPage(WebDriver driver) {
		super(driver);
		jes=(JavascriptExecutor) driver;
	}
	
	@FindBy(xpath = "/html/body/div/div/div/main/section[1]/div/div[1]/h1")
	public WebElement nagwa_portals_title;
	
	@FindBy(xpath = "/html/body/div/div/div/main/section[1]/div/div[2]/p")
	public WebElement nagwa_portal_paragraph;
	
	@FindBy(xpath = "//div[@class='cta']//a")
	public WebElement portal_price_button;
	
	@FindBy(id = "vjs_video_3_html5_api")
	public WebElement video_Player;
	
	@FindBy(xpath = "/html/body/div/div/div/main/section[3]/div/div[1]/h2")
	public WebElement customized_Content_title;
	
	@FindBy(xpath = "/html/body/div/div/div/main/section[3]/div/div[2]/ul/li[1]/div")
	public WebElement courses_icon_inside_customized_content;
	
	@FindBy(xpath = "/html/body/div/div/div/main/section[3]/div/div[2]/ul/li[2]/div")
	public WebElement videos_icon_inside_customized_content;
	
	@FindBy(xpath = "/html/body/div/div/div/main/section[3]/div/div[2]/ul/li[3]/div")
	public WebElement questions_icon_inside_customized_content;
	
	@FindBy(xpath = "/html/body/div/div/div/main/section[3]/div/div[2]/ul/li[4]/div")
	public WebElement lesson_icon_inside_customized_content;
	
	@FindBy(xpath = "/html/body/div/div/div/main/section[3]/div/div[2]/ul/li[5]/div")
	public WebElement worksheet_icon_inside_customized_content;
	
	
	@FindBy(xpath = "/html/body/div/div/div/main/section[4]/div/div[1]/h2")
	public WebElement testimonials_title;
	
	@FindBy(xpath = "//*[@id=\"slick-slide00\"]/div[1]/p")
	public WebElement testimonials_paragraph;
	
	@FindBy(xpath = "/html/body/div/div/div/main/section[4]/div/div[2]/div[1]/a[2]/i")
	WebElement testimonials_right_arrow;
	
	@FindBy(xpath = "/html/body/div/div/div/main/section[4]/div/div[2]/div[1]/a[1]/i")
	WebElement testimonials_left_arrow;
	
	
	
	
	// this method to open form page
	public void open_portal_pricing_page()
	{
		clickOn(portal_price_button);
	}
	
	
	
    // this method to play video in portal page
	public void play_portal_video() throws InterruptedException 
	{
		jes.executeScript("scrollBy(0,300)");
		openVideos(video_Player);
		
	}
	
	
	// this method to preview testimonials
	public void testimonials_preview() throws InterruptedException 
	{
		scrollToBottom();
		clickOn(testimonials_right_arrow);
		Thread.sleep(500);
		clickOn(testimonials_right_arrow);
		Thread.sleep(500);
		clickOn(testimonials_left_arrow);
		Thread.sleep(500);
		scrollToUP();
	}
}
