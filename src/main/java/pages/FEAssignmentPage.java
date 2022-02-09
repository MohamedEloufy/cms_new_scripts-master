package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FEAssignmentPage extends PageBase{

	public FEAssignmentPage(WebDriver driver) {
		super(driver);
		jes=(JavascriptExecutor) driver;
	}
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/section/div/ul/li[1]/a")
	 WebElement assessments;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/section/div/ul/li[2]/a")
	WebElement exams;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/section/div/ul/li[3]/a")
	WebElement sessions;
	
	
	public void open_Assessments_Page() throws InterruptedException 
	{
		clickOn(assessments);
		scrollToBottom();
		Thread.sleep(1000);
		scrollToUP();
	}

	public void open_Exams_Page()
	{
		clickOn(exams);
	}
	public void open_Sessions_Page() 
	{
		clickOn(sessions);
	}
	
	
}
