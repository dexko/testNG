import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class FirstAndroidTest {



        @Test
        public void androidTest() throws MalformedURLException {

            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability("platformName", "android");
            desiredCapabilities.setCapability("automationName", "UiAutomator2");
            desiredCapabilities.setCapability("app", System.getProperty("user.dir") + "/SauceLabsTestApp.apk");
            desiredCapabilities.setCapability("platformVersion", "10");
            desiredCapabilities.setCapability("deviceName", "Pixel XL API 29");
            desiredCapabilities.setCapability("appActivity", ".SplashActivity");
            desiredCapabilities.setCapability("appPackage", "com.swaglabsmobileapp");

            AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("test-Username");
            el1.sendKeys("standard_user");
            MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("test-Password");
            el2.sendKeys("secret_sauce");
            MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("test-LOGIN");
            el3.click();
            MobileElement el4 = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"test-Modal Selector Button\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView");
            el4.click();
            MobileElement el5 = (MobileElement) driver.findElementByXPath("//android.widget.ScrollView[@content-desc=\"Selector container\"]/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView");
            el5.click();
            MobileElement el6 = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"test-Toggle\"]/android.widget.ImageView");
            el6.click();
            MobileElement el60 = (MobileElement) driver.findElementByXPath("(//android.view.ViewGroup[@content-desc=\"test-Item\"])[1]");
            el60.click();
            MobileElement el7 = (MobileElement) driver.findElementByXPath("(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[1]/android.widget.TextView");
            el7.click();
            MobileElement el8 = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.view.ViewGroup");
            el8.click();
            MobileElement el9 = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"test-CHECKOUT\"]/android.widget.TextView");
            el9.click();
            MobileElement el10 = (MobileElement) driver.findElementByAccessibilityId("test-First Name");
            el10.sendKeys("Zina");
            MobileElement el11 = (MobileElement) driver.findElementByAccessibilityId("test-Last Name");
            el11.sendKeys("Trott");
            MobileElement el12 = (MobileElement) driver.findElementByAccessibilityId("test-Zip/Postal Code");
            el12.sendKeys("3222");
            MobileElement el13 = (MobileElement) driver.findElementByAccessibilityId("test-CONTINUE");
            el13.click();
            //driver.quit();
*/
        }}
