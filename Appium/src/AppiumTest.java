import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		DesiredCapabilities Cap = new DesiredCapabilities();
		Cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
		Cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
//		Cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "");
		Cap.setCapability(MobileCapabilityType.APP, "//Users//BharathG//Documents//UIKitCatalog.app");
		Cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITEST");
		
//		Cap.setCapability(MobileCapabilityType., value);
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		IOSDriver driver = new IOSDriver(url, Cap);
		
//		driver.findElementById("").sendKeys("Hello");
		

	}

}
