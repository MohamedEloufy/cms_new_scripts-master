package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class P004A_GetYourPortalStepOnePage extends PageBase {
    public P004A_GetYourPortalStepOnePage(WebDriver driver) {
        super(driver);

    }

    @FindBy(xpath = "/html/body/div[1]/div/div/div/main/div[1]")
    public WebElement pageTitle;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/main/div[2]")
    public WebElement paymentStepOneGraph;

    @FindBy(id = "sign_up_fname")
    WebElement firstName;

    @FindBy(id = "sign_up_lname")
    WebElement lastName;


    @FindBy(className = "year")
    WebElement yearDropDownList;

    @FindBy(className = "month")
    WebElement monthDropDownList;

    @FindBy(className = "day")
    WebElement dayDropDownList;

    @FindBy(id = "sign_up_MobilePhone")
    WebElement phoneNumber;

    @FindBy(id = "sign_up_email")
    WebElement email;

    @FindBy(id = "sign_up_password")
    WebElement createPassword;

    @FindBy(id = "sign_up_confirm_password")
    WebElement confirmPassword;

    @FindBy(xpath = "//*[@id=\"TeacherRegisterform\"]/div[9]/div/div/label/span")
    WebElement termCheckBox;

    @FindBy(id = "btnTeacherRegister")
    WebElement signUpAndContinueBtn;



    public void fillTheFormOfStepOne(String fName,String lName,String phone,String emailValue,String createPasswordValue) throws InterruptedException {
        writeData(firstName,fName);
        writeData(lastName,lName);
        select=new Select(yearDropDownList);
        select.selectByIndex(1);
        select=new Select(monthDropDownList);
        select.selectByIndex(1);
        select= new Select(dayDropDownList);
        select.selectByIndex(1);
        writeData(phoneNumber,phone);
        writeData(email,emailValue);
        writeData(createPassword,createPasswordValue);
        writeData(confirmPassword,createPasswordValue);
        clickOn(termCheckBox);
        clickOn(signUpAndContinueBtn);
        Thread.sleep(1000);

    }

}
