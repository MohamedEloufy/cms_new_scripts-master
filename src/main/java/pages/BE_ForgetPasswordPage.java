package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BE_ForgetPasswordPage extends PageBase{

	public BE_ForgetPasswordPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(id = "txt_userName")
	WebElement usernametextbox;
	
	@FindBy(linkText = "Forgot Password?")
	WebElement forgetpasswordlink;
	
	@FindBy(id = "txtForgotPasswordEmail")
	WebElement emailaddresstextbox;
	
	@FindBy(id = "btnForgetPassword")
	WebElement setbtn;
	

}
