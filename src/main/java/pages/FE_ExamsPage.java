package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FE_ExamsPage extends PageBase{

	public FE_ExamsPage(WebDriver driver) {
		super(driver);
		jes=(JavascriptExecutor) driver;
	}
	
	@FindBy(xpath = "/html/body/div/div[1]/div/main/div/section/div/div[1]/div[3]/div[2]/ul/li/a")
	WebElement startExam;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div/a[2]")
	WebElement accept;
	
	@FindBy(className = "time-countdown")
	public WebElement timer;
	
	@FindBy(xpath = "//*[@id=\"mcq_choices\"]/ul/li[1]/span")
	WebElement answerNumberA;
	
	@FindBy(xpath = "//*[@id=\"mcq_choices\"]/ul/li[2]/span")
	WebElement answerNumberB;
	 
	@FindBy(id = "savebtn")
	WebElement saveBtn;
	
	
	@FindBy(id = "submitbtn")
	 WebElement submitBtn;
	
	@FindBy(linkText = "GO TO EXAMS")
	public WebElement GoToExamsListBtn;
	
	
	@FindBy(xpath = "/html/body/div/div[1]/div/main/div/section/div/div[1]/div[5]/div[1]/div[2]/ul/li[1]")
	WebElement numberOfQuestionText;
	

	@FindBy(xpath = "/html/body/div/div[1]/div/main/div/div/h1")
	public WebElement examsAssertions;
	
	
	public void startExam() throws InterruptedException
	{
		
		
		jes.executeScript("scrollBy(0,2100)");
		clickOn(startExam);
		Thread.sleep(1000);
		clickOn(accept);
	}
	public void openEditExam() throws InterruptedException
	{
		jes.executeScript("scrollBy(0,2100)");
		clickOn(startExam);
		Thread.sleep(1000);
	}
	
	public void solveExam() throws InterruptedException
	{
		jes.executeScript("scrollBy(0,200)");
		Thread.sleep(1000);
		Boolean elementX= answerNumberA.isEnabled();
		while(elementX==true)
		{
			try {
		clickOn(answerNumberA);
		clickOn(saveBtn);
		}catch (Exception e) {
			elementX=false;
		}
			
		}

		
	}
	public void submitExam() throws InterruptedException
	{
		clickOn(submitBtn);
		Thread.sleep(1000);
		clickOn(GoToExamsListBtn);
	}
	
	public void editExam() throws InterruptedException
	{
		jes.executeScript("scrollBy(0,200)");
		Thread.sleep(1000);
		Boolean elementY= answerNumberA.isEnabled();
		while(elementY==false)
		{
			try {
		clickOn(saveBtn);
		clickOn(answerNumberB);
		clickOn(saveBtn);
		}catch (Exception e) {
			elementY=true;
		}
			
		}
	}
	
	

}
