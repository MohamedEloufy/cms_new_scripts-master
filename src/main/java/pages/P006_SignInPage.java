package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P006_SignInPage extends PageBase {

	public P006_SignInPage(WebDriver driver) {
		super(driver);
		jes=(JavascriptExecutor) driver;
		
	}
	
	@FindBy(id = "txt_userName")
	WebElement user_name_TextBox;
	
	@FindBy(id = "btnNext")
	WebElement next_btn;
	
	@FindBy(id = "txt_password")
	WebElement password_textBox;
	
	@FindBy(id = "btnSignin")
	WebElement sign_in_btn;
	
	@FindBy(linkText = "Continue as a guest")
	WebElement Continue_as_a_guest_link;
	
	
	
	
	public void user_Can_Sign_In(String userName,String password)
	{
		writeData(user_name_TextBox, userName);
		clickOn(next_btn);
		writeData(password_textBox, password);
		clickOn(sign_in_btn);
		
	}
	
	public void use_nagwa_as_a_guest() 
	{
		clickOn(Continue_as_a_guest_link);
	}

	
}
