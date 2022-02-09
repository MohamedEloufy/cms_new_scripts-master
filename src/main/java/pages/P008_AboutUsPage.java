package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P008_AboutUsPage extends PageBase {

	public P008_AboutUsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/div[1]/h1")
	public WebElement about_us_title;
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/div[2]/div[2]/figure/img")
	public WebElement image_in_about_us_page;
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/div[2]/div[1]/p")
	public WebElement paragraph_about_us;
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/div[2]/div[1]/article[1]/h2")
	public WebElement mission_statement_title;
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/div[2]/div[1]/article[1]/p")
	public WebElement mission_statement_paragraph;
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/div[2]/div[1]/article[2]/h2")
	public WebElement vision_statement_title;
	
	@FindBy(xpath = "/html/body/div/div/div/div/main/div[2]/div[1]/article[2]/p")
	public WebElement vision_statement_paragraph;
	

}
