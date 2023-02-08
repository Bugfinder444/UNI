package tests;

import org.testng.AssertJUnit;
import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ObjectClass extends BaseClass{
	
	public ObjectClass(AndroidDriver driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);	
	}
	
	@AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup" )
	public WebElement searchBox;
	
	@AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.EditText")
	public WebElement EnterValue;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]")
	public WebElement click;
	
	@AndroidFindBy(xpath= "//android.widget.FrameLayout[@content-desc=\"Unit Converter, Smart Tools co., Contains ads\"]/android.widget.FrameLayout[2]/android.widget.Button")
	public WebElement installApp;
		
	@AndroidFindBy(xpath= "//android.widget.FrameLayout[@content-desc=\"Unit Converter, Installed, \"]/android.widget.FrameLayout[2]/android.widget.Button")
	public WebElement openApp;
	
	@AndroidFindBy(id= "kr.sira.unit:id/tab0_input")
	public WebElement tab;
	@AndroidFindBy(id= "kr.sira.unit:id/tab0_num7")
	public WebElement seven;
	@AndroidFindBy(id= "kr.sira.unit:id/tab0_4multiply")
	public WebElement mul;
	@AndroidFindBy(id= "kr.sira.unit:id/tab0_selector")
	public WebElement equal;
	@AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[6]")
	public WebElement meter;
	@AndroidFindBy(id= "kr.sira.unit:id/tab0_numok")
	public WebElement ok;
	
	public void searchBox() throws InterruptedException, MalformedURLException {
		
		Thread.sleep(3000);
		searchBox.click(); 
		EnterValue.sendKeys("unit converter");
		click.click();	
	}
	public void installApp() throws InterruptedException {
		
		Thread.sleep(5000);
		installApp.click();
		System.out.println("Installing Application..");	
	}
	public void openApp() throws InterruptedException {
		
		openApp.click();
		System.out.println("Application is Installed");
		
	}
	public void operations() throws InterruptedException {
		
		tab.click();
		Thread.sleep(2000);
		seven.click();
		mul.click();
		seven.click();
		equal.click();
		Thread.sleep(1000);
		meter.click();
		ok.click();
		Thread.sleep(2000);
	}
	public void valueCheck() {
		
		String expectedtext = "59";
		String actualtext = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.TabHost/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.TextView")).getText();
		AssertJUnit.assertEquals(expectedtext,actualtext);
	}	
	public void unInstall() {
		
		driver.terminateApp("kr.sira.unit");
		driver.removeApp("kr.sira.unit");
		System.out.print("Unit converter has been uninstalled");
		driver.terminateApp("com.android.vending");
	}
}
