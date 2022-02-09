package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FE_AssessmentsQuestions extends PageBase{

	public FE_AssessmentsQuestions(WebDriver driver) {
		super(driver);
		jes=(JavascriptExecutor) driver;
	}

	@FindBy(xpath = "//*[@id=\"mcq_choices\"]/ul/li[1]/span")
	public WebElement firstChoice;

	@FindBy(id = "savebtn")
	public WebElement saveQuestion;

	@FindBy(xpath = "//*[@id=\"mcq_choices\"]/ul/li[2]/span")
	public WebElement secondChoice;

	@FindBy(xpath = "//*[@id=\\\"mcq_choices\\\"]/ul/li[3]/span")
	public WebElement thirdChoice;

	@FindBy(id = "submitbtn")
	public WebElement submitBtn;
	
	@FindBy(className = "free-form")
	WebElement textBox2;


	@FindBy(id = "sampleID")
	public WebElement textBox;

	@FindBy(css = "a.next.dev-select-question")
	WebElement nextBtn;

	@FindBy(linkText = "GO TO ASSESSMENTS")
	WebElement goToAssessmentPage;

	@FindBy(linkText = "EDIT ANSWERS")
	WebElement editAnswers;

	@FindBy(xpath = "/html/body/div/div[1]/div/div/main/section/div/div[2]/div/div")
	public WebElement submitScreen;
	
	
	


	public void solveMCQQuestions() throws InterruptedException
	{		
		 

		Boolean element= firstChoice.isEnabled();
		while(element==true) 
		{
			try {
			clickOn(firstChoice);
			clickOn(saveQuestion);
			}catch (Exception e) {
				element=false;
			}
		}

	}

	public void edit_MCQ_question() 
	{
		Boolean element2= nextBtn.isDisplayed();
		while(element2==true) 
		{
			try {
			clickOn(saveQuestion);
			clickOn(secondChoice);
			clickOn(saveQuestion);
			clickOn(nextBtn);
			}catch (Exception e) {
				element2=false;
				
			}
		}
		
		
	}



	public void solve_freeform_question() throws InterruptedException 
	{
		Boolean elementY= textBox.isEnabled();
		while(elementY==true)
		{
			try {
				writeData(textBox, "9");
				clickOn(saveQuestion);
				Thread.sleep(1000);
			}catch (Exception e) {
				elementY=false;
			}
		}
		
	}

	public void edit_FREEFORM_questions() 
	{
		Boolean elementZ= nextBtn.isDisplayed();
		while(elementZ==true)
		{
			try {
				
				clickOn(saveQuestion);
				writeData(textBox, "2");
				clickOn(saveQuestion);
				clickOn(nextBtn);
			}catch (Exception e) {
				elementZ=false;
			}
		}
	}


	public void submitQuestions()
	{
		clickOn(submitBtn);
	}
	public void returnToAssessmentScreen()
	{
		clickOn(goToAssessmentPage);
	}

	public void editAssessmentFromSubmitScreen()
	{
		clickOn(editAnswers);
	}
	
	

}

