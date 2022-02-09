package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PortalPricingPage extends PageBase{
    public PortalPricingPage(WebDriver driver) {
        super(driver);
        jes=(JavascriptExecutor) driver;
    }


    @FindBy(className = "big")
    public WebElement pageTitle;

    @FindBy(xpath = "/html/body/div/div/div/main/div/div/div[1]/label/input")
    public WebElement annuallyBtn;

    @FindBy(xpath = "/html/body/div/div/div/main/div/div/div[2]/label/input")
    public WebElement monthlyBtn;

    @FindBy(xpath = "/html/body/div/div/div/main/section[2]/div/div/div/table/thead/tr/th[2]/div/div/div/div[2]")
    public WebElement getYourPortalIndividual;

    @FindBy(xpath = "/html/body/div/div/div/main/section[2]/div/div/div/table/thead/tr/th[3]/div/div/div/div[2]")
    public WebElement getYourPortalTeam;

    @FindBy(xpath = "/html/body/div/div/div/main/section[2]/div/div/div/table/thead/tr/th[4]/div/div/div/div[2]")
    public WebElement getYouPortalSchool;


    public void getYourPortalIndividual() throws InterruptedException {
        clickOn(getYourPortalIndividual);
        Thread.sleep(1000);
    }
    public void getYourPortalTeam() throws InterruptedException {
        clickOn(getYourPortalTeam);
        Thread.sleep(800);
    }
    public void getYourPortalSchool() throws InterruptedException {
        clickOn(getYouPortalSchool);
        Thread.sleep(1000);
    }
}
