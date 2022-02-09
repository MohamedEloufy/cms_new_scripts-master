package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P012_CareersPage extends PageBase{

	public P012_CareersPage(WebDriver driver) {
		super(driver);
		jes=(JavascriptExecutor) driver;
	}
	
	@FindBy(className = "page-title flex")
	public WebElement careers_title;
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/section/ul/li[1]")
	public WebElement jobs_first_country;
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/section/ul/li[2]")
	public WebElement jobs_second_country;
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/section/ul/li[3]")
	public WebElement jobs_third_country;
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/section/ul/li[4]")
	public WebElement jobs_fourth_country;
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/section/ul/li[5]")
	public WebElement jobs_fifth_country;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/section/ul/li[1]/a")
	WebElement unitedKingdomJobs;
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/section/ul/li[2]/a")
	WebElement unitedStateJobs;
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/section/ul/li[3]/a")
	WebElement egyptJobs;
	
	
	@FindBy(xpath = "//*[@id=\"jobs_uk\"]/div[1]/h3/a")
	WebElement firstUnitedKingdomJob;
	
	@FindBy(xpath = "//*[@id=\"jobs_us\"]/div[1]/h3/a")
	WebElement firstUnitedStateJob;
	
	@FindBy(xpath = "//*[@id=\"jobs_eg\"]/div[1]/h3/a")
	WebElement firstEgyptJob;
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/div[2]/a")
	public WebElement applyBtn;
	
	public void unitedKingdom() throws InterruptedException
	{
		clickOn(unitedKingdomJobs);
		Thread.sleep(1000);
		clickOn(firstUnitedKingdomJob);
		scrollToBottom();

	}
	public void unitedState() throws InterruptedException
	{
		clickOn(unitedStateJobs);
		Thread.sleep(1000);
		clickOn(firstUnitedStateJob);
		scrollToBottom();
	}
	public void egypt() throws InterruptedException 
	{
		clickOn(egyptJobs);
		Thread.sleep(1000);
		//clickon(firstEgyptJob);
		//scrolltobuttom();
		//clickon(applyBtn);
	}	
	
		
	

}
