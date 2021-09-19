
package factoryDevices;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CloudDevice implements IDevice {
    @Override
    public AppiumDriver create() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();

        // Set your access credentials
        caps.setCapability("browserstack.user", "nancyhuaman_d5lacX");
        caps.setCapability("browserstack.key", "zT2aDv3Gp72QreQzxsKf");

        // Set URL of the application under test
        caps.setCapability("app", "bs://f0f1b0a12a31fd1c34c1d201e5f0aa0d75bebc72");

        // Specify device and os_version for testing
        caps.setCapability("device", "Google Pixel 3");
        caps.setCapability("os_version", "9.0");

        // Set other BrowserStack capabilities
        caps.setCapability("project", "First Java Project");
        caps.setCapability("build", "Java Android");
        caps.setCapability("name", "first_test");


        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        AndroidDriver<AndroidElement> driver;
        driver = new AndroidDriver<>(
                new URL("http://hub.browserstack.com/wd/hub"), caps);

        return driver;

    }

}
