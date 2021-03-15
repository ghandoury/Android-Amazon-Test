package baseTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected static AppiumDriver driver;

    @BeforeClass
    public void setup() throws MalformedURLException {

        DesiredCapabilities commonAndroidCapabilities = new DesiredCapabilities();
        commonAndroidCapabilities.setCapability("platformName", "android");
        commonAndroidCapabilities.setCapability("platformVersion", "11.0");
        commonAndroidCapabilities.setCapability("deviceName", "Pixel_3a_API_30");
        commonAndroidCapabilities.setCapability("noReset", false);
        commonAndroidCapabilities.setCapability("avd", "Pixel_3a_API_30");
        commonAndroidCapabilities.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
        commonAndroidCapabilities.setCapability("appPackage", "com.amazon.mShop.android.shopping");
        commonAndroidCapabilities.setCapability("allowTestPackages", "true");
        commonAndroidCapabilities.setCapability("fullReset", false);
        commonAndroidCapabilities.setCapability("autoGrantPermission", true);
        commonAndroidCapabilities.setCapability("newCommandTimeout", 1000);
        commonAndroidCapabilities.setCapability("app", System.getProperty("user.dir") + "/src/main/resources/Amazon_shopping.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), commonAndroidCapabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterClass
    public void closeDriver() {
        driver.closeApp();
    }
}
