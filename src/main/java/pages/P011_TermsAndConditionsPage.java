package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P011_TermsAndConditionsPage extends PageBase{

	public P011_TermsAndConditionsPage(WebDriver driver) {
		super(driver);
		jes=(JavascriptExecutor) driver;
	}
	
	
	@FindBy(className = "page-title")
	public WebElement terms_and_Conditions_title;
	
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/article[1]")
	public WebElement about_us_article;
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/article[2]")
	public WebElement definitions_Article;
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/article[3]")
	public WebElement key_facts_article;
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/article[4]")
	public WebElement general_term_of_use_article;
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/article[5]")
	public WebElement registration_Obligations;
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/article[6]")
	public WebElement member_Account_Password_and_Security;

	@FindBy(xpath = "/html/body/div/div/div/div/main/article[7]")
	public WebElement payment_Cancellation_andRenewal_article;
}
