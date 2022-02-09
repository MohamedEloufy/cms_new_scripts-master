package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P020_ExamsPage extends PageBase{

	public P020_ExamsPage(WebDriver driver) {
		super(driver);
		jes=(JavascriptExecutor) driver;
		
	}
	@FindBy(linkText = "Exams")
	WebElement exameslink;

	@FindBy(xpath = "/html/body/header/div[1]/div/div[2]/ul/li[3]")
	WebElement countrydropdownlist;
	
	@FindBy(xpath = "/html/body/header/div[1]/div/div[2]/ul/li[3]/div/ul/li[12]/a")
	WebElement UnitedKingdom;
	
	@FindBy(xpath = "/html/body/header/div[1]/div/div[2]/ul/li[3]/div/ul/li[13]/a")
	WebElement UnitedStates;
	
	@FindBy(xpath = "/html/body/header/div[1]/div/div[2]/ul/li[3]/div/ul/li[2]/a")
	WebElement egypt;
	
	
	@FindBy(xpath = "//*[@id=\"allpacks\"]/div/div[2]/div[1]/div[2]/ul/li[1]/a")
	WebElement firstlink;
	
	@FindBy(xpath = "//*[@id=\"allpacks\"]/div/div[2]/div[2]/div[2]/ul/li[2]/a")
	WebElement sixlink;
	
	@FindBy(xpath = "//*[@id=\"allpacks\"]/div/div[2]/div[3]/div[2]/ul/li[5]/a")
	WebElement elevenlink;
	
	
	
	public void changecountrytoegypt() 
	{
		clickOn(countrydropdownlist);
		clickOn(egypt);
	}
	
	public void changecountrytoUnitedKingdom() 
	{
		clickOn(countrydropdownlist);
		clickOn(UnitedKingdom);
	}
	public void changecountrytoUnitedStates() 
	{
		clickOn(countrydropdownlist);
		clickOn(UnitedStates);
	}
	
	public void openlinks() throws InterruptedException 
	{
		jes.executeScript("scrollBy(0,1500)");
		clickOn(firstlink);
		Thread.sleep(1000);
		clickOn(exameslink);
		//jes.executeScript("scrollBy(0,1900)");
		//clickon(sixlink);
		//Thread.sleep(1000);
		//clickon(exameslink);
		//jes.executeScript("scrollBy(0,2200)");
		//clickon(elevenlink);
		//Thread.sleep(1000);
		//clickon(exameslink);
		
		;
	}
}
