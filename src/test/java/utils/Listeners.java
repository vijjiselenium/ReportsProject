package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;

import Testcases.TestModule2;

public class Listeners extends TestModule2 implements ITestListener
{
	
	ExtentReports extent;
	
	
	@Override
    public void onTestStart(ITestResult result) {
		
		if(extent==null)
		{

		extent=ExtentReportsConfiguration.getReportConfiguration();
		}
		
    	System.out.println("testcase is about to start");
    	extent.createTest(result.getMethod().getMethodName());
    	
	}
    @Override
	public void onTestSuccess(ITestResult result) {
    	System.out.println("testcase got pssed successfully");
	}
    @Override
	public void onTestFailure(ITestResult result) {
    	System.out.println("testcase  got failed");
    	System.out.println(result.getMethod().getMethodName());
    	
    	//way1
    	//TestModule2 tm=new TestModule2();
    	//tm.driver;
    	//way 2 use static variable
    	//way 3 use inheritence
    	
    	TakesScreenshot tks=(TakesScreenshot)driver;
    	File sourceLocation=tks.getScreenshotAs(OutputType.FILE);
    	String path=System.getProperty("user.dir")+"//FailedScreenshot//"+result.getMethod().getMethodName()+".png";
    	
    	File destinationLocation=new File(path);
    	
    	//File destinationLocation= new File("C:\\Users\\Vijji\\java course\\My Latest Resume\\FailuresScreenshots\\failedtest.png");
    	try {
			FileUtils.copyFile(sourceLocation, destinationLocation);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    			
    			
	}
    
    
    @Override
	public void onStart(ITestContext context) {
    	System.out.println("testcase are about start");
	}
    @Override
	public void onFinish(ITestContext context) {
    	extent.flush();	
		
	}
	
   

}
