package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P004D_GetYourPortalStepFourPage extends PageBase{
    public P004D_GetYourPortalStepFourPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/main/div[1]")
    public WebElement pageTitleStep4;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/main/div[2]")
    public WebElement step4Graph;

    @FindBy(id = "paypal")
    public  WebElement paypalBtn;

    @FindBy(xpath = "/html/body/header/div/div/div/a/img")
    WebElement nagwaLogo;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/main/div[7]/div/button")
    WebElement processWithPaypalBtn;

    public void processThePay()
    {
        clickOn(processWithPaypalBtn);
    }
    public void homePage()
    {
        clickOn(nagwaLogo);
    }
}
