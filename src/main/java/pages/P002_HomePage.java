package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P002_HomePage extends PageBase {

	public P002_HomePage(WebDriver driver) {
		super(driver);
		jes=(JavascriptExecutor) driver;
	}
	
	// A{00}Sign in button in home page 
	@FindBy(xpath = "/html/body/header/div[1]/div/div[2]/ul/li[1]/a")
	WebElement signInBtn;
	public void open_SignIn_Page() 

	{
		clickOn(signInBtn);
	}
	
	
	@FindBy(xpath = "/html/body/header/div[1]/div/div[2]/ul/li[2]")
	public WebElement language_button;
	@FindBy(xpath = "//ul[contains(@class, 'dropdown-menu languages')]//li//a")
	public List<WebElement>language_menu;
	
	public void change_language_to_arabic()  
	{
		
		for (WebElement language : language_menu)
		{
			try {
				if(language.getText().equalsIgnoreCase("العربية")) 
				{
					clickOn(language);
				}
			} catch (Exception e) {
				System.out.println("arabic language doesn't exist");
			}
			
		}
		
		
	}
	
	
	public void change_language_to_english()  
	{
		
		for (WebElement language : language_menu)
		{
			try {
				if(language.getText().equalsIgnoreCase("English")) 
				{
					clickOn(language);
				}
			} catch (Exception e) {
				System.out.println("english language doesn't exist");
			}
			
		}
		
		
	}
	
	public void changeLanguageToFrancais()
	{
		
		for (WebElement language : language_menu)
		{
			try {
				if(language.getText().equalsIgnoreCase("Français")) 
				{
					clickOn(language);
				}
			} catch (Exception e) {
				System.out.println("france language doesn't exist");
			}
			
		}
		
		
	}
	
	public void change_LanguageToSpanish()
	{
		
		for (WebElement language : language_menu)
		{
			try {
				if(language.getText().equalsIgnoreCase("Español")) 
				{
					clickOn(language);
				}
			} catch (Exception e) {
				System.out.println("spanish language doesn't exist");
			}
			
		}
		
		
	}
	public void changeLanguageToPortugal()
	{
		
		for (WebElement language : language_menu)
		{
			try {
				if(language.getText().equalsIgnoreCase("Português")) 
				{
					clickOn(language);
				}
			} catch (Exception e) {
				System.out.println("Portugal language doesn't exist");
			}
			
		}
		
		
	}
	
	
	@FindBy(css = "body > header > div.top-header > div > div.user-actions > ul > li:nth-child(3) > a")
	WebElement country_drop_down_list;
	
	@FindBy(xpath = "//ul[contains(@class, 'countries-list dev-selectCountry')]//li//a//span")
	public List<WebElement> countries;
	
	
	
	public void change_country_to_bahrain()  
	{
		
		for (WebElement country : countries)
		{
			try {
				if(country.getText().equalsIgnoreCase("Bahrain"))
				{
					clickOn(country);
					Thread.sleep(800);
				}
			} catch (Exception e) {
				System.out.println("bahrain country doesn't exist");
			}
			
		}
		
		
	}
	
	public void change_country_to_egypt()  
	{
		
		for (WebElement country : countries)
		{
			try {
				if(country.getText().equalsIgnoreCase("Egypt"))
				{
					clickOn(country);
					Thread.sleep(800);
				}
			} catch (Exception e) {
				System.out.println("egypt country doesn't exist");
			}
			
		}
		
	}
	
	public void change_country_to_france() 
	{
		
		for (WebElement country : countries)
		{
			try {
				if(country.getText().equalsIgnoreCase("France"))
				{
					clickOn(country);
					Thread.sleep(800);
				}
			} catch (Exception e) {
				System.out.println("france country doesn't exist");
			}
			
		}
		
	}
	
	public void change_country_to_india() 
	{
		
		for (WebElement Country : countries)
		{
			try {
				if(Country.getText().equalsIgnoreCase("India"))
				{
					clickOn(Country);
					Thread.sleep(800);
				}
			} catch (Exception e) {
				System.out.println("india country doesn't exist");
			}
			
		}
		
	}
	
	public void change_country_to_iraq()  
	{
		
		for (WebElement country : countries)
		{
			try {
				if(country.getText().equalsIgnoreCase("Iraq"))
				{
					clickOn(country);
					Thread.sleep(800);
				}
			} catch (Exception e) {
				System.out.println("iraq country doesn't exist");
			}
			
		}
	}

	public void change_country_to_jamaica() 
	{
		
		for (WebElement country : countries)
		{
			try {
				if(country.getText().equalsIgnoreCase("Jamaica"))
				{
					clickOn(country);
					Thread.sleep(800);
				}
			} catch (Exception e) {
				System.out.println("jamaica country doesn't exist");
			}
			
		}
		
	}
	
	public void change_country_to_jordan() 
	{
		
		
		for (WebElement country : countries)
		{
			try {
				if(country.getText().equalsIgnoreCase("Jordan"))
				{
					clickOn(country);
					Thread.sleep(800);
				}
			} catch (Exception e) {
				System.out.println("jordan country doesn't exist");
			}
			
		}
		
	}
	
	public void change_country_to_kuwait() 
	{
		
		
		for (WebElement country : countries)
		{
			try {
				if(country.getText().equalsIgnoreCase("Kuwait"))
				{
					clickOn(country);
					Thread.sleep(800);
				}
			} catch (Exception e) {
				System.out.println("kuwait country doesn't exist");
			}
			
		}
		
	}
	
	public void change_country_to_oman()  
	{
		
		for (WebElement country : countries)
		{
			try {
				if(country.getText().equalsIgnoreCase("Oman"))
				{
					clickOn(country);
					Thread.sleep(800);
				}
			} catch (Exception e) {
				System.out.println("oman country doesn't exist");
			}
			
		}
		
	}
	
	public void change_country_to_portugal()  
	{
		
		for (WebElement country : countries)
		{
			try {
				if(country.getText().equalsIgnoreCase("Portugal"))
				{
					clickOn(country);
					Thread.sleep(800);
				}
			} catch (Exception e) {
				System.out.println("Portugal country doesn't exist");
			}
			
		}
		
	}
	
	public void change_country_to_saudi_arabia()  
	{
		
		for (WebElement country : countries)
		{
			try {
				if(country.getText().equalsIgnoreCase("Saudi Arabia"))
				{
					clickOn(country);
					Thread.sleep(800);
				}
			} catch (Exception e) {
				System.out.println("saudi arabia country doesn't exist");
			}
			
		}
	
	}
	
	public void change_country_to_United_Kingdom()  
	{
		
		for (WebElement country : countries)
		{
			try {
				if(country.getText().equalsIgnoreCase("United Kingdom"))
				{
					clickOn(country);
					Thread.sleep(800);
				}
			} catch (Exception e) {
				System.out.println("united kingdom doesn't exist");
				
			}
			
		}
		
	}
	public void change_country_to_United_States()  
	{

		for (WebElement country : countries)
		{
			try {
				if(country.getText().equalsIgnoreCase("United States"))
				{
					clickOn(country);
					Thread.sleep(800);
				}
			} catch (Exception e) {
				System.out.println("united state country doesn't exist");
			}
			
		}
		
	}
	public void countryList()
	{
		clickOn(country_drop_down_list);
	}
	
	
	// {A01}search field in home screen 
	@FindBy(xpath = "/html/body/header/div[1]/div/div[3]/button")
	WebElement search_btn;
	@FindBy(id = "txt_search_query")
	WebElement text_field_search;
	@FindBy(id = "btn_global_search")
	WebElement search_icon;
	@FindBy(xpath = "/html/body/div/div/div/div/main/div[1]/h1")
	public WebElement searchResultTitle;
	public void search_For_Lesson(String lessonName) 
	{
		clickOn(search_btn);
		writeData(text_field_search,lessonName);
		clickOn(search_icon);
	}
	
	
	
	
	// {A02}Grades button in home page  
	@FindBy(xpath = "/html/body/header/div[2]/div/div[2]/nav/ul/li[1]")
	WebElement grades_btn;
	public void open_Grades_Page() 
	{
		clickOn(grades_btn);
		
	}
	
	
	//{A03}Portal button in home page 
	@FindBy(xpath = "/html/body/header/div[2]/div/div[2]/nav/ul/li[2]")
	WebElement portals_btn;
	public void open_Portal_Page() 
	{
		clickOn(portals_btn);
	}
	
	// {A04}User guide button in home page 
	@FindBy(xpath = "/html/body/header/div[2]/div/div[3]/ul/li/a")
	WebElement userGuide;
	public void openUserGuIdePage()
	{
		clickOn(userGuide);
	}
	
	
	//{A05}_student button in home page 
	@FindBy(xpath = "/html/body/div/div/div/main/section[1]/div/div[2]/div/a[1]")
	WebElement student_Btn;
	public void open_Student_Grades() 
	{
		clickOn(student_Btn);
	}
	
	//{A06}educator button in home page 
	@FindBy(xpath = "/html/body/div/div/div/main/section[1]/div/div[2]/div/a[2]")
	WebElement educators_Btn;
	public void open_Educators_portal() 
	{
		clickOn(educators_Btn);
	}
	
	//{A07}open get your portal now 
	@FindBy(linkText = "Get Your Portal Now")
	WebElement get_your_portal_now_btn;
	public void open_get_your_portal_page() 
	{
		clickOn(get_your_portal_now_btn);
	}
	
	
	
	
	//Information about nagwa company 
	
	// {A08}About nagwa company 
	@FindBy(linkText = "About Us")
	WebElement about_us_btn;
	public void open_about_us_page() 
	{
		scrollToBottom();
		clickOn(about_us_btn);
	}
	
	
	//{A09}Contact us : contact with nagwa company
	@FindBy(linkText = "Contact Us")
	WebElement contactUsBtn;
	public void openContactUsPage()
	{
		scrollToBottom();
		clickOn(contactUsBtn);
	}
	
	//{A10}Privacy Policy of Nagwa company
	@FindBy(linkText = "Privacy Policy")
	WebElement privacy_Policy;
	public void open_privacy_policy_page()
	{
		clickOn(privacy_Policy);
	}
	
	//{A11}Terms and Conditions of nagwa company
	@FindBy(linkText = "Terms and Conditions")
	WebElement terms_and_Conditions;
	public void open_term_and_conditions_page() 
	{
		clickOn(terms_and_Conditions);
	}
	
	//{A12}open careers page of nagwa company 
	@FindBy(linkText = "Careers")
	WebElement careers_btn;
	public void open_careers_page() 
	{
		scrollToBottom();
		clickOn(careers_btn);
	}
	
	
	//{A13}open courses page 
	@FindBy(linkText = "Courses")
	WebElement courses_btn;
	public void open_courses_page() 
	{
		scrollToBottom();
		clickOn(courses_btn);
	}
	
	
	//{A14}open lesson page
	@FindBy(linkText = "Lessons")
	WebElement lesson_btn;
	public void open_Lesson_page() 
	{
		scrollToBottom();
		clickOn(lesson_btn);
	}
	
	
	// {A15}open plans page 
	@FindBy(linkText = "Plans")
	WebElement plans_btn;
	public void open_plans_page() 
	{
		scrollToBottom();
		clickOn(plans_btn);
	}
	@FindBy(linkText = "Presentations")
	WebElement presentation_Btn;
	public void openPresentationPage()
	{
		scrollToBottom();
		clickOn(presentation_Btn);
	}
	
	//{A16}open videos page 
	@FindBy(linkText = "Videos")
	WebElement videos_btn;
	public void open_videos_page() 
	{
		scrollToBottom();
		clickOn(videos_btn);
	}
	
	//{A17} open explainers page
	@FindBy(linkText = "Explainers")
	WebElement explainers_btn;
	public void openExplainerPage()
	{
		scrollToBottom();
		clickOn(explainers_btn);
	}

	//{A18}open worksheet page
	@FindBy(linkText = "Worksheets")
	WebElement worksheets_btn;
	public void open_Worksheet_page() 
	{
		scrollToBottom();
		clickOn(worksheets_btn);
	}
	
	
	//{A19}open exam page
	@FindBy(linkText = "Exams")
	WebElement exams_btn;
	public void open_Exams_Page() 
	{
		scrollToBottom();
		clickOn(exams_btn);
	}
	
	// open portals page
	@FindBy(linkText = "Portals")
	WebElement portal_btn;
	public void openPortalsPage() 
	{
		scrollToBottom();
		clickOn(portal_btn);
    }
	
	// {A20}open membership page
	@FindBy(linkText = "Memberships")
	WebElement membership_btn;
	public void open_membership_page() 
	{
		scrollToBottom();
		clickOn(membership_btn);
	}
	
	
	// {A21}open apps page
	@FindBy(linkText = "Apps")
	WebElement apps_btn;
	public void open_apps_page() 
	{
		scrollToBottom();
		clickOn(apps_btn);
	}
	

	
}
