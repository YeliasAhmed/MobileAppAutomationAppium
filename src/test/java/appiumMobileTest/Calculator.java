package appiumMobileTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
        cap.setCapability("appPackage", "com.google.android.calculator");
        cap.setCapability("appActivity", "com.android.calculator2.Calculator");


//        Appium Driver
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url, cap);
        System.out.println("Calculator is started...");



        driver.findElement(By.id("com.google.android.calculator:id/digit_5")).click();
        driver.findElement(By.id("com.google.android.calculator:id/op_mul")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_8")).click();
        driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
        MobileElement result = driver.findElement(By.className("android.widget.TextView"));
        System.out.println("Result is : " + result.getText());
        System.out.println("Calculation is completed");

    }

    public static void main(String[] args) throws Exception {

        try {
            calculatorOpen();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            System.out.println(e.getStackTrace());
            System.out.println("Device not found");

        }
    }
}
