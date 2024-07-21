package DriverSessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class FirstAppiumSession {
  @Test
  public void create() throws MalformedURLException {
	  
	//Desired capabilities are a set of instructions that you can give to Appium before it starts working. 
	  
	  //desired properties we are passing to the server
	  DesiredCapabilities cap = new DesiredCapabilities();
	  cap.setCapability("platformName", "Android");
	  cap.setCapability("appium:automationName", "uiautomator2");
	  cap.setCapability("appium:deviceName", "pixel_5");
	  cap.setCapability("appium:UDID", "emulator-5554");
	  
	  String appPath=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
	  cap.setCapability("appium:app",appPath);
	  
	  //server details
	  URL url=new URL("http://0.0.0.0:4723");
	  
	  //create driver session
	  AppiumDriver driver=new AndroidDriver(url,cap);
	  
	  //print
	  System.out.println("Session id is: "+driver.getSessionId());
	  
  }
}
