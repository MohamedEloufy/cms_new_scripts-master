package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P004B_GetYourPortalStepTwoPage extends PageBase {

    public P004B_GetYourPortalStepTwoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div[1]/div/div/div/main/div[1]")
    public WebElement pageTitleStep2;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/main/div[2]")
    public WebElement paymentStepTwoGraph;

    @FindBy(id = "annually")
    public WebElement annuallyBtn;

    @FindBy(id = "monthly")
    public WebElement monthlyBtn;

    @FindBy(id = "individual")
    public WebElement individualPackageBtn;

    @FindBy(id = "team")
    public WebElement teamPackageBtn;

    @FindBy(id = "school")
    public WebElement schoolPackageBtn;

    @FindBy(xpath = "/html/body/div/div/div/div/main/div[3]/div/div[3]/div/div/button[2]")
    public WebElement addStudentBtn;

    @FindBy(id = "btn_sub")
    public WebElement subStudentBtn;

    @FindBy(id = "btn_continue")
    public WebElement continueBtn;


    public void addStudent()
    {
        clickOn(addStudentBtn);
    }
    public void subStudent()
    {
        clickOn(subStudentBtn);
    }
    public void moveToStepThree() throws InterruptedException {
        clickOn(continueBtn);
        Thread.sleep(800);
    }
}
