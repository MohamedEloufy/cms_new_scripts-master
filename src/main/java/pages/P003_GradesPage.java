package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P003_GradesPage extends PageBase{

	public P003_GradesPage(WebDriver driver) {
		super(driver);
		jes=(JavascriptExecutor) driver;
		
	}
	
	@FindBy(className = "logo")
	WebElement nagwa_logo;


	@FindBy(xpath = "/html/body/div/div/div/main/div/div[1]/h1")
	public WebElement country_name;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/div[2]/ul/li[1]/span/a")
	WebElement grade_1;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/div[2]/ul/li[2]/span/a")
	WebElement grade_2;
	

	
	
	
	public void open_grade_one() throws InterruptedException {
		clickOn(grade_1);
		Thread.sleep(800);
		
	}
	
	public void open_grade_two() throws InterruptedException {
		
		clickOn(grade_2);
		Thread.sleep(800);
		
	}
	

	public void click_on_nagwa_logo() 
	{
	   clickOn(nagwa_logo);
	}
	
	
	
	
}
