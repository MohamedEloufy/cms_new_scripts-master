package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FE_SessionPage extends PageBase{

	public FE_SessionPage(WebDriver driver) {
		super(driver);
		jes=(JavascriptExecutor) driver;
	}
	@FindBy(xpath = "/html/body/div/div/div/main/div/section/div/div[2]/table/tbody/tr[2]/td[7]/ul/li")
	WebElement joinBTN;
	public void join() 
	{
		clickOn(joinBTN);
	}

}
