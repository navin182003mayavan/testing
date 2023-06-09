package com.example.extendedReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.*;


public class Report {
	public static void main(String[] args)
	{
		ExtentSparkReporter spark = new ExtentSparkReporter("extentReport.html");
		ExtentReports extent = new ExtentReports ();
		extent.attachReporter(spark);
		ExtentTest test1 = extent.createTest("Facebook","login for facebook");
	test1.log(Status.FAIL, "Sample test");
	System.out.println("FInished");
		extent.flush();
	}

}
