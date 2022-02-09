package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FE_worksheet extends PageBase{

	public FE_worksheet(WebDriver driver) {
		super(driver);
		jes=(JavascriptExecutor) driver;
	}
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/section/div/ul/li[1]")
	WebElement firstCourse;
	
	@FindBy(linkText = "Numbers up to 10 on a Number Line")
	WebElement lesson;
	
	@FindBy(id = "practicebutton")
	WebElement practiceBtn;
	
	public void openQuestions() 
	{
		clickOn(firstCourse);
		clickOn(lesson);
		clickOn(practiceBtn);
	}

	
}
