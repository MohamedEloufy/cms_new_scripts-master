package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P001_LanguagePage extends PageBase{

	public P001_LanguagePage(WebDriver driver) {
		super(driver);
		
		
	}
	@FindBy(className = "ar")
	WebElement arabicLanguageButton;
	
	@FindBy(xpath = "/html/body/div/div/main/div[2]/ul/li[3]/a")
	WebElement francaisLanguageButton;
	
	@FindBy(xpath = "/html/body/div/div/main/div[2]/ul/li[1]/a")
	WebElement englishLanguageButton;
	
	@FindBy(xpath = "/html/body/div/div/main/div[2]/ul/li[2]/a")
	WebElement spanishLanguageButton;
	
	@FindBy(xpath = "/html/body/div/div/main/div[2]/ul/li[4]/a")
	WebElement portugalLanguageButton;
	
	@FindBy(id = "btn_cookie_accept")
	WebElement cookieAcceptBtn;
	
	public void openHomePageWithArabicLanguage()
	{
		clickOn(arabicLanguageButton);
	}
	public void openHomePageWithEnglishLanguage()
	{
		clickOn(englishLanguageButton);
		
	}
	public void openHomePageWithFrancaisLanguage()
	{
		clickOn(francaisLanguageButton);
	}
	public void openHomePageWithSpanishLanguage()
	{
		clickOn(spanishLanguageButton);
	}
	public void openHomePageWithPortugalLanguage()
	{
		clickOn(portugalLanguageButton);
	}
	public void removeCookie()
	{
		clickOn(cookieAcceptBtn);
	}
	

}
