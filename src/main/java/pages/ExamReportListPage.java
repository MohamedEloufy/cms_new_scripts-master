package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExamReportListPage extends PageBase {

	public ExamReportListPage(WebDriver driver) {
		super(driver);
		
		jes=(JavascriptExecutor) driver;
	}


	@FindBy(className = "table")
	public WebElement table;

    @FindBy(xpath = "//table//tbody//tr[1]//td[1]")
	public WebElement examNameInRowOne;

    @FindBy(xpath ="//table//tbody//tr[1]//td[5]")
	public WebElement numberOfExamQuestionInRowOne;

    @FindBy(xpath = "//table//tbody//tr[1]//td[7]")
	public WebElement viewExamReportInRowOne;

    public void viewExamReportInRowOne()
	{
		clickOn(viewExamReportInRowOne);
	}

















	
	/*@FindBy(xpath = "/html/body/div/div/div/main/div/section/div/div[1]/table/tbody/tr[1]/td[7]/a")
	WebElement viewFirstReport;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/section/div/div[1]/table/tbody/tr[2]/td[7]/a")
	WebElement viewSecondReport;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/section/div/div[1]/table/tbody/tr[3]/td[7]/a")
	WebElement viewThirdReport;
	
	@FindBy(className = "chart-wrapper")
	public WebElement chartPercent;
	
	public void view_First_Report() 
	{
		clickOn(viewFirstReport);
		scrollToBottom();
	}
	public void view_Second_Report() 
	{
		clickOn(viewSecondReport);
		scrollToBottom();
	}
	public void view_Third_Report() 
	{
		clickOn(viewThirdReport);
		scrollToBottom();
	}*/
	
}
