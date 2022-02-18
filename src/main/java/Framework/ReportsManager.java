package Framework;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import junit.framework.TestCase;


public class ReportsManager extends TestCase{
	static ExtentTest currTest;
	static ExtentReports ReportInstance;
	public static void getInstance() {
		SimpleDateFormat DatFr = new SimpleDateFormat("MMDDYY HH:MM:SS");
		String path = DatFr.format(new Date()) ;
		ReportInstance = new ExtentReports(path);

	}
	
 public static void startNewTest(String name) {
	 currTest = ReportInstance.startTest(name);
 }
 
 public static void endTest() {
	 ReportInstance.endTest(currTest);
 }
 
 public static void ScreenShot(String path) {
	 path = path.replace("/", "\\");
	 currTest.addScreenCapture(path);
	 
 }
 
 public static void assertEquals(Object expected , Object actual) {
	 try {
		 assertEquals(expected, actual);
		 currTest.log(LogStatus.PASS, "comparison passed");
	 }catch (AssertionError e) {
		 currTest.log(LogStatus.FAIL, e.getMessage());
		// TODO: handle exception
	}
 }
 
 
 
  
}
