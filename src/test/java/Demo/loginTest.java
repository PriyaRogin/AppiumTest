package Demo;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class loginTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
			
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "samsung SM-J600G");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName","uiautomator2");
        caps.setCapability("platformVersion", "10");
        caps.setCapability("appPackage", "com.facebook.katana"); 


        // Initialize the AndroidDriver
        AndroidDriver<MobileElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/"), caps);

        // Find email and password fields and login button
                      
        MobileElement email = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Mobile number or email address\")");
        MobileElement password = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Password\")");
        MobileElement loginButton = driver.findElementByAndroidUIAutomator("new UiSelector().description(\"Log In\")");
        
        // Enter email and password
        email.sendKeys("priyarogin2021@gmail.com");
        password.sendKeys("password");

        // Click on the login button
        loginButton.click();

        driver.quit();

	}

}
