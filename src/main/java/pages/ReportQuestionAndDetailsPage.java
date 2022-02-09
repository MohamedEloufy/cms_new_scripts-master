package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ReportQuestionAndDetailsPage extends PageBase{
    public ReportQuestionAndDetailsPage(WebDriver driver) {
        super(driver);
        jes=(JavascriptExecutor) driver;
    }

    @FindBy(xpath = "//div//div[@class='page-title']")
    public WebElement ReportTitleName;

    @FindBy(id = "data-chart")
    public WebElement dataChart;

    @FindBy(xpath = "//ul[@class='answers-info']")
    public WebElement answerInfoDiagram;

    @FindBy(xpath = "//ul[@class='answers-info']//li[@class='correct']//p")
    public WebElement numberOfCorrectAnswer;

    @FindBy(xpath = "//ul[@class='answers-info']//li[@class='incorrect']//p")
    public WebElement numberOfInCorrectAnswer;

    @FindBy(xpath = "//ul[@class='answers-info']//li[@class='skipped']//p")
    public  WebElement numberOfSkippedAnswer;

    @FindBy(xpath = "//ul[@class='answers-info']//li[@class='total']//p")
    public WebElement numberOfTotalQuestions;

    @FindBy(xpath = "//div[@class='instances']//div//div//div[@class='question-number']")
    public List<WebElement> listOfQuestions;

    public void viewAllQuestions()
    {

        scrollToBottom();

    }


}
