package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P019AA_WorksheetPreviewPage extends PageBase{
    public P019AA_WorksheetPreviewPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/div/div/div/div/main/div[1]/div/a")
    WebElement practiceButton;

    public void openWorksheetPracticing()
    {
        clickOn(practiceButton);
    }
}
