package automation.config;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class AppiumDriverConfig {
	
	public final AppiumDriver driver;
	
	
	
	private static AppiumDriverConfig _instance;
	public static AppiumDriverConfig Instance()  {
		if(AppiumDriverConfig._instance == null) {
			AppiumDriverConfig._instance = new AppiumDriverConfig();
		}
		return AppiumDriverConfig._instance;
	}
	private AppiumDriverConfig()  {
		File apk = new File("C:\\Users\\Fabio Petry\\eclipse-workspace\\Automation\\src\\main\\java\\automation\\apk\\instagram.apk");
		DesiredCapabilities configurations = new DesiredCapabilities();
		configurations.setCapability(MobileCapabilityType.APP, apk.getAbsolutePath());
		configurations.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		configurations.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		configurations.setCapability("appPackage", "com.instagram.android");
		configurations.setCapability("appActivity", "com.instagram.mainactivity.LauncherActivity");
		
		
		URL urlConnection = null;
		try {
			urlConnection = new URL("http://127.0.0.1:4723/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		 driver = new AppiumDriver<>(urlConnection, configurations);
	}
}
