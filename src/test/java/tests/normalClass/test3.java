package tests.normalClass;

import java.net.MalformedURLException;

import java.net.URL;

import java.time.Duration;

import java.util.Arrays;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.PointerInput;

import org.openqa.selenium.interactions.Sequence;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.remote.MobileCapabilityType;

public class test3 {

public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
DesiredCapabilities dc = new DesiredCapabilities();

dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");

dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Z585R8TSRWQKSGQO");

//dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,60);

//dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\Fleek\\Downloads\\Unit Converter_1.6.7_Apkpure.apk");

dc.setCapability("noReset", true);

dc.setCapability("appPackage", "com.android.vending");

dc.setCapability("appActivity", "com.google.android.finsky.activities.MainActivity");

URL url = new URL("http://127.0.0.1:4723/wd/hub");

AndroidDriver driver = new AndroidDriver(url,dc);

WebDriverWait wait0 = new WebDriverWait(driver,Duration.ofSeconds(200));

wait0.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[1]/android.view.View")));

WebElement searchbox = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.view.View"));

searchbox.click();

WebElement textbox = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.EditText"));

textbox.sendKeys("unit converter");

WebDriverWait s = new WebDriverWait(driver, Duration.ofSeconds(10));

s.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.ImageView[2]")));

driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]")).click();

WebDriverWait i = new WebDriverWait(driver, Duration.ofSeconds(10));

i.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.widget.Button")));

WebElement install = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.widget.Button"));

install.click();

WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(200));

wait.until(ExpectedConditions.textToBe(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.TextView[2]"), "Installed"));

driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.Button")).click();

WebDriverWait w =new WebDriverWait(driver,Duration.ofSeconds(200));

w.until(ExpectedConditions.elementToBeClickable(By.id("kr.sira.unit:id/tab0_input")));

WebElement input = driver.findElement(By.id("kr.sira.unit:id/tab0_input"));

input.click();

WebElement num1= driver.findElement(By.id("kr.sira.unit:id/tab0_num1"));

num1.click();

WebElement selector = driver.findElement(By.id("kr.sira.unit:id/tab0_selector"));

selector.click();

WebDriverWait w2 = new WebDriverWait(driver,Duration.ofSeconds(200));

w2.until(ExpectedConditions.presenceOfElementLocated(By.id("android:id/select_dialog_listview")));

PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

Sequence scroll = new Sequence(finger, 1);

scroll.addAction(finger.createPointerMove(Duration.ofMillis(0),

PointerInput.Origin.viewport(), 325, 1440));

scroll.addAction(finger.createPointerDown(0));

scroll.addAction(finger.createPointerMove(Duration.ofSeconds(1),

PointerInput.Origin.viewport(),325, 1000));

scroll.addAction(finger.createPointerUp(0));

driver.perform(Arrays.asList(scroll));

WebElement furlong = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[14]"));

furlong.click();

driver.findElement(By.id("kr.sira.unit:id/tab0_numok")).click();

PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");

Sequence scrolla = new Sequence(finger1, 1);

scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(0),

PointerInput.Origin.viewport(), 300, 600));

scrolla.addAction(finger1.createPointerDown(0));

scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(100),

PointerInput.Origin.viewport(),300, 900));

scrolla.addAction(finger1.createPointerUp(0));

driver.perform(Arrays.asList(scrolla));

String actualText = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.TabHost/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.TextView")).getText();

String expectedText = "201.168";

if(actualText.equals(expectedText))

{

System.out.println("test 1 passed. 1 Furlong is equal to 201.168 metres");

}

else

{

System.out.println("test 1 failed.");

}

driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.TabHost/android.widget.LinearLayout/android.widget.TabWidget/android.widget.LinearLayout[2]/android.widget.TextView")).click();

driver.findElement(By.id("kr.sira.unit:id/tab1_input")).click();

driver.findElement(By.id("kr.sira.unit:id/tab1_num1")).click();

driver.findElement(By.id("kr.sira.unit:id/tab1_selector")).click();

driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")).click();

driver.findElement(By.id("kr.sira.unit:id/tab1_numok")).click();

String expectedtext1 = "82.62";

String actualtext1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.TabHost/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")).getText();

if(expectedtext1.equals(actualtext1)) {

System.out.println("test 2 has passed. 1 USD is equal to 82.62 INR.");

}

else {

System.out.println("test 2 has failed.");

}

driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.TabHost/android.widget.LinearLayout/android.widget.TabWidget/android.widget.LinearLayout[3]/android.widget.TextView")).click();

driver.findElement(By.id("kr.sira.unit:id/tab2_layout1")).click();

driver.findElement(By.id("kr.sira.unit:id/tab2_input")).click();

driver.findElement(By.id("kr.sira.unit:id/tab2_num1")).click();

driver.findElement(By.id("kr.sira.unit:id/tab2_selector")).click();

driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[5]")).click();

driver.findElement(By.id("kr.sira.unit:id/tab2_numok")).click();

String expectedtext2 = "9.80665";

String actualtext2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.TabHost/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView")).getText();

if(expectedtext2.equals(actualtext2)) {

System.out.println("Test 3 has passed. 1 kgf is equal to 9.80665 N.");

}

else {

System.out.println("Test 3 has failed.");

}

driver.terminateApp("kr.sira.unit");
driver.removeApp("kr.sira.unit");
System.out.print("Unit converter has been uninstalled.");
driver.terminateApp("com.android.vending");

}

}