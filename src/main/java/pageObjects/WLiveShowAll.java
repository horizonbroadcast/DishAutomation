package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class WLiveShowAll {
	public WLiveShowAll(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	// Live channel show all pageandroid.widget.ImageView
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	private WebElement nameField;
	
	
	@AndroidFindBy(xpath="//*[@text='Female']")
	public WebElement femaleOption;
	// driver.findElement(By.id("android:id/text1")).click();
	@AndroidFindBy(id="android:id/text1")
	private WebElement countrySelection;
	
	

}
