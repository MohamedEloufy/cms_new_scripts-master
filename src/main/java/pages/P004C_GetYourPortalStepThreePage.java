package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class P004C_GetYourPortalStepThreePage extends PageBase{

	
	public P004C_GetYourPortalStepThreePage(WebDriver driver) {
		super(driver);
		jes=(JavascriptExecutor) driver;
		Select select;
	}
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div/main/div[1]/h1")
	public WebElement pageTitleStepThree;

	@FindBy(xpath = "/html/body/div[1]/div/div/div/main/div[2]")
	public WebElement stepThreeGraph;

	@FindBy(id = "txtPortalName")
	public WebElement portalName;
	@FindBy(id = "txtSuffix")
	public WebElement portalSuffix;
	@FindBy(id = "SelectLanguage")
	WebElement languageDropDownList;
	@FindBy(id = "SelectCurriculum")
	WebElement curriculumDropDownList;
	@FindBy(className = "year")
	WebElement yearDropDownList;
	@FindBy(className = "month")
	WebElement monthDropDownList;
	@FindBy(className = "day")
	WebElement dayDropDownList;
	@FindBy(id = "btnTeacherRegister")
	WebElement continueBtn;

	
	
	public void fillTheFormOnStepThree(String portalNamE,String portal_Suffix) throws InterruptedException {
     writeData(portalName,portalNamE);
     writeData(portalSuffix,portal_Suffix);
     select=new Select(languageDropDownList);
     select.selectByIndex(1);
     Thread.sleep(1000);
     select=new Select(curriculumDropDownList);
     select.selectByIndex(1);
     select=new Select(yearDropDownList);
     select.selectByIndex(1);
     select=new Select(monthDropDownList);
     select.selectByIndex(1);
     select=new Select(dayDropDownList);
     select.selectByIndex(1);
     clickOn(continueBtn);

	}


}
