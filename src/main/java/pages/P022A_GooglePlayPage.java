package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P022A_GooglePlayPage extends PageBase{

	public P022A_GooglePlayPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id=\"fcxH9b\"]/div[4]/c-wiz/div/div[2]/div/div[1]/div/c-wiz[1]/c-wiz[1]/div/div[2]/div/div[1]/c-wiz[1]/h1/span")
	public WebElement nagwaStudyTitle;
	
	@FindBy(xpath = "//*[@id=\"fcxH9b\"]/div[4]/c-wiz/div/div[2]/div/div[1]/div/c-wiz[1]/c-wiz[1]/div/div[2]/div/div[1]/c-wiz[1]/h1/span")
	public WebElement nagwaStudioTitle;
	
	@FindBy(xpath = "//*[@id=\"fcxH9b\"]/div[4]/c-wiz/div/div[2]/div/div[1]/div/c-wiz[1]/c-wiz[1]/div/div[2]/div/div[1]/c-wiz[1]/h1/span")
	public WebElement nagwaConnectorForEducatorsTitle;
	
	@FindBy(xpath = "//*[@id=\"fcxH9b\"]/div[4]/c-wiz/div/div[2]/div/div[1]/div/c-wiz[1]/c-wiz[1]/div/div[2]/div/div[1]/c-wiz[1]/h1/span")
	public WebElement nagwaConnectorForStudentTitle;
	

}
