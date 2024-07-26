package BaseClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.remote.AndroidMobileCapabilityType.*;
import static io.appium.java_client.remote.MobileCapabilityType.*;
import static org.openqa.selenium.remote.ErrorCodes.TIMEOUT;


public class BaseSetUp {
    public static AppiumDriver<MobileElement> driver;

    public static void setup() throws MalformedURLException {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(DEVICE_NAME, "Poco X3 Pro");
            caps.setCapability(PLATFORM_NAME, "Android");
            caps.setCapability(APP_PACKAGE, "id.superapp.courier.staging");
            caps.setCapability(APP_ACTIVITY, "id.superapp.courier.MainActivity");
            caps.setCapability("autoGrantPermissions", true);
            //caps.setCapability(NO_RESET, true);

            URL url = new URL("http://localhost:4723/wd/hub");
            driver = new AndroidDriver<>(url, caps);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public static void teardown() {
        driver.quit();
    }

    public static void reset() {
        driver.resetApp();
    }

    public void click(By by) {
        MobileElement element = driver.findElement(by);
        element.click();
    }

    public void input(By by, String text) {
        MobileElement element = driver.findElement(by);
        element.sendKeys(text);
    }

    public void waitForElement(By by) {
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }



}
