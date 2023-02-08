package tests;

import java.net.MalformedURLException;
import java.time.Duration;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.qameta.allure.Allure;

@Listeners(CustomListner.class)

public class TestNgClass extends BaseClass{

	@Test(priority = 0)
	public void Search_Box() throws InterruptedException, MalformedURLException{
		
		Allure.step("Open SearchBox");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ObjectClass oc =new ObjectClass(driver);
		oc.searchBox();
	}
	
	@Test(priority = 1)
	public void install_App() throws InterruptedException{
		
		Allure.step("Install Application");
		ObjectClass oc =new ObjectClass(driver);
		oc.installApp();
	}
	
	@Test(priority = 2)
	public void open_App() throws InterruptedException{
		
		Allure.step("open App");
		ObjectClass oc =new ObjectClass(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		oc.openApp(); 
	}
	
	@Test(priority = 3)
	public void Operations() throws InterruptedException{
		
		Allure.step("Operations");
		ObjectClass oc =new ObjectClass(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		oc.operations();
	}
	
	@Test(priority =4)
	public void valueCheck() {
		
		Allure.step("Value Compare");
		ObjectClass oc =new ObjectClass(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		oc.valueCheck();	
	}
	
	@Test(priority = 5)
	public void UnInstall() {
		
		Allure.step("UnInstallation");
		ObjectClass oc =new ObjectClass(driver);
		oc.unInstall();
		System.out.println("End of Program ");
		System.out.println();
		System.out.println();
	}
}