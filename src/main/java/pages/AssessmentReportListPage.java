package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AssessmentReportListPage extends PageBase{
    public AssessmentReportListPage(WebDriver driver) {
        super(driver);
        jes=(JavascriptExecutor) driver;
    }

    @FindBy(className = "table")
    public WebElement table;

    @FindBy(xpath = "//table//tbody//tr[3]//td[1]")
    public WebElement assessmentNameInRowThree;

    @FindBy(xpath = "//table//tbody//tr[3]//td[5]")
    public WebElement numberOfAnsweredQuestionsInRowThree;

    @FindBy(xpath = "//table//tbody//tr[3]//td[7]")
    WebElement viewAssessmentReportInRowThree;

    public void ViewTheAssessmentReportInRowThree()
    {
        clickOn(viewAssessmentReportInRowThree);
    }
}
