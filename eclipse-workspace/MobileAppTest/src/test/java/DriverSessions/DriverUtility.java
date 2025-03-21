package DriverSessions;

             
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class DriverUtility {
	
public static  AppiumDriver driver;   //can access only static method without object using just classname
	
	public static AppiumDriver initAndroidSession()
	{
		UiAutomator2Options options=new UiAutomator2Options();
		  options.setPlatformName("Android");
		  
		  String appPath=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
		  options.setCapability("appium:app", appPath);

		  
		  //server setup
		  URL url;
		try {
			url = new URL("http://0.0.0.0:4723");
			//create driver session
			  driver=new AndroidDriver(url,options);
			  System.out.println("Session id is: "+driver.getSessionId());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  return driver;
		  
	}

}
