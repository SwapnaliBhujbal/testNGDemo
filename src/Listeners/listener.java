package Listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class listener extends TestListenerAdapter {
	
	
	public void onTestSuccess(ITestResult tr) {
		System.out.println("Test Case pass");
	}
	
	public void onTestFailure(ITestResult tr) {
		System.out.println("Test Case fail");
	}
	
}
