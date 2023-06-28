package appiumMobileTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

public class Calculator {


     public static AppiumDriver<MobileElement> driver;

    public static void calculatorOpen() throws Exception {

//        Device Configuration

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Xiaomi Redmi 7");
        cap.setCapability("udid", "fcaef21b");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "10");
 // Apps Configuration
        cap.setCapability("appPackage", "com.miui.calculator");
        cap.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");

//        Appium Driver
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url, cap);
        System.out.println("Calculator is started...");

    }
    public static void main(String[] args) throws Exception {
        calculatorOpen();

       try {
           calculatorOpen();
       }catch (Exception e){
           System.out.println("Device not found");
           System.out.println("Device not found");
       }
    }
}
