package WTPackage;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)


public class Tests  {
	
     public enum BrowserType { Firefox,Edge,Chrome};
	 private static WebDriver driver;
	 private static String baseUrl = "http://www.avantisteam.com";
	 private static BrowserType driverType;
	
	 public Tests(BrowserType driverType) {
		this.driverType= driverType;
	}
	 // Making list of browsers for testing
	 @Parameters
	 public static List<Object[]> browsersStrings(){
	   return Arrays.asList(new Object[][] { {BrowserType.Firefox}, {BrowserType.Edge} });
	 }
	//Checking existence each of menu items,click on each menu item
	//Checking that scrolling to right place by specify picture existence 
	 //1	 
	@Test
	public void homePageTestMenu() throws Exception {
		//define browser type and open home page
		driver= Init(this.driverType);
		StartHomePage();
		HomePage homePage	=	new HomePage(driver);
	    //Open each main menu item and check that scrolling to right place by specify picture existence 
		homePage.about_Label_Menu.click();
		Assert.assertEquals(true,homePage.about_Picture.isDisplayed());
		
		homePage.vision_Label_Menu.click();
		Assert.assertEquals(true,homePage.vision_Picture.isDisplayed());
		
		homePage.team_Label_Menu.click();
		Assert.assertEquals(true,homePage.team_Picture.isDisplayed());
		
		homePage.innovate_Label_Menu.click();
		Assert.assertEquals(true,homePage.innovate_Picture.isDisplayed());
		
		homePage.socialize_Label_Menu.click();
		Assert.assertEquals(true,homePage.socialize_Picture.isDisplayed());
		
		homePage.contact_Label_Menu.click();
		Assert.assertEquals(true,homePage.contact_Picture.isDisplayed());
		
		homePage.avesomeness_Label_Menu.click();
		Assert.assertEquals(true,homePage.avesomeness_Picture.isDisplayed());
		
		homePage.coolfacts_Label_Menu.click();
		Assert.assertEquals(true,homePage.coolfacts_Picture.isDisplayed());

	}
	
	//2	
	//Checking existence each of menu social net on right side,click on each menu social net item
	//Checking that opening appropriate window 
	@Test
	public void homePageTestSocialMenuRight() throws Exception {
		//define browser type and open home page
		driver= Init(this.driverType);
		StartHomePage();
		HomePage homePage	=	new HomePage(driver);
		Thread.sleep(3000);
		String currentWindowHandle=driver.getWindowHandle();

		//click right menu Mail
        homePage.Right_Menu_Mail.click();
        Thread.sleep(1000);
        String tab = (String) new ArrayList (driver.getWindowHandles()).get(1);
		driver.switchTo().window(tab);
		Assert.assertEquals(true, homePage.Right_Menu_Mail_Btn.isDisplayed());
		driver.close();
		driver.switchTo().window(currentWindowHandle);
		Thread.sleep(1000);
		
		//click right menu Facebook
		homePage.Right_Menu_Facebook.click();      
		Thread.sleep(3000);
		String newWindow	=	SwitchWindow(currentWindowHandle);
		Assert.assertEquals(true, homePage.Facebook_Dialog_Link.isDisplayed());
		driver.close();
		driver.switchTo().window(currentWindowHandle);
		Thread.sleep(3000);
		
		//click right menu Twitter
		homePage.Right_Menu_Twitter.click();
		newWindow	=	SwitchWindow(currentWindowHandle);
		Thread.sleep(3000);
		Assert.assertEquals(true, homePage.Twitter_Dialog_Logo.isDisplayed());
		driver.close();
		driver.switchTo().window(currentWindowHandle);
		Thread.sleep(3000);
		//click right menu Plus
        homePage.Right_Menu_Plus.click();
		newWindow	=	SwitchWindow(currentWindowHandle);
		Thread.sleep(3000);
		Assert.assertEquals(true, homePage.Right_Menu_Plus_Link.isDisplayed());
		homePage.Right_Menu_Plus_Btn.click();

        //click right menu Print -need java script verify
		//homePage.Right_Menu_Print.click();
		
	}
	//3	
	//Checking existence each of links that duplicate  main menu ,click on each link
	//Checking that scrolling to right place by specify picture existence
	@Test
	public void homePageTestInsideLinks() throws Exception {
			//define browser type and open home page
			driver= Init(this.driverType);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			StartHomePage();
			HomePage homePage	=	new HomePage(driver);
			Thread.sleep(3000);
			String currentWindowHandle=driver.getWindowHandle();

			//Click on links on page and checking that scrolling to right place by specify picture existence
			Assert.assertEquals(true,homePage.about_Picture.isDisplayed());
			
			homePage.Inside_Vision_Link.click();
			Assert.assertEquals(true,homePage.vision_Picture.isDisplayed());

			js.executeScript("arguments[0].click();", homePage.Inside_Avesomeness_Link);
			Thread.sleep(3000);
			Assert.assertEquals(true,homePage.avesomeness_Picture.isDisplayed());
			
			js.executeScript("arguments[0].click();", homePage.Inside_Coolfacts_Link);
			Thread.sleep(3000);
			Assert.assertEquals(true,homePage.coolfacts_Picture.isDisplayed());
			
			js.executeScript("arguments[0].click();", homePage.Inside_Team_Link);
			Thread.sleep(3000);
			Assert.assertEquals(true,homePage.team_Picture.isDisplayed());
			
			js.executeScript("arguments[0].click();", homePage.Inside_Innovate_Link);
			Thread.sleep(3000);
			Assert.assertEquals(true,homePage.innovate_Picture.isDisplayed());
			
			js.executeScript("arguments[0].click();", homePage.Inside_Socialize_Link);
			Thread.sleep(3000);
			Assert.assertEquals(true,homePage.socialize_Picture.isDisplayed());
			
			js.executeScript("arguments[0].click();", homePage.Inside_Contact_Link);
			Thread.sleep(3000);
			Assert.assertEquals(true,homePage.contact_Picture.isDisplayed());
		}
	//4	
	//Checking existence each of menu social net on page center,click on each menu social net item
	//Checking that opening appropriate window 
	@Test
	public void homePageTestSocialLinks() throws Exception {
				//define browser type and open home page
				driver= Init(this.driverType);
				StartHomePage();
				HomePage homePage	=	new HomePage(driver);
				String FacebookUrl	=	"https://www.facebook.com/avantisteam";
				String TwitterUrl	=	"https://twitter.com/AvantisTeam";
				String LinkedinUrl	=	"https://www.linkedin.com/company/avantis-team";
				String InstagramUrl	=	"https://www.instagram.com/avantisteam/";
				String GoogleUrl	=	"https://plus.google.com/u/0/116188719201280191799";
				String actualUrl	=	"";
				String tab			=	"";
				
				String	currentWindowHandle = driver.getWindowHandle();
				homePage.socialize_Label_Menu.click();
				
				Thread.sleep(3000);
				
				//click each  social link on page and check that opening right new tab by  checking it url 
				homePage.Social_Facebook_Link.click();
		        SwitchToNewTab();
				Thread.sleep(3000);
				actualUrl	=	driver.getCurrentUrl();
				Assert.assertEquals(FacebookUrl,actualUrl);		
				driver.close();
				driver.switchTo().window(currentWindowHandle);
				
				homePage.Social_Twitter_Link.click();
		        SwitchToNewTab();
				Thread.sleep(3000);
				actualUrl	=	driver.getCurrentUrl();
				Assert.assertEquals(TwitterUrl,actualUrl);
				driver.close();
				driver.switchTo().window(currentWindowHandle);
				
				homePage.Social_Instagram_Link.click();
		        SwitchToNewTab();
				Thread.sleep(3000);
				actualUrl	=	driver.getCurrentUrl();
				Assert.assertEquals(InstagramUrl,actualUrl);
				driver.close();
				driver.switchTo().window(currentWindowHandle);
				
			
				homePage.Social_Linkedin_Link.click();
		        SwitchToNewTab();
				Thread.sleep(3000);
				actualUrl	=	driver.getCurrentUrl();
				Assert.assertEquals(LinkedinUrl,actualUrl);
				driver.close();
				driver.switchTo().window(currentWindowHandle);
				
				homePage.Social_Google_Link.click();
		        SwitchToNewTab();
				Thread.sleep(3000);
				actualUrl	=	driver.getCurrentUrl();
				Assert.assertEquals(GoogleUrl,actualUrl);				
				driver.close();
				driver.switchTo().window(currentWindowHandle);
				
			
			}
	//5
	//Check Contact Us,put several negative scenarios as
	//1.Fill one field click Contact Us button 
	//2.Fill two field with wrong address format click Contact Us button 
	//3.Fill nothing? click Contact Us button 
	//Check positive scenario ,fill all fields right,click contactUs button
@Test
    public void CheckContactUsService() throws Exception {
	driver= Init(this.driverType);
	StartHomePage();
    }
    
@After
public void CloseDrivder() {
	driver.close();

}
//switch driver to new tab
	public static void SwitchToNewTab() throws InterruptedException {
		Thread.sleep(1000);
        String tab = (String) new ArrayList (driver.getWindowHandles()).get(1);
		driver.switchTo().window(tab);
		
	}
	//switch driver to new window
	public static String SwitchWindow(String currentWindowHandle) {
	
	    for(String windowHandle : driver.getWindowHandles()){
	        if(!windowHandle.equals(currentWindowHandle)){
	            driver.switchTo().window(windowHandle);
	            return  windowHandle; 
	        }
	    }
	    return "";
	}
	public static void StartHomePage(){
		 driver.get(baseUrl);
		 driver.manage().window().maximize();

    }
	// ncreating driver according with browser type
    public static WebDriver Init(BrowserType browser) throws Exception
    {
    
    	WebDriver driverTest=null;
         switch (browser)
         {
             case Firefox:
         			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
         			driverTest= new FirefoxDriver();	
             break;
             case Edge:
        		 System.setProperty("webdriver.edge.driver", "MicrosoftWebDriver.exe");
        		 EdgeOptions capabilities = new EdgeOptions();
        		 driverTest= new EdgeDriver(capabilities);   
             break;
             default: throw new Exception("Driver type undefined");
             
         }
         return driverTest;
    }
}
