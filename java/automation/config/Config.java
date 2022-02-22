package automation.config;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Config {

	public static void main(String[] args) throws MalformedURLException {
		
		File apk = new File("C:\\Users\\Fabio Petry\\eclipse-workspace\\Automation\\src\\main\\java\\automation\\apk\\instagram.apk");
		DesiredCapabilities configurations = new DesiredCapabilities();
		configurations.setCapability(MobileCapabilityType.APP, apk.getAbsolutePath());
		configurations.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		configurations.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		
		URL urlConnection = new URL("http://127.0.0.1:4723/wd/hub");		
		AppiumDriver driver = new AppiumDriver<>(urlConnection, configurations);
	}

}
