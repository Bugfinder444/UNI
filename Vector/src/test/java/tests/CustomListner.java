package tests;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListner extends BaseClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Failed");
		try {
			failed(result.getMethod().getMethodName(), driver);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	}
		
}
