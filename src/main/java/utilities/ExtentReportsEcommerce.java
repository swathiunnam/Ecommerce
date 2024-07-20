package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReportsEcommerce  {
	
	public static ExtentReports getReport() {

	   
	  ExtentSparkReporter sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/report.html");
	   
	   sparkReporter.config().setDocumentTitle("Automation Report");
	   sparkReporter.config().setReportName("Functional Testing");
	  
	  ExtentReports extent=new ExtentReports();
	  extent.attachReporter(sparkReporter);
	   
	   return extent;
	   
	  
   }
  
}
