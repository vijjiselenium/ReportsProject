package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsConfiguration {
	
	public static ExtentReports getReportConfiguration()
	{

		String reportsPath=System.getProperty("user.dir")+"\\reports\\index2.html";
		ExtentSparkReporter reporter =new ExtentSparkReporter(reportsPath);
		reporter.config().setReportName("Automation Test Report");
		
		//ExtentReports
		
		ExtentReports  extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		return extent;
	}

}
