package com.crm.listeners;

import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.crm.BaseClass.LoginBase;

public class ExtentReportWithListeners extends LoginBase implements ITestListener{
	public static ExtentSparkReporter spark;
	public static ExtentReports report;
	public static ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		String name = result.getMethod().getMethodName();
		Reporter.log(name+" is onTestStart",true);
		test = report.createTest(name);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String name = result.getMethod().getMethodName();
		test.log(Status.PASS, name+" is pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String date = LocalDateTime.now().toString().replace(':', '-');
		String name = result.getMethod().getMethodName();
		String dynamicName = name+date;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 TakesScreenshot ts = (TakesScreenshot) driver;
	      String from = ts.getScreenshotAs(OutputType.BASE64);
	      test.addScreenCaptureFromBase64String(from);
	      test.log(Status.FAIL, name+" is fail");
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		String name = result.getMethod().getMethodName();
		test.log(Status.SKIP, name+" is skipped");
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("onStart",true);
		spark = new ExtentSparkReporter(".\\src\\test\\resources\\Reports\\LoginReport.html");
		spark.config().setDocumentTitle("OrangeHRM");
		spark.config().setReportName("Roshan");
		spark.config().setTheme(Theme.DARK);
		report = new ExtentReports();
		report.setSystemInfo("System Brand", "HP Victus");
		report.setSystemInfo("OS", "Windows 11");
		report.setSystemInfo("Browser", "Chrome");
		report.attachReporter(spark);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("onFinish",true);	
		report.flush();
	}
}
