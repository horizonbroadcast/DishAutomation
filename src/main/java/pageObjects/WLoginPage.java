package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class WLoginPage {

	public WLoginPage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//object id of home courasel
	//@AndroidFindBy(id="com.watcho.qa:id/sliderImage")
	//public WebElement courasel;
	//webelement of watcho user tab
		
	//WebElement of watchuser tab
	@AndroidFindBy(xpath="//android.widget.TextView[@text='WATCHO USER']")
	public WebElement watchousertab;
	
	//WebElement of dishd2h tab
		@AndroidFindBy(xpath="//android.widget.TextView[@text='DISH / D2H USER']")
		public WebElement dishd2htab;
		
		
	//WebElement of Email ID / Mobile Number
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Email ID / Mobile Number']")
	public WebElement emailmobile;
				
	//WebElement of Continue
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Continue']")
	public WebElement continueButton;
			
	//WebElement of Login with Facebook
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Login with Facebook']")
	public WebElement facebooklogin;
	
	//WebElement of guestuser
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Skip and Continue as Guest']")
		public WebElement guestuser;
				
	
	}
	
	
	
	

