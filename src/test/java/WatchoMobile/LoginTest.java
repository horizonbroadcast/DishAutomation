package WatchoMobile;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import WatchoMobile.base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.WHomePage;

public class LoginTest extends base {
	
	@Test
	public void mainTest() throws IOException, InterruptedException
	{
	service= startServer();
	
	AndroidDriver<AndroidElement> driver=capabilities("watcho");
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
//xpath id className, androidUIautomator
 /*    xpath Syntax
  *    //tagName[@attribute='value']

  * 
  */
 WHomePage h=new WHomePage(driver);
 //Constructor of class will be invoked when you create object for the class
 
// default constructor be called
 
 //constructor can be defined with arguments
 
//   driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
 
 //You can call the methods or variables of the class with class object
 //Thread.sleep(20000);
 
String S = h.skip.getText();

if (S.equalsIgnoreCase("Skip"))
{
 h.skip.click();
}
 
 h.webEpisode.click();
 
 //h.courasel.click();
 
 


}
}
