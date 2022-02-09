package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AssessmentQuestionsPage extends PageBase{

	public AssessmentQuestionsPage(WebDriver driver) {
		super(driver);
		jes=(JavascriptExecutor) driver;
	}
	
	
	@FindBy(xpath = "//*[@id=\"mcq_choices\"]/ul/li[1]/span")
	public WebElement firstchoice;
	
	@FindBy(id = "savebtn")
	public WebElement savequestion;
	
	@FindBy(id = "submitbtn")
	WebElement submit;
	
	@FindBy(id = "sampleID")
	public WebElement textbox;
	
	public void solve_MCQ() 
	{
		clickOn(firstchoice);
		clickOn(savequestion);
	}
	public void submit_Assessment() 
	{
		clickOn(submit);
	}
	
	public void solve_free_form() 
	{
		writeData(textbox, "9");
		clickOn(savequestion);
	}
	
	

}
