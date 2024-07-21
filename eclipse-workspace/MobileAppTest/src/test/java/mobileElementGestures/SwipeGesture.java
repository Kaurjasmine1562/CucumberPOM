package mobileElementGestures;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Generic.Utility;

import DriverSessions.DriverUtility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class SwipeGesture {
	 @Test
	  public void testSwipe()
	  {
		  AppiumDriver driver=DriverUtility.initAndroidSession();
			 
			 //view
			driver.findElement(AppiumBy.accessibilityId("Views")).click();
			 
			 //gallery
			 driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
			 
			 //photos
			 driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
			 
			 //elearea-swipe
			 
			 WebElement area=driver.findElement(AppiumBy.id("io.appium.android.apis:id/gallery"));
			 //swipe
			 
//			 driver.executeScript("mobile: swipeGesture",ImmutableMap.of(
//					 "elementId",((RemoteWebElement)area).getId(),
//					 "direction","left",
//					 "percent",0.75
//					  ));
//			 
			 Utility.swipeLeft(driver,area);
			 
			 System.out.println("Swipe Gesture Completed!");




		  
		  
		  
		  
	  }
	}
