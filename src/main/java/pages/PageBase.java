package pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
	protected WebDriver driver;
	public JavascriptExecutor jes;
	
	public Select select;
	
	public PageBase(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	// method used to click on any element 
	public static void clickOn(WebElement button)
	{
		button.click();
	}
	
    // method to write data on text box
	public static void writeData(WebElement element, String value)
	{
		element.sendKeys(value);
	}
	
	//method to scroll the pages 
	public void scrollToBottom()
	{
		jes.executeScript("scrollBy(0,2500)");
	}
	public void scrollToUP()
	{
		jes.executeScript("scrollBy(2500,0)");
	}
	public boolean isElementExist(WebElement we)
	{
		try 
		{
			we.isDisplayed();
			return true;
		}catch(NoSuchElementException e) 
		{
			return false;
		}
	}
	public void openVideos(WebElement element) throws InterruptedException
	{
		
		jes.executeScript("return arguments[0].play()", element);
		Thread.sleep(6000);
		jes.executeScript("return arguments[0].pause()", element);
		Thread.sleep(2000);
	}
}
