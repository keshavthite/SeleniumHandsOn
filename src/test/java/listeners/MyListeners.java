package listeners;
import java.io.File;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class MyListeners extends TestListenerAdapter {

ExtentReports report;
ExtentTest logger;

public MyListeners()
{
	report=new ExtentReports(System.getProperty("user.dir")+"/test-output/report.html", true);
	report=new ExtentReports("report.html", true);
	report.addSystemInfo("Host Name","keshav Testing HandsOn");
	report.addSystemInfo("Environment","automation testing");
	report.loadConfig(new File(System.getProperty("user.dir")+"/test-output/extent-config.xml"));
}
 public void onTestSuccess(ITestResult result)
 {
	 logger=report.startTest("PassTest");
	 logger.log(LogStatus.PASS,"Test case Passed is : "+result.getTestName());
	 System.out.println(result.getName()+" successed....");
	 report.endTest(logger);
 }
 
 public void onTestFailure(ITestResult result)
 {
	 logger=report.startTest("failTest");
	 logger.log(LogStatus.FAIL,"Test case failed is : "+result.getTestName());
	 System.out.println(result.getName()+" failed....");
	 report.endTest(logger);
 }
 public void onTestStart(ITestResult result)
 {
	 System.out.println(result.getName()+" started....");
	 
 }
}
