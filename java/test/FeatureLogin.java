package test;

import java.net.MalformedURLException;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import automation.config.AppiumDriverConfig;
import io.appium.java_client.AppiumDriver;

public class FeatureLogin {


	@Test
	public void Login() throws MalformedURLException, InterruptedException {
		AppiumDriver driver = AppiumDriverConfig.Instance().driver;

		waitObject("com.instagram.android:id/sign_up_with_email_or_phone");
		pressObject("com.instagram.android:id/sign_up_with_email_or_phone");
		
		waitObject("com.instagram.android:id/right_tab");
		pressObject("com.instagram.android:id/right_tab");
		waitObject("com.instagram.android:id/email_field");
		pressObject("com.instagram.android:id/email_field");
		sendKeysObject("com.instagram.android:id/email_field", "Test.Ap052022@gmail.com");
		waitObject("com.instagram.android:id/button_text");
		pressObject("com.instagram.android:id/button_text");
		
		
		
		driver.quit();
	}
	
	
	

	
	
	
	
	
	public void sendKeysObject(String id,String key) {
		AppiumDriver driver = AppiumDriverConfig.Instance().driver;

		driver.findElementById(id).sendKeys(key);;
	}
	public void pressObject(String press) {
		AppiumDriver driver = AppiumDriverConfig.Instance().driver;

		driver.findElementById(press).click();
	}
	public void waitObject(String wait) {
		AppiumDriver driver = AppiumDriverConfig.Instance().driver;

		WebElement waitObjectAppium = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.id(wait)));
	}
}

