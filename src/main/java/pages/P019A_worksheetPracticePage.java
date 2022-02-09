package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class P019A_worksheetPracticePage extends PageBase {
    public P019A_worksheetPracticePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div/main/section/div/div[3]/a[1]")
    WebElement next_btn;

    @FindBy(id = "submitbtn")
    WebElement saveWorksheet;

    @FindBy(xpath = "//ul[@class='mcq_choices']//li")
    List<WebElement>choices;

    @FindBy(id = "mcq_choices")
    public WebElement choicesContainer;

    @FindBy(id = "sampleID")
    public WebElement textBox;

    @FindBy(xpath = "//ul[@class='questions-nums']//li//a")
    public List<WebElement> questionIcons;

    @FindBy(className = "one-part-question")
    public WebElement onePartQuestion;

    @FindBy(className = "multi-part-question")
    public WebElement multiPartQuestion;

    @FindBy(xpath = "//div[@data-orderininstance='1']")
    public WebElement multiPart_PartOne;

    @FindBy(xpath = "//div//input[@data-mcqno='1' and @id='sampleID']")
    public WebElement multiPart_PartOne_TextBox;

    @FindBy(xpath = "//div[@data-mcqno='1' and @id='mcq_choices']//ul[@class='mcq_choices' and @data-mcqno='1']")
    public WebElement multiPart_PartOne_MultipleChoice_Container;

    @FindBy(xpath = "//div[@data-mcqno='1' and @id='mcq_choices']//ul//li//span")
    public WebElement multiPart_PartOne_Choice_A;

    @FindBy(xpath = "//div[@data-orderininstance='2']")
    public WebElement multiPart_PartTwo;

    @FindBy(xpath = "//div//input[@data-mcqno='2' and @id='sampleID']")
    public WebElement multiPart_PartTwo_TextBox;

    @FindBy(xpath = "//div[@data-mcqno='2' and @id='mcq_choices']//ul[@class='mcq_choices' and @data-mcqno='1']")
    public WebElement multiPart_PartTwo_MultipleChoice_Container;

    @FindBy(xpath = "//div[@data-mcqno='2' and @id='mcq_choices']//ul//li//span")
    public WebElement multiPart_PartTwo_Choice_A;

    @FindBy(xpath = "//div[@data-orderininstance='3']")
    public WebElement multiPart_PartThree;

    @FindBy(xpath = "//div//input[@data-mcqno='3' and @id='sampleID']")
    public WebElement multiPart_PartThree_TextBox;

    @FindBy(xpath = "//div[@data-mcqno='3' and @id='mcq_choices']//ul[@class='mcq_choices' and @data-mcqno='1']")
    public WebElement multiPart_PartThree_MultipleChoice_Container;

    @FindBy(xpath = "//div[@data-mcqno='3' and @id='mcq_choices']//ul//li//span")
    public WebElement multiPart_PartThree_Choice_A;


    public int numberOfQuestions = questionIcons.size();
    @FindBy(xpath = "//*[@id=\"mcq_choices\"]/ul/li[1]/span")
    WebElement choiceA;

    @FindBy(id = "savebtn")
    WebElement submit_Answer;

    public void solveWorksheet() throws InterruptedException
    {
        for (int i =1;i<=numberOfQuestions;i++)
        {
            try {
                WebElement element = questionIcons.get(i);
                element.click();
                if(onePartQuestion.isDisplayed())
                {
                if(choicesContainer.isDisplayed()&&choiceA.isEnabled())
                {
                    clickOn(choiceA);
                    clickOn(submit_Answer);
                    Thread.sleep(2000);
                }
                else if(textBox.isDisplayed()&&textBox.isEnabled())
                {
                    textBox.clear();
                    writeData(textBox,"2");
                    clickOn(submit_Answer);
                    Thread.sleep(2000);
                }
                }else if(multiPartQuestion.isDisplayed())
                {
                  if(multiPart_PartOne.isDisplayed() && multiPart_PartTwo.isDisplayed() && multiPart_PartThree.isDisplayed())
                  {
                      // three question{choose , choose ,choose}
                    if(multiPart_PartOne_MultipleChoice_Container.isDisplayed()
                            && multiPart_PartTwo_MultipleChoice_Container.isDisplayed()
                            && multiPart_PartThree_MultipleChoice_Container.isDisplayed()
                            && multiPart_PartOne_Choice_A.isEnabled()
                            && multiPart_PartTwo_Choice_A.isEnabled()
                            && multiPart_PartThree_Choice_A.isEnabled())
                    {
                        clickOn(multiPart_PartOne_Choice_A);
                        Thread.sleep(300);
                        clickOn(multiPart_PartTwo_Choice_A);
                        Thread.sleep(300);
                        clickOn(multiPart_PartThree_Choice_A);
                        clickOn(submit_Answer);
                        Thread.sleep(2000);
                    }
                         // three question{choose , choose,free form}
                    else if(   multiPart_PartOne_MultipleChoice_Container.isDisplayed()
                            && multiPart_PartTwo_MultipleChoice_Container.isDisplayed()
                            && multiPart_PartThree_TextBox.isDisplayed()
                            && multiPart_PartOne_Choice_A.isEnabled()
                            && multiPart_PartTwo_Choice_A.isEnabled()
                            && multiPart_PartThree_TextBox.isEnabled())
                    {
                        clickOn(multiPart_PartOne_Choice_A);
                        Thread.sleep(300);
                        clickOn(multiPart_PartTwo_Choice_A);
                        Thread.sleep(300);
                        writeData(multiPart_PartThree_TextBox,"9");
                        Thread.sleep(300);
                        clickOn(submit_Answer);
                        Thread.sleep(2000);
                    }
                       //three question{choose, free form , choose}
                    else if(   multiPart_PartOne_MultipleChoice_Container.isDisplayed()
                            && multiPart_PartTwo_TextBox.isDisplayed()
                            && multiPart_PartThree_MultipleChoice_Container.isDisplayed()
                            && multiPart_PartOne_Choice_A.isEnabled()
                            && multiPart_PartTwo_TextBox.isEnabled()
                            && multiPart_PartThree_Choice_A.isEnabled())
                    {
                        clickOn(multiPart_PartOne_Choice_A);
                        Thread.sleep(300);
                        writeData(multiPart_PartTwo_TextBox,"5");
                        Thread.sleep(300);
                        clickOn(multiPart_PartThree_Choice_A);
                        clickOn(submit_Answer);
                        Thread.sleep(2000);
                    }
                    //three question{choose, free form, free form}
                    else if(   multiPart_PartOne_MultipleChoice_Container.isDisplayed()
                            && multiPart_PartTwo_TextBox.isDisplayed()
                            && multiPart_PartThree_TextBox.isDisplayed()
                            && multiPart_PartOne_Choice_A.isEnabled()
                            && multiPart_PartTwo_TextBox.isEnabled()
                            && multiPart_PartThree_TextBox.isEnabled())
                    {
                        clickOn(multiPart_PartOne_Choice_A);
                        Thread.sleep(300);
                        writeData(multiPart_PartTwo_TextBox,"7");
                        Thread.sleep(300);
                        writeData(multiPart_PartThree_TextBox,"2");
                        clickOn(submit_Answer);
                        Thread.sleep(2000);
                    }
                    //three question{free form, free form, free form}
                    else if(   multiPart_PartOne_TextBox.isDisplayed()
                            && multiPart_PartTwo_TextBox.isDisplayed()
                            && multiPart_PartThree_TextBox.isDisplayed()
                            && multiPart_PartOne_TextBox.isEnabled()
                            && multiPart_PartTwo_TextBox.isEnabled()
                            && multiPart_PartThree_TextBox.isEnabled())
                    {
                        writeData(multiPart_PartOne_TextBox,"1");
                        Thread.sleep(300);
                        writeData(multiPart_PartTwo_TextBox,"2");
                        Thread.sleep(300);
                        writeData(multiPart_PartThree_TextBox,"3");
                        clickOn(submit_Answer);
                        Thread.sleep(2000);
                    }
                        //three question {free form ,free form, choose }
                    else if(   multiPart_PartOne_TextBox.isDisplayed()
                            && multiPart_PartTwo_TextBox.isDisplayed()
                            && multiPart_PartThree_MultipleChoice_Container.isDisplayed()
                            && multiPart_PartOne_TextBox.isEnabled()
                            && multiPart_PartTwo_TextBox.isEnabled()
                            && multiPart_PartThree_Choice_A.isEnabled())
                    {
                        writeData(multiPart_PartOne_TextBox,"6");
                        Thread.sleep(300);
                        writeData(multiPart_PartTwo_TextBox,"5");
                        Thread.sleep(300);
                        clickOn(multiPart_PartThree_Choice_A);
                        clickOn(submit_Answer);
                        Thread.sleep(2000);
                    }
                    // three question {free form , choose, free form}
                    else if(   multiPart_PartOne_TextBox.isDisplayed()
                            && multiPart_PartTwo_MultipleChoice_Container.isDisplayed()
                            && multiPart_PartThree_TextBox.isDisplayed()
                            && multiPart_PartOne_TextBox.isEnabled()
                            && multiPart_PartTwo_Choice_A.isEnabled()
                            && multiPart_PartThree_TextBox.isEnabled())
                    {
                        writeData(multiPart_PartOne_TextBox,"3");
                        Thread.sleep(300);
                        clickOn(multiPart_PartTwo_Choice_A);
                        Thread.sleep(300);
                        writeData(multiPart_PartThree_TextBox,"5");
                        clickOn(submit_Answer);
                        Thread.sleep(2000);
                    }

                    // three question {free form , choose,choose}
                    else if(   multiPart_PartOne_TextBox.isDisplayed()
                            && multiPart_PartTwo_MultipleChoice_Container.isDisplayed()
                            && multiPart_PartThree_MultipleChoice_Container.isDisplayed()
                            && multiPart_PartOne_TextBox.isEnabled()
                            && multiPart_PartTwo_Choice_A.isEnabled()
                            && multiPart_PartThree_Choice_A.isEnabled())
                    {
                        writeData(multiPart_PartOne_TextBox,"4");
                        Thread.sleep(300);
                        clickOn(multiPart_PartTwo_Choice_A);
                        Thread.sleep(300);
                        clickOn(multiPart_PartThree_Choice_A);
                        clickOn(submit_Answer);
                        Thread.sleep(2000);
                    }
                  }
                  if(multiPart_PartOne.isDisplayed() && multiPart_PartTwo.isDisplayed())
                  {
                   // two question{choose , choose }
                      if(        multiPart_PartOne_MultipleChoice_Container.isDisplayed()
                              && multiPart_PartTwo_MultipleChoice_Container.isDisplayed()
                              && multiPart_PartOne_Choice_A.isEnabled()
                              && multiPart_PartTwo_Choice_A.isEnabled())
                      {
                          clickOn(multiPart_PartOne_Choice_A);
                          Thread.sleep(300);
                          clickOn(multiPart_PartTwo_Choice_A);
                          clickOn(submit_Answer);
                          Thread.sleep(2000);
                      }
                      // two question{choose, free form}
                      else if(    multiPart_PartOne_MultipleChoice_Container.isDisplayed()
                              &&  multiPart_PartTwo_TextBox.isDisplayed()
                              &&  multiPart_PartOne_Choice_A.isEnabled()
                              &&  multiPart_PartTwo_TextBox.isEnabled())
                      {
                          clickOn(multiPart_PartOne_Choice_A);
                          Thread.sleep(300);
                          writeData(multiPart_PartTwo_TextBox,"2");
                          Thread.sleep(300);
                          clickOn(submit_Answer);
                          Thread.sleep(2000);
                      }
                      // two question{free form , choose}
                      else if(    multiPart_PartOne_TextBox.isDisplayed()
                              &&  multiPart_PartTwo_MultipleChoice_Container.isDisplayed()
                              &&  multiPart_PartOne_TextBox.isEnabled()
                              &&  multiPart_PartTwo_Choice_A.isEnabled())
                      {
                          writeData(multiPart_PartOne_TextBox,"2");
                          Thread.sleep(300);
                          clickOn(multiPart_PartTwo_Choice_A);
                          Thread.sleep(300);
                          clickOn(submit_Answer);
                          Thread.sleep(2000);
                      }
                      else if (multiPart_PartOne_TextBox.isDisplayed()
                              &&multiPart_PartTwo_TextBox.isDisplayed()
                              &&multiPart_PartOne_TextBox.isEnabled()
                              &&multiPart_PartTwo_TextBox.isEnabled())
                      {

                          writeData(multiPart_PartOne_TextBox,"2");
                          Thread.sleep(300);
                          writeData(multiPart_PartTwo_TextBox,"5");
                          Thread.sleep(300);
                          clickOn(submit_Answer);
                          Thread.sleep(2000);
                      }
                  }
                }
            }catch (Exception e)
            {
                System.out.println("there is an error in questions");
            }
        }
        clickOn(saveWorksheet);
        Thread.sleep(2000);
    }
}