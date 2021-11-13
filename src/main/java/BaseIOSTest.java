import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseIOSTest {
//    public static void main(String[] args) throws MalformedURLException {
////        System.out.println("main");
//        DesiredCapabilities capabilites =new DesiredCapabilities();
//        capabilites.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
//        capabilites.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.0");
//        capabilites.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 13 Simulator");
//        capabilites.setCapability(MobileCapabilityType.UDID, "56B05B33-8806-40C7-A852-6908C91A0298");
//        //IOS_XCUI_Test     Apple
//        capabilites.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
//        capabilites.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT, 500000);
//        capabilites.setCapability("commandTimeouts", "12000"); //.app
//
//        capabilites.setCapability(MobileCapabilityType.APP, "/Users/apple/Library/Developer/Xcode/DerivedData/UIKitCatalog-dzmqjfsgtomokubyehhxxzgtrzok/Build/Products/Debug-iphonesimulator/UIKitCatalog.app");
//
//        IOSDriver driver = new IOSDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"),capabilites);
//
//    }

    public static IOSDriver DesiredCapabilities() throws MalformedURLException
    {
        DesiredCapabilities capabilites =new DesiredCapabilities();
        capabilites.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        capabilites.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.0");
        capabilites.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 13 Simulator");
        capabilites.setCapability(MobileCapabilityType.UDID, "56B05B33-8806-40C7-A852-6908C91A0298");
        //IOS_XCUI_Test     Apple
        capabilites.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        capabilites.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT, 500000);
        capabilites.setCapability("commandTimeouts", "12000");
        capabilites.setCapability(MobileCapabilityType.NO_RESET, true);

        capabilites.setCapability(MobileCapabilityType.APP, "/Users/apple/Library/Developer/Xcode/DerivedData/UIKitCatalog-dzmqjfsgtomokubyehhxxzgtrzok/Build/Products/Debug-iphonesimulator/UIKitCatalog.app");

        IOSDriver driver = new IOSDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"),capabilites);

        return driver;

    }
}
