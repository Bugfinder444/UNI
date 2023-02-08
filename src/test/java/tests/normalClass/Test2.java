package tests.normalClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Test2 {
	
	
		public static void main(String[] args) throws MalformedURLException, InterruptedException, AWTException {
		
		DesiredCapabilities caps= new DesiredCapabilities();
		
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
		
		
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		
		caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		
		//caps.setCapability("appium:connectHardwareKeyboard", true);
		
		//caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,60);
		
		//caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\Fleek\\Downloads\\Unit Converter_1.6.7_Apkpure.apk");
		caps.setCapability("appPackage", "com.android.vending");
		caps.setCapability("appActivity", "com.google.android.finsky.activities.MainActivity");
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url,caps);
		Thread.sleep(2000);
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(400));
		
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup")));
		    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup")).click();
			
			
			WebElement active = driver.switchTo().activeElement();
			
			Actions action = new Actions(driver);
			action.moveToElement(active).sendKeys("unit converter").sendKeys(Keys.ENTER).perform();	
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.FrameLayout[@content-desc=\"Unit Converter, Smart Tools co., Contains ads\"]/android.widget.FrameLayout[2]/android.widget.Button")));
			driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Unit Converter, Smart Tools co., Contains ads\"]/android.widget.FrameLayout[2]/android.widget.Button")).click();
			System.out.println("Installing Application..");
		 
		//Robot robot = new Robot();
		//robot.keyPress(KeyEvent.VK_ENTER);
			
		Thread.sleep(20000);
			
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.FrameLayout[@content-desc=\"Unit Converter, Installed, \"]/android.widget.FrameLayout[2]/android.widget.Button")));
		System.out.println("Application is Installed");
		driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Unit Converter, Installed, \"]/android.widget.FrameLayout[2]/android.widget.Button")).click();
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "done"));
		
		/*WebElement active = driver.switchTo().activeElement();
		Actions action =new Actions(driver);
		action.moveToElement(active).sendKeys(Keys.RETURN).perform();*/
		Thread.sleep(10000);
		
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("kr.sira.unit:id/tab0_input")));
		WebElement inputText =driver.findElement(By.id("kr.sira.unit:id/tab0_input"));
		inputText.click();
		Thread.sleep(2000);
		driver.findElement(By.id("kr.sira.unit:id/tab0_num7")).click();
		driver.findElement(By.id("kr.sira.unit:id/tab0_4multiply")).click();
		driver.findElement(By.id("kr.sira.unit:id/tab0_num7")).click();
		driver.findElement(By.id("kr.sira.unit:id/tab0_selector")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[6]")).click();
		driver.findElement(By.id("kr.sira.unit:id/tab0_numok")).click();
		
		Thread.sleep(3000);
		
	/*	String expectedtext1 = "49";

		String actualtext1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.TabHost/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")).getText();

		if(expectedtext1.equals(actualtext1)) {

		System.out.println("test 2 has passed. 1 USD is equal to 82.62 INR.");

		}

		else {

		System.out.println("test 2 has failed.");

		}	*/
		
		/*PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		   Sequence tap = new Sequence(finger, 1);
		   tap.addAction(finger.createPointerMove(Duration.ofMillis(0),
		                       PointerInput.Origin.viewport(), 293, 800));
		   tap.addAction(finger.createPointerDown(0));
		   tap.addAction(finger.createPointerMove(Duration.ofMillis(100),
		                       PointerInput.Origin.viewport(),293, 800));
		   tap.addAction(finger.createPointerUp(0));
		   driver.perform(Arrays.asList(tap));*/
		
	/*	driver.findElement(By.id("kr.sira.unit:id/tab0_numok")).click();
		
		PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
		   Sequence tap1 = new Sequence(finger1, 1);
		   tap1.addAction(finger1.createPointerMove(Duration.ofMillis(0),
		                       PointerInput.Origin.viewport(), 243, 2146));
		   tap1.addAction(finger1.createPointerDown(0));
		   tap1.addAction(finger1.createPointerMove(Duration.ofMillis(100),
		                       PointerInput.Origin.viewport(),243, 2146));
		   tap1.addAction(finger1.createPointerUp(0));
		   driver.perform(Arrays.asList(tap1)); */
		
		   driver.terminateApp("kr.sira.unit");
		   driver.removeApp("kr.sira.unit");
		   System.out.print("Unit converter has been uninstalled.");
		   driver.terminateApp("com.android.vending");
		
	}
}
