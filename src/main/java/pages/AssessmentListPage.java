package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AssessmentListPage extends PageBase{

	public AssessmentListPage(WebDriver driver) {
		super(driver);
		jes=(JavascriptExecutor) driver;
	}
	

	
	@FindBy(xpath = "/html/body/div/div[1]/div/main/div/section/div/div[1]/table/tbody/tr[8]/td[2]/ul/li/a")
	WebElement startSolving;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/main/div/section/div/div[1]/table/tbody/tr[3]/td[2]/ul/li/a")
	WebElement edit_mcq;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/main/div/section/div/div[1]/table/tbody/tr[9]/td[2]/ul/li/a")
	WebElement edit_frq;
	
	@FindBy(xpath = "//*td[contains(text(),'ferr')]//preceding-sibling::td//a[@linktext='Edit']")
	WebElement edit__frq;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/main/div/section/div/div[1]/table/tbody/tr[4]/td[2]/ul/li/a")
	WebElement edit_free_form;
	
	@FindBy(linkText = "Continue")
	WebElement continueSolving;
	
	
	@FindBy(xpath = "//*[@id=\"quiz-popup\"]/div/div/a[2]")
	WebElement okaystartquizbtn;
	
	
	
	
	public void start_Mcq_Assessment() 
	{
		clickOn(startSolving);
	}

	public void edit_MCQ_Assessment() 
	{
		clickOn(edit_mcq);
	}
	public void edit_FREE_FORM_Assessment() 
	{
		clickOn(edit_free_form);
	}
	public void edit_FRQ_Assessment() 
	{
		
		clickOn(edit_frq);
	}
	public void startquiz() throws InterruptedException 
	{
		
		clickOn(startSolving);
		Thread.sleep(1000);
		clickOn(okaystartquizbtn);
	}
	public void editQuiz() 
	{
		clickOn(edit_free_form);
	}
	public void start_Free_Assessment() 
	{
		clickOn(startSolving);
	}
	
	
}
