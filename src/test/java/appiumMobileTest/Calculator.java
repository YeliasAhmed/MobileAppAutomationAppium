package appiumMobileTest;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

public class Calender {


     static AppiumDriver driver;

    public static void openSmartScale() throws Exception {

//        Device Configuration

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Redmi 7");
        cap.setCapability("udid", "fcaef21b");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "11");

// Apps Configuration


        cap.setCapability("appPackage", "com.miui.calculator");
        cap.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");


//        Appium Driver

        URL url = new URL("http://127.0.0.0:4723/");
        driver = new AppiumDriver(url, cap);

        System.out.println("Teton Smart Scale is Started...");

    }
    public static void main(String[] args) throws Exception {
        openSmartScale();

       try {
           openSmartScale();
       }catch (Exception e){
           System.out.println("Device not found");
           System.out.println("Device not found");
       }
    }
}
