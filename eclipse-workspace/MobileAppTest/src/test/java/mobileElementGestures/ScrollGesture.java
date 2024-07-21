package mobileElementGestures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;
import Generic.Utility;
import com.google.common.collect.ImmutableMap;

import DriverSessions.DriverUtility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ScrollGesture {
  @Test
  public void testScroll() throws InterruptedException 
  
  {
	  AppiumDriver driver = DriverUtility.initAndroidSession();
	  
	  //view
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //view for action ---> whole list path
	  WebElement pageArea=driver.findElement(AppiumBy.id("android:id/list"));
	  
	  //scroll Gesture
//	  driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
//			  "elementId",((RemoteWebElement)pageArea).getId(),
//			  "direction","down",
//			  "percent",0.75        //1.0 means the whole screen
//			 	  ));
	  
	  
	 Utility.scrollDown(driver,pageArea);
	 System.out.println("Page scroll down!");
	 
	 Thread.sleep(2000);
	 
	 Utility.scrolUp(driver,pageArea);
	 System.out.println("Page scroll up!");
	 
	 Thread.sleep(2000);
	 
	 Utility.scrollUpToCount(driver,pageArea,2); 
	 
	 
	  
	  
	  
	  
  }
}
