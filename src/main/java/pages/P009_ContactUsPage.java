package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P009_ContactUsPage extends PageBase{

	public P009_ContactUsPage(WebDriver driver) {
		super(driver);
		jes=(JavascriptExecutor) driver;
	}
	
	@FindBy(className = "google-map")
	public WebElement map;
	
	@FindBy(className = "page-title")
	public WebElement title;
	
	@FindBy(id = "contact_name")
	WebElement contactName;
	
	@FindBy(id = "contact_email")
	WebElement contactEmail;

	@FindBy(id = "contact_phone")
	WebElement contactPhone;
	
	@FindBy(id = "contact_message")
	WebElement contactMessage;
	
	@FindBy(xpath = "//div//button[@class=\"btn btn-primary\"]")
	WebElement sendBtn;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div/main/div[3]/div[2]/h2")
	public WebElement contact_information_title;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div/main/div[3]/div[2]/ul/li[1]/p")
	public WebElement nagwa_location;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div/main/div[3]/div[2]/ul/li[1]/i")
	public WebElement location_icon;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div/main/div[3]/div[2]/ul/li[2]/i")
	public WebElement phone_icon;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div/main/div[3]/div[2]/ul/li[2]/ul/li[1]/p")
	public WebElement general_Enquiries_number;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div/main/div[3]/div[2]/ul/li[2]/ul/li[2]/p")
	public WebElement sales_number;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div/main/div[3]/div[2]/ul/li[2]/ul/li[3]/p")
	public WebElement customer_service_number;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div/main/div[3]/div[2]/ul/li[3]/i")
	public WebElement message_icon;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div/main/div[3]/div[2]/ul/li[3]/p")
	public WebElement nagwa_mail;
	

	
	@FindBy(id = "reCAPTCHA")
	public WebElement alert_error;
	
	
	public void contactNagwa(String name,String email,String phone,String message)
	{
		jes.executeScript("scrollBy(0,1500)");
		writeData(contactName, name);
		writeData(contactEmail, email);
		writeData(contactPhone,phone);
		writeData(contactMessage, message);
		clickOn(sendBtn);
	}

}
