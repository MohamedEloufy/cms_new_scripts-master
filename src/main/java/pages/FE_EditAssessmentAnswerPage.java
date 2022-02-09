package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FE_EditAssessmentAnswerPage extends PageBase{

	public FE_EditAssessmentAnswerPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(id = "savebtn")
	WebElement SaveChangeBtn;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div/main/section/div/div[2]/div/div/div[1]/div/div/ul/li[3]/span")
	WebElement editAnswerOfQuestionOne;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div/main/section/div/div[2]/div/div/div[1]/div/div/ul/li[2]/span")
	WebElement editAnswerOfQuestionTwo;
	
	@FindBy(id = "submitbtn")
	WebElement submitBtn;
	
	public void editAnswer()
	{
		clickOn(SaveChangeBtn);
		clickOn(editAnswerOfQuestionOne);
		clickOn(SaveChangeBtn);
		clickOn(SaveChangeBtn);
		clickOn(editAnswerOfQuestionTwo);
		clickOn(editAnswerOfQuestionTwo);
		clickOn(SaveChangeBtn);
		clickOn(submitBtn);
	}
}
