package utility;

import java.io.IOException;

import org.testng.ITestNGListener;
import org.testng.ITestResult;



public class Listenerss {
	public class Listeners extends Baseclass implements ITestNGListener {
		public void onTestStart(ITestResult result) {
			// System.out.println("Test Started " + result.getName());
		 }
		
		public void onTestSuccess(ITestResult result) {
			 //System.out.println("Test passed " + result.getName());
		 }
		 
		 public void onTestFailure(ITestResult result) {
			 try {
				Screenshot.clickScreenshot(driver, result.getName());
			} catch (IOException e) {
				e.printStackTrace();
			}
		 }
		 
		 public void onTestSkipped(ITestResult result) {
			// System.out.println("Test Skipped " + result.getName());
		 }

}
}