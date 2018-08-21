package WTPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class HomePage {
 
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;
   
    private final String about_Label_Menu_Xpath			="//*[@href='#aboutus']";
    private final String vision_Label_Menu_Xpath		="//*[@href='#vision']";
    private final String avesomeness_Label_Menu_Xpath	="//*[@href='#careers']";
    private final String coolfacts_Label_Menu_Xpath		="//*[@href='#factsNew']";
    private final String team_Label_Menu_Xpath			="//*[@href='#team']";
    private final String innovate_Label_Menu_Xpath		="//*[@href='#innovate']";
    private final String socialize_Label_Menu_Xpath		="//*[@href='#socialize']";
    private final String contact_Label_Menu_Xpath		="//*[@href='#contact']";
    private final String about_Picture_Xpath			="//h1[contains(text(),'AD')]";
    private final String vision_Picture_Xpath			="//h1[contains(text(),'VISION')]";
    private final String avesomeness_Picture_Xpath		="//div[@class='logoText']";
    private final String coolfacts_Picture_Xpath		="//div[@class='hedingDiv2']";
    private final String team_Picture_Xpath				="//div[@class='firstThird']";
    private final String innovate_Picture_Xpath			="//div[@class='differentiateHeading']";
    private final String socialize_Picture_Xpath		="//section[7]//a[3]/img";
    private final String contact_Picture_Xpath			="//div[@class='beInTouch']";
    private final String avesome_Link_Xpath				="//section[2]//a";
    
    private final String Right_Menu_Print_Xpath			="//*[@class='at-icon at-icon-print']";
    private final String Right_Menu_Twitter_Xpath		="//*[@class='at-share-btn at-svc-twitter']";
    private final String Right_Menu_Facebook_Xpath		="//*[@class='at-share-btn at-svc-facebook at4-share-count-anchor']";
    private final String Right_Menu_Mail_Xpath			="//*[@class='at-share-btn at-svc-email']";
    private final String Right_Menu_Plus_Xpath			="//*[@class='at-share-btn at-svc-compact at4-share-count-anchor']";
    private final String Twitter_Dialog_Logo_Xpath		="//h1[@class='logo']";
    private final String Facebook_Dialog_Link_Xpath		="//*[@id='forgot-password-link']";
    private final String Right_Menu_Mail_Btn_Xpath		="//*[@class='at-expanded-menu-email-btn']";
    private final String Right_Menu_Plus_Link_Xpath		="//*[@class='at-expanded-menu-top-services-header']";
    private final String Right_Menu_Plus_Btn_Xpath		="//button[@class='at-expanded-menu-close']";

   
    private final String Inside_Vision_Link_Xpath		="//section[1]//*[@href='#vision']";
    private final String Inside_Avesomeness_Link_Xpath	="//section[2]//*[@href='#careers']";
    private final String Inside_Coolfacts_Link_Xpath	="//section[3]//*[@href='#factsNew']";
    private final String Inside_Team_Link_Xpath			="//section[4]//*[@href='#team']";
    private final String Inside_Innovate_Link_Xpath		="//section[5]//*[@href='#innovate']";
    private final String Inside_Socialize_Link_Xpath	="//section[6]//*[@href='#socialize']";
    private final String Inside_Contact_Link_Xpath		="//section[7]//*[@href='#contact']";
    
    private final String Social_Facebook_Link_Xpath		="//*[@class='social_facebook']";
    private final String Social_Twitter_Link_Xpath		="//*[@class='social_twitter']";
    private final String Social_Linkedin_Link_Xpath		="//*[@class='social_in']";
    private final String Social_Instagram_Link_Xpath	="//*[@class='social_insta']";
    private final String Social_Google_Link_Xpath		="//*[@class='social_google']";

    @FindBy(xpath = Social_Facebook_Link_Xpath)
    public WebElement Social_Facebook_Link;

    @FindBy(xpath = Social_Twitter_Link_Xpath)
    public WebElement Social_Twitter_Link;

    @FindBy(xpath = Inside_Vision_Link_Xpath)
    public WebElement Inside_Vision_Link;

    @FindBy(xpath = Social_Linkedin_Link_Xpath)
    public WebElement Social_Linkedin_Link;

    @FindBy(xpath = Social_Instagram_Link_Xpath)
    public WebElement Social_Instagram_Link;

   
    @FindBy(xpath = Inside_Vision_Link_Xpath)
    public WebElement Social_Google_Link;

    @FindBy(xpath = Inside_Avesomeness_Link_Xpath)
    public WebElement Inside_Avesomeness_Link;

    @FindBy(xpath = Inside_Coolfacts_Link_Xpath)
    public WebElement Inside_Coolfacts_Link;

    @FindBy(xpath = Inside_Team_Link_Xpath)
    public WebElement Inside_Team_Link;

    @FindBy(xpath = Inside_Innovate_Link_Xpath)
    public WebElement Inside_Innovate_Link;

    @FindBy(xpath = Inside_Socialize_Link_Xpath)
    public WebElement Inside_Socialize_Link;

    @FindBy(xpath = Inside_Contact_Link_Xpath)
    public WebElement Inside_Contact_Link;
    
    @FindBy(xpath = Right_Menu_Plus_Btn_Xpath)
    public WebElement Right_Menu_Plus_Btn;

   @FindBy(xpath = Right_Menu_Plus_Link_Xpath)
    public WebElement Right_Menu_Plus_Link;

    @FindBy(xpath = Right_Menu_Mail_Btn_Xpath)
    public WebElement Right_Menu_Mail_Btn;

    
    @FindBy(xpath = Facebook_Dialog_Link_Xpath)
    public WebElement Facebook_Dialog_Link;
    
    @FindBy(xpath = Twitter_Dialog_Logo_Xpath)
    public WebElement Twitter_Dialog_Logo;
    
    @FindBy(xpath = Right_Menu_Print_Xpath)
    public WebElement Right_Menu_Print;
    
    @FindBy(xpath = Right_Menu_Twitter_Xpath)
    public WebElement Right_Menu_Twitter;
    
    @FindBy(xpath = Right_Menu_Facebook_Xpath)
    public WebElement Right_Menu_Facebook;
    
    @FindBy(xpath = Right_Menu_Mail_Xpath)
    public WebElement Right_Menu_Mail;
    
    @FindBy(xpath = Right_Menu_Plus_Xpath)
    public WebElement Right_Menu_Plus;
    
    
    @FindBy(xpath = about_Label_Menu_Xpath)
    public WebElement about_Label_Menu;

    @FindBy(xpath = vision_Label_Menu_Xpath)
    public WebElement vision_Label_Menu;

    @FindBy(xpath = avesomeness_Label_Menu_Xpath)
    public WebElement avesomeness_Label_Menu;

    @FindBy(xpath = coolfacts_Label_Menu_Xpath)
    public WebElement coolfacts_Label_Menu;

    @FindBy(xpath = team_Label_Menu_Xpath)
    public WebElement team_Label_Menu;

    @FindBy(xpath = innovate_Label_Menu_Xpath)
    public WebElement innovate_Label_Menu;


    @FindBy(xpath = socialize_Label_Menu_Xpath)
    public WebElement socialize_Label_Menu;

    @FindBy(xpath = contact_Label_Menu_Xpath)
    public WebElement contact_Label_Menu;

    @FindBy(xpath = about_Picture_Xpath)
    public WebElement about_Picture;

    @FindBy(xpath = vision_Picture_Xpath)
    public WebElement vision_Picture;

    @FindBy(xpath = avesomeness_Picture_Xpath)
    public WebElement avesomeness_Picture;

    @FindBy(xpath = coolfacts_Picture_Xpath)
    public WebElement coolfacts_Picture;

    @FindBy(xpath = team_Picture_Xpath)
    public WebElement team_Picture;

    @FindBy(xpath = innovate_Picture_Xpath)
    public WebElement innovate_Picture;


    @FindBy(xpath = socialize_Picture_Xpath)
    public WebElement socialize_Picture;

    @FindBy(xpath = contact_Picture_Xpath)
    public WebElement contact_Picture;

   
    
    @FindBy(xpath = avesome_Link_Xpath)
    public WebElement avesome_Link;
   
}