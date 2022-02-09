package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Frq_Questions extends PageBase{

	public Frq_Questions(WebDriver driver) {
		super(driver);
		jes=(JavascriptExecutor) driver;
	}
	
	
	
	@FindBy(css = "a.next.dev-select-question")
	WebElement nextBtn;
	
	@FindBy(id = "removeAnswerImage")
	WebElement removeImage;
	
	@FindBy(id = "savebtn")
	WebElement saveBtn;
	
	@FindBy(id = "submitbtn")
	WebElement submit;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div/main/section/div/div[2]/div/div/div[1]/div/div/div[1]/div[2]/div[1]/button[1]")
	WebElement boldFont;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div/main/section/div/div[2]/div/div/div[1]/div/div/div[1]/div[2]/div[1]/button[2]")
	WebElement italicFont;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div/main/section/div/div[2]/div/div/div[1]/div/div/div[1]/div[2]/div[1]/button[3]")
	WebElement underline;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div/main/section/div/div[2]/div/div/div[1]/div/div/div[1]/div[2]/div[1]/button[4]")
	WebElement strikethrough;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div/main/section/div/div[2]/div/div/div[1]/div/div/div[1]/div[2]/div[1]/button[5]")
	WebElement superscript;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div/main/section/div/div[2]/div/div/div[1]/div/div/div[1]/div[2]/div[1]/button[6]")
	WebElement subscript;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div/main/section/div/div[2]/div/div/div[1]/div/div/div[1]/div[2]/div[1]/button[7]")
	WebElement removeFontStyle;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div/main/section/div/div[2]/div/div/div[1]/div/div/div[1]/div[2]/div[2]/button[1]")
	WebElement unorderedList;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div/main/section/div/div[2]/div/div/div[1]/div/div/div[1]/div[2]/div[2]/button[2]")
	WebElement orderedList;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div/main/section/div/div[2]/div/div/div[1]/div/div/div[1]/div[2]/div[3]/button")
	WebElement uploadImage;

	@FindBy(xpath = "//*[@id=\"questionImage\"]")
	public WebElement browseImage;
	
	@FindBy(id = "submitQuestionImage")
	public WebElement finishBtn;
	
	@FindBy(className = "note-editable")
	WebElement noteTextBox;
	
	public void write_text_note() throws InterruptedException 
	{
		clickOn(boldFont);
		writeData(noteTextBox, "hello");
		writeData(noteTextBox, "  ");
		clickOn(boldFont);
		Thread.sleep(1000);
		clickOn(italicFont);
		writeData(noteTextBox, "mohamed");
		writeData(noteTextBox, "  ");
		clickOn(italicFont);
		Thread.sleep(1000);
		clickOn(underline);
		writeData(noteTextBox, "eloufy");
		writeData(noteTextBox, "  ");
		clickOn(underline);
		Thread.sleep(1000);
		clickOn(strikethrough);
		writeData(noteTextBox, "egypt");
		writeData(noteTextBox, "  ");
		clickOn(strikethrough);
		Thread.sleep(1000);
		writeData(noteTextBox, "x");
		clickOn(superscript);
		writeData(noteTextBox, "2");
		clickOn(superscript);
		writeData(noteTextBox, "+2=0");
		writeData(noteTextBox, "  ");
		Thread.sleep(1000);
		writeData(noteTextBox, "y");
		clickOn(subscript);
		writeData(noteTextBox, "3");
		clickOn(subscript);
		writeData(noteTextBox, "-3=0");
		writeData(noteTextBox, "  ");
		Thread.sleep(1000);
		noteTextBox.sendKeys(Keys.ENTER);
		clickOn(unorderedList);
	    Thread.sleep(1000);
		writeData(noteTextBox, "zamalek");
		noteTextBox.sendKeys(Keys.ENTER);
		writeData(noteTextBox, "ismaly");
		noteTextBox.sendKeys(Keys.ENTER);
		clickOn(unorderedList);
		writeData(noteTextBox, "egyption teams");
		noteTextBox.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		clickOn(orderedList);
		Thread.sleep(1000);
		writeData(noteTextBox, "zamalek");
		noteTextBox.sendKeys(Keys.ENTER);
		writeData(noteTextBox, "masry");
		noteTextBox.sendKeys(Keys.ENTER);
		clickOn(orderedList);
		Thread.sleep(1000);

	}
	public void uploadImage() throws InterruptedException 
	{
		clickOn(uploadImage);
		 String imageName="portal.png";
		String imagePath=System.getProperty("user.dir")+"\\uploads\\"+imageName;
		browseImage.sendKeys(imagePath);
		Thread.sleep(10000);
		clickOn(finishBtn);
		Thread.sleep(1000);
		clickOn(saveBtn);
	}
	public void submit() 
	{
		clickOn(submit);
	}
	
	public void edit_frq()
	{
		Boolean element2= nextBtn.isDisplayed();
		while(element2==true) 
		{
			try {
		clickOn(saveBtn);
		Thread.sleep(1000);
		noteTextBox.clear();
		Thread.sleep(1000);
		clickOn(removeImage);
		Thread.sleep(1000);
		clickOn(boldFont);
		writeData(noteTextBox, "hello");
		writeData(noteTextBox, "  ");
		clickOn(boldFont);
		Thread.sleep(1000);
		clickOn(italicFont);
		writeData(noteTextBox, "ahmed");
		writeData(noteTextBox, "  ");
		clickOn(italicFont);
		Thread.sleep(1000);
		clickOn(underline);
		writeData(noteTextBox, "eloufy");
		writeData(noteTextBox, "  ");
		clickOn(underline);
		Thread.sleep(1000);
		clickOn(strikethrough);
		writeData(noteTextBox, "egypt");
		writeData(noteTextBox, "  ");
		clickOn(strikethrough);
		Thread.sleep(1000);
		writeData(noteTextBox, "x");
		clickOn(superscript);
		writeData(noteTextBox, "2");
		clickOn(superscript);
		writeData(noteTextBox, "+2=0");
		writeData(noteTextBox, "  ");
		Thread.sleep(1000);
		writeData(noteTextBox, "y");
		clickOn(subscript);
		writeData(noteTextBox, "3");
		clickOn(subscript);
		writeData(noteTextBox, "-3=0");
		writeData(noteTextBox, "  ");
		Thread.sleep(1000);
		noteTextBox.sendKeys(Keys.ENTER);
		clickOn(unorderedList);
	    Thread.sleep(1000);
		writeData(noteTextBox, "smoha");
		noteTextBox.sendKeys(Keys.ENTER);
		writeData(noteTextBox, "banha");
		noteTextBox.sendKeys(Keys.ENTER);
		clickOn(unorderedList);
		writeData(noteTextBox, "egyption teams");
		noteTextBox.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		clickOn(orderedList);
		Thread.sleep(1000);
		writeData(noteTextBox, "inby");
		noteTextBox.sendKeys(Keys.ENTER);
		writeData(noteTextBox, "mahalah");
		noteTextBox.sendKeys(Keys.ENTER);
		clickOn(orderedList);
		Thread.sleep(1000);
		
		uploadImage();
		clickOn(nextBtn);
			}catch (Exception e) {
				element2=false;
				clickOn(submit);
				
			}
		}
	}
	
}
