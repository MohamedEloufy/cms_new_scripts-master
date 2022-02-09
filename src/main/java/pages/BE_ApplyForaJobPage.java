package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BE_ApplyForaJobPage extends PageBase {

	public BE_ApplyForaJobPage(WebDriver driver) {
		super(driver);
		jes=(JavascriptExecutor) driver;
		
	}
	
	@FindBy(id = "resumator-firstname-value")
	WebElement firstname;
	
	@FindBy(id = "resumator-lastname-value")
	WebElement lastname;
	
	@FindBy(id = "resumator-email-value")
	WebElement emailValue;
	
	@FindBy(id = "resumator-phone-value")
	WebElement phoneNumber;
	
	@FindBy(id = "resumator-choose-upload")
	WebElement attachedResume;
	
	@FindBy(id = "resumator-resume-value")
	WebElement chooseFile;
	
	@FindBy(id = "resumator-questionnaire-q469760")
	WebElement hearAboutUsList;
	
	
	@FindBy(id = "resumator-questionnaire-q449042")
	WebElement haveYouEmplyBeforeList;
	
	@FindBy(id = "resumator-questionnaire-q449040")
	WebElement millarityStateList;
	
	@FindBy(id = "resumator-questionnaire-q449043")
	WebElement currentsalarytext;
	
	@FindBy(id = "resumator-questionnaire-q449044")
	WebElement expectedsalarytext;
	
	@FindBy(id = "resumator-questionnaire-q449149")
	WebElement socialinsurencelist;
	
	@FindBy(id = "resumator-submit-resume")
	WebElement submitbtn;
	
	public void applytoajob(String fname,String lname, String email,String phone,String currentsalary,String expectedsalary) 
	{
		
		writeData(firstname, fname);
		writeData(lastname, lname);
		writeData(emailValue,email);
		writeData(phoneNumber, phone);
		clickOn(attachedResume);
		String filename="mohamed.txt";
		String filepath=System.getProperty("user.dir")+"\\uploads\\"+filename;
		chooseFile.sendKeys(filepath);
		select= new Select(hearAboutUsList);
		select.selectByIndex(3);
		select= new Select(hearAboutUsList);
		select.selectByIndex(1);
		select=new Select(millarityStateList);
		select.selectByIndex(2);
		writeData(currentsalarytext,currentsalary);
		writeData(expectedsalarytext, expectedsalary);
		select= new Select(socialinsurencelist);
		select.selectByIndex(1);
		clickOn(submitbtn);
		
	}
	

}
