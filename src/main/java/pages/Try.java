package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Try extends PageBase{

	public Try(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "/html/body/header/div[1]/div/div[2]/ul/li[2]")
	List<WebElement> languagelist;
	
	public void selectmohamed() 
	{
		languagelist.get(1).click();
	}

}
