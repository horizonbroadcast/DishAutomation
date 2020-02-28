package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class WPasswdPage {

	public WPasswdPage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	//WebElement of Enter your Dish/D2H password title
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Enter your Dish/D2H password']")
	public WebElement passwordtitle;
	
	
	//WebElement of entry of passwd
		@AndroidFindBy(xpath="//android.widget.EditText[@text='Dish/D2H Password']")
		public WebElement passwdEntry;
		
		//WebElement of entry of signinpasswd
				@AndroidFindBy(xpath="//android.widget.TextView[@text='Sign in']")
				public WebElement signin;
				
		@AndroidFindBy(id ="sdfdfdf")
		public WebElement sdfere;
	
	
	
	
	}
	
	
	
	

