package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P010_PrivacyPolicyPage extends PageBase{

	public P010_PrivacyPolicyPage(WebDriver driver) {
		super(driver);
		jes=(JavascriptExecutor) driver;
	}
	
	@FindBy(className = "page-title")
	public WebElement privacy_Policy_title;
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/article[1]")
	public WebElement privacy_policy_article;
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/article[2]")
	public WebElement what_does_this_policy_cover_article;
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/article[3]")
	public WebElement our_Commitment_article;
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/article[4]")
	public WebElement data_sharing_article;
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/article[5]")
	public WebElement personal_Information_that_Nagwa_Collects_and_Stores_article;
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/article[6]")
	public WebElement anonymous_data_Collection_Using_Third_Party_Analytic_Services_article;

	@FindBy(xpath = "/html/body/div/div/div/div/main/article[7]")
	public WebElement cookies_article;
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/article[8]")
	public WebElement nagwa_Data_Controllers_Data_Processors_article;
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/article[9]")
	public WebElement right_to_be_Forgotten_article;
	
	@FindBy(xpath ="/html/body/div/div/div/div/main/article[10]")
	public WebElement right_to_Request_Personal_Data_article;
	
	@FindBy(xpath ="/html/body/div/div/div/div/main/article[11]")
	public WebElement updating_or_Correcting_Personal_Information_article;
	
	
}
