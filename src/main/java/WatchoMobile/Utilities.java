package WatchoMobile;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

import java.time.Duration;

public class Utilities {
	AndroidDriver<AndroidElement>  driver;

	public Utilities(AndroidDriver<AndroidElement> driver)
	{
		this.driver=driver;
	}

/* Method to scroll to the Text described in the string*/
	
	public void scrollToText(String text)
	{
	     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));");
	}


	/* Method the Scroll incase the first method is not functioning properly, and the screen is not properly visible */

	public void scrolltopage(String text)

	{

	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))"));
	
	int count=    driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
	 
		    for(int i=0;i<count;i++)
	
	    {
	
	    String text1=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
	   
	    if(text1.equalsIgnoreCase("Jordan 6 Rings"))
	
	    {
	 
	driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
	
	break;
	
	
	    }
	    }
	}

	//Mobile Gestures
	//This function is used to perform Tap option.

	public void Tapfunc(WebElement checkbox )
		{
		//WebElement checkbox=driver.findElement(By.className("android.widget.CheckBox"));
	
		TouchAction t=new TouchAction(driver);
	
		t.tap(tapOptions().withElement(element(checkbox))).perform();
		
		}

	//Long press function set to 2 seconds  Longpress is the webelement.
	
	public void LongPress(WebElement Longpress)
		{
		//WebElement pn=	driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		TouchAction t =new TouchAction(driver);
		t.longPress(longPressOptions().withElement(element(Longpress)).withDuration(ofSeconds(2))).release().perform();
		//Thread.sleep(2000);
		//System.out.println(driver.findElementById("android:id/title").isDisplayed());
		}
	
	
	//Function is basically used for Drag and drop of webelements from source to destination.
	
	
	public void DragDrop(WebElement source, WebElement destination)
	{
	 
     //WebElement source=driver.findElementsByClassName("android.view.View").get(0);
     //WebElement destination=driver.findElementsByClassName("android.view.View").get(1);
        
     TouchAction t = new TouchAction(driver);
     //longpress(source)/move(destination)//release
    t.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();
     //t.longPress(element(source)).moveTo(element(destination)).release().perform();
	}

	/**
	  /* Method to swipe screen from Bottom to Top (Vertical) Get the size of
	  * screen. Find swipe start and end point from screen's width and height.
	  * Find starty point which is at bottom side of screen. Find endy point
	  * which is at top side of screen. Find horizontal point where you wants to
	  * swipe. It is in middle of screen width.
	  * Time duration should be in milliseconds
	  */

	 public void bottomTopswipe(int timeduration) {
 
	  Dimension size = driver.manage().window().getSize();
	  System.out.println(size);
	  int startpoint = (int) (size.height * 0.70);
	  int endpoint = (int) (size.height * 0.20);
	  int width = size.width / 2;
	  System.out.println("Start swipe operation");
	  TouchAction t= new TouchAction(driver);
	  t.longPress(PointOption.point(width , endpoint)).waitAction(WaitOptions.waitOptions(ofSeconds(1))).moveTo(PointOption.point(width,startpoint)).release().perform();
	  //touchAction.longPress(PointOption.point(startx, starty)).waitAction(WaitOptions.waitOptions(ofSeconds(1))).moveTo(PointOption.point(endx, endy)).release().perform();

	 }
	 

	
	
}