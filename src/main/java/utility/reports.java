package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class reports {
	public static ExtentReports createExtentReports() {
		ExtentReports reports=new ExtentReports();//Data collect
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter("extentreports.html");
		reports.attachReporter(sparkReporter);
		reports.setSystemInfo("CreatedBy","Priti");
		reports.setSystemInfo("TestSuite","Regression");
	return reports;
	}
}
