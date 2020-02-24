package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class WHomePage {

	public WHomePage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//object id of home courasel
	@AndroidFindBy(id="com.watcho.qa:id/sliderImage")
	public WebElement courasel;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Skip']")
	public WebElement skip;
	
	//First element of Webepisode home page
	@AndroidFindBy(xpath="//android.widget.TextView[@text='E1 | Baal baal bache | Ep 1']")
	public WebElement webEpisode ;
	
	//Live channel Titel object location
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Live Channels']")
	public WebElement liveRail;
	
	//Live channel show all
	@AndroidFindBy(xpath="//android.widget.TextView=[@text='Show All']")
	public WebElement liveShowall;
	
	// Live channel show all page   android.widget.ImageView
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	public WebElement nameField;
	
	}
	
	
	
	

