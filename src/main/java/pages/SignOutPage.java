package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignOutPage extends PageBase{

	public SignOutPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "/html/body/header/div[1]/div/div[2]/ul/li/a")
	WebElement signOutDropDownList;
	
	@FindBy(xpath = "/html/body/header/div[1]/div/div[2]/ul/li/ul/li/a")
	WebElement signOutKey;
	
	public void userCanSignOut() throws InterruptedException {
		clickOn(signOutDropDownList);
		clickOn(signOutKey);
		Thread.sleep(2000);
	}

}
