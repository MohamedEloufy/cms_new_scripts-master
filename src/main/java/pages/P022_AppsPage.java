package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P022_AppsPage extends PageBase {

	public P022_AppsPage(WebDriver driver) {
		super(driver);
		jes=(JavascriptExecutor) driver;
		
	}
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/ul/li[1]/div/div/ul/li[2]/a")
	WebElement nagwastudygooglePlaybtn;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/ul/li[1]/div/div/ul/li[1]/a")
	WebElement nagwastudyappStorebtn;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/ul/li[2]/div/div/ul/li/a")
	WebElement nagwastudioAppstorebtn;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/ul/li[2]/div/div/ul/li[2]/a")
	WebElement nagwastudiogooleplaybtn;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/ul/li[3]/div/div/ul/li[1]/a")
	WebElement nagwaconnectforeducatorsappstorebtn;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/ul/li[3]/div/div/ul/li[2]/a")
	WebElement nagwaconnectforeducatorsgoogleplay;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/ul/li[4]/div/div/ul/li[1]/a")
	WebElement nagwaconnectorforstudenappstoretbtn;
	
	@FindBy(xpath = "/html/body/div/div/div/main/div/ul/li[4]/div/div/ul/li[2]/a")
	WebElement nagwaconnectorforstudentgoogleplaybtn;
	
	@FindBy(id = "%.@.\"com.nagwa.study\",7]")
	public WebElement installbtn;
	
	
	
	
	public void opennagwastudyplaystore() 
	{
		clickOn(nagwastudygooglePlaybtn);
	}
	
	
	public void opennagwastudyappstore() 
	{
		clickOn(nagwastudyappStorebtn);
	}
	
	
	public void opennagwastudio() 
	{
		clickOn(nagwastudioAppstorebtn);
	}
	
	public void openNagwaStudioGoogleplay() 
	{
		clickOn(nagwastudiogooleplaybtn);
	}
	
	public void openNagwaConnectorforeducatorsappstore() 
	{
		scrollToBottom();
		clickOn(nagwaconnectforeducatorsappstorebtn);
	}
	
	public void openNagwaConnectorforeducatoregoogleplay() 
	{
		scrollToBottom();
		clickOn(nagwaconnectforeducatorsgoogleplay);
	}
	public void openNagwaconnectorforstudentappstore() 
	{
		scrollToBottom();
		clickOn(nagwaconnectorforstudenappstoretbtn);
	}
	public void openNagwaConnectorforstudentgoogleplay() 
	{
		scrollToBottom();
		clickOn(nagwaconnectorforstudentgoogleplaybtn);
	}
	
	

}
