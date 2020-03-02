package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class WMorePage {

	public WMorePage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//object id of home courasel
	@AndroidFindBy(id="com.watcho.qa:id/sliderImage")
	public WebElement courasel;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Skip']")
	public WebElement skip;
	
	
	
	}
	
	
	
	

