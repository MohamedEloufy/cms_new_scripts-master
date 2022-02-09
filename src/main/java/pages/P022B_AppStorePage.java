package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P022B_AppStorePage extends PageBase{

	public P022B_AppStorePage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//*[@id=\"ember146\"]/div/div[2]/header/h1")
	public WebElement nagwaStudioTitle;
	
	@FindBy(xpath = "/html/body/div[4]/div/main/div/div/div/div[2]/section[1]/div/div[2]/header/h1")
	public WebElement nagwaStudyTitle;
	
	@FindBy(id = "ember146")
	public WebElement imageNew;
	
	@FindBy(xpath = "//*[@id=\"ember156\"]/div/div[2]/header/h1")
    public WebElement nagwaConnectorTitle;
	
	@FindBy(xpath = "//*[@id=\"ember152\"]/div/div[2]/header/h1")
	public WebElement nagwaConnectorForStudentTitle;
	
	

}
