package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class P015_PlansPage extends PageBase {

    public P015_PlansPage(WebDriver driver) {
        super(driver);
        jes=(JavascriptExecutor) driver;

    }

    @FindBy(className = "page-title")
    public WebElement pageTitle;

    @FindBy(id = "lessons_next")
    WebElement nextLessonPlanBtn;

    @FindBy(id = "lessons_previous")
    WebElement previousLessonPlanBtn;

    @FindBy(xpath = "/html/body/div/div/div/main/div/ul/li[1]/a")
    WebElement firstLessonPlan;

    @FindBy(xpath = "/html/body/div/div/div/main/div/ul/li[2]/a")
    WebElement secondLessonPlan;

    @FindBy(xpath = "/html/body/div/div/div/main/div/ul/li[3]/a")
    WebElement thirdLessonPlan;

    @FindBy(id = "NagwaLitePlayer")
    public WebElement videoPlayer;

    @FindBy(xpath = "//div[@class='components']//ul//li//div//a")
    public List<WebElement> lessonComponent;

    public void openFirstLessonPlan() {
        clickOn(firstLessonPlan);
    }

    public void openSecondLessonPlan() {
        clickOn(secondLessonPlan);
    }

    public void openThirdLessonPlan() {
        clickOn(thirdLessonPlan);
    }

    public void previewTheNextLessonPlanPage() {
        scrollToBottom();
        clickOn(nextLessonPlanBtn);
    }

    public void previewThePreviousLessonPlanPage() {
        scrollToBottom();
        clickOn(previousLessonPlanBtn);
    }

    public void openLessonComponent() {
        for (WebElement component : lessonComponent) {
            try {
                if (component.getText().equalsIgnoreCase("Lesson")) {
                    clickOn(component);
                    Thread.sleep(1000);
                }
            } catch (Exception e) {
                System.out.println("lesson component doesn't exist");
            }
        }
        for (WebElement component : lessonComponent) {
            try {
                if (component.getText().equalsIgnoreCase("Lesson Plan")) {
                    clickOn(component);
                    Thread.sleep(1000);
                    scrollToBottom();
                    Thread.sleep(1000);
                    scrollToUP();

                }
            } catch (Exception e) {
                System.out.println("Lesson Plan component doesn't exist");
            }
        }
        for (WebElement component : lessonComponent) {
            try {
                if (component.getText().equalsIgnoreCase("Lesson Presentation")) {
                    clickOn(component);
                    Thread.sleep(1000);
                    scrollToBottom();
                    Thread.sleep(1000);
                    scrollToUP();

                }
            } catch (Exception e) {
                System.out.println("Lesson Presentation component doesn't exist");
            }
        }
        for (WebElement component : lessonComponent) {
            try {
                if (component.getText().equalsIgnoreCase("Lesson Video")) {
                    clickOn(component);
                    Thread.sleep(1000);
                    openVideos(videoPlayer);


                }
            } catch (Exception e) {
                System.out.println("Lesson Video component doesn't exist");
            }
        }
        for (WebElement component : lessonComponent) {
            try {
                if (component.getText().equalsIgnoreCase("Lesson Explainer")) {
                    clickOn(component);
                    Thread.sleep(1000);
                    scrollToBottom();
                    Thread.sleep(1000);
                    scrollToUP();

                }
            } catch (Exception e) {
                System.out.println("Lesson Explainer component doesn't exist");
            }
        }
        for (WebElement component : lessonComponent) {
            try {
                if (component.getText().equalsIgnoreCase("Lesson Worksheet")) {
                    clickOn(component);
                    Thread.sleep(1000);
                    scrollToBottom();
                    Thread.sleep(1000);
                    scrollToUP();

                }
            } catch (Exception e) {
                System.out.println("Lesson Worksheet component doesn't exist");
            }
        }


    }
}
